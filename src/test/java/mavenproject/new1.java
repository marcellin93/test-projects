package mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class new1 extends baseclass{
	public static void main(String[] args) {
		browserlaunch("https://www.facebook.com/");
		WebElement txtuser = driver.findElement(By.id("email"));
		WebElement txtpass = driver.findElement(By.id("pass"));
		user(txtuser,"marcellin");
		pass(txtpass,"123456");
		WebElement login = driver.findElement(By.id("loginbutton"));
		click(login);
		System.out.println("*****************************");
	    System.out.println("********************END***************************");
	    System.out.println("****************** 3rd update **********************");
	    System.out.println("******************** new 3rd update **************************");
	    System.out.println("*****************//////////////////////////////////*********************");
	    System.out.println("michu");
   
}
}
