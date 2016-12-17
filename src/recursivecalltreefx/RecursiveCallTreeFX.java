/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivecalltreefx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 *
 * @author hossein
 */
public class RecursiveCallTreeFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Point start = new Point();
        start.x = 400;
        start.y = 600;
        drawTree(root, start, 90, 10);
        Scene scene = new Scene(root);
        primaryStage.setTitle("Recursive Call Tree FX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void drawTree(Group group, Point p0, double angle, int level) {
        if (level <= 0) {
            return;
        }
        Point destination = p0.getDestination(10, angle, level);
        Line line = new Line(p0.x, p0.y, destination.x, destination.y);
        line.setStrokeWidth(level);
        if (level > 7) {
            line.setStroke(Color.BROWN);
        } else if (level > 3) {
            line.setStroke(Color.GREEN);
        } else {
            line.setStroke(Color.LIMEGREEN);
        }
        group.getChildren().add(line);
        drawTree(group, destination, angle - 20 - Math.random() * 10, level - 1);
        drawTree(group, destination, angle - 5, level - 1);
        drawTree(group, destination, angle + 20 + Math.random() * 20, level - 1);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
