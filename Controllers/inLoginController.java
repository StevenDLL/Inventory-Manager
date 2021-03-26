package StevenDLL.Controllers;

import StevenDLL.EntryPoint;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class inLoginController {
    public AnchorPane mainPane;
    public CheckBox remember_CheckBox;
    public Button login_Button;
    public TextField username_TextField;
    public PasswordField password_TextField;
    public ImageView logo_ImageView;
    public Hyperlink open_HyperLink;
    public Hyperlink forgot_HyperLink;

    public void loginButton_Clicked(MouseEvent mouseEvent) {
        //if (!(username_TextField.getText().isBlank()) && !(password_TextField.getText().isBlank())) {
            EntryPoint.SCENE_MANAGER.setCurrentScene(1);
        //}
    }
}
