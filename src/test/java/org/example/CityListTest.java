package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;


class CityListTest {
    @Test
    void testDelete(){
        City c1=new City("Calgary","Alberta");
        City c2=new City("White Rock"," British Columbia");
        City c3=new City("Liverpool","Nova Scotia");
        City c4=new City("Iqaluit","Nunavut");

        CityList cityList= new CityList();

        cityList.add(c1);
        cityList.add(c2);
        cityList.add(c3);
        cityList.add(c4);

        cityList.delete(c2);
        assertEquals(3,cityList.count());
    }
    @Test
    void testDeleteException(){
        City c1=new City("Calgary","Alberta");
        City c2=new City("White Rock"," British Columbia");
        City c3=new City("Liverpool","Nova Scotia");
        City c4=new City("Iqaluit","Nunavut");
        City c5=new City("Dawson","Yukon");

        CityList cityList= new CityList();

        cityList.add(c1);
        cityList.add(c2);
        cityList.add(c3);
        cityList.add(c4);

        assertThrows(IllegalArgumentException.class, () -> {
            cityList.delete(c5);
        });
    }

    @Test
    void testCount(){

        City c1=new City("Calgary","Alberta");
        City c2=new City("White Rock"," British Columbia");
        City c3=new City("Liverpool","Nova Scotia");
        City c4=new City("Iqaluit","Nunavut");

        CityList cityList= new CityList();

        cityList.add(c1);
        cityList.add(c2);
        cityList.add(c3);
        cityList.add(c4);

        assertEquals(4,cityList.count());
    }
    @Test
    void testSort(){
        City c1=new City("Calgary","Alberta");
        City c2=new City("White Rock"," British Columbia");
        City c3=new City("Liverpool","Nova Scotia");
        City c4=new City("Iqaluit","Nunavut");

        CityList cityList= new CityList();

        cityList.add(c1);
        cityList.add(c2);
        cityList.add(c3);
        cityList.add(c4);

        assertEquals("Calgary",cityList.getCitiesNameSorted().get(0).getCityName());
        assertEquals("Iqaluit",cityList.getCitiesNameSorted().get(1).getCityName());
        assertEquals("Liverpool",cityList.getCitiesNameSorted().get(2).getCityName());
        assertEquals("White Rock",cityList.getCitiesNameSorted().get(3).getCityName());
    }

}

