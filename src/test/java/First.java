import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class First {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/Anna/Desktop/selenium/src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://it.easyum.ru/");

    }
    

    @Test
    public void test() {
           WebElement find = driver.findElement(By.xpath("//button[@class='red_btn top_order open_order_modal']"));
           find.click();

    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
