

package ruwaninventorycontrollsystem;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import ruwaninventorycontrollsystem.*;

/**
 * FXML Controller class
 *
 * @author Nimesha Jinarajadasa
 */
public class MainMenuController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    
    
    public void initialize(URL url, ResourceBundle rb) {
      
    }    
    
    @FXML
    public void productStatus(){
        
       try{
            Parent root1 = FXMLLoader.load(getClass().getResource("Product.fxml"));
           
            Scene scene = new Scene(root1);
            
            RuwanInventoryControllSystem.getStage().setTitle("Products");
            RuwanInventoryControllSystem.getStage().setScene(scene);  
            RuwanInventoryControllSystem.getStage().show();
          }catch(Exception e){}
        
    
    }
    
       public void supplierStatus(){
        
       try{
            Parent root1 = FXMLLoader.load(getClass().getResource("Supplier.fxml"));
           
            Scene scene = new Scene(root1);
            
            RuwanInventoryControllSystem.getStage().setTitle("Suppliers");
            RuwanInventoryControllSystem.getStage().setScene(scene);  
            RuwanInventoryControllSystem.getStage().show();
          }catch(Exception e){}
        
    
    }
    
}
