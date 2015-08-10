/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ruwaninventorycontrollsystem;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 * FXML Controller class
 *
 * @author Nimesha Jinarajadasa
 */
public class ProductController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void backToMainMenu(){
         try{
            Parent root1 = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
           
            Scene scene = new Scene(root1);
            
            RuwanInventoryControllSystem.getStage().setTitle("easyCash");
            RuwanInventoryControllSystem.getStage().setScene(scene);  
            RuwanInventoryControllSystem.getStage().show();
          }catch(Exception e){}
    }
    @FXML
     public void ProductDetails(){

        try {
            URL location = getClass().getResource("ProductTableview.fxml");

            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(location);
            fxmlLoader.setBuilderFactory(new JavaFXBuilderFactory());

           Parent root1 = (Parent) fxmlLoader.load(location.openStream());
            
           ProductTableViewController ctr1=(ProductTableViewController)fxmlLoader.getController();
            
            Scene scene = new Scene(root1);
            
            RuwanInventoryControllSystem.getStage().setTitle("Product Details");
            RuwanInventoryControllSystem.getStage().setScene(scene);  
            RuwanInventoryControllSystem.getStage().show();

        } catch (IOException ex) {
            Logger.getLogger(SupplierController.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
}
}
