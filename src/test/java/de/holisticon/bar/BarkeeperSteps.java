package de.holisticon.bar;

import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BarkeeperSteps {
	private Menu menu;
	private Order order;
	private final List<Drink> mixedDrinks = new ArrayList<Drink>();

	@Given("^the menu$")
	public void givenMenu() throws Throwable {
		menu = new Menu();
	}

	@Given("^it contains '(.*)'$")
	public void givenMenuContaining(String drinkName) throws Throwable {
		OrderItem wodkaLemon = new OrderItem(drinkName);
		menu.addOrderItem(wodkaLemon);
	}

	@Given("^a '(.*)' is ordered from the menu$")
	public void givenOrderForItemFromMenu(String orderedDrinkName) throws Throwable {
		order = new Order();
		order.addItem(menu.getOrderItem(orderedDrinkName));
	}

	@When("^the barkeeper mixes drinks from the order$")
	public void whenTheBarkeeperMixesIt() throws Throwable {
		Barkeeper barkeeper = new Barkeeper();
		for (OrderItem anOrderItem : order.getAllOrderItems()) {
			Drink drink = barkeeper.mixDrinkFor(anOrderItem);
			mixedDrinks.add(drink);
		}
	}

	@Then("^it returns the mixed drinks$")
	public void thenItReturnsTheMixedDrinks() throws Throwable {
		for (OrderItem orderItem : order.getAllOrderItems()) {
			assertThat(mixedDrinks, containsDrinkWithName(orderItem.getName()));
		}

	}

	private static Matcher<? super List<Drink>> containsDrinkWithName(final String expectedDrinksName) {
		return new TypeSafeMatcher<List<Drink>>() {

			@Override
			protected boolean matchesSafely(final List<Drink> drinks) {
				for (Drink drink : drinks) {
					if (drink.getName().equals(expectedDrinksName)) {
						return true;
					}
				}
				return false;
			}

			public void describeTo(Description arg0) {
			}

		};
	}
}
