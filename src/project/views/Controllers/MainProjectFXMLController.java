/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.views.Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import project.Controllers.ManagerController;
import project.beans.Person;

/**
 * FXML Controller class
 *
 * @author sniper
 */
public class MainProjectFXMLController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private TableView<Person> personsTable;
    private ObservableList<Person> personsList;
    private ManagerController managerController;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        personsList = FXCollections.observableArrayList();
        managerController = new ManagerController();
        personsList = managerController.initPersons();
        initPersonsTable(personsTable);
    }

    private void initPersonsTable(TableView<Person> table) {
        int i = 0;
        ((TableColumn<Person, Long>) table.getColumns().get(i++)).setCellValueFactory(
                new PropertyValueFactory<>("id"));
        ((TableColumn<Person, String>) table.getColumns().get(i++)).setCellValueFactory(
                new PropertyValueFactory<>("name"));
        ((TableColumn<Person, Integer>) table.getColumns().get(i)).setCellValueFactory(
                new PropertyValueFactory<>("age"));

        table.setItems(personsList);
    }

    @FXML
    void addPerson(MouseEvent event) {
        personsList.add(new Person(0, "fuckoff", 20));

    }

    @FXML
    void removePerson(MouseEvent event) {
        ObservableList<Person> listSelectedItems = personsTable.getSelectionModel().getSelectedItems();
        if (personsTable.getSelectionModel().getSelectedIndex() > 0) {
            listSelectedItems.stream().forEach((person) -> {
                personsList.remove(person);
            });
        }
        personsTable.setItems(personsList);
    }
}
