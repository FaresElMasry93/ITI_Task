package uploadfile;

import base.BaseTests;
import org.testng.annotations.Test;

public class UploadFileTests extends BaseTests {
    @Test
    public void testAccceptUploadFile(){
        var uploadfile=homePage.clickFileUpload();
        uploadfile.getFilePath("C:\\Selenium\\test3\\resources\\chromedriver.exe");
    }

}
