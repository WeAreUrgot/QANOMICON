package steps;

import baseEntity.BaseStep;
import core.BrowsersService;
import io.qameta.allure.Step;
import pages.AAdmin;
import pages.Project;

public class StepAdmin extends BaseStep {

    public StepAdmin(BrowsersService browsersService) {
        super(browsersService);
    }

    @Step
    public void deleteProjectStep() {
        AAdmin AAdmin = new AAdmin(browsersService, true);
        AAdmin.projectButton.click();
        Project project = new Project(browsersService);
        project.deleteProjectButton.click();
        project.deleteProjectButtonV.click();
        project.deleteProjectButtonOk.click();
    }
}
