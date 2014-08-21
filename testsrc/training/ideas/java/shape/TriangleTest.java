package training.ideas.java.shape;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idnamb on 21-08-2014.
 */
public class TriangleTest {

    @Test
    public void test_if_Rightangle_triangle() {
        double angle1 = 30;
        double angle2 = 60;
        double angle3 = 90;
        Assert.assertEquals("This is a Rightangle tringle", Triangle.TriangleType.RIGHTANGLE, Triangle.trianglecalc(angle1, angle2, angle3));
    }
    @Test
    public void test_if_Equilateral_triangle(){

        double angle1=60;
        double angle2=60;
        double angle3=60;
        Assert.assertEquals("This is a Equilateral triangle", Triangle.TriangleType.EQUILATERAL,Triangle.trianglecalc(angle1,angle2,angle3));
    }

    @Test
    public void test_if_Isosceles_triangle(){

        double angle1=50;
        double angle2=50;
        double angle3=80;
        Assert.assertEquals("This is a Equilateral triangle", Triangle.TriangleType.ISOSCELES,Triangle.trianglecalc(angle1,angle2,angle3));
    }

    @Test
    public void test_if_triangle_only(){

        double angle1=50;
        double angle2=10;
        double angle3=120;
        Assert.assertEquals("This is a triangle only", Triangle.TriangleType.TRINGLE,Triangle.trianglecalc(angle1,angle2,angle3));
    }

    @Test
    public void test_if_Notriangle_only(){

        double angle1=50;
        double angle2=10;
        double angle3=150;
        Assert.assertEquals("This is not a triangle", Triangle.TriangleType.NOTRIANGLE,Triangle.trianglecalc(angle1,angle2,angle3));

    }

    @Test
    public void test_if_Notriangle_with_0(){

        double angle1=30;
        double angle2=0;
        double angle3=150;
        Assert.assertEquals("This is not a triangle", Triangle.TriangleType.NOTRIANGLE,Triangle.trianglecalc(angle1,angle2,angle3));

    }

}
