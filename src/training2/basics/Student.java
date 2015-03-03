package training2.basics;

/**
 * Created by idnamb on 09-12-2014.
 */
public class Student {
    private final String fname,lname;
    private int standard;
    private boolean isPassed;

    public static enum Result{
        PASS,FAIL
    }

    public Result getResult() {
        if(isPassed)
        {
            return Result.PASS;
        }
        else
        {
            return Result.FAIL;
        }
    }
    public Student(String fname, String lname) {
        this.fname=fname;
        this.lname=lname;
        this.standard=1;
        isPassed=true;
    }

    public Student(String fname, String lname,int standard) {
        this.fname=fname;
        this.lname=lname;
        this.standard=standard;
        isPassed=true;
    }

    public void setName(String fname, String lname){
        //this.fname=fname;
        // this.lname=lname;
    }

    public String getName() {
        return fname+" "+lname;
    }

    public int getStandard() {
        return standard;
    }

    public void promoteToNextClass() {
        standard++;
        isPassed = true;
    }

    public void remainInSameClass() {
        isPassed = false;
    }
}
