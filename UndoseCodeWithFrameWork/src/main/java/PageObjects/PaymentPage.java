package PageObjects;
import java.beans.Visibility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentPage {
public WebDriver driver;
	
By Tarjeta=By.xpath("//a[@id='new-card-toggle']");
By Usar=By.xpath("//span[text()='Usar nueva tarjeta']");
By Numero=By.xpath("//input[@id='cardnumberunique']");
By Mes=By.xpath("//input[@placeholder='Mes']");
By Ano=By.xpath("//input[@placeholder='Año']");
By CVV=By.xpath("//input[@placeholder='CVV']");  
By email=By.xpath("//input[@class='form-control email preventChromeAutofill']");
By emailclick=By.xpath("//button[@id='paylimit']");
	
	public PaymentPage(WebDriver driver) {
		this.driver=driver;
	}
	public PopupPage getAuth()
	{
		driver.findElement(emailclick).click();	
		PopupPage pp1=new PopupPage(driver);
		return pp1;
	}
	public WebDriver getDetails()
	{
	driver.findElement(Tarjeta).click();
	WebDriverWait w=new WebDriverWait(driver, 5000);
	w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Usar nueva tarjeta']")));
	driver.findElement(Usar).click();
	driver.findElement(Usar).click();
	w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='cardnumberunique']")));
	driver.findElement(Numero).sendKeys("4111111111111111");
	driver.findElement(Mes).sendKeys("11");
	driver.findElement(Ano).sendKeys("25");
	driver.findElement(CVV).sendKeys("111");
	driver.findElement(email).sendKeys("test@test.com");
	return driver;
    }
}
