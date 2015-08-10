/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ruwaninventorycontrollsystem;


import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Nimesha Jinarajadasa
 */
public class RuwanInventoryControllSystem extends Application {
   
   private static Stage stage;
    
    @Override
    public void start(Stage primaryStage) throws IOException {
      
        stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("easyCash");
        stage.setScene(scene);
        stage.show();
        
        
        
    }
    
    public static Stage getStage(){
       
        return stage;
    }

    
    public static void main(String[] args) {
        
        launch(args);
    }
    
}
