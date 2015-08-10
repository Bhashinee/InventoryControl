/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruwaninventorycontrollsystem;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Bhashi
 */
public class Details {
 
        private final SimpleStringProperty firstName;
        private final SimpleStringProperty lastName;
        private final SimpleStringProperty supaddress;
        private final SimpleStringProperty companyName;
        private final SimpleStringProperty phoneNo;
        
 
        public Details(String fName, String lName, String address, String company, String phone) {
            this.firstName = new SimpleStringProperty(fName);
            this.lastName = new SimpleStringProperty(lName);
            this.supaddress = new SimpleStringProperty(address);
            this.companyName = new SimpleStringProperty(company);
            this.phoneNo = new SimpleStringProperty(phone);
        }

  
 
        public String getFirstName() {
            return firstName.get();
        }
 
        public void setFirstName(String fName) {
            firstName.set(fName);
        }
 
        public String getLastName() {
            return lastName.get();
        }
 
        public void setLastName(String lName) {
            lastName.set(lName);
        }
            public String getAddress() {
            return supaddress.get();
        }
 
        public void setAddress(String address) {
            supaddress.set(address);
        }
        
        public String getCompany() {
            return companyName.get();
        }
 
        public void setCompany(String company) {
            companyName.set(company);
        }
        
        public String getPhone() {
            return phoneNo.get();
        }
 
        public void setPhone(String phone) {
            companyName.set(phone);
        }
    }

