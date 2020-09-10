package steps;

import baseEntity.BaseStep;
import core.BrowsersService;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.AMiles;
import pages.Milestones;
import pages.Overview;

import java.io.File;

public class StepMiles extends BaseStep {



    public StepMiles(BrowsersService browsersService) {
        super(browsersService);
    }

    @Step
    public void addMilestonesStep() {
        Overview overview = new Overview(browsersService);
        overview.addMilestonesButtonOver.click();
        AMiles aMiles = new AMiles(browsersService);
        aMiles.nameMilestonesField.sendKeys("HERE WE GO!");
        aMiles.addMilestoneButton.sendKeys(Keys.END);
        aMiles.addMilestoneButton.click();
    }

    @Step
    public void dialogBoxAndFileUpload() {
        Overview overview = new Overview(browsersService);
        overview.milestonesButton.click();
        Milestones milestones = new Milestones(browsersService);
        milestones.editStonesButton.click();
        AMiles aMiles = new AMiles(browsersService);
        aMiles.dialogBox.click();
        String path = "src/test/resources/xoxoxo.jpg";
        File file = new File(path);
        String absolutePath = file.getAbsolutePath();
        aMiles.fileUpload.sendKeys(absolutePath);
        aMiles.addImages.click();
        aMiles.addMilestoneButton.sendKeys(Keys.END);
        aMiles.addMilestoneButton.click();
    }

    @Step
    public void badDataUsage() {
        Overview overview = new Overview(browsersService);
        overview.milestonesButton.click();
        Milestones milestones = new Milestones(browsersService);
        milestones.editStonesButton.click();
        AMiles aMiles = new AMiles(browsersService);
        aMiles.startDateField.sendKeys("0000");
        aMiles.nameMilestonesField.click();
        aMiles.addMilestoneButton.sendKeys(Keys.END);
        aMiles.addMilestoneButton.click();
    }

    @Step
    public void dateTypeValue() {
        Overview overview = new Overview(browsersService);
        overview.milestonesButton.click();
        Milestones milestones = new Milestones(browsersService);
        milestones.editStonesButton.click();
        AMiles aMiles = new AMiles(browsersService);
        aMiles.startDateField.sendKeys("31.12.1969");
        aMiles.nameMilestonesField.click();
        aMiles.nameMilestonesField.clear();
        aMiles.addMilestoneButton.sendKeys(Keys.END);
        aMiles.addMilestoneButton.click();

    }

    @Step
    public void bubbleStep() {
        Overview overview = new Overview(browsersService);
        overview.milestonesButton.click();
        Milestones milestones = new Milestones(browsersService);
        milestones.editStonesButton.click();

    }

    @Step
    public String getErrorMessage() {
        AMiles aMiles = new AMiles(browsersService);
        WebElement errorMessage = aMiles.errorMessage;
        return errorMessage.getText();
    }
}
