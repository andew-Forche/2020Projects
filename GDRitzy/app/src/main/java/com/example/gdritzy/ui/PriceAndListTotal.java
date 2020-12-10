package com.example.gdritzy.ui;

import android.util.Log;

import java.util.ArrayList;

public class
PriceAndListTotal {

    double totalPrice;
    ArrayList<String> itemsList = new ArrayList<>();

    public void addToPrice(Double price) {
        totalPrice += price;
        Log.d("price", String.valueOf(totalPrice));
    }

    public void addToList(String listItem) {
        itemsList.add(listItem);
        Log.d("items",getListItems());

    }

    public String getListItems() {
        String listString ="";
        for (String i:itemsList) {
            listString += i + "\t";
        }
        Log.d("cashmoney",listString);
        return listString;
    }

    public double getTotalPrice() {
        return totalPrice;
    }


}
