package application;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    private static Scene mainScene;
    private static Stage stage;
    
    @Override
    public void start(Stage primaryStage) {
        try {
            stage = primaryStage;
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Login.fxml"));
            AnchorPane anchorPane = loader.load();
    
            mainScene = new Scene(anchorPane);
            primaryStage.setScene(mainScene);
            primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/view/imgs/1024x1024_GYM.png")));
            primaryStage.setResizable(false);
            primaryStage.setTitle("Login");
            primaryStage.show();
        } catch (IOException e) {
            System.out.println("Erro: "+ e.getMessage());
        }
    }

    public static Scene getMainScene() {
        return mainScene;
    }
    
    public static Stage getStage() {
        return stage;
    }
    
    public static void main(String[] args) {
        launch(args);
    }

}
