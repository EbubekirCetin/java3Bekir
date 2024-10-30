package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseDriver {
// PROJELERİ TEST ETMEK İÇİN KENDİ KALIPLARIMIZI OLUŞTURUYORUZ
    //SİTELERİ TEST EDERKEN BU KALIPLARIMI(BASEDRİVER ) HAZIR OLUCAK BUNLAR
    //KENDİ ÇALIŞMA ÇERÇEVEM KENDİ FİREMWORKUM
    //İNTERWİEW LERDE KENDİ YAPTIĞIN FİREMWORKLERDEN BAHSEDERMİSİN DİYE SORABİLİRLER

    public static  WebDriver driver;

    //bunun şartı extends olmasi ve başta yer alması
    //public static void BaslangicIslemleri()     //tear start()    (SİLİNDİ BİR ALT SATIR YAPIILDI)
    static //tear start()
    {
        driver=new ChromeDriver();


        //driver.manage().window();//Ekranı max yapıyor.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); //20 sn mühlet:sayfayı yükleme(doğru linkmi)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  //20 sn mühglet:elementi bulma mühleti


    }

    public static void BekleKapat()  //tearDown()
    {

        MyFunc.Bekle(3);
        driver.quit();


    }









}
