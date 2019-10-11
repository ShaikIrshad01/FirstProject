package Automation.Phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Testcase_5 {

	static By Dmonth= By.xpath("//div[11]//div[1]//tr[1]//th[2]");
	static By next=By.xpath("//div[11]//div[1]//tr[1]//th[3]");
	static By guests= By.xpath("//select[@id='adults']");
	static By tour_type= By.xpath("//select[@id='tourtype']");
	
	@Test
	public static void tour() throws Exception {
		
		Homepage h= new Homepage();
		h.Launch();
		h.tours();
		Toursearch t= new Toursearch();
		t.Destinationcity().click();;
		//sendKeys(h.prop.getProperty("DText"));
		//h.driver.findElement(By.xpath("//div[@class='select2-result-label'][contains(text(),'"+h.prop.getProperty("DText")+"')]")).click();
		String city= h.prop.getProperty("DText");
		h.driver.findElement(By.xpath("//div[@class='select2-result-label'][contains(text(),'"+city+"')]")).click();
		//h.driver.findElement(By.xpath("//div[contains(text(),'"+h.prop.getProperty("DText")+"')]")).click();
	
		
		/*t.Tdate().click();
		String str = h.driver.findElement(Dmonth).getText();
		
		while(!str.equalsIgnoreCase(h.prop.getProperty("tour_month_year"))) {
			h.driver.findElement(next).click();
			str= h.driver.findElement(Dmonth).getText();
		}
		
		tourDate(h.prop.getProperty("tour_date"));
		*/
		//no. of guests
		Select guest= new Select(h.driver.findElement(guests));
		guest.selectByVisibleText(h.prop.getProperty("guests"));
		
		//tour type
		Select tr= new Select(h.driver.findElement(tour_type));
		tr.selectByValue("187");
		
		t.Tsearch().click();
		Thread.sleep(10000);
		h.driver.close();
}
	
public static void tourDate(String date){
	
	String d;
	Homepage h1= new Homepage();
	for(int i=1; i<=6;i++){
		for(int j=1; j<=7; j++){
			 d = h1.driver.findElement(By.xpath("//div[11]//tr["+i+"]//td["+j+"]")).getText();
			 if(d.equals("1")) {
				 for(int k=i; k<6; k++) {
					 for(int l=j; l<7; l++) {
						 d = h1.driver.findElement(By.xpath("//div[11]//tr["+k+"]//td["+l+"]")).getText();
						 if(d.equals(date))
								h1.driver.findElement(By.xpath("//div[11]//tr["+k+"]//td["+l+"]")).click();
					 }
				 }
		}
	}
}
}}

//div[contains(text(),'Sheraton Trip')]