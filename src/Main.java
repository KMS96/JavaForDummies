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
import javafx.geometry.*;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
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

    private void openPDFile(String fileName){ // Открыть PDF
        try {
            m_PDFViewer.loadPDF("C:\\\\Users\\\\Михаил\\\\Desktop\\\\JavaForDummies\\\\src\\\\" + fileName + ".PDF");
        } catch (PDFException e) {
            e.printStackTrace();
        }
    }

    private Button setImgButton(String nameImg, String label){
        InputStream input =
                getClass().getResourceAsStream(nameImg + ".png");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);
        Button button = new Button(label);
        button.setGraphic(imageView);
        return button;
    }

    private Button backButton(){ // Кнопка возврата
        return setImgButton("coffee-bean-icon", "MENU");
    }

    private void setSizeButton(Button btn){ // Размеры кнопки
        btn.setLayoutX(20);
        btn.setLayoutY(25);
        btn.setMaxWidth(150);
        btn.setMaxHeight(16);
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        Button button2 = backButton();
        button2.setOnAction(e -> stage.setScene(scene1));

        // Кнопки:
        Button annotations = setImgButton("Java-icon-main", "Annotations");
        setSizeButton(annotations);
        annotations.setOnAction(event -> {
            m_PDFViewer = new PDFViewer();
            openPDFile("Annotations");
            BorderPane borderPane = new BorderPane(m_PDFViewer);

            borderPane.setRight(button2);

            Scene scene = new Scene(borderPane);
            stage.setTitle("Annotations");
            stage.setScene(scene);
        });

        Button collections = setImgButton("Java-icon-main", "Collections");
        setSizeButton(collections);
        collections.setOnAction(event -> {
            m_PDFViewer = new PDFViewer();
            openPDFile("Collections");
            BorderPane borderPane = new BorderPane(m_PDFViewer);

            borderPane.setRight(button2);

            Scene scene = new Scene(borderPane);
            stage.setTitle("Collections");
            stage.setScene(scene);
        });

        Button concurrent = setImgButton("Java-icon-main", "Concurrent");
        setSizeButton(concurrent);
        concurrent.setOnAction(event -> {
            m_PDFViewer = new PDFViewer();
            openPDFile("Concurrent");
            BorderPane borderPane = new BorderPane(m_PDFViewer);

            borderPane.setRight(button2);

            Scene scene = new Scene(borderPane);
            stage.setTitle("Concurrent");
            stage.setScene(scene);
        });

        Button oop = setImgButton("Java-icon-main", "OOP");
        setSizeButton(oop);
        oop.setOnAction(event -> {
            m_PDFViewer = new PDFViewer();
            openPDFile("OOP");
            BorderPane borderPane = new BorderPane(m_PDFViewer);

            borderPane.setRight(button2);

            Scene scene = new Scene(borderPane);
            stage.setTitle("OOP");
            stage.setScene(scene);
        });

        Button exceptions = setImgButton("Java-icon-main", "Exceptions");
        setSizeButton(exceptions);
        exceptions.setOnAction(event -> {
            m_PDFViewer = new PDFViewer();
            openPDFile("Exceptions");
            BorderPane borderPane = new BorderPane(m_PDFViewer);

            borderPane.setRight(button2);

            Scene scene = new Scene(borderPane);
            stage.setTitle("Exceptions");
            stage.setScene(scene);
        });

        Button git = setImgButton("Java-icon-main", "Git");
        setSizeButton(git);
        git.setOnAction(event -> {
            m_PDFViewer = new PDFViewer();
            openPDFile("Git");
            BorderPane borderPane = new BorderPane(m_PDFViewer);

            borderPane.setRight(button2);

            Scene scene = new Scene(borderPane);
            stage.setTitle("Git");
            stage.setScene(scene);
        });

        Button input_output = setImgButton("Java-icon-main", "InputOutput");
        setSizeButton(input_output);
        input_output.setOnAction(event -> {
            m_PDFViewer = new PDFViewer();
            openPDFile("InputOutput");
            BorderPane borderPane = new BorderPane(m_PDFViewer);

            borderPane.setRight(button2);

            Scene scene = new Scene(borderPane);
            stage.setTitle("InputOutput");
            stage.setScene(scene);
        });

        Button servlet = setImgButton("Java-icon-main", "Java_EE_Servlet_API");
        setSizeButton(servlet);
        servlet.setOnAction(event -> {
            m_PDFViewer = new PDFViewer();
            openPDFile("Java_EE_Servlet_API");
            BorderPane borderPane = new BorderPane(m_PDFViewer);

            borderPane.setRight(button2);

            Scene scene = new Scene(borderPane);
            stage.setTitle("Java_EE_Servlet_API");
            stage.setScene(scene);
        });

        Button jdbc = setImgButton("Java-icon-main", "JDBC");
        setSizeButton(jdbc);
        jdbc.setOnAction(event -> {
            m_PDFViewer = new PDFViewer();
            openPDFile("JDBC");
            BorderPane borderPane = new BorderPane(m_PDFViewer);

            borderPane.setRight(button2);

            Scene scene = new Scene(borderPane);
            stage.setTitle("JDBC");
            stage.setScene(scene);
        });

        Button jUnit = setImgButton("Java-icon-main", "JUnit");
        setSizeButton(jUnit);
        jUnit.setOnAction(event -> {
            m_PDFViewer = new PDFViewer();
            openPDFile("JUnit");
            BorderPane borderPane = new BorderPane(m_PDFViewer);

            borderPane.setRight(button2);

            Scene scene = new Scene(borderPane);
            stage.setTitle("JUnit");
            stage.setScene(scene);
        });

        Button log4j = setImgButton("Java-icon-main", "Log4j");
        setSizeButton(log4j);
        log4j.setOnAction(event -> {
            m_PDFViewer = new PDFViewer();
            openPDFile("Log4j");
            BorderPane borderPane = new BorderPane(m_PDFViewer);

            borderPane.setRight(button2);

            Scene scene = new Scene(borderPane);
            stage.setTitle("Log4j");
            stage.setScene(scene);
        });

        Button maven = setImgButton("Java-icon-main", "Maven");
        setSizeButton(maven);
        maven.setOnAction(event -> {
            m_PDFViewer = new PDFViewer();
            openPDFile("Maven");
            BorderPane borderPane = new BorderPane(m_PDFViewer);

            borderPane.setRight(button2);

            Scene scene = new Scene(borderPane);
            stage.setTitle("Maven");
            stage.setScene(scene);
        });

        Button sql = setImgButton("Java-icon-main", "SQL");
        setSizeButton(sql);
        sql.setOnAction(event -> {
            m_PDFViewer = new PDFViewer();
            openPDFile("SQL");
            BorderPane borderPane = new BorderPane(m_PDFViewer);

            borderPane.setRight(button2);

            Scene scene = new Scene(borderPane);
            stage.setTitle("SQL");
            stage.setScene(scene);
        });

        Button string = setImgButton("Java-icon-main", "String");
        setSizeButton(string);
        string.setOnAction(event -> {
            m_PDFViewer = new PDFViewer();
            openPDFile("String");
            BorderPane borderPane = new BorderPane(m_PDFViewer);

            borderPane.setRight(button2);

            Scene scene = new Scene(borderPane);
            stage.setTitle("String");
            stage.setScene(scene);
        });


        // Меню:
        InputStream input =
                getClass().getResourceAsStream("background.png");
        Image image = new Image(input);

        VBox vbox = new VBox(50);
        vbox.setId("VBOX");
        VBox vbox1 = new VBox(12);
        VBox vbox2 = new VBox(12);
        HBox hBox1 = new HBox(7);
        HBox hBox2 = new HBox(7);
        HBox hBox3 = new HBox(7);
        HBox hBox4 = new HBox(7);
        hBox1.getChildren().addAll(annotations, collections, concurrent, exceptions);
        hBox2.getChildren().addAll(input_output, servlet, oop, string);
        hBox1.setAlignment(Pos.CENTER);
        hBox2.setAlignment(Pos.CENTER);
        vbox1.getChildren().addAll(hBox1, hBox2);
        hBox3.getChildren().addAll(git, jdbc, jUnit, log4j);
        hBox4.getChildren().addAll(maven, sql, string);
        hBox3.setAlignment(Pos.CENTER);
        hBox4.setAlignment(Pos.CENTER);
        vbox2.getChildren().addAll(hBox3, hBox4);
        vbox.getChildren().addAll(vbox1, vbox2);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(20.0));
        /*BackgroundImage myBI= new BackgroundImage(new Image("background.jpg",512,512,false,true),
                BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        vbox.setBackground(new Background(myBI));*/

        scene1 = new Scene(vbox, 512, 512);

        //scene1.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
        scene1.getStylesheets().add("style.css");

        stage.setScene(scene1);
        stage.setTitle("JavaForDummies");
        stage.show();
    }
}