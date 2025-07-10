package com.demoqa.pages.alertsFrameWindows;

import com.demoqa.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

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

    public FramePage switchToIframeBzIndex(int index) {
        driver.switchTo().frame(index);
        return this;
    }

    @FindBy(id = "sampleHeading")
    WebElement sampleHeading;
    public FramePage verifyIframeByText(String text) {
        Assert.assertTrue(shouldHaveText(sampleHeading, text, 1));
        return this;
    }

    @FindBy(id = "frame1")
    WebElement frame1;
    public FramePage switchToIframeById() {
        driver.switchTo().frame(frame1);
        return this;
    }

    public FramePage switchToMainPage() {
        driver.switchTo().defaultContent();
        return this;
    }

    @FindBy(tagName = "h1")
    WebElement title;
    public FramePage verifyMainPageByTitle(String text) {
        Assert.assertTrue(title.getText().contains(text));
        return this;
    }
@FindBy(tagName = "body")
WebElement body;
    public FramePage handleNestedFrames() {
        driver.switchTo().frame(frame1); // switch to parent frame
//        get text from parent frame
        System.out.println("IFrame is " + body.getText());
//        Number of IFrames
        System.out.println("Number of IFrames inside IFrame is " + iFrame.size());
        //switch to child
        driver.switchTo().frame(0);
        System.out.println("Iframe is " + body.getText());
//        switch To Parent Iframe();
        driver.switchTo().parentFrame();
        System.out.println("Iframe is " + body.getText());

        return this;
    }
}
