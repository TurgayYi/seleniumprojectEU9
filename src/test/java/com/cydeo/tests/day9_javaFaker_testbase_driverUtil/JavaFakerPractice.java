package com.cydeo.tests.day9_javaFaker_testbase_driverUtil;


import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {


    @Test
    public void test1(){
        //Creating faker object to reach methods

        Faker faker = new Faker();
        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().fullName() = " + faker.name().fullName());
        System.out.println("faker.gameOfThrones().character() = " + faker.gameOfThrones().character());

        System.out.println("faker.phoneNumber().phoneNumber() = " + faker.phoneNumber().phoneNumber());
        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard());

    }
}
