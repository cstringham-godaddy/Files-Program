/**
 * Write a description of class Student here.
 * 
 * @author Chris Stringham
 * @version 29 Nov 2011
 */

public class Student
{
    private String name;
    private int age;
    private double gpa;

    /**
     * Constructor for objects of class Student
     */    
    public Student(String nameIn, int ageIn, double gpaIn)
    {
        name = nameIn;
        age = ageIn;
        gpa = gpaIn;
        
        stoString();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void stoString()
    {
        System.out.println(name + " " + age + " " + gpa);//"Name0 22 1.2";
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public double getGpa(int x)
    {
        return gpa;
    }
}
