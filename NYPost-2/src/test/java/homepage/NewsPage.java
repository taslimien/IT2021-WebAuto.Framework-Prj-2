package homepage;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class NewsPage extends CommonAPI {

    @Test
    public void home(){
        System.out.println(driver.getTitle());
    }
}
