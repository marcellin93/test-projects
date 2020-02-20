package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class dropdown2 extends  dropdown1{

	public static void main(String[] args) {
		getinput();
	browser("https://www.toolsqa.com/automation-practice-form/");
		WebElement a = driver.findElement(By.xpath("//select[@id='selenium_commands']"));
		select(a, "singleselect");
		WebElement a1 = driver.findElement(By.xpath("//select[@id='continentsmultiple']"));
	select(a1, "multiselect");
		
		
	}

}
