package pages;

import baseEntity.BasePageFactory;
import core.BrowsersService;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Overview extends BasePageFactory {

    @FindBy(id = "sidebar-milestones-add")
    public WebElement addMilestonesButtonOver;

    @FindBy(id = "navigation-milestones")
    public WebElement milestonesButton;

    public Overview(BrowsersService browsersService) {
        super(browsersService, false);
    }

    @Override
    protected void openPage() {

    }

    @Override
    public boolean isPageOpened() {
        return addMilestonesButtonOver.isDisplayed();
    }
}
