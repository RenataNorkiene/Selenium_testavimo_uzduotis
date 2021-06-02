import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {
    @BeforeTest
    public void setup(){
        Selenium.setup();
    }

    @Test
    public void addItemTest(){
        Selenium.addItem("Avatar", "nuotykiu", "grazus","gabus", 300);
        //Assert.assertEquals("Duomenys įrašyti sėkmingai", Selenium.getResults());
    }
    @Test
    public void badItemTest(){
        Selenium.badItem("+@@","@</a>@","/@", "@@@@@", 777777);

    }
    @Test
    public void deleteItemTest(){
        Selenium.deleteItem("13");
    }
    @Test
    public void  updateItemTest(){
        Selenium. updateItem("720","Avatar1","nuotykiu","grazus", "gabus", 123);
        //Assert.assertEquals("Įrašas paredaguotas sėkmingai", Selenium.getResults());
    }
    @Test
    public void illegalUpdateTest(){
        Selenium.illegalUpdate("97","@@!!","!!!??","!!!!!!","!1!1!1", 11111);

    }

    @AfterTest
    public void close(){
        Selenium.close();
    }
}


