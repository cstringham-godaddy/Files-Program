/**
 * Write a description of class Students here.
 * 
 * @author Chris Stringham
 * @version 29 Nov 2011
 */

public class Students
{
    public static final int MAX = 100;// max # of Student objects in array
    
    private Student students[]; // array of Student objects
    private int count; // maintain # of objects in array

    /**
     * Constructor for objects of class Students
     */
    public Students()
    {
        // Initialize instance variables
        students = new Student[MAX];
        count = 0;
        
    }
        
    //+ readFile() – opens the data file, reads the data, creates Student objects, and puts
    //them into the students array
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void readFile()
    {
        LineReader lr = new LineReader("Students.txt");
        
        String name;
        String line;
        int age;
        double gpa;
        name = lr.readLine();
        while (name != null) 
        {
            line = lr.readLine();
            age = Integer.parseInt(line);
            line = lr.readLine();
            gpa = Double.parseDouble(line);
            
            students[count] = new Student(name, age, gpa);
            
            name = lr.readLine();
            count++;
        }
        lr.close();
    }
    
    public String toString()
    {
        if (count == 0)
            return "students[]";

        StringBuffer s = new StringBuffer("Students[");
        
        int i;
        
        for (i = 0; i < count - 1; ++i)
            s.append(students[i] + ", ");
        
        s.append(students[i] + "]");

        return s.toString();
    }
    
    public void bestGpa()
    {
        double gpa = 0;
        int index = 0;
        
        for( int x = 0; x < count; x++)
        {
            
            if(students[x].getGpa(x) > gpa)
            {
                gpa = students[x].getGpa(x);
                index = x;
            }
        }
        System.out.println("Best Gpa is: "  + gpa );
        System.out.print(students[index].getName() + " " + students[index].getAge() + " " + gpa);
        
    }
    
    public void betterThanAverageGPA()
    {
        double avg = this.avgGpa();

        for (int x = 0; x < count; x++)
        {
            if (students[x].getGpa() > avg)
                System.out.println(students[x].toString());
        }
    }
    
    public void avgGpa()
    {
    	double avg = 0;
    	
    	for (int x = 0; x < count; x++)
    	{
    		avg = students[x].getGpa(x) + avg;
    	}
    	
    	System.out.print("\nThe average GPA is: " + avg / count );
    }
    
    public void aboveAvg()
    {
    	//while (avg < )
    }
    
    public void sortStudents()
    {
    	int temp;
    	
    	for (int i = 1; i < count; i++)
    	{
    		temp = students[i];
    		
    		int j = i -1;
    		
    		while (j >= 0 && temp < students[j].getGpa(j))
    		{
    			students[j + 1] = students[j];
    			j = j - 1;
    		}
    		
    		students[j + 1] = temp;
    		}
    	}
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //+ toString() – returns a String containing a line of information for each Student in
    //the students array. Will call Student's toString() to do this. For example:
    //Name0 22 1.2
    //Name1 22 2.71
    public void toStringx()
    {
        //name0 22 1.2
    }
    
    //public void sortIntArray()
    //{
    //    int i, j; // used to index into the array
    //    int temp; // temporarily holds an element from the array
    //    for (i = 1; i < count; ++i) {
    //        temp = arr[i];
    //        j = i - 1;
    //        while (j >= 0 && temp < arr[j]) {
    //            arr[j + 1] = arr[j];
    //            j = j - 1;
    //        }
    //        arr[j + 1] = temp;
    //    }
    //}
}
