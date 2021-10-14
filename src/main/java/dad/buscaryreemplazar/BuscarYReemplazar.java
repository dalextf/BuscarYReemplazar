package dad.buscaryreemplazar;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarYReemplazar extends Application {

    private TextField buscarText;
    private TextField reemplazarText;
    private Label buscarLabel;
    private Label reemplazarLabel;
    private Button buscarBoton;
    private Button reemplazarBoton;
    private Button reemTodoBoton;
    private Button cerrarBoton;
    private Button ayudaBoton;
    private RadioButton mayusYmin;
    private RadioButton expreReg;
    private RadioButton buscarAtras;
    private RadioButton resaltarRes;

    @Override
    public void start(Stage primaryStage) throws Exception {

        buscarText = new TextField();
        reemplazarText = new TextField();

        buscarLabel = new Label("Buscar: ");
        reemplazarLabel = new Label("Reemplazar con: ");

        buscarBoton = new Button("Buscar");
        buscarBoton.setPrefWidth(100);
        reemplazarBoton = new Button("Reemplazar");
        reemplazarBoton.setPrefWidth(100);
        reemTodoBoton = new Button("Reemplazar todo");
        reemTodoBoton.setPrefWidth(100);
        cerrarBoton = new Button("Cerrar");
        cerrarBoton.setPrefWidth(100);
        ayudaBoton = new Button("Ayuda");
        ayudaBoton.setPrefWidth(100);

        mayusYmin = new RadioButton("Mayúsculas y minúsculas");
        expreReg = new RadioButton("Expreción regular");
        buscarAtras = new RadioButton("Buscar hacia atrás");
        resaltarRes = new RadioButton("Resaltar resultados");

        ToggleGroup botones = new ToggleGroup();
        botones.getToggles().addAll(mayusYmin, expreReg, buscarAtras, resaltarRes);

        GridPane botonera = new GridPane();
        botonera.addRow(0, mayusYmin, buscarAtras);
        botonera.addRow(1, expreReg, resaltarRes);
        botonera.setVgap(5);

        ColumnConstraints[] constraintBotonera = {new ColumnConstraints(), new ColumnConstraints()};
        constraintBotonera[0].setHgrow(Priority.ALWAYS);
        constraintBotonera[1].setHgrow(Priority.ALWAYS);

        botonera.getColumnConstraints().setAll(constraintBotonera);


        VBox botonesDerecha = new VBox();
        botonesDerecha.getChildren().addAll(reemTodoBoton, cerrarBoton, ayudaBoton);
        botonesDerecha.setSpacing(5);
        //botonesDerecha.setPadding(new Insets(5));

        GridPane rootPane = new GridPane();
        rootPane.setGridLinesVisible(false);
        rootPane.setVgap(5);
        rootPane.setHgap(5);
        rootPane.setAlignment(Pos.TOP_CENTER);
        rootPane.addRow(0, buscarLabel, buscarText, buscarBoton);
        rootPane.setPadding(new Insets(5));
        rootPane.addRow(1, reemplazarLabel, reemplazarText, reemplazarBoton);
        rootPane.addRow(2, new Label(""), botonera, botonesDerecha);

        ColumnConstraints[] constraintView = {new ColumnConstraints(), new ColumnConstraints()};
        constraintView[0].setHalignment(HPos.LEFT);
        constraintView[1].setFillWidth(true);
        constraintView[1].setHgrow(Priority.ALWAYS);


        rootPane.getColumnConstraints().setAll(constraintView);



        Scene scene = new Scene(rootPane, 516, 239);

        primaryStage.setTitle("Buscar y reemplazar");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
