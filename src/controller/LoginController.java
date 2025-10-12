package controller;

import application.Main;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController implements Initializable {

    @FXML
    private Label labelMessage;

    @FXML
    private TextField txtName;

    @FXML
    private PasswordField txtPassword;

    public void onBtnEnter(ActionEvent event) {
        if (txtName.getText().equals("")||txtPassword.getText().equals("")) {
            labelMessage.setText("preencher ambos os campos.");
        } else {
            callHome();
        }      
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
    private void callHome() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Home.fxml"));
            Parent root = loader.load();
            
            Scene newScene = new Scene(root);
            Stage stage = Main.getStage();
            stage.setScene(newScene);
            stage.setTitle("Home");
            stage.centerOnScreen();
            stage.setResizable(true);
        } catch (IOException e) {
            System.out.println("Erro login: "+e);
        }
    }
    
}
