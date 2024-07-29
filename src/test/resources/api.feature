@API
Feature: All method dummy API

  @loginPost
  Scenario: User logs in with valid credentials
    Given I have a username "emilys" and a password "emilyspass"
    When I send a POST request to "/user/login"
    Then the response status code should be 200
    And the response should contain the username "emilys"
    And the response should contain the email "emily.johnson@x.dummyjson.com"

  @AddNewUserPost
  Scenario: Add a new user with valid details
    Given I have a first name "Joko", last name "koko", and age "24"
    When I send a POST request to "/users/add"
    Then the response status code should be 201
    And the response should contain the first name "Joko"
    And the response should contain the last name "koko"