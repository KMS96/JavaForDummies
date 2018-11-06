/**
 * Created by Mikhail on 15.10.2018.
 */
import com.qoppa.pdfViewerFX.PDFViewer;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Text;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.icepdf.core.pobjects.ViewerPreferences;

import javax.swing.text.Position;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Main extends Application{
    Scene scene1, scene2, scene3;
    private PDFViewer m_PDFViewer;

    public BorderPane fail(String docname) throws IOException {
        /*String file = docname + ".pdf";
        PDDocument doc = PDDocument.load(new File(file));
        BorderPane pane = new BorderPane();
        pane.getChildren().add(doc);*/
    }

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {

        // Кнопки:

        Button oop = new Button("OOP");
        oop.setLayoutX(20);
        oop.setLayoutY(25);
        oop.setMaxWidth(50);
        oop.setMaxHeight(16);
        oop.setOnAction(e -> stage.setScene(scene2));

        Button collections = new Button("Collections");
        collections.setLayoutX(20);
        collections.setLayoutY(25);
        collections.setMaxWidth(50);
        collections.setMaxHeight(16);
        collections.setOnAction(e -> stage.setScene(scene3));

        // Меню:

        VBox vbox = new VBox(5);
        vbox.getChildren().addAll(oop, collections);
        scene1 = new Scene(vbox, 600, 600);

        // Создание кнопки возврата:

        InputStream input =
                getClass().getResourceAsStream("coffee-bean-icon.png");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);
        Button button2 = new Button("Go back to MENU");
        button2.setGraphic(imageView);
        button2.setOnAction(e -> stage.setScene(scene1));

        // ООП:

        // Для расположения кнопки возврата в правом ниднем углу
        BorderPane root = new BorderPane();
        BorderPane bottom = new BorderPane();
        bottom.setRight(button2);
        root.setBottom(bottom);

        scene2 = new Scene(root, 600, 600);

        // Коллекции:

        Button button3 = new Button("Go back to MENU");
        button3.setGraphic(imageView);
        button3.setOnAction(e -> stage.setScene(scene1));


        // Для расположения кнопки возврата в правом нижнем углу
        BorderPane root1 = new BorderPane();
        BorderPane bottom1 = new BorderPane();
        bottom1.setRight(button3);
        root1.setBottom(bottom1);

        scene3 = new Scene(root1, 600, 600);

        stage.setScene(scene1);
        stage.setTitle("JavaForDummies");
        stage.show();
    }
}