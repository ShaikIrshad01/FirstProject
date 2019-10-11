package Automation.Phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Hotel_Search extends LaunchBrowser {

	By city_click= By.xpath("//span[contains(text(),'Search by Hotel or City Name')]");
	By city_Text= By.xpath("//div[@id='s2id_location']//a[@class='select2-choice select2-default']");
	By check_in= By.xpath("//div[@id='dpd1']//input[@placeholder='Check in']");
	By guests= By.xpath("//input[@id='htravellersInput']");
	By adults= By.xpath("//input[@id='hadultInput']");
	By child= By.xpath("//input[@id='hchildInput']");
	By search= By.xpath("//button[@class='btn btn-lg btn-block btn-primary pfb0 loader']");
	
	
	
	public WebElement city() {
		driver.findElement(city_click).click();
		return driver.findElement(city_Text);
	}
	
	public WebElement checkIn() {
		return driver.findElement(check_in);
	}
	
	public WebElement guests() {
		return driver.findElement(guests);
	}
	
	public WebElement adults(){
		return driver.findElement(adults);
	}
	
	public WebElement child() {
		return driver.findElement(child);
	}
	
	public WebElement hotelSearchButton(){
		return driver.findElement(search);
	}
}
