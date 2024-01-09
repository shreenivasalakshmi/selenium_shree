package MEVEN;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MEVEN_PROJECT implements frame_constent
{
 public WebDriver d;
@BeforeClass
public void launch()
{
WebDriverManager.chromedriver().setup();
d=new ChromeDriver();
d.manage().window().maximize();
d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
d.get(facebook_url);
}
@AfterClass
public void close()
{
d.quit();	
}
}
