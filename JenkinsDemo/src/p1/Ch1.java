package p1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ch1 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 @Test
		 
			public void testjenkins() {
				
				System.out.println("hello world");
				
				WebDriver driver=new ChromeDriver();
				driver.get("http://www.facebook.com");
				driver.getTitle();
				
				driver.quit();


	}

}
