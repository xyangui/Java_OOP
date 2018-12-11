package com.company.immutable;

import java.util.ArrayList;
import java.util.Collections;

public class Map {

    private ArrayList<Location> locations = new ArrayList<>();

    public void addLocation(Location location) {
        locations.add(location);
    }

    public void sortLocations() {
        Collections.sort(locations);
    }
}
