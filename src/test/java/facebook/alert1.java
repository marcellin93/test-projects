package facebook;

import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class alert1 {
	static WebDriver driver;
	static Alert a,b,c;
	static Scanner s;
	public static  void getinput() {
		s=new Scanner(System.in);
		System.out.println("Enter the alert name");
		String name=s.nextLine(); }
	public static void browser(String value) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marcellin\\eclipse-workspace\\mavenproject\\driver\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get(value);
}
	public static void comparename(String name) {
	if (name.equals("simple")) {
	driver.findElement(By.xpath("//a[@href='#OKTab']")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
    a = driver.switchTo().alert();
	System.out.println(a.getText());
	a.accept();
	}
	if (name.equals("confirm")) {
	driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
    b = driver.switchTo().alert();
	System.out.println(b.getText());
	b.dismiss();
	}
	if (name.equals("prompt")) {
	driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
	c = driver.switchTo().alert();
	System.out.println(c.getText());
	c.sendKeys("marcellin");
	c.accept();
	}
	}
}
