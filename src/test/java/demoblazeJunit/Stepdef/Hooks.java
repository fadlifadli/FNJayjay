package demoblazeJunit.Stepdef;
import Fad.BaseUrl;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseUrl {

    @Before
    public void beforeTest(){
        getDriver();
    }
    @After
    public void afterTest(){
        driver.close();
    }
}
