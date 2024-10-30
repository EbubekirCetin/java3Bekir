package Gun05;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_GetCassValue_Yeni extends BaseDriver {
    public static void main(String[] args) {
        //BaslangicIslemleri(); direk static bölüm çalıştı


        driver.get("https://snapdeal.com/");//https://snapdeal.com/

        WebElement aramaKutusu= driver.findElement(By.id("inputValEnter"));

        //parametrelerin değerini veriyor8682151000256

        System.out.println("aramaKutusu.class = "+ aramaKutusu.getAttribute("class"));

        //elementi şekillerndiren değerleri veriyor
        System.out.println("aramaKutusu.color = "+ aramaKutusu.getCssValue("color") );
        System.out.println("aramaKutusu.background = "+ aramaKutusu.getCssValue("background") );
        System.out.println("aramaKutusu.font-size = "+ aramaKutusu.getCssValue("font-size") );
        System.out.println("aramaKutusu.color = "+ aramaKutusu.getCssValue("color") );




        BekleKapat();






    }
}
