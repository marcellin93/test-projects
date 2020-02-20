package facebook;

import java.util.Scanner;

import org.apache.poi.ss.formula.functions.IfFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class dropdown1 {
    //BASE CLASS
static WebDriver driver;
static Select s;
static Scanner sc;
public static  void getinput() {
	sc=new Scanner(System.in);
	System.out.println("Enter the alert name");
	String name=sc.nextLine(); }


public static void browser(String value) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marcellin\\eclipse-workspace\\mavenproject\\driver\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get(value);
}	

	public static void select(WebElement source,String name) {
		if (name.equals("singleselect")) {
			s= new Select(source);
			s.selectByIndex(2);
			s.selectByIndex(4);
		}if (name.equals("multiselect")) {
			s= new Select(source);
			s.selectByIndex(2);
		}
		
         }
}


