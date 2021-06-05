import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Selenium {

    private static WebDriver browser;

    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "webDrivers/chromedriver91.exe");

        browser = new ChromeDriver();
        browser.get("http://kitm.epizy.com/filmai.php");
    }

    public static void addItem(String keyword, String keyword2, String keyword3, String keyword4, Integer keyword5){
        WebElement nameField = browser.findElement(By.name("pavadinimas"));
        nameField.sendKeys(keyword);
        WebElement genreField = browser.findElement(By.name("zanras"));
        genreField.sendKeys(keyword2);
        WebElement actorField = browser.findElement(By.name("aktoriai"));
        actorField.sendKeys(keyword3);
        WebElement producerField = browser.findElement(By.name("rezisierius"));
        producerField.sendKeys(keyword4);
        WebElement timeField = browser.findElement(By.name("trukme"));
        timeField.sendKeys(String.valueOf(keyword5));
        WebElement sendField = browser.findElement(By.name("insert"));
        JavascriptExecutor executor = (JavascriptExecutor) browser;
        executor.executeScript("arguments[0].click();", sendField);

    }
    public static void badItem(String keyword, String keyword2, String keyword3, String keyword4, Integer keyword5){
        WebElement nameField = browser.findElement(By.name("pavadinimas"));
        nameField.sendKeys(keyword);
        WebElement genreField = browser.findElement(By.name("zanras"));
        genreField.sendKeys(keyword2);
        WebElement actorField = browser.findElement(By.name("aktoriai"));
        actorField.sendKeys(keyword3);
        WebElement producerField = browser.findElement(By.name("rezisierius"));
        producerField.sendKeys(keyword4);
        WebElement timeField = browser.findElement(By.name("trukme"));
        timeField.sendKeys(String.valueOf(keyword5));
        WebElement sendField = browser.findElement(By.name("insert"));
        JavascriptExecutor executor = (JavascriptExecutor) browser;
        executor.executeScript("arguments[0].click();", sendField);

    }
    public static void deleteItem(String keyword){
        WebElement idField = browser.findElement(By.name("id"));
        idField.sendKeys(keyword);
        WebElement deleteField = browser.findElement(By.name("delete"));
        JavascriptExecutor executor = (JavascriptExecutor) browser;
        executor.executeScript("arguments[0].click();", deleteField);

    }
    public static void  updateItem(String keyword,String keyword2,String keyword3,String keyword4, String keyword5, Integer keyword6){
        WebElement idField = browser.findElement(By.name("id"));
        idField.sendKeys(keyword);
        WebElement nameField = browser.findElement(By.name("pavadinimas"));
        nameField.sendKeys(keyword2);
        WebElement genreField = browser.findElement(By.name("zanras"));
        genreField.sendKeys(keyword3);
        WebElement actorField = browser.findElement(By.name("aktoriai"));
        actorField.sendKeys(keyword4);
        WebElement producerField = browser.findElement(By.name("rezisierius"));
        producerField.sendKeys(keyword5);
        WebElement timeField = browser.findElement(By.name("trukme"));
        timeField.sendKeys(String.valueOf(keyword6));
        WebElement updateField = browser.findElement(By.name("update"));
        JavascriptExecutor executor = (JavascriptExecutor) browser;
        executor.executeScript("arguments[0].click();", updateField);

    }

    public static void illegalUpdate(String keyword,String keyword2,String keyword3,String keyword4, String keyword5, Integer keyword6){
        WebElement idField = browser.findElement(By.name("id"));
        idField.sendKeys(keyword);
        WebElement nameField = browser.findElement(By.name("pavadinimas"));
        nameField.sendKeys(keyword2);
        WebElement genreField = browser.findElement(By.name("zanras"));
        genreField.sendKeys(keyword3);
        WebElement actorField = browser.findElement(By.name("aktoriai"));
        actorField.sendKeys(keyword4);
        WebElement producerField = browser.findElement(By.name("rezisierius"));
        producerField.sendKeys(keyword5);
        WebElement timeField = browser.findElement(By.name("trukme"));
        timeField.sendKeys(String.valueOf(keyword6));
        WebElement updateField = browser.findElement(By.name("update"));
        JavascriptExecutor executor = (JavascriptExecutor) browser;
        executor.executeScript("arguments[0].click();", updateField);

    }

    public static void main(String [] args) { //args gauti vartotojo parametrus
        System.out.println("testavimas");
        setup();
        getResults1();
        getResults2();
        addItem("penktadienis", "penktadienis", "penktadienis","penktadienis", 123);
        badItem("+@@","@</a>@","/@", "@@@@@", 3333333);
        deleteItem("13");
        updateItem("45","pirmadienis","pirmadienis","pirmadienis", "pirmadienis", 123);
        illegalUpdate("97","@@!!","!!!??","!!!!!!","!1!1!1", 77777);

        browser.close();
    }
    public static String getResults1(){
        WebElement result1 = browser.findElement(By.className("msg-good"));
        String resultStr = result1.getText();

        System.out.println(result1);
        return resultStr;
    }
    public static String getResults2(){

        WebElement result2 = browser.findElement(By.className("msg-bad"));
        String resultStr = result2.getText();

        System.out.println(result2);
        return resultStr;
    }


    public static void close(){
        browser.close();
    }
}