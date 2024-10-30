package Gun05;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.junit.Test;
public class _04_Navigating_Yeni extends BaseDriver{

        @Test
        public void Test1()
        {
            //driver.get("https://testpages.herokuapp.com/styled/index.html"")// siteyi aç
            driver.navigate().to("https://testpages.herokuapp.com/styled/index.html"); //siteye git,aç
            MyFunc.Bekle(2);

            WebElement link = driver.findElement(By.id("alerttest"));
            link.click(); //yeni sayfaya gidildi
            MyFunc.Bekle(2);


            driver.navigate().back();  //önceki sayfaya geri dön, geri okuma basılmış gibi
            MyFunc.Bekle(2);

            driver.navigate().forward();//bir ileri sayfaya git


            Assert.assertTrue("Beklenen sayfaya ulaşılmadı",driver.getCurrentUrl().equals("1https://testpages.eviltester.com/styled/alerts-test.html"));
            //Ben true bekliyorum,değilse göster, yoksa test passed
            //1 koyarak hata aldşrdık faile
            //hata varsa göster yoksa rahatsız etme assert.AssertTrue komutu if else yerine

            BekleKapat();

        }
}

