import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String exactTitle = "Sign In";

		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://adc-fap0846-fa-ext.oracledemos.com/fscmUI/faces/FuseWelcome");

		String actualTitle = driver.getTitle();
		System.out.println("Actual Title: " + actualTitle);

		if (driver.getTitle().equals("Sign In")) {

			System.out.println("Verification pass");

		} else {

			System.out.println("Verification fail");

		}

		// baseUrl = driver.get("https://google.com");

		driver.navigate().forward();

		driver.navigate().to("http://google.com");

		driver.navigate().back();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate().refresh();
		//driver.close();

	}
}
