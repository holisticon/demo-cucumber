Feature: The bar has a barkeeper to mix drinks

	In order to get a drink
	As a guest 
	I want a barkeeper to mix it

	Scenario: get a mixed wodka lemon
		Given the menu 
		And it contains 'Wodka Lemon'
		And a 'Wodka Lemon' is ordered from the menu
		When the barkeeper mixes drinks from the order
		Then it returns the mixed drinks
