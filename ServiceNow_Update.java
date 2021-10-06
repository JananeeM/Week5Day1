package Week5day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ServiceNow_Update extends ServiceNow_BaseClass {
	
	@Test
	public void updateInstance()
	{
		driver.findElement(By.xpath("//input[@id='filter']")).sendKeys("incidents");
		driver.findElement(By.xpath("(//div[text()='Incidents'])[2]")).click();
		WebElement Frame2 = driver.findElement(By.xpath("//iframe[@id='gsft_main']"));
		driver.switchTo().frame(Frame2);
		//WebElement Frame3 =driver.findElement(By.xpath("//iframe[@id='templateIframe']"));
		//driver.switchTo().frame(Frame3);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("INC0010071",Keys.ENTER);
		driver.findElement(By.xpath("//td[@class='vt'][1]")).click();
		WebElement Urgency = driver.findElement(By.xpath("//select[@name='incident.urgency']"));
		Select drop=new Select(Urgency);
		drop.selectByIndex(0);
		
		WebElement State = driver.findElement(By.xpath("//select[@name='incident.state']"));
		Select drop1=new Select(State);
		drop1.selectByIndex(1);
		
		
		driver.findElement(By.xpath("//textarea[@id='activity-stream-work_notes-textarea']")).sendKeys("Important");
		driver.findElement(By.xpath("//button[@class='form_action_button  action_context btn btn-default'][1]")).click();
		
		
	}
	

}
