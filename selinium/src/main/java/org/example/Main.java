package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("D:\\java\\chromedriver-win64\\chromedriver.exe");
        if (file.exists()) {
            System.out.println("File exists.");
        } else {
            System.out.println("File does not exist.");
        }
        System.out.println(file.getAbsolutePath());
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        WebDriver driver = new ChromeDriver();
        try {
            // Navigate to Google
            driver.get("https://www.google.com");
            // Find the search box using its name attribute
            WebElement searchBox = driver.findElement(By.name("q"));

            // Type the search query
            searchBox.sendKeys("Selenium WebDriver");

            // Submit the search form
            searchBox.submit();

            // Wait for the results to load and display the title
            Thread.sleep(2000);  // Wait for 2 seconds

            // Print the title of the page
            System.out.println("Page title is: " + driver.getTitle());

            // Verify the title of the page
            if (driver.getTitle().contains("Selenium WebDriver")) {
                System.out.println("Test Passed!");
            } else {
                System.out.println("Test Failed.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }

    }
}