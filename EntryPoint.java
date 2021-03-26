package StevenDLL;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class EntryPoint extends Application {

    public static final SceneManager SCENE_MANAGER = new SceneManager();
    public static Stage main_Stage;

    public void start(Stage stage) throws Exception {

        main_Stage = stage;
        main_Stage.getIcons().add(new Image(getClass().getResourceAsStream("/StevenDLL/Resources/Images/user-picture.png")));
        main_Stage.setResizable(false);
        SCENE_MANAGER.setCurrentScene(0);
        main_Stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
