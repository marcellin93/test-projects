package facebook;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
                               //SUB CLASS


public class rightclickdoubleclick2 extends rightclickdoubleclick1{

	public static void main(String[] args) throws AWTException {
		browser("http://www.greenstechnologys.com/");
		WebElement m = driver.findElement(By.xpath("//p[contains(text(),'Placements company ')]"));
		fill(m);


	}

}
