package Automation.Phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Loginpage extends LaunchBrowser {
	By Email= By.xpath("//input[@placeholder='Email']");
	By password= By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/form[1]/div[1]/div[5]/div[1]/div[2]/input[1]");
	By lsubmit=By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/form[1]/button[1]");
	
public void Lsubmit() throws InterruptedException {
		
		driver.findElement(lsubmit).click();
	}
public WebElement email1() {
	return driver.findElement(Email);
}
public WebElement password1() {
	return driver.findElement(password);
}
}

