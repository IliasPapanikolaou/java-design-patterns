package com.unipi.ipap.javadesignpatterns.adapter;

import com.unipi.ipap.javadesignpatterns.adapter.carspeed.BugattiVeyron;
import com.unipi.ipap.javadesignpatterns.adapter.carspeed.Movable;
import com.unipi.ipap.javadesignpatterns.adapter.carspeed.MovableAdapter;
import com.unipi.ipap.javadesignpatterns.adapter.carspeed.MovableAdapterImpl;
import com.unipi.ipap.javadesignpatterns.adapter.fooddelivery.DeliveryStore;
import com.unipi.ipap.javadesignpatterns.adapter.fooddelivery.FoodItem;
import com.unipi.ipap.javadesignpatterns.adapter.fooddelivery.GroceryItemAdapter;
import com.unipi.ipap.javadesignpatterns.adapter.fooddelivery.GroceryProduct;
import com.unipi.ipap.javadesignpatterns.adapter.phoneport.AndroidPhone;
import com.unipi.ipap.javadesignpatterns.adapter.phoneport.ChargePhone;
import com.unipi.ipap.javadesignpatterns.adapter.phoneport.Iphone;
import com.unipi.ipap.javadesignpatterns.adapter.phoneport.LightningToMicroUsbAdapter;

public class AdaptorApplications {

    public static void main(String[] args) {
        // Adapter Car Speed
        System.out.println("\n----Adapter Design Pattern----");

        Movable bugattiVeyron = new BugattiVeyron();
        MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);

        System.out.println(bugattiVeyron.getSpeed() + " mph");
        System.out.println(bugattiVeyronAdapter.getSpeed() + " km/h");

        // Adapter Phone Port
        System.out.println("------------------------------");
        AndroidPhone androidPhone = new AndroidPhone();
        Iphone iphone = new Iphone();

        System.out.println("Recharging Android Phone with Micro USB");
        System.out.println(ChargePhone.rechargeMicroUsbPhone(androidPhone));

        System.out.println("Recharging iPhone with Lightning");
        System.out.println(ChargePhone.rechargeLightningPhone(iphone));

        System.out.println("Recharging iPhone with MicroUsb");
        System.out.println(ChargePhone.rechargeMicroUsbPhone(new LightningToMicroUsbAdapter(iphone)));

        // Food Delivery Store
        System.out.println("------------------------------");
        DeliveryStore deliveryStore = new DeliveryStore();
        // Compatible Items
        deliveryStore.addItems(new FoodItem("Pizza", 8.0, "Pizza Hat"));
        deliveryStore.addItems(new FoodItem("Pasta", 7.0,"La Pasteria"));
        // Incompatible Items now can be included with the use of GroceryItemAdapter
        deliveryStore.addItems(
                new GroceryItemAdapter(new GroceryProduct("Apples", 3.0, "Jack's Grocery")));
        deliveryStore.addItems(
                new GroceryItemAdapter(new GroceryProduct("Spinach", 2.5, "Maria's Grocery")));
        deliveryStore.getItems().forEach(System.out::println);
    }
}
