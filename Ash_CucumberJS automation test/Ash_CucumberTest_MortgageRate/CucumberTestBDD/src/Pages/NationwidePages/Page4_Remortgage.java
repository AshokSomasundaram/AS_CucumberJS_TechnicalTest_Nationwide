package Pages.NationwidePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page4_Remortgage extends page {

	public static WebElement StartApplicationCheck() {
		assertEquals("Start your Remortgage application",
				driver.findElement(By.xpath("//div[@class='col col12']")).getText());
	}

}
