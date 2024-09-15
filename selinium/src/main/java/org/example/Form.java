package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Form {
    public static void main(String[] args) {

        // Initialize ChromeOptions
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // Maximize the browser window

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver(options);

        try {
            // Open the HTML page
            driver.get("http://127.0.0.1:5500/html/index.html");

            // Fill out the form
            WebElement textField = driver.findElement(By.id("text"));
            WebElement passwordField = driver.findElement(By.id("password"));
            WebElement emailField = driver.findElement(By.id("email"));
            WebElement numberField = driver.findElement(By.id("number"));
            WebElement dateField = driver.findElement(By.id("date"));
            WebElement radioOption1 = driver.findElement(By.xpath("//input[@name='radio' and @value='option1']"));
            WebElement checkbox = driver.findElement(By.id("checkbox"));
            WebElement selectDropdown = driver.findElement(By.id("select"));
            WebElement textarea = driver.findElement(By.id("textarea"));
            WebElement fileInput = driver.findElement(By.id("file"));
            WebElement rangeInput = driver.findElement(By.id("range"));
            WebElement submitButton = driver.findElement(By.cssSelector("button[type='submit']"));

            // Interact with form elements
            textField.sendKeys("John Doe");
            passwordField.sendKeys("securepassword");
            emailField.sendKeys("john.doe@example.com");
            numberField.sendKeys("5");
            dateField.sendKeys("2024-09-15");
            radioOption1.click();
            checkbox.click();

            // Select an option from dropdown
            selectDropdown.sendKeys("Option 2");

            // Enter text in textarea
            textarea.sendKeys("This is a test message.");

            // Upload a file (provide a valid file path here)
            fileInput.sendKeys("D:\\java\\selinium\\file.txt");

            // Adjust range input
            rangeInput.sendKeys("75");

            // Submit the form
            submitButton.click();

            // Wait for the result text to appear (consider using WebDriverWait for better reliability)
            Thread.sleep(2000); // Sleep for 2 seconds

            // Verify the result
            WebElement resultElement = driver.findElement(By.id("result"));
            String resultText = resultElement.getText();

            if (resultText.contains("Form Submitted Successfully!")) {
                System.out.println("Test Passed: Form was submitted successfully.");
            } else {
                System.out.println("Test Failed: Form submission result did not match.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
