package com.example.arayuz;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import java.util.*;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {

        Button button1 =new Button("  FİŞ  ");
        Button button2 =new Button(" İPTAL ");
        Button button3 =new Button("ADİSYON");
        Button button4 =new Button("DÜZELT");
        Button button5 =new Button("PERAKENDE");
        Button button6 =new Button("MUTFAK");

        button1.setStyle("-fx-background-color: orange;");
        button1.setTextFill(Color.WHITE);
        button1.setPrefWidth(100); //butonun uzunluğunu belirliyor
        button1.setPrefHeight(50);
        VBox.setMargin(button1, new Insets(10, 0, 0, 0)); // üstten boşluk bırakıyor
        button1.setOnAction(e -> System.out.println("Fiş Oluşturuldu."));

        button2.setStyle("-fx-background-color: purple;");
        button2.setTextFill(Color.WHITE);
        button2.setPrefWidth(100);
        button2.setPrefHeight(50);
        button2.setOnAction(e -> System.out.println("İptal Edildi."));

        button3.setStyle("-fx-background-color: blue;");
        button3.setTextFill(Color.WHITE); //yazı rengi
        button3.setPrefWidth(100);
        button3.setPrefHeight(50);
        button3.setOnAction(e -> System.out.println("Adisyon Oluşturuldu."));

        button4.setStyle("-fx-background-color: darkblue;");
        button4.setTextFill(Color.WHITE);
        button4.setPrefWidth(100);
        button4.setPrefHeight(50);
        button4.setOnAction(e -> System.out.println("Düzeltme İşlemi"));

        button5.setStyle("-fx-background-color: green;");
        button5.setTextFill(Color.WHITE);
        button5.setPrefWidth(100);
        button5.setPrefHeight(50);

        button6.setStyle("-fx-background-color: red;");
        button6.setTextFill(Color.WHITE);
        button6.setPrefWidth(100);
        button6.setPrefHeight(50);

        VBox vbox = new VBox();
        vbox.setSpacing(5);//butonlar arası boşluk 5 piksel

        vbox.getChildren().addAll(button1,button2,button3,button4,button5,button6);

        HBox hbox = new HBox();
        hbox.setSpacing(5);
        hbox.setAlignment(Pos.BOTTOM_LEFT);//  sağ alt köşeye ekler

        Button b1=new Button("Fiş İptal");
        b1.setStyle("-fx-background-color: darkblue;");
        b1.setTextFill(Color.WHITE);
        b1.setPrefWidth(70);
        b1.setPrefHeight(20);
        b1.setOnAction(e -> System.out.println("Fiş İptal Edildi."));

        Button b2=new Button("Nakit");
        b2.setStyle("-fx-background-color: lightgreen;");
        b2.setTextFill(Color.WHITE);
        b2.setPrefWidth(70);
        b2.setPrefHeight(20);
        b2.setOnAction(e -> System.out.println("Nakit Seçildi."));

        Button b3=new Button("Tahsilat");
        b3.setStyle("-fx-background-color: gray;");
        b3.setTextFill(Color.WHITE);
        b3.setPrefWidth(70);
        b3.setPrefHeight(20);
        b3.setOnAction(e -> System.out.println("Tahsilat Seçildi."));

        Button b4=new Button("Çıkış");
        b4.setStyle("-fx-background-color: red;");
        b4.setTextFill(Color.WHITE);
        b4.setPrefWidth(70);
        b4.setPrefHeight(20);

        b4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.close();
            }
        });

        hbox.getChildren().addAll(b1,b2,b3,b4);
        hbox.setMargin(b1, new Insets(398, 300, 10, 5));

        VBox vbox1=new VBox();
        VBox vbox2=new VBox();

        Button bt1= new Button("GÖZLEME");
        bt1.setStyle("-fx-background-color: purple;");
        bt1.setTextFill(Color.WHITE);
        bt1.setPrefWidth(100);
        bt1.setPrefHeight(50);
        VBox.setMargin(bt1, new Insets(10, 10, 0, 500));//koordinatını belirler.

        Button bt2= new Button("WAFFLE");
        bt2.setStyle("-fx-background-color: purple;");
        bt2.setTextFill(Color.WHITE);
        bt2.setPrefWidth(100);
        bt2.setPrefHeight(50);
        VBox.setMargin(bt2, new Insets(5, 10, 0, 500));

        Button bt3= new Button("SALATA");
        bt3.setStyle("-fx-background-color: purple;");
        bt3.setTextFill(Color.WHITE);
        bt3.setPrefWidth(100);
        bt3.setPrefHeight(50);
        VBox.setMargin(bt3, new Insets(5, 10, 0, 500));

        Button bt4= new Button("İÇECEK");
        bt4.setStyle("-fx-background-color: purple;");
        bt4.setTextFill(Color.WHITE);
        bt4.setPrefWidth(100);
        bt4.setPrefHeight(50);
        VBox.setMargin(bt4, new Insets(5, 10, 0, 500));

        Button bt5= new Button("BURGER");
        bt5.setStyle("-fx-background-color: purple;");
        bt5.setTextFill(Color.WHITE);
        bt5.setPrefWidth(100);
        bt5.setPrefHeight(50);
        VBox.setMargin(bt5, new Insets(5, 10, 0, 500));

        Button bt6= new Button("MAKARNA");
        bt6.setStyle("-fx-background-color: purple;");
        bt6.setTextFill(Color.WHITE);
        bt6.setPrefWidth(100);
        bt6.setPrefHeight(50);
        VBox.setMargin(bt6, new Insets(5, 10, 0, 500));

        Button bt7= new Button("TOST");
        bt7.setStyle("-fx-background-color: purple;");
        bt7.setTextFill(Color.WHITE);
        bt7.setPrefWidth(100);
        bt7.setPrefHeight(50);
        VBox.setMargin(bt7, new Insets(10, 10, 0, 395));

        Button bt8= new Button("TAVUK");
        bt8.setStyle("-fx-background-color: purple;");
        bt8.setTextFill(Color.WHITE);
        bt8.setPrefWidth(100);
        bt8.setPrefHeight(50);
        VBox.setMargin(bt8, new Insets(5, 5, 0, 395));

        Button bt9= new Button("PASTA");
        bt9.setStyle("-fx-background-color: purple;");
        bt9.setTextFill(Color.WHITE);
        bt9.setPrefWidth(100);
        bt9.setPrefHeight(50);
        VBox.setMargin(bt9, new Insets(5, 10, 0, 395));

        Button bt10= new Button("BÖREK");
        bt10.setStyle("-fx-background-color: purple;");
        bt10.setTextFill(Color.WHITE);
        bt10.setPrefWidth(100);
        bt10.setPrefHeight(50);
        VBox.setMargin(bt10, new Insets(5, 10, 0, 395));

        Button bt11= new Button("KAHVALTI");
        bt11.setStyle("-fx-background-color: purple;");
        bt11.setTextFill(Color.WHITE);
        bt11.setPrefWidth(100);
        bt11.setPrefHeight(50);
        VBox.setMargin(bt11, new Insets(5, 10, 0, 395));

        Button bt12= new Button("SİMİT");
        bt12.setStyle("-fx-background-color: purple;");
        bt12.setTextFill(Color.WHITE);
        bt12.setPrefWidth(100);
        bt12.setPrefHeight(50);
        VBox.setMargin(bt12, new Insets(5, 10, 0, 395));

        vbox1.getChildren().addAll(bt1,bt2,bt3,bt4,bt5,bt6);
        vbox2.getChildren().addAll(bt7,bt8,bt9,bt10,bt11,bt12);
        //vbox1.getChildren().add(vbox2);

        Map<String, Double> map = new HashMap<>();
        map.put("Tost", 15.0);
        map.put("Çay", 7.0);
        map.put("Gözleme", 20.0);
        map.put("Köfte", 50.0);
        map.put("Kahve", 10.0);
        map.put("Waffle", 25.0);
        map.put("Künefe", 45.0);
        map.put("Börek", 32.0);
        map.put("Limonata", 8.0);
        map.put("Su", 3.0);
        map.put("Simit", 5.5);
        map.put("Tavuk", 25.0);
        map.put("Makarna", 40.0);
        map.put("Burger", 40.0);
        map.put("Salata", 25.0);
        map.put("Pasta", 90.0);

        //map.get("Tost");// fiyatı yazdırır.
       // ObservableList<map> ürünler = FXCollections.observableArrayList();
       // ArrayList<String> Urunler=new ArrayList<>();
        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll(map.keySet());
        comboBox.setPromptText("Ürün Seç");
        comboBox.setLayoutX(200); // x koordinatı
        comboBox.setLayoutY(20); // y koordinatı

        TextField textField = new TextField();
        textField.setPromptText("Adet giriniz");
        textField.setLayoutX(200);
        textField.setLayoutY(80);

        Button olustur=new Button("Oluştur");
        olustur.setLayoutX(300);
        olustur.setLayoutY(120);

        Text text =new Text();
        //text.setText((map.get(comboBox.getValue())).toString());
        text.setLayoutX(250);
        text.setLayoutY(165);

        olustur.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String secilenUrun = comboBox.getValue();
                Double fiyat = map.get(secilenUrun);
                double sonuc=0;
                //((Button)event.getSource()).getText();
                if(textField!=null){
                    double adet = Double.parseDouble(textField.getText());
                    sonuc = fiyat * adet;}

                if (fiyat == null) {
                    text.setText("Ürün bulunamadı.");
                } else if (textField.getText() == null || textField.getText().isEmpty()) {
                    text.setText(fiyat.toString()+" TL");
                } else {
                    text.setText(Double.toString(sonuc));
                }
            }
        });

        Label label=new Label("Fiyat:");
        label.setLayoutX(210);
        label.setLayoutY(150);

        AnchorPane pane=new AnchorPane();
        //AnchorPane.setRightAnchor(vbox1,2.5);
        pane.getChildren().add(vbox);
        pane.getChildren().add(hbox);
        pane.getChildren().add(vbox1);
        pane.getChildren().add(vbox2);
        pane.getChildren().add(comboBox);
        pane.getChildren().add(textField);
        pane.getChildren().add(label);
        pane.getChildren().add(olustur);
        pane.getChildren().add(text);

        Scene scene = new Scene(pane,600,450); // pencerenin boyutları
        primaryStage.setTitle("Cafe Otomasyonu"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    /**button.setLayoutX(300);
     button.setLayoutY(500);
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
