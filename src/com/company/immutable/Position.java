package com.company.immutable;

public class Position {

    private double x;
    private double y;

    public Position(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }

    public double getY() { return y; }

    public double distance(Position target) {
        double dx = x - target.getX();
        double dy = y - target.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public int compareTo(Position other) {
        Position origin = new Position(0.0, 0.0);
        double diff = origin.distance(this) - origin.distance(other);
        return (int)diff;
    }
}
