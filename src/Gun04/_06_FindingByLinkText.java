package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_FindingByLinkText {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.get("https://hepsiburada.com/");



        WebElement siparişlerimLinki=driver.findElement(By.linkText("Siparişlerim"));

        System.out.println("siparişlerimLinki = "+siparişlerimLinki.getText());


        //PartialLinktext:Linkin görünen yazısının bir kısmını selector olarak kullanabilirsiniz
        WebElement link2=driver.findElement(By.partialLinkText("Süper Fiyat"));
        System.out.println("link2.gettext = ()"+link2.getText());


        MyFunc.Bekle(3);
        driver.quit();   //bu driver üzerinden açılmış bütün tarayıcıları kapatır.
        //driver.close()// bu driver üzerinden açılmış o anda aktif olan tarayıcıyı kapatır








    }
}
