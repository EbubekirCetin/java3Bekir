package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _05_FindingByClassName {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement element= driver.findElement(By.className("form-sub-label"));
        System.out.println("element.getText =" + element.getText() );
        //findElement: Locator birden fazla elemanı işaret bile, ilkini bulur

        List<WebElement> elementler=driver.findElements(By.className("form-sub-label"));

        for (WebElement e:elementler)
            System.out.println("e.getText()" + e.getText());

        System.out.println("elementler.size() = "   + elementler.size());


        MyFunc.Bekle(3);
        driver.quit();






    }
}
