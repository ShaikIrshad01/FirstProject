package Automation.Phptravels;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testcase_4 {
	
	static By month= By.xpath("//div[16]//div[1]//tr[1]//th[2]");
	static By next=By.xpath("//div[16]//div[1]//tr[1]//th[3]");

	@Test
	public static void flight() throws Exception{
		
		Homepage h= new Homepage();
		h.Launch();
		h.flights();
		//h.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//h.driver.get(h.prop.getProperty("url"));
		
		FlightSearch f= new FlightSearch();
		f.fromcity().sendKeys(h.prop.getProperty("fromtext"));
		h.driver.findElement(By.xpath("//span[@class='select2-match'][contains(text(),'"+h.prop.getProperty("fromtext")+"')]")).click();
		f.tocity().sendKeys(h.prop.getProperty("Totext"));
		h.driver.findElement(By.xpath("//span[@class='select2-match'][contains(text(),'"+h.prop.getProperty("Totext")+"')]")).click();
		f.date().click();
		
		String str = h.driver.findElement(month).getText();
		
		while(!str.equalsIgnoreCase(h.prop.getProperty("departure_month_year"))) 
		{
			h.driver.findElement(next).click();
			str= h.driver.findElement(month).getText();
		}
		
		checkInDate(h.prop.getProperty("Ddate"));
		
		f.number_of_passengers().click();
		
		f.adultsclick().sendKeys(h.prop.getProperty("adults"));
		int val1 = Integer.parseInt(h.prop.getProperty("adults"));
		h.driver.findElement(By.xpath("//select[@id='madult']//option[@value='"+val1+"']")).click();
		
		f.childclick().sendKeys(h.prop.getProperty("child"));
		int val2 = Integer.parseInt(h.prop.getProperty("child"));
		h.driver.findElement(By.xpath("//select[@id='mchildren']//option[@value='"+val2+"']")).click();
		
		f.infantsclick().sendKeys(h.prop.getProperty("infant"));
		int val3 = Integer.parseInt(h.prop.getProperty("infant"));
		h.driver.findElement(By.xpath("//select[@id='minfant']//option[@value='"+val3+"']")).click();
		
		f.doneclick().click();
		Thread.sleep(1000);
		//h.driver.findElement(By.xpath("//button[@id='cookyGotItBtn']")).click();
		f.Fsearchbutton().click();
	}		
	

public static void checkInDate(String date){
		
		String d;
		Homepage h1= new Homepage();
		for(int i=1; i<=6;i++){
			for(int j=1; j<=7; j++){
				 d = h1.driver.findElement(By.xpath("//div[16]//tr["+i+"]//td["+j+"]")).getText();
				 if(d.equals("1")) {
					 for(int k=i; k<6; k++) {
						 for(int l=j; l<7; l++) {
							 d = h1.driver.findElement(By.xpath("//div[16]//tr["+k+"]//td["+l+"]")).getText();
							 if(d.equals(date))
									h1.driver.findElement(By.xpath("//div[16]//tr["+k+"]//td["+l+"]")).click();
						 }
					 }
			}
		}
	}
	}	
}


