import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PortalAutomation {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://portal.aait.edu.et");
        WebElement uname = driver.findElement(By.name("UserName"));
        WebElement pwd = driver.findElement(By.name("Password"));
        WebElement login = driver.findElement(By.className("btn"));
        uname.sendKeys("ATE/9482/08");
        pwd.sendKeys("7930");
        login.click();
        driver.findElement(By.cssSelector("#m2 > a:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#m2 > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)")).click();
        //WebElement grades = driver.findElement(By.cssSelector("tr.yrsm:nth-child(8) > td:nth-child(1) > p:nth-child(2)"));
        //for generating all grades
        
//       List<WebElement> grades =  driver.findElements(By.cssSelector("div.row:nth-child(2)"));
//       for (WebElement e : grades){
//           System.out.println(e.getText());
//       }

        //for generating last semister grade
        WebElement lastSemisterGrade = driver.findElement(By.cssSelector("tr.yrsm:nth-child(8) > td:nth-child(1) > p:nth-child(2)"));
        System.out.println(lastSemisterGrade.getText());


        try {
            Thread.sleep(10000);
        }catch (Exception E){

        }
        driver.close();





    }
}