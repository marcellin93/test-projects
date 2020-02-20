package facebook;

import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert2 extends alert1{

	public static void main(String[] args) {
//http://demo.automationtesting.in/Alerts.html
getinput();
browser("http://demo.automationtesting.in/Alerts.html");
comparename("simple");
	}

}
