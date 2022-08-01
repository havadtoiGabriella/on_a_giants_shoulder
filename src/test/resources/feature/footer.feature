Feature: Footer test

  Scenario Outline: <footer menu item> footer menu item url validation
    Given I navigate to the main page
    And I accept the data handling dialog box
    When I hover over the "<footer menu item>" main footer menu item
    Then  "<footer menu item>" main menu item "<url>" url should point to the right page
    Examples:
      | footer menu item | url                              |
      | Lifehack         | https://lifehack.org/            |
      | Blog             | https://lifehack.org/            |
      | Products         | https://www.lifehack.org/courses |
      | Academy          | https://academy.lifehack.org/    |
      | Get In Touch     | https://www.lifehack.org/contact |

  Scenario Outline: <sub-menu item> sub-menu item url validation
    Given I navigate to the main page
    And I accept the data handling dialog box
    When I hover over the "<sub-menu item>" sub-menu item
    Then  "<sub-menu item>" sub-menu item "<url>" url should point to the right page
    Examples:
      | sub-menu item                            | url                                                                |
      | About Us                                 | https://www.lifehack.org/about                                     |
      | Write for Us                             | https://www.lifehack.org/contribute                                |
      | Lifehack Show                            | https://www.lifehack.org/lifehackshow                              |
      | Lifehack Shop                            | https://shop.lifehack.org/                                         |
      | Live a Full Life                         | https://www.lifehack.org/the-full-life-framework                   |
      | Achieve Your Goals                       | https://www.lifehack.org/achieving-goals                           |
      | Get Motivated                            | https://www.lifehack.org/motivation-guide-how-to-get-motivated     |
      | Stay Focused                             | https://www.lifehack.org/how-to-focus                              |
      | Learn Faster                             | https://www.lifehack.org/learn-faster                              |
      | Get Fit                                  | https://www.lifehack.org/how-to-get-fit                            |
      | Boost Your Energy                        | https://www.lifehack.org/boost-energy                              |
      | Free Classes                             | https://www.lifehack.org/free-classes                              |
      | Mastercourses                            | https://www.lifehack.org/courses                                   |
      | Hacking Procrastination                  | https://start.lifehack.org/hacking-procrastination-register-y2uu5m |
      | Full Life Framework: The Essential Guide | http://g.lifehack.org/full-life-framework-essential-guide          |
      | Full Life Planner                        | https://shop.lifehack.org/products/the-full-life-planner           |
      | Full Life Assessment                     | https://app.assessmentgenerator.com/assessment/7625?group=Blog     |
      | Login                                    | https://academy.lifehack.org/sign_in                               |
      | Full Life Framework                      | http://g.lifehack.org/full-life-framework-workshop                 |
      | Make it Happen                           | http://g.lifehack.org/make-it-happen-special                       |
      | Contact Us                               | https://www.lifehack.org/contact                                   |
      | FAQ                                      | https://help.lifehack.org/                                         |
      | Facebook                                 | https://www.facebook.com/lifehackorg/                              |
      | Instagram                                | https://instagram.com/lifehackorg                                  |

  Scenario Outline: <social link> link url validation
    Given I navigate to the main page
    And I accept the data handling dialog box
    When I hover over the "<social link>" link
    Then  "<social link>" link "<url>" url should point to the right page
    Examples:
      | social link | url                                       |
      | facebook    | https://www.facebook.com/lifehackorg/     |
      | twitter     | https://twitter.com/lifehackorg/          |
      | pinterest   | https://pinterest.com/lifehack/           |
      | youtube     | https://www.youtube.com/user/LifehackOrg/ |
      | instagram   | https://instagram.com/lifehackorg         |

  Scenario: Terms and Conditions link validation
    Given I navigate to the main page
    And I accept the data handling dialog box
    When I click on the Terms and Conditions link
    Then the page for Terms and Conditions should open

  Scenario: Privacy Policy link validation
    Given I navigate to the main page
    And I accept the data handling dialog box
    When I click on the Privacy Policy link
    Then the page for Privacy Policy should open

  Scenario: Copyright text validation
    Given I navigate to the main page
    And I accept the data handling dialog box
    When I scroll down to the footer of the page
    Then the copyright text should be displayed
