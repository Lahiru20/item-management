import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Objects;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage Stage) throws Exception {
        Stage.setScene(new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("View/Menu.fxml")))));
        Stage.show();
    }
}