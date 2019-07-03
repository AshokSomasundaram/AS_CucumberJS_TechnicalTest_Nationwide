package info.seleniumcucumber.userStepDefintions;

import org.openqa.selenium.WebDriver;

import Pages.AppleMainPage.AddToBagPage;
import Pages.AppleMainPage.AppleMainPage;
import Pages.AppleMainPage.CheckOutPage;
import Pages.AppleMainPage.Mac;
import Pages.AppleMainPage.MacAccessories;
import Pages.AppleMainPage.MacBookPro;
import Pages.AppleMainPage.MacBookProTradeIn;
import Pages.AppleMainPage.MacBookProTradeInCustomise15inch;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class UserStepDefinitions {

	public static WebDriver driver;

	@Given("I go to the url")
	public void urlNavigation() {

		Page1_NationwideHomePage.NavigateUrl();

	}

	@When("I find the mortgage rate with the following options")
	public void MortgageRateFindings() {

		Page1_NationwideHomePage.Mortgages().click();
		Page2_Mortgages.OurMortgageRates().click();
		Page3_NationwideMortgageRates.NewMortgageCustomer().click();
		Page3_NationwideMortgageRates.MortgageType().click();
		Page3_NationwideMortgageRates.PropertyValue().sendKeys("£300000");
		Page3_NationwideMortgageRates.MortgageAmount().sendKeys("£150000");
		Page3_NationwideMortgageRates.Term().sendKeys("20");
		Page3_NationwideMortgageRates.FindMortgageRate().click();
		Page3_NationwideMortgageRates.MortgageRateType().click();
		Page3_NationwideMortgageRates.ProductFee().click();

	}

	@Then("I check the rates for 5 yr fixed and apply for remortgage")
	public void ApplyFixed5yrMortgage() {
		Page3_NationwideMortgageRates.RatesTable5yr().click();
		Page3_NationwideMortgageRates.ApplyFixed5yr().click();
		String StartApplicationCheck = Page4_Remortgage.StartApplication().getText();

	}

}