package selenium.pagesTodoist;

import org.openqa.selenium.By;
import selenium.control.Button;
import selenium.control.TextBox;

public class CreateProfileSection1Page {
    public TextBox profileName = new TextBox(By.xpath("//input[@placeholder='E.g. Jane Doist']"));
    public Button continueButton = new Button(By.xpath("//button[@type='submit']"));
}
