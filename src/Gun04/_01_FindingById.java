package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_FindingById {
    public static void main(String[] args) {

        //senaryo
        //https://form.jotform.com/221934510376353 sayfasına gidınız
        //isim kutucuğuna "bekir yazdırınız"
        //soyad kutucuğuna "cetin" yazdırınız"


        //id=first_8

        WebDriver driver=new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        MyFunc.Bekle(2);

        WebElement isimkutusu=driver.findElement(By.id("first_8"));// id si first_8 olan elementi bul
        isimkutusu.sendKeys("bekir");// wbelemente verilen yazıyı yaz

        MyFunc.Bekle(2);

        WebElement soyIsimKutusu=driver.findElement(By.id("last_8"));
        soyIsimKutusu.sendKeys("çetin");


        MyFunc.Bekle(5);
        driver.quit();


    }
}
