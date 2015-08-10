/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruwaninventorycontrollsystem;

import java.net.URL;
import static java.rmi.Naming.list;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import static java.util.Collections.list;
import java.util.ResourceBundle;
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
import static javafx.application.Application.launch;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Bhashi
 */
public class suppTableViewController implements Initializable{
    @FXML
    TableView tblview;
    //public-Readable var listViewSupplier: javafx.scene.control.ListView;
    //var db: Database = Database.getInstance();
   // private final TableView<Details> tblview = new TableView<>();
   // private final ObservableList<Person> data =FXCollections.observableArrayList(new Person("A", "B"));
    private  ObservableList<Details> data=FXCollections.observableArrayList(new Details("A", "B","C","D","E"));
    final HBox hb = new HBox();
    

    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        TableColumn firstNameCol = new TableColumn("Supplier ID");
        firstNameCol.setMinWidth(100);
        firstNameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));
 
        TableColumn lastNameCol = new TableColumn("Supplier Name");
        lastNameCol.setMinWidth(100);
        lastNameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        
        TableColumn addressCol = new TableColumn("Address");
        addressCol.setMinWidth(100);
        addressCol.setCellValueFactory(new PropertyValueFactory<>("address"));
        
        TableColumn companyNameCol = new TableColumn("Company");
        companyNameCol.setMinWidth(100);
        companyNameCol.setCellValueFactory(new PropertyValueFactory<>("Company"));
        
        TableColumn phoneCol = new TableColumn("Phone");
        phoneCol.setMinWidth(100);
        phoneCol.setCellValueFactory(new PropertyValueFactory<>("Phone"));
 
        tblview.setItems(data);
        tblview.getColumns().addAll(firstNameCol, lastNameCol,addressCol,companyNameCol,phoneCol);
       // data.add(new Details("qq", "aa", "c","dd","E"));
                
        try {
            Statement st=connection.getcon().createStatement();
           // st.executeUpdate("INSERT INTO APP.FRIENDS (ID, \"NAME\") \n" +"VALUES (10, 'maaa')");          
           // st.execute("DELETE FROM RUKSHANI.FRIENDS WHERE id=10");
            ResultSet rs=st.executeQuery("select * from SUPPLIER");
            ResultSetMetaData rsmd=rs.getMetaData();
	    int numberOfColumns = rsmd.getColumnCount();
            System.out.println(numberOfColumns);
            
            while(rs.next()){
          //  for (int i = 1; i <= numberOfColumns; i++){
//                for(int i=1;i<=numberOfColumns;i++){
//                    System.out.print(rs.getString(i)+"    ");
                  //  data =FXCollections.observableArrayList(new Person("A", "B"));
                    //System.out.println(i);
                /*String ID = rs.getString(1);
                String name = rs.getString(2);
                String address = rs.getString(3);
                int phone = rs.getInt(4);
                String company = rs.getString(5);
                System.out.println(address);
                System.out.println(phone);
                data.add(new Details(ID, name, address));*/
                System.out.println(rs.getString(4));
                System.out.println(rs.getString(5));
                data.add(new Details(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5)));
                    
//                }
//                System.out.println("");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }  
    }

    public static void main(String[] args) {
        launch(args);
    }
 
            @FXML
    public void backToSupplier(){
         try{
            Parent root1 = FXMLLoader.load(getClass().getResource("Supplier.fxml"));
           
            Scene scene = new Scene(root1);
            
            RuwanInventoryControllSystem.getStage().setTitle("Suppliers");
            RuwanInventoryControllSystem.getStage().setScene(scene);  
            RuwanInventoryControllSystem.getStage().show();
          }catch(Exception e){}
    }
    
        public void backToMainMenu(){
         try{
            Parent root1 = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
           
            Scene scene = new Scene(root1);
            
            RuwanInventoryControllSystem.getStage().setTitle("easyCash");
            RuwanInventoryControllSystem.getStage().setScene(scene);  
            RuwanInventoryControllSystem.getStage().show();
          }catch(Exception e){}
    }
        
        
    }
    


