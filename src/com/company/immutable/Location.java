package com.company.immutable;

public class Location implements Comparable<Location> {

    private Position position;
    private LocationType type;

    public Location(Position position, LocationType type) {
        this.position = position;
        this.type = type;
    }

    public Position getPosition() { return position; }

    public LocationType getType() { return type; }

    public void setPosition(Position position) { this.position = position; }

    public void setType(LocationType type) { this.type = type; }

    public double distance(Location target) {
        return position.distance(target.getPosition());
    }

    public String toString() {
        return type.toString() + " at " + position.toString();
    }

    public int compareTo(Location other) {
        return position.compareTo(other.getPosition());
    }
}
