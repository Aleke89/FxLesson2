package com.example.hbox;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.BitSet;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//HBOX LAYOUT***********************************
//        Button pervi = new Button("Birinshi");
//        Button second = new Button("Ekinshi");
//        HBox root = new HBox();
//
//        Scene scene = new Scene(root,400,200);
//        root.getChildren().addAll(pervi,second);
//        root.setSpacing(50);
//        root.setFillHeight(true);
//        stage.setScene(scene);
//        stage.show();

//*****************************************************

//        BorderPAne LAyout *************************
//        BorderPane borderPane = new BorderPane();
//        borderPane.setCenter(new Button("Press"));
//        borderPane.setBottom(new Button("Press22"));
//        borderPane.setRight(new Button("Press22"));
//        borderPane.setLeft(new Button("Press22"));
//        borderPane.setMinWidth(200);
//        borderPane.setMinHeight(150);
//
//        Group root = new Group();
//        root.getChildren().addAll(borderPane);
//        stage.setScene(new Scene(root,400,300));
//        stage.show();

//        *********************************************


//        VBox LAyout********************
//        Button firstone = new Button("1");
//        Button secondone = new Button("2");
//        Button thirdone = new Button("3");
//        VBox root = new VBox();
//        Scene scene = new Scene(root,200,200);
//        root.getChildren().addAll(firstone,
//                secondone,
//                thirdone);
//        stage.setScene(scene);
//        stage.show();
//        *********************************************


//        StackPAne Layout *****************
//        Button first = new Button("Birinshigoi");
//        Button second = new Button("Ekinshigoi");
//        StackPane root = new StackPane();
//        Scene scene = new Scene(root,400,400);
//        root.getChildren().addAll(first,second);
//        root.setAlignment(first, Pos.BOTTOM_CENTER);
//        stage.setScene(scene);
//        stage.show();
        //        *********************************************

//        GridPAne Layout ********************
//        Label birinshi = new Label("First");
//        Label ekinshi = new Label("Second");
//        TextField bir = new TextField();
//        TextField eki = new TextField();
//        Button Submit = new Button("Basu");
//        GridPane root = new GridPane();
//        Scene scene = new Scene(root,400,400);
//        root.addRow(0, birinshi,bir);
//        root.addRow(1, ekinshi,eki);
//        root.addRow(2, Submit);
//        stage.setScene(scene);
//        stage.show();

//        *********************************

//        FlowPane Layout **************
//        stage.setTitle("FlowPAnegoi Koroch");
//        FlowPane root = new FlowPane();
//        root.setVgap(120);
//        root.setHgap(120);
//        root.setPrefWrapLength(300);
//        root.getChildren().add(new Button("Basta"));
//        root.getChildren().add(new Button("Tokta"));
//        root.getChildren().add(new Button("KAitadan"));
//        Scene scene = new Scene(root,300,200);
//
//        stage.setScene(scene);
//        stage.show();
//        *********************************


//        TilePAne Layout*****************
//        TilePane tile = new TilePane();
//        tile.setHgap(8);
//        tile.setPrefColumns(4);
//        for (int i = 0; i < 20; i++) {
//            tile.getChildren().add(new TextField());
//        }
//        Scene scene = new Scene(tile,300,200);
//        stage.setScene(scene);
//        stage.show();
//        ********************************

//        AnchorPAne **************
//        Label label = new Label("AnchorPane Example");
//        AnchorPane anchorPane = new AnchorPane(label);
//        AnchorPane.setTopAnchor(label, 120.0);
//        AnchorPane.setLeftAnchor(label, 10.0);
//        AnchorPane.setRightAnchor(label, 230.0);
//        AnchorPane.setBottomAnchor(label, 120.0);
//        Button button = new Button("Add");
//        AnchorPane.setTopAnchor(button, 125.0);
//        AnchorPane.setLeftAnchor(button, 220.0);
//        AnchorPane.setRightAnchor(button, 110.0);
//        AnchorPane.setBottomAnchor(button, 125.0);
//        anchorPane.getChildren().add(button);
//
//        anchorPane.setMinHeight(400);
//        anchorPane.setMinWidth(400);
//        Scene scene = new Scene(anchorPane,400,400);
//        stage.setScene(scene);
//        stage.show();
//****************************
    }

    public static void main(String[] args) {
        launch(args);
    }
}