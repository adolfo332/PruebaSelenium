package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo {
	static WebDriver driver;
	
	public static void main(String[] args) {
	
		ChromeOptions opcion = new ChromeOptions(); // Se crea el objecto de clase ChromeOptions
		opcion.addArguments("--incognito");
		opcion.addArguments("--start-maximized");
		System.setProperty("webdriver.chrome.driver", "chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver(opcion); // Se crea el objecto de la clase ChromeDriver
		
		 driver.get("https://opensorce-demo.orangehrmlive.com/");
		
		 driver.close();
		 
		
		
		
	}

}
