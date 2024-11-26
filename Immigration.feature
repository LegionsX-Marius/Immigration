Feature: Immigration
  Scenario Outline: Check Immigration +ADD
    Given Navigate to OrangeHRM
    When  Fill in <username>
    Then  Add <password>
    Then  Press Login button
    When  Press My Info
    Then  Press Immigration
    Then  Press +ADD
    Then  Select Document
    Then  Series <series>
    Then  Select Issued Date
    Then  Select Expiry Date
    Then  Eligible Status <status>
    Then  Issued By
    Then  Eligible Review Date
    Then  CommentsOne <comments>
    Then  Click Save
    Examples:
      | username | password | series | status   | comments |
      | Admin    | admin123 | AZ     | Approved | God      |