import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class dasboard extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Bendicar");

        
        Label label = new Label("Bendicar");
        label.setStyle("-fx-font-family: 'Fresh Steak'; -fx-font-size: 65px;");

        
        Button btn1 = new Button("Insert Table");
        Button btn2 = new Button("Update Table");
        Button btn3 = new Button("Delete Table");
        

        
        btn1.setOnAction(e -> {
            Insert insert = new Insert();
            try {
                insert.start(new Stage());
                primaryStage.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });;

        btn2.setOnAction(e -> {
            update update = new update();
            try {
                update.start(new Stage());
                primaryStage.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });;

        btn3.setOnAction(e -> {
            delete delete = new delete();
            try {
                delete.start(new Stage());
                primaryStage.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });;

        
        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(label, btn1, btn2, btn3);
        vbox.setStyle("-fx-alignment: center; -fx-padding: 20px;");
        

        
        Scene scene = new Scene(vbox, 400, 250);

        
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
