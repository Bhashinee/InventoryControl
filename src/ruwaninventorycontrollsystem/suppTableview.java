/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruwaninventorycontrollsystem;

/**
 *
 * @author Bhashi
 */
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class suppTableview extends Application {
    
    private final TableView<ProductDetails> table = new TableView<>();
   // private final ObservableList<Person> data =FXCollections.observableArrayList(new Person("A", "B"));
   // private  ObservableList<ProductDetails> data=FXCollections.observableArrayList(new ProductDetails("A", "B","C","D","E",7,8));
    final HBox hb = new HBox();
    
    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(new Group());
        stage.setWidth(450);
        stage.setHeight(550);
        
        TableColumn firstNameCol = new TableColumn("Supplier ID");
        firstNameCol.setMinWidth(100);
        firstNameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));
 
        TableColumn lastNameCol = new TableColumn("Supplier Name");
        lastNameCol.setMinWidth(100);
        lastNameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        
        TableColumn addressCol = new TableColumn("Address");
        addressCol.setMinWidth(100);
        addressCol.setCellValueFactory(new PropertyValueFactory<>("address"));
        
        TableColumn fourthNameCol = new TableColumn("Phone");
        fourthNameCol.setMinWidth(100);
        fourthNameCol.setCellValueFactory(new PropertyValueFactory<>("phone"));
        
        TableColumn fifthNameCol = new TableColumn("Company");
        fifthNameCol.setMinWidth(100);
        fifthNameCol.setCellValueFactory(new PropertyValueFactory<>("Company"));
 
      //  table.setItems(data);
        table.getColumns().addAll(firstNameCol, lastNameCol,addressCol,fourthNameCol,fifthNameCol);
        
        //data.add(new Details("qq", "aa", "c","dd"));
        
        
        //data =FXCollections.observableArrayList(new Person("A", "B"));
        
        try {
            Statement st=connection.getcon().createStatement();
           // st.executeUpdate("INSERT INTO APP.FRIENDS (ID, \"NAME\") \n" +"VALUES (10, 'maaa')");          
           // st.execute("DELETE FROM RUKSHANI.FRIENDS WHERE id=10");
            ResultSet rs=st.executeQuery("select * from PRODUCT");
            ResultSetMetaData rsmd=rs.getMetaData();
	    int numberOfColumns = rsmd.getColumnCount();
            System.out.println(numberOfColumns);
            
            while(rs.next()){
          //  for (int i = 1; i <= numberOfColumns; i++){
//                for(int i=1;i<=numberOfColumns;i++){
//                    System.out.print(rs.getString(i)+"    ");
                  //  data =FXCollections.observableArrayList(new Person("A", "B"));
                    //System.out.println(i);
                String ID = rs.getString(1);
                String name = rs.getString(2);
                String address = rs.getString(3);
                String phone = rs.getString(4);
                String company = rs.getString(5);
                System.out.println(address);
                System.out.println(phone);
               // data.add(new ProductDetails(ID, name, address,phone,company));
                  //  data.add(new Details(rs.getString(1), rs.getString(2), rs.getString(3)));
                    
//                }
//                System.out.println("");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }   
 
        final Button addButton = new Button("Add");
        addButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
              // data.add(new ProductDetails("Z","X","B","C","f"));
            }
        });
 
        hb.getChildren().addAll(addButton);
        hb.setSpacing(5);
 
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(table, hb);
 
        ((Group) scene.getRoot()).getChildren().addAll(vbox);
 
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
    
}

