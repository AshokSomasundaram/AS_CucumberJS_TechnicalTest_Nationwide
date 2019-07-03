package Pages.NationwidePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page3_NationwideMortgageRates extends page {

	public static WebElement NewMortgageCustomer() {
		return driver.findElement(By.xpath("//button[text()='No']"));

	}

	public static WebElement MortgageType() {
		return driver.findElement(By.xpath("//button[text()='I'm changing lender']"));

	}

	public static WebElement PropertyValue() {
		return driver.findElement(By.id("SearchPropertyValueLabel"));

	}

	public static WebElement MortgageAmount() {
		return driver.findElement(By.id("SearchMortgageAmountLabel"));

	}

	public static WebElement Term() {
		return driver.findElement(By.id("Term"));

	}

	public static WebElement FindMortgageRate() {
		return driver.findElement(By.xpath("//button[text()='Find a mortgage rate']"));

	}

	public static WebElement MortgageRateType() {
		return driver.findElement(By.id("input-fixed"));
	}

	public static WebElement ProductFee() {
		return driver.findElement(By.id("product-fee-fee"));
	}

	public static WebElement RatesTable5yr() {
		return driver.findElement(By.xpath("//a[@href='#prod140276']"));
	}

	public static WebElement ApplyFixed5yr() {
		return driver.findElement(By.id("di-id-7d724c5f-97f909be"));
	}
}
