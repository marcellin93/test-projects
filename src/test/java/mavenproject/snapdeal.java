package mavenproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class snapdeal {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Marcellin\\\\eclipse-workspace\\\\demo1\\\\driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.findElement(By.id("inputValEnter")).sendKeys("iphone x");
		driver.findElement(By.xpath("//span[text()='Search']")).click();
         List<WebElement> commonname = driver.findElements(By.xpath("//p[@class='product-title']"));
		
		for (WebElement x : commonname) {
		        System.out.println(x.getText());			
		        }
		Thread.sleep(3000);
		WebElement ini = driver.findElement(By.xpath("//input[@name='fromVal']"));
	ini.sendKeys("20");
		WebElement fin = driver.findElement(By.xpath("//input[@name='toVal']"));
		fin.sendKeys("30");
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		
		/*System.out.println("********************************************************************************");
		 List<WebElement> rate = driver.findElements(By.xpath("//p[@class='product-title']"));

			for (WebElement x : rate) {
			        System.out.println(x.getText());			
			        }*/
		
	}

}
