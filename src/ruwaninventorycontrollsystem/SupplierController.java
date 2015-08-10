/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruwaninventorycontrollsystem;

import java.io.IOException;
import java.net.URL;
import static java.rmi.Naming.list;
import static java.util.Collections.list;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import org.apache.derby.database.Database;
import org.eclipse.persistence.config.TargetDatabase;
import static org.eclipse.persistence.config.TargetDatabase.Database;
import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Bhashi
 */
public class SupplierController implements Initializable{
    
    //public-Readable var listViewSupplier: javafx.scene.control.ListView;
    //var db: Database = Database.getInstance();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }
    

    
        @FXML
    public void backToMainMenu(){
         try{
            Parent root1 = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
           
            Scene scene = new Scene(root1);
            
            RuwanInventoryControllSystem.getStage().setTitle("Suppliers");
            RuwanInventoryControllSystem.getStage().setScene(scene);  
            RuwanInventoryControllSystem.getStage().show();
          }catch(Exception e){}
    }
            @FXML
    public void SupplierDetails(){

        try {
            URL location = getClass().getResource("suppTableview.fxml");

            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(location);
            fxmlLoader.setBuilderFactory(new JavaFXBuilderFactory());

            Parent root1 = (Parent) fxmlLoader.load(location.openStream());
            
            suppTableViewController ctr=(suppTableViewController)fxmlLoader.getController();
            
            Scene scene = new Scene(root1);
            
            RuwanInventoryControllSystem.getStage().setTitle("Supplier Details");
            RuwanInventoryControllSystem.getStage().setScene(scene);  

            RuwanInventoryControllSystem.getStage().show();

        } catch (IOException ex) {
            Logger.getLogger(SupplierController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    
}
