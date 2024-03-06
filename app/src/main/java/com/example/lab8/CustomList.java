package com.example.lab8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class CustomList extends ArrayAdapter<City> {

    private ArrayList<City> cities;
    private Context context;

    public CustomList(Context context, ArrayList<City> cities) {
        super(context, 0, cities);
        this.cities = cities;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;

        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.content, parent,false);
        }

        City city = cities.get(position);

        TextView cityName = view.findViewById(R.id.city_text);
        TextView provinceName = view.findViewById(R.id.province_text);

        cityName.setText(city.getCityName());
        provinceName.setText(city.getProvinceName());

        return view;

    }

    /**
     * This returns a sorted list of cities
     * @return list
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        return list;
    }

    /**
     * this gets size of the list
     * @return
     */
    public int getCount(){
        return cities.size();
    }

    /**
     * this adds a city object to the list
     *for the first phase it will be
     empty * @param city
     */
    public void addCity(City city){
        cities.add(city);

    }

    /**
     * returns whether a city is in the list or not
     * @param city
     * @return Boolean
     *
     */
    public Boolean hasCity(City city) {
        for (int i = 0; i < cities.size(); i++) {
            if (cities.get(i).equals(city)) {
                return true;
            }
        }
        return false;
    }


    /**
     * Removes a city from the list if it exists, otherwise throws an exception
     * @param city
     * @throws NoSuchElementException
     *
     */
    public void delete(City city) {
        boolean remove = false;
        for (int i = 0; i < cities.size(); i++) {
            if (cities.get(i).equals(city)) {
                cities.remove(i);
                remove = true;
            }
        }
        if (!remove){
            throw new NoSuchElementException();
        }
    }

    /**
     * Returns the number of cities in the list
     * @return integer
     *
     */
    public int countCities(){
        int count = 0;
        for (int i = 0; i < cities.size(); i++) {

        }
        return count;
    }



    @Override
    public boolean equals(@Nullable Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        return super.equals(obj);
    }



}
