Feature: Blog articles test

  Background: User accepts the data handling dialog box
    Given I navigate to the main page
    And I accept the data handling dialog box

  Scenario Outline: Opening "<article>" article
    Given I navigate to the <page> blog page
    When I choose the "<article>" article
    Then I should be redirected to the "<article>" article's landing page
    Examples:
      | page               | article                                                      |
      | FOCUS              | The Flowtime Technique: A Pomodoro Alternative               |
      | GOAL_GETTING       | How to Find Motivation to Achieve Your Goal After a Setback  |
      | DIET_AND_NUTRITION | How to Create a Delicious and Healthy Meal Plan for the Week |

  #Scenario Outline: Opening a blog article with pagination
    # Given I open the <page> blog page
    # When I click on the 'See older posts' link
    # And I choose the <article> article
    # Then I should be redirected to the <article> article's landing page
    # Examples:
    #  | page               | article                                                      |
    #  | Life Balance       | 10 Simple Ways to Find Balance and Get Your Life Back        |
    #  | Goal Getting       | How To Start Small And Make Your Goals Happen                |
    #  | Success Mindset    | How to Work Hard the Smart Way: 4 Daily Rituals to Follow    |

  #Scenario Outline: Opening a blog article author's profile page
  #  Given I open the <page> blog page
  #  And I choose the "<article>" article
  #  When I click on "<writer>" writer's name
  # Then I should be redirected to "<writer>" author's profile page
  #  Examples:
  #    | page               | article                                                      | author            |
  #   | FOCUS              | The Flowtime Technique: A Pomodoro Alternative               | Chris Porteous    |
  #  | LEADERSHIP         | How to Deal With Coworkers Who Complain A Lot                | Yair Nativ        |
  # | DIET_AND_NUTRITION | How to Create a Delicious and Healthy Meal Plan for the Week | Dr. Harriet Holme |

 # Scenario Outline: Opening 'Posts' on blog article author's profile page
   #  Given I open the <page> blog page
   #  And I choose the <article> article
   # And I click on <author> author's name
   # When I click on 'Posts'
   # Then I should see all the posts that <author> wrote
   # Examples:
   #   | page             | article                                                      | author            |
   #   | Focus            | The Flowtime Technique: A Pomodoro Alternative               | Chris Porteous    |
   #   | Leadership       | How to Deal With Coworkers Who Complain A Lot                | Yair Nativ        |
   #   | Diet & Nutrition | How to Create a Delicious and Healthy Meal Plan for the Week | Dr. Harriet Holme |

  # Scenario Outline: Opening a blog article's Reference page
  #  Given I open the <page> blog page
  #  And I choose the <article> article
  #  When I click on the <reference> reference link
  #  Then I should be redirected to the reference's landing page
  #  Examples:
  #    | page             | article                                                      | reference                                                         |
  #    | Focus            | The Flowtime Technique: A Pomodoro Alternative               | Urgent Pigeon: Asset-Based Thinking: What can I build upon?       |
  #    | Leadership       | How to Deal With Coworkers Who Complain A Lot                | Harvard Business Review: Managing a Chronic Complainer            |
  #    | Diet & Nutrition | How to Create a Delicious and Healthy Meal Plan for the Week | Healthy Eating Dr: How Much Water Do You Need to Drink Every Day? |

