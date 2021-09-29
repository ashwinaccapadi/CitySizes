import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class CityRunner
{
    public static void main( String args[] ) 
    {
        ArrayList<String> data = new ArrayList<String>();
        HashMap<String, Integer> cities=new HashMap<String, Integer>(10000);
        City theCities= new City();
        try
        {
            Scanner scan = new Scanner(new File("CityData.dat"));
            String[] city= new String[2];
            while(scan.hasNextLine()){
                String line= scan.nextLine();
                city = line.split("\t");
                int cit= Integer.parseInt(city[1]);
                cities.put(city[0], cit);
            }

            scan.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        try
        {

            // THIS IS WHERE YOU OPEN THE STREAM TO WRITE TO THE FILE
            // When you write to the file, you will over-write what was there
            // (i.e. make a new copy)
            // In the FileWriter code you write, the second parameter is false, not true.
            // Set it to false to overwrite
            FileWriter a =new FileWriter("output.dat", false);
            // Open a Stream to a file that you can write to
            // FileWriter code: 

            // BufferedWriter code:
            BufferedWriter b = new BufferedWriter(a);
            // PrintWriter code:
            PrintWriter c = new PrintWriter(b, false);

            // Create an array called numbers by splitting data with the .split() method

            // For each string in the array...
            // Parse the string into an int
            // Create a Prime object and pass that int as a parameter into the Prime class
            // Use the .toString() method and write to the file

            /*for(String line: ctys){                
            City p = new City(line);
            c.println(p.toString());
            }*/

            theCities=new City(cities);
            ArrayList<String> places= theCities.thePrint();
            for (int i=0; i<places.size(); i++)
            {
                c.println(places.get(i));
            }

            // Close the stream
            c.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }
}
