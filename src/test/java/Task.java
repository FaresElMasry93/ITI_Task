import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.Favourites;
import utils.Utilities;

public class Task extends BaseTest {
    private Utilities util = new Utilities();
    private String Email = util.readTestData(1, 1);
    private String Password = util.readTestData(1,2);
    private String SearchText = util.readTestData(1,3);
    private String AssertText = util.readTestData(1,4);

    @Test
    public void test(){
        LoginPage loginPage = homePage.signIn();
        loginPage.setEmail(Email);
        loginPage.setPassword(Password);
        loginPage.submit();
        Favourites favourites = loginPage.searchText(SearchText);
        favourites.selectItem(SearchText);
        favourites.selectFavoriteItem();
        Assert.assertEquals(favourites.getItemStatus(),AssertText);





    }
}
