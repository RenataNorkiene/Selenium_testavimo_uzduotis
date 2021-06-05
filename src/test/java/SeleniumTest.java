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
        Assert.assertEquals("Duomenys įrašyti sėkmingai", Selenium.getResults1());
    }
    @Test
    public void badItemTest(){
        Selenium.badItem("+@@","@</a>@","/@", "@@@@@", 777777);
        Assert.assertEquals("Duomenų įvedimo klaida", Selenium.getResults2());
    }
    @Test
    public void deleteItemTest(){
        Selenium.deleteItem("13");
    }
    @Test
    public void  updateItemTest(){
        Selenium. updateItem("720","Avatar1","nuotykiu","grazus", "gabus", 123);
        Assert.assertEquals("Įrašas paredaguotas sėkmingai", Selenium.getResults1());
    }
    @Test
    public void illegalUpdateTest(){
        Selenium.illegalUpdate("97","@@!!","!!!??","!!!!!!","!1!1!1", 11111);
        Assert.assertEquals("Blogai įvesti duomenys redaguojant įrašą", Selenium.getResults2());
    }

    @AfterTest
    public void close(){
        Selenium.close();
    }
}




