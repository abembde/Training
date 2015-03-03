package training.ideas.java.shape;

/**
 * Created by idnamb on 21-08-2014.
 */
public class Triangle {
            public static enum TriangleType{NOTRIANGLE,EQUILATERAL,ISOSCELES,RIGHTANGLE,TRINGLE};

        public static TriangleType trianglecalc(double angle1, double angle2, double angle3) {

//        String a= "This is not a triangle";
//        String b ="This is a Equilateral triangle";
//        String c= "This is a Isosceles triangle";
//        String d="This is a Right Angle triangle";
//        String e= "This is a triangle only";
//
            if ((angle1+angle2+angle3==180)&&(angle1>0)&&(angle2>0)&&(angle3>0))
            {
                if(angle1==angle2&&angle2==angle3){
                    return TriangleType.EQUILATERAL;
                }
                else if((angle1==angle2)||(angle2==angle3)){
                    return TriangleType.ISOSCELES;
                }
                else if((angle1+angle2==angle3)||(angle1+angle3==angle2)||(angle2+angle3==angle1)){
                    return TriangleType.RIGHTANGLE;
                }
                else
                {

                    return TriangleType.TRINGLE;
                }
            }
            else
                return TriangleType.NOTRIANGLE;

        }
    }


