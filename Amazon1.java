package amazon1.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vinoth kumar\\eclipse-workspace\\Excel22Project\\driver\\driver2\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in/");
Actions a = new Actions(driver);
WebElement s =driver.findElement(By.xpath("//span[text()='Prime']"));
a.moveToElement(s).perform();
Thread.sleep(3000);
s.click();
	}

}
