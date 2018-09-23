package ru.atom.geometry;

public class Bar implements Collider {

    private final Point pointOne;
    private final Point pointTwo;

    public Bar(int x, int y, int x1, int y1) {
        this.pointOne = new Point(x, y);
        this.pointTwo = new Point(x1, y1);
    }

    @Override
    public boolean isColliding(Collider other) {
        Point point = (Point) other;

        if (point.getX() >= pointOne.getX()
                && point.getX() <= pointTwo.getX()
                && point.getY() >= pointOne.getY()
                && point.getY() <= pointTwo.getY())
            return true;

        return false;
    }
}
