package cl.duoc.tabla;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

//public class AlumnoController {
//    //dynamic list creation
//    private final ObservableList<Alumno> alumnos = FXCollections.observableArrayList();
//
//    //interfaz grafica codeada
//
//    public VBox crearVista() {
//        //tabla
//        TableView<Alumno> tabla = new TableView<>();
//
//        //columna 1
//        TableColumn<Alumno, String> colNombre = new TableColumn<>("Nombre");
//        //contenido columna 1
//        colNombre.setCellValueFactory(dato ->
//                new SimpleStringProperty(dato.getValue().nombre())
//        );
//
//        //columna 2
//        TableColumn<Alumno, String> colCarrera = new TableColumn<>("Carrera");
//        colCarrera.setCellValueFactory(dato ->
//                new SimpleStringProperty(dato.getValue().carrera())
//       w );
//
//        //columna 3
//        TableColumn<Alumno, Number> colNota = new TableColumn<>("Nota");
//        colNota.setCellValueFactory(dato ->
//                new SimpleDoubleProperty(dato.getValue().nota())
//        );
//
//        //agregar columnas
//        tabla.getColumns().addAll(colNombre, colCarrera, colNota);
//
//        // con tabla con lista observable
//        tabla.setItems(alumnos);
//
//        //datos iniciales
//        alumnos.add(new Alumno("jp", "ing informatica",2.0));
//        alumnos.add(new Alumno("chela", "ing informatica",6.7));
//        alumnos.add(new Alumno("dios", "diosologia",7.0));
//
//        //campos de poblacion after run
//        //cmpo nombre
//        TextField txtNombre = new TextField();
//        txtNombre.setPromptText("nombre");
//        //cmpo carrera
//        TextField txtCarrera = new TextField();
//        txtCarrera.setPromptText("Carrera");
//        //cmpo nota
//        TextField txtNota = new TextField();
//        txtNota.setPromptText("Nota");
//        //button
//        Button btnAgregar = new Button("Agregar Alumno");
//
//        //accion button
//        btnAgregar.setOnAction(event ->
//                {
//                    String nombre = txtNombre.getText();
//                    String carrera = txtCarrera.getText();
//                    double nota = Double.parseDouble(txtNota.getText());
//
//                    alumnos.add(new Alumno(nombre, carrera, nota));
//
//                    txtNombre.clear();
//                    txtCarrera.clear();
//                    txtNota.clear();
//                }
//                );
//
//        return new VBox(10, tabla,txtNombre,txtCarrera,txtNota,btnAgregar);
//    }
//
//
//
//
//}
