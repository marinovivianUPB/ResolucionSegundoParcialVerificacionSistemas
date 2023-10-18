package selenium.pagesTodoist;

import org.openqa.selenium.By;
import selenium.control.Button;
import selenium.control.TextBox;

public class AddProjectPopUp {
    public TextBox projectName = new TextBox(By.id("edit_project_modal_field_name"));
    public Button addButton = new Button(By.xpath("//button[@type='submit']"));
}
