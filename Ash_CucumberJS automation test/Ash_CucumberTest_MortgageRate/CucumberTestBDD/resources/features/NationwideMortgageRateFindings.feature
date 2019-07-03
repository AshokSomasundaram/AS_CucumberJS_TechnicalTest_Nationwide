Feature: Find a mortgage rate
  As a new customer
  I want to find the mortgage rates available
  So that I can decide whether to switch my mortgage to Nationwide

  @Pending
  Scenario: Find mortgage rates
    Given I open the url "https://www.nationwide.co.uk"
		When I find the mortgage rate
		Then I check the rates for 5 yr fixed and apply for remortgage