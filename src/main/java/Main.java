import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Sandra\\kurs_qa\\hromdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.stealmylogin.com/demo.html");
        WebElement inputUsername= driver.findElement(By.xpath("/html/body/form/input[1]"));
        inputUsername.sendKeys("sandra");
        WebElement inputPassword= driver.findElement(By.xpath("/html/body/form/input[2]"));
        inputPassword.sendKeys("krstic");
        inputPassword.sendKeys(Keys.ENTER);

        String retriveCurrentUrl= driver.getCurrentUrl();
        System.out.println(retriveCurrentUrl);

        if (retriveCurrentUrl.equalsIgnoreCase("https://example.com/")) {
            System.out.println("Nice!");
        } else {
            System.out.println("Not nice!");
        }

    }
}
