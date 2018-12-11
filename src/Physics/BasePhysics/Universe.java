package Physics.BasePhysics;

import java.util.ArrayList;

public abstract class Universe {
    private BasePhysics physics;
    protected ArrayList<Point> points;

    public void interactAll() {
        ArrayList<Point> newPoints = new ArrayList<>(points);
        for (Point p1 : points) {
            for (Point p2 : points) {

                if (p1 == p2) continue;
                newPoints.remove(p1);
                newPoints.remove(p2);
                newPoints.addAll(physics.interact(p1, p2));
            }
        }
        points = newPoints;
    }

    protected Universe(BasePhysics physics) {
        this.physics = physics;
    }

    public ArrayList<Point> getPoints() {
        return points;
    }
}
