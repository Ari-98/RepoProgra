 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classicmodels.dao;

import com.classicmodels7b.dao.Conexion;
import com.classicmodels7b.dao.OfficesDao;
import com.classicmodels7b.model.OfficesModel;
//import com.sun.istack.internal.logging.Logger;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
//import sun.util.logging.PlatformLogger;
//import sun.util.logging.PlatformLogger.Level;


/**
 *
 * @author Isamar
 */
public class OfficesDaoImpl implements OfficesDao{
    Conexion con = new Conexion();
    
    public String createOffice(OfficesModel newOffice) {
        String serverAnswer = null;
        try {
            PreparedStatement preparedStatement = con.getConnection()
                    .prepareStatement("INSERT INTO offices (officeCode,"
                            + " city, phone, "
                            + "addressLine1, "
                            + "addressLine2,state, country,postalCode, "
                            + "territory ) VALUES(?,?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1, newOffice.getOfficeCode());
            preparedStatement.setString(2, newOffice.getCity());
            preparedStatement.setString(3, newOffice.getPhone());
            preparedStatement.setString(4, newOffice.getAddressLine1());
            preparedStatement.setString(5, newOffice.getAddressLine2());
            preparedStatement.setString(6, newOffice.getState());
            preparedStatement.setString(7, newOffice.getCountry());
            preparedStatement.setString(8, newOffice.getPostalCode());
            preparedStatement.setString(9, newOffice.getTerritory());
            
             int numAffectedRows =preparedStatement.executeUpdate();
             
               
                if (numAffectedRows >0) {
                serverAnswer = "The office was inserted";
            }
        } catch (SQLException e) {
            System.out.println("ERROR "+ e.getMessage());
            serverAnswer = "There was an error";
        }
        return serverAnswer;
    }

    public ArrayList<OfficesModel> readOffices() {
        ArrayList<OfficesModel> officesList = new ArrayList();
        OfficesModel auxOffice;
        
        try {
            PreparedStatement preparedStatement = con.getConnection().prepareStatement("SELECT * FROM offices");
            
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                auxOffice = new OfficesModel();
                auxOffice.setOfficeCode(resultSet.getString(1));
                
                auxOffice.setCity(resultSet.getString(2));
                auxOffice.setPhone(resultSet.getString(3));
                auxOffice.setAddressLine1(resultSet.getString(4));
                auxOffice.setAddressLine2(resultSet.getString(5));
                auxOffice.setState(resultSet.getString(6));
                auxOffice.setCountry(resultSet.getString(7));
                auxOffice.setPostalCode(resultSet.getString(8));
                auxOffice.setTerritory(resultSet.getString(9));
                
                officesList.add(auxOffice);
            }
        } catch (SQLException e) {
            System.out.println("ERROR "+ e.getMessage());
        }
        
        return officesList;
    }

   /* public String updateOffice(OfficesModel auxOffice) {
        String serverAnswer = null;
        try {
            PreparedStatement update = con.getConnection("UPDATE offices SET (officeCode,"
                            + " city, phone, "
                            + "addressLine1, "
                            + "addressLine2,state, country,postalCode, "
                            + "territory ) VALUES(?,?,?,?,?,?,?,?,?) WHERE officeCode=?)");
              
            update.setString(1, auxOffice.getOfficeCode());
            update.setString(2, auxOffice.getCity());
            update.setString(3, auxOffice.getPhone());
            update.setString(4, auxOffice.getAddressLine1());
            update.setString(5, auxOffice.getAddressLine2());
            update.setString(6, auxOffice.getState());
            update.setString(8, auxOffice.getPostalCode());
            update.setString(9, auxOffice.getTerritory());
            
            int rowsUpdated = update.executeUpdate();
			if (rowsUpdated > 0) {
				System.out.println("An existing user was updated successfully!");
			}
                    
        } catch (SQLException e) {
           System.out.println("ERROR "+ e.getMessage());
        }
        return serverAnswer;
    }*/

    public String updateOffice(OfficesModel auxOffice) {
        String serverAnswer = null;
        try{
            PreparedStatement preparedStatement=con.getConnection().prepareStatement("UPDATE offices SET city=?, phone=?, addressLine1=?, addressLine2=?, state=?, country=?, postalCode=?, territory=? WHERE offices.officeCode = ?");
            preparedStatement.setString(1, auxOffice.getCity());
            preparedStatement.setString(2, auxOffice.getPhone());
            preparedStatement.setString(3, auxOffice.getAddressLine1());
            preparedStatement.setString(4, auxOffice.getAddressLine2());
            preparedStatement.setString(5, auxOffice.getState());
            preparedStatement.setString(6, auxOffice.getCountry());
            preparedStatement.setString(7, auxOffice.getPostalCode());
            preparedStatement.setString(8, auxOffice.getTerritory());
            preparedStatement.setString(9, auxOffice.getOfficeCode());
            
            int numAffectedRows = preparedStatement.executeUpdate();
            if (numAffectedRows > 0) {
                serverAnswer = "The office was updated";
            }
        }catch (SQLException e){
           System.out.println("ERROR"+e.getMessage());   
           serverAnswer = "There was an error";
       }
        return serverAnswer;
    }
    public String deleteOffice(String officeCode) {
        String ServerAnswer = null;
        try {
          Statement preparedStatement = con.getConnection().createStatement();
                   System.out.println("DELETE  FROM offices WHERE officeCode= ' "+officeCode+ "'");
              preparedStatement.executeUpdate("DELETE  FROM offices WHERE officeCode= '"+officeCode+ "'");
                   
        } catch (SQLException e) {
           Logger.getLogger(OfficesDaoImpl.class.getName()).log(Level.SEVERE, null,e);
        } 
            return ServerAnswer;
       
    }
    
}
