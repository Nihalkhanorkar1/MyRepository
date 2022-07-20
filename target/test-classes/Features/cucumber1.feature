Feature: As a user i want to open the browser.
Scenario: As a user i want to verify the URL.
Given open the browser.
When Enter the "https://demo.opencart.com/index.php?route=common/home&language=en-gb"
Then Page is displayed.

 


Feature: To verify shoppingcart option.
Scenario: To verify  user is able to click on shopping cart option.
Given Selecting an item to buy
When click on add to cart
Then Item should be added to cart


