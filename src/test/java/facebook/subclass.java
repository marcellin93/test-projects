package facebook;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class subclass extends baseclass{
public static void main(String[] args) throws IOException {
	browserlaunch("https://www.facebook.com/");
	WebElement usertext = driver.findElement(By.id("email"));
	fill(usertext, getdata(1,0));
	WebElement userpass = driver.findElement(By.id("pass"));
	fill(userpass, getdata(1,1));
	WebElement login = driver.findElement(By.id("loginbutton"));
	click(login);
}
}
