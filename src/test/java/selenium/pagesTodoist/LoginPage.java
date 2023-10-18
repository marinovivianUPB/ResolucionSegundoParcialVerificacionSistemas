package selenium.pagesTodoist;

import org.openqa.selenium.By;
import selenium.control.Button;
import selenium.control.TextBox;
public class LoginPage {
    public TextBox emailTextBox = new TextBox(By.xpath("//input[@type='email']"));
    public TextBox passwordTextBox = new TextBox(By.xpath("//input[@type='password']"));
    public Button loginButton = new Button(By.xpath("//button[@type='submit']"));
}
