package training2.basics;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idnamb on 09-12-2014.
 */
public class StudentTest {
    @Test
    public void myTest1(){
        Student student1 = new Student("Kirtesh","Wani");
        Student student2 = new Student("Chetan","Patil",3);
        Assert.assertEquals(1,student1.getStandard());
        Assert.assertEquals(3,student2.getStandard());
        student1.promoteToNextClass();
        student2.promoteToNextClass();
        Assert.assertEquals(2,student1.getStandard());
        Assert.assertEquals(4,student2.getStandard());
        student1.promoteToNextClass();
        student2.remainInSameClass();
        Assert.assertEquals(3,student1.getStandard());
        Assert.assertEquals(4,student2.getStandard());
        Assert.assertEquals(Student.Result.PASS,student1.getResult());
        Assert.assertEquals(Student.Result.FAIL,student2.getResult());
    }

    @Test
    public void test2(){

        boolean condition = 4==5;
        if(condition==false){
            System.out.println("in if");
        }
        else
        {
            System.out.println("in else");
        }
    }

    @Test
    public void test3(){

        int angle1,angle2,angle3;
        angle1=60;angle2=60;angle3=60;
        if(angle1+angle2+angle3==180&&angle1>0&&angle2>0&&angle3>0){
            if(angle1==angle2&&angle1==angle3){

            }
            else{
                if(angle1==90||angle2==90||angle3==90){

                    if(angle1==45||angle2==45||angle3==45){
                        System.out.println("right angle + iso");
                    }
                    else
                    {
                        System.out.println("right angle");
                    }
                }
                else{
                    if(angle1==angle2||angle1==angle3||angle2==angle3){

                    }
                    else{

                    }
                }
            }

        }
        else
        {

        }
    }

}
