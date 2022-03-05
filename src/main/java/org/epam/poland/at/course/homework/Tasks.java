package org.epam.poland.at.course.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Tasks {

    public static String Task11() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://www.amazon.com/");

        WebElement deliverButton = driver.findElement(By.xpath("//*[@id=\"nav-global-location-popover-link\"]"));
        deliverButton.click();

        WebElement deliveryPostalCodeInfo = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"GLUXZipUpdateInput\"]")));
        deliveryPostalCodeInfo.sendKeys("99801");

        WebElement applyButton = driver.findElement(By.xpath("//*[@id=\"GLUXZipUpdate\"]/span/input"));
        applyButton.click();


        WebElement continueButton = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[5]/div/div/div[2]/span/span/input")));
        continueButton.click();

        WebElement deliverText = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),\"Juneau\")]")));
        String result = deliverText.getText();

        driver.close();
        driver.quit();



        return result;
    }

    public static boolean Task12() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");

        WebElement deliverButton = driver.findElement(By.xpath("//*[@id=\"nav-global-location-popover-link\"]"));
        deliverButton.click();

        WebElement deliveryCountriesList = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"GLUXCountryListDropdown\"]/span/span")));
        deliveryCountriesList.click();

        WebElement deliveryCountry = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),\"Poland\")]")));

        boolean result = deliveryCountry.getText().contains("Poland");

        driver.close();
        driver.quit();

        return result;

    }

    public static boolean Task13() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");

        WebElement deliverButton = driver.findElement(By.xpath("//*[@id=\"nav-global-location-popover-link\"]"));
        deliverButton.click();

        WebElement deliveryCountriesList = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"GLUXCountryListDropdown\"]/span/span")));
        deliveryCountriesList.click();

        WebElement deliveryCountry = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class,\"scroll\")]//a[contains(text(), \"Canada\")][last()]")));
        deliveryCountry.click();

        WebElement doneButton = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div/div[2]/span/span/span/button")));
        doneButton.click();

        WebElement goods = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div[1]/div/div[2]/div[1]/div[1]/a/div[1]/img")));
        goods.click();

        WebElement good = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img"));
        good.click();

        WebElement goodCountry = driver.findElement(By.xpath("//*[contains(@class,\"inner\")]//*[contains(text(),\"Canada\")]"));

        boolean result = goodCountry.getText().contains("Canada");

        driver.close();
        driver.quit();

        return result;
    }
}
