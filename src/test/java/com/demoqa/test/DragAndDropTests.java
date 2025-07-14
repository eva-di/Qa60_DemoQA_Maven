package com.demoqa.test;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.pages.interactions.DroppablePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDropTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getInterations();
        new SidePanel(driver).selectDroppable();
    }
    @Test
    public void actionDragMeTest() {

        new DroppablePage(driver).actionDragMe().verifyDropped("Dropped!");
    }
}
