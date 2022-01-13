package ru.job4j.oop;

import junit.framework.TestCase;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

public class PointTest extends TestCase {

    public void testDistance() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        assertThat(dist, closeTo(2, 0.001));
    }

    public void testDistance3d() {
        Point c = new Point(4, 5, 8);
        Point d = new Point(1, 2, 5);
        double dist1 = c.distance3d(d);
        assertThat(dist1, closeTo(5.196, 0.001));
    }
}