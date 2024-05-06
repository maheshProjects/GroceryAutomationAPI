@Address
Feature: Address Module API Automation

  Scenario Outline: Verify User Add Address In The Application Through API
    Given User add headers and bearer authorization for accessing addUserAddress endpoint
    When User add request body to add new address "<first_name>","<last_name>","<mobile>","<apartment>","<state>","<city>","<country>","<zipcode>","<address>" and "<address_type>"
    And User send "POST" request to addUserAddress endpoint
    Then User should verify the posted addUserAddress status code is 200
    And User should verify the posted addUserAddress response body success message matches "Address added successfully" and get the address id saved

    Examples: 
      | first_name | last_name | mobile     | apartment | state | city | country | zipcode | address          | address_type |
      | Mahesh     | Pandian   | 8078306861 | apartment |    32 | 3533 |     101 |  602201 | 2/321 anna nagar | work         |

  Scenario Outline: Verify User Update Address Into The Application Through API
    Given User add headers and bearer authorization for accessing updateUserAddress endpoint
    When User add request body with address id, state id, city id and country id to update address "<first_name>","<last_name>","<mobile>","<apartment>","<zipcode>","<address>" and "<address_type>"
    And User send "PUT" request to updateUserAddress endpoint
    Then User should verify the updated UserAddress status code is 200
    And User should verify the updated UserAddress response body success message matches "Address updated successfully"

    Examples: 
      | first_name | last_name | mobile     | apartment | zipcode | address            | address_type |
      | Mahesh     | Pandian   | 8078306861 | apartment |  603301 | 2/321 gandhi nagar | home         |

  Scenario: Verify User Get Address From The Application Through API
    Given User add headers and bearer authorization for accessing getUserAddress endpoint
    When User send "GET" request to getUserAddress endpoint
    Then User should verify the getUserAddress status code is 200
    And User should verify the getUserAddress response body countryname present as "India"

  Scenario: Verify User Delete Address From The Application Through API
    Given User add headers and bearer authorization for accessing deleteAddress endpoint
    When User add request body of address id to delete address
    When User send "DELETE" request to deleteAddress endpoint
    Then User should verify the deleteAddress status code is 200
    And User should verify the deleteAddress response body success message "Address deleted successfully"
