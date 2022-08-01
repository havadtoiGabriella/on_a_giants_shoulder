Feature: Header test

  Scenario: Page logo validation
    Given I navigate to the main page
    And I accept the data handling dialog box
    When I hover over the page logo
    Then the page logo url should point to the Home Page

  Scenario Outline: Navigation bar validation
    Given I navigate to the main page
    And I accept the data handling dialog box
    When I hover over the "<navbar menu item>" navbar menu item
    Then  "<navbar menu item>" navbar menu item "<url>" url should point to the right page
    Examples:
      | navbar menu item | url                                                                               |
      | Start Here       | https://www.lifehack.org/the-full-life-framework                                  |
      | Courses          | https://www.lifehack.org/courses                                                  |
      | Blog             | https://www.lifehack.org/#                                                        |
      | Lifehack Show    | https://www.lifehack.org/lifehackshow                                             |
      | Shop             | https://shop.lifehack.org/?utm_source=blog&utm_medium=navbar&utm_campaign=default |
      | Login            | https://academy.lifehack.org/sign_in                                              |

    Scenario: Subscribe button validation
      Given I navigate to the main page
      And I accept the data handling dialog box
      When I wait until the page is fully loaded
      Then the Subscribe button should be displayed

  Scenario Outline: <navbar menu item> navbar menu item dropdown validation
    Given I navigate to the main page
    And I accept the data handling dialog box
    When I hover over the "<navbar menu item>" navbar menu item
    Then a dropdown for "<navbar menu item>" should open with the menu items
    And  dropdown "<menu item>" menu item "<url>" url should point to the right page
    Examples:
      | navbar menu item | menu item                                   | url                                                            |
      | Start Here       | How to Achieve Your Goals                   | https://www.lifehack.org/achieving-goals                       |
      | Start Here       | How To Get Motivated                        | https://www.lifehack.org/motivation-guide-how-to-get-motivated |
      | Start Here       | How to Increase Mental Focus and Stay Sharp | https://www.lifehack.org/how-to-focus                          |
      | Start Here       | How To Learn Faster And Smarter             | https://www.lifehack.org/learn-faster                          |
      | Start Here       | How To Get Fit If You Have a Busy Schedule  | https://www.lifehack.org/how-to-get-fit                        |
      | Start Here       | How To Boost Energy And Peak Performance    | https://www.lifehack.org/boost-energy                          |
      | Start Here       | How to Live a Full Life                     | https://www.lifehack.org/the-full-life-framework               |
      | Courses          | Free Classes                                | https://www.lifehack.org/free-classes                          |
      | Courses          | Mastercourses                               | https://www.lifehack.org/courses                               |
      | Blog             | Focus                                       | https://www.lifehack.org/focus                                 |
      | Blog             | Goal Getting                                | https://www.lifehack.org/goal-getting                          |
      | Blog             | Life Balance                                | https://www.lifehack.org/life-balance                          |
      | Blog             | Staying Motivated                           | https://www.lifehack.org/staying-motivated                     |
      | Blog             | Procrastination                             | https://www.lifehack.org/procrastination                       |
      | Blog             | Success Mindset                             | https://www.lifehack.org/success-mindset                       |
      | Blog             | Career Success                              | https://www.lifehack.org/career-success                        |
      | Blog             | Leadership                                  | https://www.lifehack.org/productivity/leadership-productivity  |
      | Blog             | Entrepreneur                                | https://www.lifehack.org/work/entrepreneur-work                |
      | Blog             | Diet & Nutrition                            | https://www.lifehack.org/diet-and-nutrition                    |
      | Blog             | Exercise & Training                         | https://www.lifehack.org/exercise-training                     |
      | Blog             | Restore Energy                              | https://www.lifehack.org/restore-energy                        |
      | Blog             | Mental Wellness                             | https://www.lifehack.org/mental-wellness                       |
      | Blog             | Relationships                               | https://www.lifehack.org/communication/relationships           |
      | Blog             | Parenting                                   | https://www.lifehack.org/parenting                             |
