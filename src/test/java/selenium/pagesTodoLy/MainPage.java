package selenium.pagesTodoLy;

import selenium.control.Button;
import selenium.control.TextBox;
import org.openqa.selenium.By;

public class MainPage {
    public Button errorMessage = new Button(By.id("ErrorMessageText"));
    public Button signupButton = new Button(By.xpath("//img[@src='/Images/design/pagesignup.png']"));
    public Button loginButton = new Button(By.xpath("//img[@src='/Images/design/pagelogin.png']"));
}
