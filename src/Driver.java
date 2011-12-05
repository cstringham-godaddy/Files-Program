/**
 * Demonstrates the LineReader and LineWriter classes
 * 
 * @author Chris Stringham
 * @version 29 Nov 2011
 */

public class Driver
{
    public static void main(String args[])
    {
        //creates studentS object
        Students studentsObj = new Students();
        
        //read data file into studentS
        studentsObj.readFile();
        
        //print all Student objects from Students
        //System.out.print(studentsObj.toString());
        
        //print the Student with the best GPA
        studentsObj.bestGpa();
        
        //calculate and print the avarange GPA
        studentsObj.avgGpa();
        
        //print all the students with GPS above the avarange
        
        //print the youngest student who has a gpa below avarage
        
        //sort the student objects in students into order from lowest to hightest GPA
        
        //print all student objects from students again (will now be in a diferent order from last time)
        
        
        
        // needed to format payRate to 2 decimal places
        //NumberFormat nf = NumberFormat.getInstance();
        //nf.setMaximumFractionDigits(2);

        // employee record format
        //String name;
        //int age;
        //double payRate;
        
        // now use LineReader to read employee records from the file
        // read each employee field into this string:
        //String line;

        //LineReader lr = new LineReader("students.txt");
        //name = lr.readLine();
        //while (name != null) {      // how to handle EOF
        //    // read remaining fields for the employee
        //    line = lr.readLine();
        //    age = Integer.parseInt(line);
        //    line = lr.readLine();
        //    payRate = Double.parseDouble(line);

        //    System.out.println(name + '\t' + age + '\t' + payRate);

        //    name = lr.readLine();
        //}
        //lr.close();
        
        //read data file into Students
        //print all Student objects from Students
        //print the Student with the best GPA
        //calculate and print the average GPA
        //print all the Students with GPAs above the average
        //print the youngest Student who has a GPA below average
        //sort the Student objects in Students into order from lowest to highest GPA
        //print all Student objects from Students again (will now be in a different order from last
        //time)
    }
}
