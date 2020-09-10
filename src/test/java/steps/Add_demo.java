package steps;

import baseEntity.BaseTest;
import models.Userwthbuilder_demo;
import org.testng.annotations.Test;
import steps.*;

public class Add_demo extends BaseTest {

    @Test
    public void addMilestones() {
        Userwthbuilder_demo user = new Userwthbuilder_demo.Builder()
                .withEmail("varvarukie@gmail.com")
                .withPassword("youwillbowtome")
                .build();
        Login logStep = new Login(browsersService);
        logStep.login(user);

        Dashboard dashboardStep = new Dashboard(browsersService);
        dashboardStep.addProject();

        AddProject addProjectStep = new AddProject(browsersService);
        addProjectStep.addNewProject("OMG!DAT IS DIPLOMA!", "Use a single repository for all cases (recommended)");
        dashboardStep.enterProject();

        AddMile addMilestonesStep = new AddMile(browsersService);
        addMilestonesStep.addMiles();


    }
}

