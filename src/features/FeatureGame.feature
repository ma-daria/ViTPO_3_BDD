Feature: Game
  Scenario: #1.1. Добавление пароля
    Given I Have class Game
    When I have enteredGame "vk.com" as servis operand
    And I have enteredGame "password" as password operand
    And I add passwordGame
    Then The result bool shouldGame be "true"