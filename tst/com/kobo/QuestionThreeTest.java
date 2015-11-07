package com.kobo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QuestionThreeTest {

    private static final double EPSILON = 0.000001;

    private ShoppingCart cart;

    @Before
    public void before() {
        cart = new ShoppingCart();
    }

    @Test
    public void tooPoorToShop() {
        assertEquals(0, cart.calculatePostage(), EPSILON);
    }

    @Test
    public void cheapBook() {
        double weight = 2.0;
        cart.addItem(new Book(1.0, weight));
        assertEquals(weight, cart.calculatePostage(), EPSILON);
    }

    @Test
    public void expensiveBook() {
        double weight = 2.0;
        cart.addItem(new Book(11.0, weight));
        assertEquals(weight * 2, cart.calculatePostage(), EPSILON);
    }

    @Test
    public void singleCD() {
        double weight = 2.0;
        cart.addItem(new CD(weight, 1));
        assertEquals(weight, cart.calculatePostage(), EPSILON);
    }

    @Test
    public void multiCD() {
        double weight = 2.0;
        cart.addItem(new CD(weight, 2));
        assertEquals(weight * 2, cart.calculatePostage(), EPSILON);
    }

    @Test
    public void singleDVD() {
        double weight = 2.0;
        cart.addItem(new DVD(weight, 1));
        assertEquals(weight + 10, cart.calculatePostage(), EPSILON);
    }

    @Test
    public void multiDVD() {
        double weight = 2.0;
        cart.addItem(new DVD(weight, 2));
        assertEquals((weight + 10) * 2, cart.calculatePostage(), EPSILON);
    }

    @Test
    public void mixedItemTypes() {
        cart.addItem(new Book(1.0, 2.0));
        cart.addItem(new CD(3.0, 2));
        cart.addItem(new DVD(4.0, 1));
        double bookPostage = 2.0;
        double cdPostage = 3.0 * 2;
        double dvdPostage = 4.0 + 10;
        assertEquals(bookPostage + cdPostage + dvdPostage, cart.calculatePostage(), EPSILON);
    }
}
