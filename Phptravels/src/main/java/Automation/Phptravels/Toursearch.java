package Automation.Phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Toursearch extends LaunchBrowser{
	
	By Dclick = By.xpath("//span[contains(text(),'Search by Listing or City Name')]");
	By Dcity = By.xpath("//div[@id='s2id_autogen3']//a[@class='select2-choice select2-default']");
	By date = By.xpath("//div[@id='tchkin']//input[@placeholder='Check in']");
	By guests = By.xpath("//select[@id='adults']");
	By search = By.xpath("//div[@class='col-md-2 form-group go-right col-xs-12 search-button']//button[@class='btn-primary btn btn-lg btn-block pfb0 loader'][contains(text(),'Search')]");
	
	public WebElement Destinationcity() {
		return driver.findElement(Dclick);
	//driver.findElement(Dcity);
	}
	public WebElement Tdate() {
		return driver.findElement(date);
	}
	public WebElement Tguests() {
		return driver.findElement(guests);
	}
	
	public WebElement Tsearch() {
		return driver.findElement(search);
	}
}
