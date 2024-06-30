package seleniumSession;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrokenLinksChecker {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
      // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the web page
        driver.get("https://naveenautomationlabs.com/opencart/");

        // Extract all links
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // Validate each link
        for (WebElement link : links) {
            String url = link.getAttribute("href");
            if (url != null && !url.isEmpty()) {
                checkLink(url);
                break;
            } else {
                System.out.println("Invalid link: " + link.getText());
                break;
            }
        }
        
       

        // Close the WebDriver
        driver.quit();
    }

    public static void checkLink(String url) {
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("HEAD");
            connection.connect();

            int responseCode = connection.getResponseCode();
            if (responseCode >= 400) {
                System.out.println(url + " is a broken link. Response Code: " + responseCode);
            } else {
                System.out.println(url + " is a valid link. Response Code: " + responseCode);
            }
        } catch (IOException e) {
            System.out.println("Error checking link: " + url);
            e.printStackTrace();
        }
    }
    
   
}
