package controller;

import application.Main;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.entities.Client;
import util.Message;

public class HomeController implements Initializable {

    @FXML
    private ImageView potho;

    @FXML
    private Label name;

    @FXML
    private Label age;

    @FXML
    private Label sex;

    @FXML
    private Label contact;

    @FXML
    private Label registration;

    @FXML
    private Label status;

    @FXML
    private Label email;

    @FXML
    private Label emergencyContact;

    @FXML
    private Label responsibleName;

    @FXML
    private Label responsibleContact;

    @FXML
    private Label plan;

    @FXML
    private Label value;

    @FXML
    private Label lastPayment;

    @FXML
    private ListView<?> listPayment;

    @FXML
    private TableView<?> tableCustomers;

    @FXML
    private TableColumn<?, ?> columnRegistration;

    @FXML
    private TextField txtSearch;

    public void onBtnSearch() {
        String search = txtSearch.getText();
        if (search.equals("")) {

        } else {

        }
    }

    public void onBtnRegister() {
        showRegEdit("");
    }

    public void onBtnEdit() {
        String[] filter = registration.getText().split(":");
        if (filter.length > 1) {
          showRegEdit(filter[1].replace(" ", ""));  
        } else {
            Message.showAlert("Info", "", "Selecione um Aluno.", Alert.AlertType.INFORMATION);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    private void initializeNode() {

    }

    private void addData(Client client) {
        potho.setImage(client.getPotho());
        name.setText(client.getName());
        age.setText("Idade: " + client.getAge());
        sex.setText("Sexo: " + client.getSex());
        contact.setText("Contato: " + client.getContact());
        registration.setText("Matricula: " + client.getRegistration());
        status.setText("Status: " + client.getStatus());
        email.setText("E-mail: " + client.getEmail());
        emergencyContact.setText("Contato de emergência: " + client.getEmergencyContact());
        responsibleName.setText("Nome: " + client.getResponsibleName());
        responsibleContact.setText("Contato: " + client.getResponsibleContact());
        plan.setText("Plano: " + client.getPlan());
        value.setText("Valor: R$" + client.getValue());
        lastPayment.setText("Data do ultimo pagamento: " + client.getLastPayment());
    }

    private void showRegEdit(String registration) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/RegistrationAndEditing.fxml"));
            AnchorPane anchorPane = loader.load();

            CustomerController customer = loader.getController();
            customer.setRegistration(registration);

            Stage window = new Stage();
            window.setTitle("Cadastro");
            window.setScene(new Scene(anchorPane));
            window.setResizable(false);
            window.initOwner(Main.getStage());
            window.initModality(Modality.WINDOW_MODAL);
            window.showAndWait();
        } catch (IOException e) {
            System.out.println("HomeController erro: " + e);
        }
    }

}
