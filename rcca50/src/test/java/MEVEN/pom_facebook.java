package MEVEN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_facebook 
{
@FindBy(id="email")
private WebElement email;
@FindBy(id="pass")
private WebElement pass;
@FindBy(name="login")
private WebElement log_btn;
public pom_facebook(WebDriver d)
{
PageFactory.initElements(d,this);	
}
public WebElement mail()
{
return email;	
}
public WebElement passw()
{
return pass;	
}
public WebElement login()
{
return log_btn;	
}
}
