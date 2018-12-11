package Physics.Basic;

import Physics.BasePhysics.BasePhysics;
import Physics.BasePhysics.Point;
import Physics.BasePhysics.Universe;

import java.util.ArrayList;
import java.util.List;

public abstract class BasicMultiDPhysics implements BasePhysics {
    public final int STATIC_CHARACTERISTICS = listPointCharacteritics().length / 2;


    @Override
    public List<Point> aloneBehiavor(Point point) {
        point.time++;
        for (int i = 0; i < STATIC_CHARACTERISTICS; i++) {
            point.characteritics.replace(
                    listPointCharacteritics()[i],
                    Integer.toString(
                            Integer.parseInt(point.characteritics.get(listPointCharacteritics()[i]))
                                    +
                                    Integer.parseInt(point.characteritics.get(listPointCharacteritics()[i + STATIC_CHARACTERISTICS]))
                    )
            );

        }
        ArrayList<Point> list = new ArrayList<>();
        list.add(point);
        return list;
    }

    @Override
    public List<Point> interact(Point pointA, Point pointB) {
        aloneBehiavor(pointA);
        aloneBehiavor(pointB);
        ArrayList<Point> list = new ArrayList<>();
        list.add(pointA);
        if (!positionEquals(pointA, pointB)) {
            list.add(pointB);
        }
        return list;
    }

    @Override
    public boolean positionEquals(Point a, Point b) {
        for (int i = 0; i < STATIC_CHARACTERISTICS; i++) {
            if (!a.characteritics.get(listPointCharacteritics()[i]).equals(b.characteritics.get(listPointCharacteritics()[i])))
                return false;
        }
        return true;
    }
}
