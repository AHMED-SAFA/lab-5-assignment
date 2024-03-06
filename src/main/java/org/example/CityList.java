package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private final List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if that city does not exist
     * @param city This is the city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * returns a sorted list of cities
     * @return Return the sorted list of cities
     *
     */
    public List<City> getCitiesNameSorted() {
        List<City> cityList = new ArrayList<>(cities);
        Collections.sort(cityList);
        return cityList;
    }

    /**
     * deletes a specific city from city-list
     * @param city The city should be removed
     */

    public void delete(City city) {
        if (!cities.remove(city)) {
            throw new IllegalArgumentException("City not found");
        }
    }

    /**
     * counts the number of cities in city-list
     * @return The count of city-list
     */
    public int count() {
        return cities.size();
    }
    /**
     * sorts the city-list(Changes the original Arraylist)
     */
    void sort(){
        Collections.sort(cities);
    }

    void display(){
        for(City c : cities){
            System.out.println("State: "+c.getCityName()+", Province: "+c.getProvinceName());
        }
    }


    public static void main(String[] args) {
        City c1=new City("Calgary","Alberta");
        City c2=new City("White Rock"," British Columbia");
        City c3=new City("Liverpool","Nova Scotia");
        City c4=new City("Iqaluit","Nunavut");

        CityList cityList= new CityList();

        cityList.add(c1);
        cityList.add(c2);
        cityList.add(c3);
        cityList.add(c4);
        cityList.display();
        System.out.println();
        cityList.delete(c2);
        cityList.display();
        System.out.println(cityList.count());
        List<City> ct= cityList.getCitiesNameSorted();
        for(City c : ct){
            System.out.println("State: "+c.getCityName()+", Province: "+c.getProvinceName());
        }

    }

}