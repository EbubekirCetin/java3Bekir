package Gun05;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_GetAttribute {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://hepsiburada.com/");

        WebElement siparislerimLinki = driver.findElement(By.linkText("Siparişlerim"));
        System.out.println("SiparişlermiLinki.getText = " + siparislerimLinki.getText());

        //Bir Web Elementinin Attribute (özellikleri) ni alma
        System.out.println("SiparişlerimLinki.href = " + siparislerimLinki.getAttribute("href"));
        System.out.println("sparişlerimLinki.title = " + siparislerimLinki.getAttribute("title"));
        System.out.println("sipaişlerimLinki.rel = " + siparislerimLinki.getAttribute("rel"));


        MyFunc.Bekle(3);
        driver.quit();

    }
}
