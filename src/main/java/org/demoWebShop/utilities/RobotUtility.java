package org.demoWebShop.utilities;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class RobotUtility {
    public void robotClassToPressKey() {
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        robot.keyPress(KeyEvent.VK_TAB);
    }

    public void robotClassToReleaseKey()   {
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }

    public void robotClassToCopy() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_V);
    }

    public void robotClassTopaste() throws AWTException {
        Robot robot = new Robot();
        robot.keyRelease(KeyEvent.VK_V);
    }

    public void robotClassToUploadFile(String path) throws AWTException {
        StringSelection select = new StringSelection(path);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }

}
