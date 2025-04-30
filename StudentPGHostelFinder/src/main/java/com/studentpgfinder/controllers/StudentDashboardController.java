package com.studentpgfinder.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import com.studentpgfinder.models.Hostel;
import com.studentpgfinder.utils.HostelData;

import java.util.List;

public class StudentDashboardController {
    @FXML
    private ListView<String> resultsList;
    @FXML
    private Button searchButton;

    @FXML
    private void handleSearch() {
        List<Hostel> hostels = HostelData.loadHostels();  // Load hostel data
        resultsList.getItems().clear();

        for (Hostel hostel : hostels) {
            resultsList.getItems().add(hostel.getName() + " - " + hostel.getLocation() + " - ₹" + hostel.getPrice());
        }
    }
}
