package Week5day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
@Test
public class ServiceNow_Delete extends ServiceNow_BaseClass{
	
	public void delete()
	{
		
	
	driver.findElement(By.xpath("//input[@id='filter']")).sendKeys("incidents");
	driver.findElement(By.xpath("(//div[text()='Incidents'])[2]")).click();
	WebElement Frame2 = driver.findElement(By.xpath("//iframe[@id='gsft_main']"));
	driver.switchTo().frame(Frame2);
	//WebElement Frame3 =driver.findElement(By.xpath("//iframe[@id='templateIframe']"));
	//driver.switchTo().frame(Frame3);
	driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("INC0010071",Keys.ENTER);
	driver.findElement(By.xpath("//td[@class='vt'][1]")).click();
	
	driver.findElement(By.xpath("//button[@class='form_action_button  action_context btn btn-default'][3]")).click();
}
}