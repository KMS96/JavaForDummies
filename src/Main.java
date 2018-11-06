/*
 * This app is a helper for study Java.
 *
 * Created by Mikhail on 15.10.2018.
 */

import com.qoppa.pdf.PDFException;
import com.qoppa.pdf.dom.IPDFDocument;
import com.qoppa.pdf.source.PDFContent;
import com.qoppa.pdf.source.PDFSource;
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
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.ScratchFile;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.icepdf.core.pobjects.ViewerPreferences;

import javax.swing.text.Position;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;

public class Main extends Application{
    private Scene scene1, scene2, scene3;
    private PDFViewer m_PDFViewer;

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        // Кнопки:
        Button oop = new Button("OOP");
        oop.setLayoutX(20);
        oop.setLayoutY(25);
        oop.setMaxWidth(150);
        oop.setMaxHeight(16);
        oop.setOnAction(event -> {
            m_PDFViewer = new PDFViewer();
            try {
                m_PDFViewer.loadPDF("C:\\\\Users\\\\Михаил\\\\Desktop\\\\JavaForDummies\\\\src\\\\OOP.PDF");
            } catch (PDFException e) {
                e.printStackTrace();
            }
            BorderPane borderPane = new BorderPane(m_PDFViewer);

            InputStream input =
                    getClass().getResourceAsStream("coffee-bean-icon.png");
            Image image = new Image(input);
            ImageView imageView = new ImageView(image);
            Button button2 = new Button("MENU");
            button2.setGraphic(imageView);
            button2.setOnAction(e -> stage.setScene(scene1));

            borderPane.setRight(button2);
            Scene scene = new Scene(borderPane);
            stage.setTitle("OOP");
            stage.setScene(scene);
        });

        Button collections = new Button("Collections");
        collections.setLayoutX(20);
        collections.setLayoutY(25);
        collections.setMaxWidth(150);
        collections.setMaxHeight(16);
        collections.setOnAction(event -> {
            m_PDFViewer = new PDFViewer();
            try {
                m_PDFViewer.loadPDF("C:\\\\Users\\\\Михаил\\\\Desktop\\\\JavaForDummies\\\\src\\\\Collections.PDF");
            } catch (PDFException e) {
                e.printStackTrace();
            }
            BorderPane borderPane = new BorderPane(m_PDFViewer);

            InputStream input =
                    getClass().getResourceAsStream("coffee-bean-icon.png");
            Image image = new Image(input);
            ImageView imageView = new ImageView(image);
            Button button2 = new Button("MENU");
            button2.setGraphic(imageView);
            button2.setOnAction(e -> stage.setScene(scene1));

            borderPane.setRight(button2);
            Scene scene = new Scene(borderPane);
            stage.setTitle("Collections");
            stage.setScene(scene);
        });



        // Меню:
        VBox vbox = new VBox(5);
        vbox.getChildren().addAll(oop, collections);
        scene1 = new Scene(vbox, 600, 600);

        /* Создание кнопки возврата:
        InputStream input =
                getClass().getResourceAsStream("coffee-bean-icon.png");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);
        Button button2 = new Button("Go back to MENU");
        button2.setGraphic(imageView);
        button2.setOnAction(e -> stage.setScene(scene1));*/

        // ООП:

        /* Для расположения кнопки возврата в правом ниднем углу
        BorderPane root = new BorderPane();
        BorderPane bottom = new BorderPane();
        bottom.setRight(button2);
        root.setBottom(bottom);*/

        //scene2 = new Scene(root, 600, 600);

        /* Коллекции:

        Button button3 = new Button("Go back to MENU");
        button3.setGraphic(imageView);
        button3.setOnAction(e -> stage.setScene(scene1));


        // Для расположения кнопки возврата в правом нижнем углу
        BorderPane root1 = new BorderPane();
        BorderPane bottom1 = new BorderPane();
        bottom1.setRight(button3);
        root1.setBottom(bottom1);

        scene3 = new Scene(root1, 600, 600);*/

        stage.setScene(scene1);
        stage.setTitle("JavaForDummies");
        stage.show();
    }
}