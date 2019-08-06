Feature: Search product 
	Test user can search any specific product

Scenario: iphone search
	Given user is displayed with amazon home page "iphone" "product_search_two"
	When user enters the search "iphone" 
	And click the search button 
	Then "iphone" page should be displayed 
	
Scenario: samsung search 
	Given user is displayed with amazon home page "samsungsearch" "product_search_two"
	When user enters the search "samsung" 
	And click the search button 
	Then "samsung" page should be displayed 
    
Scenario: home page 
	Given user is displayed with amazon home page "homepage" "product_search_two"
	Then page title "Amazon.ca: Low Prices – Fast Shipping – Millions of Items" should be displayed