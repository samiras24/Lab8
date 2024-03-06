package com.example.lab8;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;


    /**
     * create a mocklist for my citylist
     *
     * @return
     */
    public CustomList MockCityList() {
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

   // @Test
   // public void addCityTest(){
      //  list = MockCityList();
    //  int listSize = list.getCount();
       // list.addCity(new City("Estevan", "SK"));
       // assertEquals(list.getCount(),listSize + 1);
   // }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one
     */


    // @Test
    // void testhasCity(){
    // list = MockCityList();
    //  City city = new City("Charlottetown", "Prince Edward Island");
    // list.addCity(city);
    // assertTrue(list.hasCity(city));
// }


    //@Test
    //void testdelete(){
        //list = MockCityList();
       // City city = new City("Charlottetown", "Prince Edward Island");
        //list.addCity(city);
    // list.delete(city);
       // assertFalse(list.getCities().contains(city));
   // }


    @Test
    void countCities(){
        list  = MockCityList();
        City city = new City("Charlottetown", "Prince Edward Island");
        City city2 = new City("Calgary", "AB");
        list.addCity(city);
        list.addCity(city2);
        assertEquals(2, list.countCities());
    }




}
