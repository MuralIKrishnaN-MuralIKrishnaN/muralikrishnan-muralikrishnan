package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	public WebDriver driver;
	By Operador=By.xpath("//input[@data-qa='celular-operator']");
	By Telcel=By.xpath("//div[@class='suggestion']//self::div/ul/li[2]");
	By Number=By.xpath("//input[@data-qa='celular-mobile']");
	By Amount=By.xpath("//input[@data-qa='celular-amount']");
	By dollar=By.xpath("//div[@class='suggestion']//child::ul[1]/li[1]");
	By Signture=By.xpath("//button[@data-qa='celular-pay']");
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub	
		this.driver=driver;
	}
	public PaymentPage getPayment()
	{
		driver.findElement(Signture).click();
		PaymentPage pp=new PaymentPage(driver);
		pp.getDetails();
		pp.getAuth();
		return pp;
	}
	public WebDriver getDetails()
	{
	driver.findElement(Operador).click();
	driver.findElement(Telcel).click();
	driver.findElement(Number).sendKeys("8465433546");
	driver.findElement(Amount).click();
	driver.findElement(dollar).click();
	return driver;
    }
}