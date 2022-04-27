import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test 
{	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\muralikrishnans\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	driver.get("http://sanbox.undostres.com.mx");
	driver.findElement(By.xpath("//input[@data-qa='celular-operator']")).click();
	driver.findElement(By.xpath("//div[@class='suggestion']//self::div/ul/li[2]")).click();
	/*List<WebElement> Operadors=driver.findElements(By.xpath("//input[@data-qa='celular-operator']"));
	System.out.println(Operadors.get(1).getText());
	 for(WebElement option:Operadors)
	 {
		 if(option.getText().equalsIgnoreCase("Telcel"))
		 {
			 option.click();
		 }
		 }*/
		WebElement Number=driver.findElement(By.xpath("//input[@data-qa='celular-mobile']"));
		/*Number.click();*/
	 Number.sendKeys("8465433546");
	 driver.findElement(By.xpath("//input[@data-qa='celular-amount']")).click();
	 driver.findElement(By.xpath("//div[@class='suggestion']//child::ul[1]/li[1]")).click();
	 /*List<WebElement> Amounts=driver.findElements(By.xpath("//input[@data-qa='celular-amount']"));
	 for(WebElement option:Amounts)
	 {
		 if(option.getText().equalsIgnoreCase("Recarga Saldo"))
		 {
			 option.click();
		 }
		 }*/
	 
	 driver.findElement(By.xpath("//button[@data-qa='celular-pay']")).click();
	 driver.findElement(By.xpath("//a[@id='new-card-toggle']")).click();
	 driver.findElement(By.xpath("//span[text()='Usar nueva tarjeta']")).click();
	 driver.findElement(By.xpath("//span[text()='Usar nueva tarjeta']")).click();
	 driver.findElement(By.xpath("//input[@id='cardnumberunique']")).sendKeys("4111111111111111");
	 driver.findElement(By.xpath("//input[@placeholder='Mes']")).sendKeys("11");
	 driver.findElement(By.xpath("//input[@placeholder='Año']")).sendKeys("25");
	 driver.findElement(By.xpath("//input[@placeholder='CVV']")).sendKeys("111");  
	 driver.findElement(By.xpath("//input[@class='form-control email preventChromeAutofill']")).sendKeys("test@test.com");
	 driver.findElement(By.xpath("//button[@id='paylimit']")).click();
	 }
}
