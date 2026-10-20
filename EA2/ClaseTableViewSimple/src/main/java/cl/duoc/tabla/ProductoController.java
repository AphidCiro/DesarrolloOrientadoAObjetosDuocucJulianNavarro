package cl.duoc.tabla;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;

import javafx.scene.control.TableView;

public class ProductoController {
    private final ObservableList<Producto> productos = FXCollections.observableArrayList();

    public VBox crearVista(){
        TableView<Producto> tabla = new TableView();


        //c1 nombre
        TableColumn<Producto, String> colNombre = new  TableColumn<>("nombre");
        colNombre.setCellValueFactory(dato ->
                new SimpleStringProperty(dato.getValue().nombre())
                );

        //c2 categoria
        TableColumn<Producto, String> colCategoria = new TableColumn<>("Categoria");
        colCategoria.setCellValueFactory(dato ->
                new SimpleStringProperty(dato.getValue().categoria())
                );

        //c3 precio
        TableColumn<Producto, Number> colPrecio = new TableColumn<>("Precio");
        colPrecio.setCellValueFactory(dato ->
                new SimpleDoubleProperty(dato.getValue().precio())
        );

        tabla.getColumns().addAll(colNombre,colCategoria,colPrecio);

        tabla.setItems(productos);

        productos.add(new Producto("test1","test",1));
        productos.add(new Producto("test2","test2",100000));
        productos.add(new Producto("test3","test",-1));

        TextField txtNombre = new TextField();
        txtNombre.setPromptText("Nombre");

        TextField txtCategoria = new TextField();
        txtCategoria.setPromptText("Categoria");

        TextField txtPrecio = new TextField();
        txtPrecio.setPromptText("Precio");

        Button btnAgregar = new Button("Agregar Producto");

        btnAgregar.setOnAction(
                event-> {
                    String nombre = txtNombre.getText();
                    String categoria = txtCategoria.getText();
                    double precio = Double.parseDouble(txtPrecio.getText());

                    productos.add(new Producto(nombre, categoria, precio));

                    txtNombre.clear();
                    txtCategoria.clear();
                    txtPrecio.clear();
                }
        );
        return new VBox(10, tabla, txtNombre,txtCategoria,txtPrecio,btnAgregar);


    }
}
