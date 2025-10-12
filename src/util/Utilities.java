package util;

import application.Main;
import java.io.IOException;
import java.net.URL;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Utilities {

    public static void logError(String error) {

    }

    public static Stage currentStage(ActionEvent event) {
        return (Stage) ((Node) event.getSource()).getScene().getWindow();
    }

    public static void showWindos(String title, URL path) {
        try {
            FXMLLoader loader = new FXMLLoader(path);
            AnchorPane anchorPane = loader.load();

            Stage window = new Stage();
            window.setTitle(title);
            window.setScene(new Scene(anchorPane));
            window.setResizable(false);
            window.initOwner(Main.getStage());
            window.initModality(Modality.WINDOW_MODAL);
            window.showAndWait();
        } catch (IOException e) {
            System.out.println("Utilities erro: " + e);
        }
    }
}
