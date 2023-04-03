package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenAppication {

	public static void main(String[] args)
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRATIK\\Downloads\\ch\\cdriver.exe");
		
		WebDriver driver=new ChromeDriver(option);
		
		driver.get("https://www.amazon.in/");

	}

}
