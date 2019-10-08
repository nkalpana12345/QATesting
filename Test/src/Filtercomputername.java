import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Filtercomputername {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


			System.setProperty("webdriver.ie.driver","C:\\Users\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		    driver.get("http://computer-database.herokuapp.com/computers"); 
		    driver.findElement(By.id("searchbox")).sendKeys("CRUD");
		    driver.findElement(By.id("searchsubmit")).click();
	}
}