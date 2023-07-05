package dropdown;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTests extends BaseTests {
    @Test
    public void testSelectionOption(){
        var dropDownPage = homePage.clickDropDown();
        String option="Option 1";
        dropDownPage.selectFromDropDown("Option 1");
        var SelectedOption=dropDownPage.getSelectedOption();
        Assert.assertEquals(SelectedOption.size(),1,"incorrect number fo selection");
        Assert.assertTrue(SelectedOption.contains(option),"option not found");
    }


}
