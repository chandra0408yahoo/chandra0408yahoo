package Strings;

import java.util.ArrayList;
import java.util.HashMap;

public class PracArray {


    public static void main(String args[]) {

        String values[] = new String[3];
        values[0] = "des";

        String values1[] = {"1", "2", "3", "4"};


        ArrayList<String> str = new ArrayList<String>();
        str.add("hello");



        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);


    }

}
