// LineReader.java

import java.io.*;

/* @author Richard Stegman
 * @version 2.1, 1/5/07
 * 
 * LineReader provides simple methods for opening and 
 * reading lines from a text file.
 * 
 * Example:
 *
 *      LineReader lr = new LineReader("foo.txt");
 *      String line = lr.readLine();
 *      while (line != null) {
 *          System.out.println(line);
 *          line = lr.readLine();
 *      }
 *      lr.close();
 *
 */
 
public class LineReader {
    private BufferedReader br;

    /*
     * LineReader constructor. 
     * Creates a BufferedReader object and opens a file for reading.
     * @param fileName name of the file to be read from
     */

    public LineReader(String fileName) {
        try {
            FileReader fr = new FileReader(fileName);
            br = new BufferedReader(fr);
        }    
        catch (FileNotFoundException e) {
            System.out.println("LineReader cannot find input file: "
                                                        + fileName);
            e.printStackTrace();
        }
    }

    /**
     * Reads a line from the file into a String and returns the String
     */

    public String readLine() {
        if (br == null) {
            System.out.println("readLine() called without a valid input file.");
            return null;
        }
        try {
            return br.readLine();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Closes the file.
     */
     
    public void close() {
        try {
            br.close();
        }
        catch (IOException e) {
        }
    }
}
