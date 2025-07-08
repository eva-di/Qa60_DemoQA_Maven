package com.demoqa.test;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.pages.alertsFrameWindows.FramePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IFrameTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getAlertsFrameWindows();

    }

    @Test
    public void iFrameTest() {
        new SidePanel(driver).selectFrame();
        new FramePage(driver).returnListOfFrames();
    }
}
