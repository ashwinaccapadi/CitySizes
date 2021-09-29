import java.lang.Math;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class City
{
    HashMap<String, Integer> cities;

    public City()
    {
        cities=new HashMap<String, Integer>(10000);
    }

    public City(HashMap<String, Integer> c)
    {
        cities=c;
    }

    public void setCities(HashMap<String, Integer> c)
    {
        cities=c;
    }

    public ArrayList<String> thePrint()
    {
        // update this method
        ArrayList <String> output=new ArrayList<String>();
        // if the method isPrime() is true
        // concatenate output with the number and " IS BIG"
        // otherwise concatenate output with the number and " IS NOT BIG"
        for(int i=0;i<cities.keySet().size(); i++)
        {
            String city=cities.keySet().getKey(i);
            if(cities.get(city)>100000){
                output.add(city +" IS A BIG CITY");
            }
            else{
                output.add(city + " IS A SMALL CITY");
            }
        }
        return output;
    }
    
}
