package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;

public class CustomerController implements Initializable {

    private String registration;
    
    @FXML
    private Pane boxResponsible;

    @FXML
    private Button btnDocument;
    
    @FXML
    private Button btnSaveAndEdit;

    @FXML
    private ComboBox<String> cbPlan;

    @FXML
    private ComboBox<String> cbSex;

    @FXML
    private ComboBox<String> cbStatus;

    @FXML
    private ToggleGroup tgHealth;

    @FXML
    private Label labelMessage;

    @FXML
    private TextField txtAge;

    @FXML
    private TextField txtContact;

    @FXML
    private TextField txtCpf;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtEmergencyContact;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtResponsibleContact;

    @FXML
    private TextField txtResponsibleCpf;

    @FXML
    private TextField txtResponsibleName;

    @FXML
    private TextField txtDegreeOfKinship;

    @FXML
    private TextArea txtaHealthObs;

    public void setRegistration(String registration) {
        this.registration = registration;
        if (registration.equals("")) {
            btnSaveAndEdit.setText("Salvar");
        } else {
            btnSaveAndEdit.setText("Atualizar");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initalizeNode();
    }

    private void initalizeNode() {
        txtAge.focusedProperty().addListener((obs, oldValue, newValue) -> {
            if (!txtAge.getText().equals("")) {
                try {
                    int age = Integer.valueOf(txtAge.getText());

                    if (age >= 18) {
                        boxResponsible.setVisible(false);
                        txtCpf.setPromptText("CPF");
                    } else {
                        boxResponsible.setVisible(true);
                        txtCpf.setPromptText("CPF (Opcional)");
                    }
                } catch (NumberFormatException e) {
                    labelMessage.setText("Valor do Campo idade invalido.");
                }
            }
        });

        tgHealth.selectedToggleProperty().addListener((obs, oldT, newT) -> {
            RadioButton selected = (RadioButton) newT;

            if (selected.getText().equals("Não")) {
                btnDocument.setDisable(true);
                txtaHealthObs.setDisable(true);
            } else {
                btnDocument.setDisable(false);
                txtaHealthObs.setDisable(false);
            }
        });
        
        cbSex.getItems().addAll("Masculino", "Feminino");
        cbStatus.getItems().addAll("Ativa","Suspensa","Desativada");   
    }

}
