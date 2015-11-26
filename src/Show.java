import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Show extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Group root = new Group();
        Scene scene = new Scene(root, 800, 600, Color.WHITE);
        primaryStage.setScene(scene);
        primaryStage.show();

        byte[] bytes = readFile();

        for (int i = 0; i < 10000; i++) {
            Color circleColor;
            if (bytes[i] % 2 == 0) {
                circleColor = Color.RED;
            } else {
                circleColor = Color.GREEN;
            }
            Circle circle = new Circle(Math.random() * 800, Math.random() * 600, 2, circleColor);
            circle.setStrokeType(StrokeType.CENTERED);
            circle.setStrokeWidth(2);
            root.getChildren().add(circle);
        }

    }

    private static byte[] readFile() throws IOException {
        return Files.readAllBytes(Paths.get("/Users/xuan.huang/git/dev-challenge/visual/resources/image.txt"));
    }
}
