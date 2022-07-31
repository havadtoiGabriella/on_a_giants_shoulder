Feature: Header test

  Scenario: Click on page logo
    Given I navigate to the main page
    And I accept the data handling dialog box
    When I hover over the page logo
    Then the page logo url should point to the home page

  Scenario Outline: Navigation bar validation
    Given I navigate to the main page
    And I accept the data handling dialog box
    When I hover over the "<menu item>" menu item
    Then  "<menu item>" menu item "<url>" url should point to the right page
    Examples:
      | menu item     | url                                                                               |
      | Start Here    | https://www.lifehack.org/the-full-life-framework                                  |
      | Courses       | https://www.lifehack.org/courses                                                  |
      | Blog          | https://www.lifehack.org/                                                         |
      | Lifehack Show | https://www.lifehack.org/lifehackshow                                             |
      | Shop          | https://shop.lifehack.org/?utm_source=blog&utm_medium=navbar&utm_campaign=default |
      | Login         | https://academy.lifehack.org/sign_in                                              |

  # Scenario Outline: 'Start Here' menu item dropdown validation
  #   Given I navigate to the main page
  #   And I accept the data handling dialog box
  #   When I hover over the 'Start Here' menu item
  #   Then a dropdown should open with "<menu element>"
  #   And "<menu element>" should have the correct link
  #   Examples:
  #     | menu element                                |
  #     | How to Live a Full Life                     |
  #     | How to Achieve Your Goals                   |
  #     | How To Get Motivated                        |
  #     | How to Increase Mental Focus and Stay Sharp |
  #     | How To Learn Faster And Smarter             |
  #     | How To Get Fit If You Have a Busy Schedule  |
  #     | How To Boost Energy And Peak Performance    |