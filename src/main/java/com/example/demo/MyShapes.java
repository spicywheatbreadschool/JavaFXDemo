package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.Group;

import java.util.ArrayList;

public class MyShapes extends Application {
    @Override
    public void start(Stage stage) {
        // Create an Ellipse and set fill color
        /*

        // Create a Text shape with font and size
        Text text = new Text("My Shapes");
        text.setFont(new Font("Arial Bold", 24));
        */
        // Initialize Students
        Student s1 = new Student("Freddy Fazbear", 1000, new Image("file:///Users/johan/IdeaProjects/demo/src/main/java/com/example/demo/student1.jpeg"));
        Student s2 = new Student("Markiplier", 1999, new Image("file:///Users/johan/IdeaProjects/demo/src/main/java/com/example/demo/markiplier.jpeg"));
        Student s3 = new Student("Joe Biden", 2024, new Image("file:///Users/johan/IdeaProjects/demo/src/main/java/com/example/demo/biden.jpeg"));

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        HBox root = new HBox();

        for(Student s : students) {
            Text sName = new Text(s.getName());
            Text sID = new Text("" + s.getID());
            Image img = s.getImg();
            ImageView imgView = new ImageView(img);
            imgView.setFitHeight(100);
            imgView.setFitWidth(100);

            VBox vbox = new VBox(sName, sID, imgView);
            root.getChildren().add(vbox);
        }


        Scene scene = new Scene(root, 500, 500,
                Color.LIGHTYELLOW);
        stage.setTitle("Showing Students");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
