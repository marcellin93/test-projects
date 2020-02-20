package facebook;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class new2 extends new1 {

	public static void main(String[] args) throws IOException {
		browserlaunch("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		fill(username, getdata(1,0));
		WebElement password = driver.findElement(By.id("pass"));
		fill(password, getdata(1,1));
		WebElement login = driver.findElement(By.id("loginbutton"));
		click(login);
		quitbrowser();
			}
	
}

