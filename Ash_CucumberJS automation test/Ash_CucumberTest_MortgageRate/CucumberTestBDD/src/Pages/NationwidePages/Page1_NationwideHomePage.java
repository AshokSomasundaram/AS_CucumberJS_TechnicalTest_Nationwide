package Pages.NationwidePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page1_NationwideHomePage extends page {

	public static void NavigateUrl() {
		String url = "https://nationwide.co.uk";
		driver.navigate().to(url);
	}
	
	public static WebElement Mortgages() {
		return driver.findElement(By.xpath("//a[@href='/products/mortgages/our-mortgages/who-we-can-help']"));
	}

}
