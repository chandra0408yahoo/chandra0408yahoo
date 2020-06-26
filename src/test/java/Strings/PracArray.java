package Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PracArray {


    public static void main(String args[]) {

        String values[] = new String[3];
        values[0] = "des";

        String values1[] = {"1", "2", "3", "4"};


        ArrayList<String> str = new ArrayList<String>();
        str.add("hellowerewefs");
        str.add("Englanddfsdfsdfsdf");
        str.add("Germanydfsfdsfsdf");
        str.add("Norwayrerewrqw");
        str.add("Norwayrerew");
        str.add("India");


        List<String> longnames =  str.stream().filter(x->x.contains("Norway")).collect(Collectors.toList());

        System.out.println(longnames.get(0));


   /*     HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);*/


    }

}
