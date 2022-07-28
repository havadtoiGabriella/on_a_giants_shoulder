Feature: Blog articles test

  Background: User accepts the data handling dialog box
    Given I navigate to the main page
    And I accept the data handling dialog box

  Scenario Outline: Opening blog articles
    Given I open the <page> blog page
    When I choose the <article> article
    Then I should be redirected to the <article> article's landing page
    Examples:
      | page             | article                                                      |
      | Focus            | The Flowtime Technique: A Pomodoro Alternative               |
      | Leadership       | How to Deal With Coworkers Who Complain A Lot                |
      | Diet & Nutrition | How to Create a Delicious and Healthy Meal Plan for the Week |

  Scenario Outline: Opening blog article with pagination
    Given I open the <page> blog page
    And I click on the 'See older posts' link
    When I choose the <article> article
    Then I should be redirected to the <article> article's landing page
    Examples:
      | page            | article                                                   |
      | Life Balance    | 10 Simple Ways to Find Balance and Get Your Life Back     |
      | Goal Getting    | How To Start Small And Make Your Goals Happen             |
      | Success Mindset | How to Work Hard the Smart Way: 4 Daily Rituals to Follow |

  Scenario Outline: Opening blog article writer's page
    Given I open the <page> blog page
    And I choose the <article> article
    When I click on <writer> writer's name
    Then I should be redirected to <writer> writer's profile page
    Examples:
      | page             | article                                                      | writer            |
      | Focus            | The Flowtime Technique: A Pomodoro Alternative               | Chris Porteous    |
      | Leadership       | How to Deal With Coworkers Who Complain A Lot                | Yair Nativ        |
      | Diet & Nutrition | How to Create a Delicious and Healthy Meal Plan for the Week | Dr. Harriet Holme |

  Scenario Outline: Opening post on blog article writer's page
    Given I open the <page> blog page
    And I choose the <article> article
    When I click on <writer> writer's name
    And I click on 'Posts'
    Then I should see all the posts that <writer> wrote
    Examples:
      | page             | article                                                      | writer            |
      | Focus            | The Flowtime Technique: A Pomodoro Alternative               | Chris Porteous    |
      | Leadership       | How to Deal With Coworkers Who Complain A Lot                | Yair Nativ        |
      | Diet & Nutrition | How to Create a Delicious and Healthy Meal Plan for the Week | Dr. Harriet Holme |

