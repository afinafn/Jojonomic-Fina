package Jojonomic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage {
    public static void main(String[] arg) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/finafany/Documents/Jojonomic-Fina/driver/chromedriver");
        WebDriver servicensw = new ChromeDriver();
        servicensw.get("https://www.service.nsw.gov.au/");
        servicensw.manage().window().maximize();

        //JavascriptExecutor js = (JavascriptExecutor) servicensw;
       // WebElement kliksearchview = servicensw.findElement(By.xpath("//*[@id=\"page-title\"]"));
       // Thread.sleep(1000);
       // js.executeScript("arguments[0].scrollIntoView();", kliksearchview);
       // Thread.sleep(2000);



       //WebElement pencarian1 = servicensw.findElement(By.xpath("//*[@id=\"homeautosuggestpuOqlIx3hBg\"]/input"));
      // pencarian1.sendKeys("Apply for a number plate");
       //Thread.sleep(2000);



        JavascriptExecutor js = (JavascriptExecutor) servicensw;
        js.executeScript("window.scrollBy(0,350)", "");

       // WebElement pencarian = servicensw.findElement(By.xpath("//*[@id=\"homeautosuggestpuOqlIx3hBg\"]/input"));
       // pencarian.sendKeys("Apply for a number plate");
       // Thread.sleep(2000);

      //  WebElement kliksearch = servicensw.findElement(By.xpath("//*[@id=\"block-content\"]/article/section[1]/div/div[1]/header/div[2]/div/form/div[2]/button"));
      //  kliksearch.click();
      //  Thread.sleep(2000);


      //  WebElement kliksearchview = servicensw.findElement(By.xpath("//*[@id=\"search\"]/div/div/div[9]/p"));
      //  Thread.sleep(1000);
      //  js.executeScript("arguments[0].scrollIntoView();", kliksearchview);
      //  Thread.sleep(2000);


        WebElement klikfindlocation = servicensw.findElement(By.xpath("//*[@id=\"global-header\"]/div/header/div[2]/div/nav/ul/li[4]/a"));
        Thread.sleep(2000);

        js.executeScript("arguments[0].scrollIntoView();", klikfindlocation);
        Thread.sleep(2000);
        klikfindlocation.click();
        Thread.sleep(3000);

        //Scroll//
        JavascriptExecutor pr2 = (JavascriptExecutor) servicensw;
        WebElement scroll_lokasi = servicensw.findElement(By.xpath("//*[@id=\"locatorListView\"]/div/div/p"));
        pr2.executeScript(  "arguments[0].scrollIntoView();", scroll_lokasi);
        //End//

        WebElement pencarianlokasi = servicensw.findElement(By.xpath("//*[@id=\"locatorTextSearch\"]"));
        pencarianlokasi.sendKeys("Sydney 2000");
        Thread.sleep(3000);


        WebElement kliksearchbutton = servicensw.findElement(By.xpath("//*[@id=\"locator\"]/div/form/div/div/div[2]/div/button"));
        kliksearchbutton.click();
        Thread.sleep(3000);

        //Scroll//
        JavascriptExecutor pr3 = (JavascriptExecutor) servicensw;
        WebElement scroll_hasillokasi = servicensw.findElement(By.xpath("//*[@id=\"block-content\"]/article/section[1]/div"));
        pr3.executeScript(  "arguments[0].scrollIntoView();", scroll_hasillokasi);
        Thread.sleep(2000);
        //End//


        WebElement hapus_pencarianlokasi = servicensw.findElement(By.xpath("//*[@id=\"locatorTextSearch\"]"));
        hapus_pencarianlokasi.clear();
        Thread.sleep(2000);

        WebElement pencarianlokasi_dua = servicensw.findElement(By.xpath("//*[@id=\"locatorTextSearch\"]"));
        pencarianlokasi_dua.sendKeys("Sydney Domestic Airport 2020");
        Thread.sleep(2000);


        WebElement kliksearchbutton_dua = servicensw.findElement(By.xpath("//*[@id=\"locator\"]/div/form/div/div/div[2]/div/button"));
        kliksearchbutton_dua.click();
        Thread.sleep(2000);






servicensw.close();


    }
}
