/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classicmodels7b.dao;

import com.classicmodels7b.model.OfficesModel;
import java.util.ArrayList;

/**
 *
 * @author Isamar
 */
public interface OfficesDao {
    // recibe un objeto de tipo OfficeModel y  crea una nueva oficina en la BD
    public String createOffice(OfficesModel newOffice);
    //DEVUELVE un listado de las oficinas almacenadas en la tabla Offices
    public ArrayList<OfficesModel> readOffices();
    //Recibe un objeto de tipo OfficeModel y actualiza una oficina
    public String updateOffice(OfficesModel auxOffice);
    //Borra una ofina de la tabla offices de acuerdo al id recibido
    public String deleteOffice(String officeCode);
}
