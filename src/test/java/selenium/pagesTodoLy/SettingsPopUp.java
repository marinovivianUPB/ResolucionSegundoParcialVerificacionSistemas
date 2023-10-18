package selenium.pagesTodoLy;

import selenium.control.Button;
import selenium.control.TextBox;
import org.openqa.selenium.By;

public class SettingsPopUp {
    public TextBox fullNameInput = new TextBox(By.id("FullNameInput"));
    public TextBox oldPassword = new TextBox(By.id("TextPwOld"));
    public TextBox newPassword = new TextBox(By.id("TextPwNew"));
    public Button okButton = new Button(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only']"));
}
