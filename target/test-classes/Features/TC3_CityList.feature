@City
Feature: City Module APU Automation

  Scenario: Verify User Get CityList  through API
    Given User add header for to get CityList
    When User add request body state id for get CityList
    And User send  "POST" request for CityList endpoint
    Then User verify the status code is 200
    And User verify the CityList response message matches "Adikkatti" and saved city id
