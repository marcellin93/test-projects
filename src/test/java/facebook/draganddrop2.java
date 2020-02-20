package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class draganddrop2 extends draganddrop1{
                                                    //SUB CLASS
public static void main(String[] args) {

	browser("http://demo.guru99.com/test/drag_drop.html");

WebElement s = driver.findElement(By.xpath("//li[@id='credit2']"));
WebElement d = driver.findElement(By.xpath("//ol[@id='bank']"));
	fill(s, d);
	WebElement s1 = driver.findElement(By.xpath("//li[@id='fourth']"));
	WebElement d1 = driver.findElement(By.xpath("//ol[@id='amt7']"));
fill(s1, d1);
WebElement s2 = driver.findElement(By.xpath("//li[@id='credit1']"));
WebElement d2 = driver.findElement(By.xpath("//ol[@id='loan']"));
fill(s2, d2);
WebElement s3 = driver.findElement(By.xpath("//li[@id='fourth'][1]"));
WebElement d3 = driver.findElement(By.xpath("//ol[@id='amt8']"));
fill(s3, d3);
	
	
	
	
}
}