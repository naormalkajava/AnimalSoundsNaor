package com.example.ericbell.animalsoundsnaor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eric.bell on 5/30/2017.
 */

public class AnimalDataSource {


    public static ArrayList<Animal> getAnimals () {
       ArrayList <Animal> animals = new ArrayList<>();

        Animal a = new Animal(R.drawable.monkey, R.raw.monkey);
        animals.add(a);


        animals.add(new Animal(R.drawable.cat,R.raw.cat));
        animals.add(new Animal(R.drawable.duck,R.raw.duck));
        animals.add(new Animal(R.drawable.bear,R.raw.bear));
        animals.add(new Animal(R.drawable.horse,R.raw.horse));
        animals.add(new Animal(R.drawable.wolf,R.raw.wolf));
        animals.add(new Animal(R.drawable.monkey,R.raw.monkey));
        animals.add(new Animal(R.drawable.bunnie,R.raw.rabbit));
        animals.add(new Animal(R.drawable.lion,R.raw.lion));
        animals.add(new Animal(R.drawable.dolphin,R.raw.dolphins));
        animals.add(new Animal(R.drawable.frog,R.raw.frog));
        animals.add(new Animal(R.drawable.tiger,R.raw.tiger));
        animals.add(new Animal(R.drawable.eagle,R.raw.eaglet));
        animals.add(new Animal(R.drawable.seal,R.raw.seal));

        return animals;
    }
}
