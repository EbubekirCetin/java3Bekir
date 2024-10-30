package Gun07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_Soru extends BaseDriver {
    // Senaryo
//        1- https://www.saucedemo.com/
//        2- login işlemini yapınız.
//        3- Sauce Labs Backpack  a tıklatın ve sepete ekletin.
//        4- Sonra geri dönün (Back to products e tıklatın)
//        5- Sauce Labs Bolt T-Shirt  a tıklatın ve sepete ekleyin.
//        6- sepete tıklatın
//        7- CheckOut a tıklatın
//        8- kullanıcı bilgilerini doldurup Continue ya tıklatın
//        9- Burada her bir eşyanın ücretlerinin toplamının aşağıdaki
//        Item total e eşit olup olmadığını Assert ile test ediniz.
//
//        Bu soruda tamamen XPATH kullanılacaktır.
    //    Assert.assertTrue(urunFiyatToplamlam == itemTotal)

    @Test
    public void Test1(){

        driver.navigate().to("https://www.saucedemo.com/");

        MyFunc.Bekle(2);

        WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
        username.sendKeys("standard_user");

        MyFunc.Bekle(1);

        WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
        Password.sendKeys("secret_sauce");

        MyFunc.Bekle(1);

        
        WebElement id = driver.findElement(By.xpath("//input[@id='login-button']"));
        id.click();

        MyFunc.Bekle(2);

        WebElement SauceLabsBackpack=driver.findElement(By.xpath("//div[@class='inventory_item_name ']"));
        SauceLabsBackpack.click();

        MyFunc.Bekle(2);




        //Sauce Labs Backpack










        driver.quit();





















    }





























}
