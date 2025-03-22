import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.util.List;

public class SeleniumDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        WebElement usernameInputField = driver.findElement(By.id("username"));
        WebElement usernameInputFieldXpath = driver.findElement(By.xpath("//input[@id = 'username']"));
        WebElement usernameInputFieldCss = driver.findElement(By.cssSelector("input[id='username']"));


        WebElement passwordInputField = driver.findElement(By.id("password"));
        WebElement passwordInputFieldXpath = driver.findElement(By.xpath("//input[@id = 'password']"));
        WebElement passwordInputFieldCss = driver.findElement(By.cssSelector("input[id='password']"));


        WebElement submitButton = driver.findElement(By.className("btn"));
        WebElement submitButtonXpath = driver.findElement(By.xpath("//button[@id = 'submit']"));
        WebElement submitButtonCss = driver.findElement(By.cssSelector("button[id='submit']"));


        List<WebElement> inputFields = driver.findElements(By.tagName("input"));

        WebElement linkTextLocator = driver.findElement(By.linkText(" Practice Test Automation."));
        WebElement partialLinkTextLocator = driver.findElement(By.partialLinkText("Teste Automation"));

        WebElement passwordFieldBelowUsername = driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.id("username")));
        WebElement privacyPolicyLink = driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(By.partialLinkText("Teste Automation"));

        driver.quit();
    }

    private static String chromeTest(String url){
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String title = driver.getTitle();
        driver.quit();
        return title;
    }
}
