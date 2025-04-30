package com.studentpgfinder.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import com.studentpgfinder.models.Hostel;
import com.studentpgfinder.utils.HostelData;

import java.util.List;
import java.util.stream.Collectors;

public class HostelSearchController {
    @FXML
    private ListView<String> resultsList;
    @FXML
    private ComboBox<String> locationComboBox;
    @FXML
    private ComboBox<Double> budgetComboBox;
    @FXML
    private CheckBox mealsCheckBox;
    @FXML
    private Button searchButton;

    @FXML
    private void initialize() {
        locationComboBox.getItems().addAll("Location 1", "Location 2", "Location 3");
        budgetComboBox.getItems().addAll(1000.0, 2000.0, 3000.0);
    }

    @FXML
    private void handleSearch() {
        String location = locationComboBox.getValue();
        double budget = budgetComboBox.getValue();
        boolean mealsIncluded = mealsCheckBox.isSelected();

        List<Hostel> hostels = HostelData.loadHostels();  // Load hostel data
        List<Hostel> filteredHostels = hostels.stream()
                .filter(h -> h.getLocation().equals(location) && h.getPrice() <= budget && (mealsIncluded ? h.getFacilities().contains("Three meals a day") : true))
                .collect(Collectors.toList());

        resultsList.getItems().clear();
        for (Hostel hostel : filteredHostels) {
            resultsList.getItems().add(hostel.getName() + " - ₹" + hostel.getPrice() + " - " + hostel.getLocation());
        }
    }
}
