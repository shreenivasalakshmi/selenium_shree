package MEVEN;

import org.testng.annotations.Test;

public class mvn_run_fb_class extends MEVEN_PROJECT{
@Test
public void run()
{	
pom_facebook p = new pom_facebook(d);
p.mail().sendKeys("shree");
}
}