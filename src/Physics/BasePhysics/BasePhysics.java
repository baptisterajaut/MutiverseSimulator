package Physics.BasePhysics;

import Physics.Physics;

import java.util.List;

public interface BasePhysics extends Physics {

    /**
     * How a single point should behave if let alone
     * @param point Point to behave
     */
    List<Point> aloneBehiavor(Point point);

    /**
     * How to CollidingsPoint should iterate
     * @param pointA
     * @param pointB
     */
    List<Point> interact(Point pointA, Point pointB);

    String[] listPointCharacteritics();

    boolean positionEquals(Point a, Point b);


}
