package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_WebElementGetText {
    public static void main(String[] args) {       //işlem başarılı yazısı gözüküyormu

        WebDriver driver=new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        //  sublabel_8_firs
        //  sublabel_8_last

        WebElement labelFirstName=driver.findElement(By.id("sublabel_8_first"));  //label:etiket
        System.out.println(labelFirstName.getText());  //Web elementin ekranda çıkan yazısı

        WebElement labelLastName=driver.findElement(By.id("sublabel_8_last"));
        System.out.println(labelLastName.getText());    //Web elementin ekranda çıkan yazısı
                                                        //getText yazısı ile alıyoruz
        MyFunc.Bekle(3);
        driver.quit();


    }
}
