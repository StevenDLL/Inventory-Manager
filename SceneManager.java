package StevenDLL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.ArrayList;

public class SceneManager {

    private ArrayList<Scene> scenes = new ArrayList<>(5);

    SceneManager() {
        setDefaultScenes();
    }

    public void setCurrentScene(int idx) {
        if (idx == 0) {
            EntryPoint.main_Stage.setScene(scenes.get(idx));
            EntryPoint.main_Stage.setTitle("Inventory Manager - Login");
        } else if (idx == 1) {
            EntryPoint.main_Stage.setScene(scenes.get(idx));
            EntryPoint.main_Stage.setTitle("Inventory Manager");

        } else if (idx == 2) {

            Stage stage = new Stage();
            stage.setScene(scenes.get(idx));
            stage.setTitle("Inventory Manager - New Item");
            stage.initOwner(EntryPoint.main_Stage);
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setResizable(false);
            stage.getIcons().add(new Image(getClass().getResourceAsStream("/StevenDLL/Resources/Images/user-picture.png")));
            stage.show();
        } else {
            System.out.println("Entered index is out of bound");
        }
    }

    private void setDefaultScenes() {

        try {
            Parent loginRoot = FXMLLoader.load(getClass().getResource("Resources/inLogin.fxml"));
            Parent inAppRoot = FXMLLoader.load(getClass().getResource("Resources/inApp.fxml"));
            Parent inNewItemRoot = FXMLLoader.load(getClass().getResource("Resources/inNewItem.fxml"));

            Scene loginScene = new Scene(loginRoot);
            Scene inAppScene = new Scene(inAppRoot);
            Scene inNewItemScene = new Scene(inNewItemRoot);

            scenes.add(loginScene);
            scenes.add(inAppScene);
            scenes.add(inNewItemScene);


        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }
}
