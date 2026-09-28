package com.duoc.clase;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FormularioController {
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtCorreo;
    @FXML
    private ComboBox<String> cmbCarrera;
    @FXML
    private Label lblResultado;

    @FXML
    public void initialize(){
        cmbCarrera.getItems().addAll(
                "Ingenieria en Informatica",
                "Analista Programador",
                "Ingenieria en Ciberseguridad"
        );
    }
    @FXML
    private void registrar(){

        String nombre = txtNombre.getText();
        String correo = txtCorreo.getText();
        String carrera = cmbCarrera.getValue();

        if (nombre.isBlank()||correo.isBlank()||carrera==null){
            lblResultado.setText("Debe completar todos los campos");
            return;
        }
        lblResultado.setText("Registrado: "+nombre+" | "+carrera);
        limpiar();
    }
    private void limpiar(){
        txtNombre.clear();
        txtCorreo.clear();
        cmbCarrera.getSelectionModel().clearSelection();
    }

}
