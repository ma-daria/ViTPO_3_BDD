Feature: Game
  Scenario: #1.1. Добавление пароля
    Given I Have class Game
    When I have enteredGame "vk.com" as servis operand
    And I have enteredGame "password" as password operand
    And I add passwordGame
    Then The result bool shouldGame be "true"


  Scenario: #1.2. Добавление 2х паролей, 2й c ошибкой
    Given I Have class Game
    When I have enteredGame "vk.com" as servis operand
    And I have enteredGame "password" as password operand
    And I add passwordGame
    When I have enteredGame "vk.com" as servis operand
    And I have enteredGame "password" as password operand
    And I add passwordGame
    Then The result bool shouldGame be "false"


  Scenario: #1.3. Запрос 1й существующей буквы
    Given I Have class Game
    When I have enteredGame "vk.com" as servis operand
    And I have enteredGame "password" as password operand
    And I add passwordGame
    And I add servis "vk.com"
    And I have enteredGame "p" as letter operand
    And I input letter
    Then The result bool shouldGame be "true"

  Scenario: #1.4. Запрос 1й не существующей буквы
    Given I Have class Game
    When I have enteredGame "vk.com" as servis operand
    And I have enteredGame "password" as password operand
    And I add passwordGame
    And I add servis "vk.com"
    And I have enteredGame "q" as letter operand
    And I input letter
    Then The result bool shouldGame be "false"


  Scenario: #1.5. Добавление 2х паролей. Запрос буквы из 1го пароля
    Given I Have class Game
    When I have enteredGame "vk.com" as servis operand
    And I have enteredGame "password" as password operand
    And I add passwordGame
    When I have enteredGame "git.com" as servis operand
    And I have enteredGame "qwerty" as password operand
    And I add passwordGame
    And I add servis "vk.com"
    And I have enteredGame "p" as letter operand
    And I input letter
    Then The result bool shouldGame be "true"


  Scenario: #1.6. Добавление не сущ сервиса
    Given I Have class Game
    When I have enteredGame "vk.com" as servis operand
    And I have enteredGame "password" as password operand
    And I add passwordGame
    And I add servis "vk"
    Then The result bool shouldGame be "false"

  Scenario: #1.7. Вывод пароля. 3 верные буквы
    Given I Have class Game
    When I have enteredGame "vk.com" as servis operand
    And I have enteredGame "password" as password operand
    And I add passwordGame
    When I have enteredGame "git.com" as servis operand
    And I have enteredGame "qwerty" as password operand
    And I add passwordGame
    And I add servis "vk.com"
    And I have enteredGame "p" as letter operand
    And I input letter
    And I have enteredGame "w" as letter operand
    And I input letter
    And I have enteredGame "d" as letter operand
    And I input letter
    Then The result shouldGame be "password"

