@PurchaseFlow

Feature: Purchase Flow
  As user want to purchase item

  Scenario: User will choose item by name (Z to A)
    Given User open the web page
    When  User input "standard_user" as userName and "secret_sauce" as password
    Then User sort product list on "Name (Z to A)"
    And User select 2 item
    And User click shopping chart icon
    Then User remove item in list shopping chart
    And User checkout the item
    Then User input "Account_Test" as setFirstname and "Test" as setLastname and "12345" as setCode
    And User click continue
    Then User should get "Item total: $7.99" as expected Item total
    And User should get "Tax: $0.64" as expected Tax
    And User should get "Total: $8.63" as expected total
    Then User click finish
    Then User will see "THANK YOU FOR YOUR ORDER" as end



