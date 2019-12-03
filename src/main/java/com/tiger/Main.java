package com.tiger;

import java.util.HashMap;
import java.util.Hashtable;

public class Main {

  public static void main(String[] args) {
    HashMap hashMap = new HashMap();
    Hashtable hashtable = new Hashtable();


//    Plate<Fruit> plate = new Plate<Apple>(new Apple());

//    Plate<? extends Fruit> plate = new Plate<Apple>(new Apple());

    Plate<? extends Fruit> plate = new Plate<Fruit>(new Fruit());

    //不能存入任何元素
    plate.setItem(new Fruit()); //error
    plate.setItem(new Apple()); //error

    //读取出来的东西只能存放在Fruit或它的基类里。
    Apple apple = plate.getItem();  //error
    Fruit fruit = plate.getItem();
    Food food = plate.getItem();
    Object object = plate.getItem();

    Plate<? super Fruit> p = new Plate<Fruit>(new Fruit());

    //存入元素正常
    p.setItem(new Fruit());
    p.setItem(new Apple());

    //读取出来的东西只能存放在Object类里。
    Apple newFruit3 = p.getItem();    //Error
    Fruit newFruit1 = p.getItem();    //Error
    Object newFruit2 = p.getItem();
  }

}
