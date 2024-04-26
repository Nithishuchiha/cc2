package com.nithish;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    WebDriver driver;
    Actions actions;

    @BeforeTest
    public void CreateBrowser() {

        driver = new ChromeDriver();
    }

    @Test
    public void Testcase1() {
        try {

            driver.get("https://www.barnesandnoble.com/");
            driver.findElement(By.xpath("//*[@id='rhf_header_element']/nav/div/div[3]/form/div/div[1]")).click();
            driver.findElement(By.xpath("//*[@id=rhf_header_element']/nav/div/div[3]/form/div/div[1]/div/a[2]"))
                    .click();

            Thread.sleep(3000);
            // Searching Book
            driver.findElement(By.xpath("//*[@id='rhf_header_element']/nav/div/div[3]/form/div/div[2]/div/input[1]"))
                    .sendKeys("Chetan Bhagat");

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    // Testcase2
    @Test
    public void Testcase2() {
        try {

            Thread.sleep(2000);
            driver.get("https://www.barnesandnoble.com/");
            WebElement audioBookPath = driver.findElement(By.id("rhfCategoryFlyout_Audiobooks"));
            actions.moveToElement(audioBookPath);
            driver.findElement(By
                    .xpath("//*[@id='navbarSupportedContent']/div/ul/li[4]/div/div/div[1]/div/div[2]/div[1]/dd/a[1]"))
                    .click();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
