/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.Controllers;

import javafx.collections.ObservableList;
import project.beans.Person;
import project.beansControllers.Persons;

/**
 *
 * @author sniper
 */
public class ManagerController {

    public ObservableList<Person> initPersons() {
        Persons ps = new Persons();
        ps.initPersons();
     return ps.getPersonslist();
    }
    
}
