import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class cancel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.ie.driver","C:\\Users\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("http://computer-database.herokuapp.com/computers"); 
	    driver.findElement(By.id("add")).click();
	    driver.findElement(By.id("name")).sendKeys("CRUD1");
	    driver.findElement(By.id("introduced")).sendKeys("2018-01-01");
	    driver.findElement(By.id("discontinued")).sendKeys("2019-03-03");
	    Select company = new Select (driver.findElement(By.id("company")));
	    company.selectByVisibleText("IBM");
	    driver.findElement(By.xpath("//*[@id='main']/form/div/a")).click();
	    driver.navigate().to("http://computer-database.herokuapp.com/computers");
	}

}
