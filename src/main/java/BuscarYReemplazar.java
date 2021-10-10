import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BuscarYReemplazar extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {



        Scene scene = new Scene(rootBox, 516, 239);

        primaryStage.setTitle("Buscar y reemplazar");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
