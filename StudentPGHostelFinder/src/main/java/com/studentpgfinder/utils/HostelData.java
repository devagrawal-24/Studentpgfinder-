package com.studentpgfinder.utils;

import com.studentpgfinder.models.Hostel;

import java.util.Arrays;
import java.util.List;

public class HostelData {

    // Sample data for hostels
    public static List<Hostel> loadHostels() {
        return Arrays.asList(
                new Hostel("ABC Hostel", "Location 1", 1500, Arrays.asList("Three meals a day", "Wi-Fi", "Laundry")),
                new Hostel("XYZ PG", "Location 2", 2500, Arrays.asList("Three meals a day", "Wi-Fi")),
                new Hostel("LMN Hostel", "Location 1", 2000, Arrays.asList("Wi-Fi", "Laundry")),
                new Hostel("QRS Hostel", "Location 3", 3000, Arrays.asList("Three meals a day", "Gym", "Wi-Fi"))
        );
    }
}
