package selenium.pagesTodoist;

import org.openqa.selenium.By;
import selenium.control.Button;
import selenium.control.TextBox;

public class ProjectWorkspaceSection {
    public Button addProjectButton = new Button(By.xpath("//span[text()='Add project']/.."));

    public TextBox projectCreated(String name){
        return new TextBox(By.xpath("//h1//span[text()='"+name+"']"));
    }
}
