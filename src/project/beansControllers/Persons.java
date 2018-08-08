/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.beansControllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import project.beans.Person;

/**
 *
 * @author sniper
 */
public class Persons {

    private ObservableList<Person> personslist;

    public Persons() {
        personslist = FXCollections.observableArrayList();
    }

    public void initPersons() {
        personslist.add(new Person(0, "zaki", 20));
        personslist.add(new Person(2, "zaki", 26));
        personslist.add(new Person(3, "zaki", 25));
        personslist.add(new Person(4, "zaki", 23));
        personslist.add(new Person(5, "zaki", 22));
    }

    public ObservableList<Person> getPersonslist() {
        return personslist;
    }

    public void setPersonslist(ObservableList<Person> personslist) {
        this.personslist = personslist;
    }

}
