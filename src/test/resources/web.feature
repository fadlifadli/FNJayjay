@Web
Feature: Web

  @Positive-Login
  Scenario: Username and password valid
    Given Open Browser demoblaze
    And login input
    Then Input username "TestAuto123"
    Then Input password "Auto123"
    When click button login
    And is home page

  @Negative-Login
  Scenario: Username Wrong and password Wrong
    Given Open Browser demoblaze
    And login input
    Then Input username "123asdasd"
    Then Input password "123asdasd"
    When click button login
    Then verify is pop up login

  @SignUp
  Scenario: Register account
    Given Open Browser demoblaze
    Then clik button signup
    And Input signup username "yayaoke"
    And Input signup password "yayaoke"
    When click button popup signup

  @AddCartProduct
  Scenario: add product 2 items and purchase
    Given Open Browser demoblaze
    And login input
    Then Input username "TestAuto123"
    Then Input password "Auto123"
    When click button login
    And is home page
    Then add items samsung to cart
    Then add item nexus to cart
    When to page cart
    When purchase item placeholder
    Then order items
    Then verfy is succes purchase