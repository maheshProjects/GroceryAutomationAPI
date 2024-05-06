@SearchProduct
Feature: Search Product Module API Automation

  Scenario Outline: Verify User Search Product In The Application Through API
    Given User add headers to post search product
    When User add request body to search "<productname>"
    And User send "POST" request to searchProduct endpoint
    Then User should verify the posted searchProduct status code is 200
    And User should verify the posted searchProduct response body product text message matches "Tata Sampann 100% Iranian Pistachios Roasted & Salted in Fruit & Nuts"

    Examples: 
      | productname |
      | nuts        |
