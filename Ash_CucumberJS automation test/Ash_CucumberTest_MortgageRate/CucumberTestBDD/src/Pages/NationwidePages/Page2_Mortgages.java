package Pages.NationwidePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page2_Mortgages extends page {

	public static WebElement OurMortgageRates() {
		return driver.findElement(By.xpath("//span[text()='Our mortgage rates']]"));
	}

}
