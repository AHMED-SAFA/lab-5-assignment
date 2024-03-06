package org.example;

public class City implements Comparable<City>{
    private String cityName;
    private String provinceName;

    /**
     * This is a constructor
     * @param city name of city
     *
     * @param province name of province
     */
    City(String city, String province){
        this.cityName = city;
        this.provinceName = province;
    }

    /**
     * Returns the city name(String)
     * @return Returns the city name(String)
     */
    String getCityName(){
        return this.cityName;
    }

    /**
     * Returns the province name(String)
     * @return Returns the province name(String)
     */
    String getProvinceName(){
        return this.provinceName;
    }

    /**
     * It's mainly used in sorting operation
     * @param city the object to be compared.
     * @return it returns sorted city list
     */

    @Override
    public int compareTo(City city) {
        return this.cityName.compareTo(city.getCityName());
    }
}
