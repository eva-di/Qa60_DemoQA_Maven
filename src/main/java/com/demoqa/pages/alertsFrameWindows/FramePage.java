package com.demoqa.pages.alertsFrameWindows;

import com.demoqa.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.namespace.QName;
import java.util.List;

public class FramePage extends BasePage {
    public FramePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "iframe")
    List<WebElement> iFrame;
    public FramePage returnListOfFrames() {
//      iFrame.size(); by finding all WebElements
        System.out.println("The total number: " + iFrame.size());
        return this;
    }
}
