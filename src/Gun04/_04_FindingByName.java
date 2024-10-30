package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_FindingByName {
    public static void main(String[] args) {

        //By.Name()
        //Senaryo:(locator olarak name kullanılacak)
        //1- https://form.jotform.com/221934510376353
        //2- isim kutucuğuna "ismet"  yazdırınız
        //3- soyad kutucuğuna "temur" yazıdırınız

        WebDriver driver=new ChromeDriver();

        driver.get("https://form.jotform.com/221934510376353");
        driver.manage().window().maximize();  //Ekranı max yapıyor


        WebElement isimKutusu=driver.findElement(By.name("q8_name[first]"));
        isimKutusu.sendKeys("Bekir");
        MyFunc.Bekle(2);

        WebElement soyad=driver.findElement(By.name("q8_name[last]"));
        soyad.sendKeys("çetin");
        soyad.clear();  //kutucuğu temizler, burada kullanılması idi,TemurYılmaz yan yana yazacaktı
        soyad.sendKeys("beko");

        MyFunc.Bekle(2);
        WebElement btnsubmit= driver.findElement(By.id("input_2"));
        btnsubmit.click();


        MyFunc.Bekle(5);
        driver.quit();


    }
}
