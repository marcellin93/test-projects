package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
                                            //BASE CLASS
public class scrolldownscrollup2 extends scrolldownscrollup1{

	public static void main(String[] args) throws InterruptedException {
		browser("https://www.toolsqa.com/");
		WebElement pdown = driver.findElement(By.xpath("//a[text()='Video Tutorials']"));
		pagedown(pdown);
		Thread.sleep(3000);
		WebElement pup = driver.findElement(By.xpath("//span[text()='Automation Tools Tutorial']"));
        pageup(pup);
	}

}
