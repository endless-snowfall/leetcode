package com.kobo;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;

/*
 * The Visitor design pattern was used here.
 *
 * One approach would've been to do away with using the Visitor pattern and just have the Item interface define a "calculatePostage" method.
 * However, once the amount of business logic in these concrete Item's increases.  There would be no choice but to increase the complexity as well.
 *
 * Using the Visitor pattern helps to keep these objects "dumb" and abstract away the business logic from the actual data itself.
 *
 * I cleaned up the code a bit and made use of Java 8 kung-fu where appropriate, hi-ya!  I'm also using Lombok.
 */

interface Item {

    void accept(PostageInterface postage);
}

interface PostageInterface {

    void visit(Book book);

    void visit(CD cd);

    void visit(DVD dvd);
}

@AllArgsConstructor
class Book implements Item {

    private double price;
    private double weight;

    @Override
    public void accept(PostageInterface postage) {
        postage.visit(this);
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }
}

@AllArgsConstructor
abstract class Disk implements Item {

    private double weight;
    private int numOfDisks;

    public double getWeight() {
        return weight;
    }

    public boolean isSingle() {
        return numOfDisks == 1;
    }

    public double getNumOfDisks() {
        return numOfDisks;
    }
}

class CD extends Disk {

    public CD(double weight, int numOfDisks) {
        super(weight, numOfDisks);
    }

    @Override
    public void accept(PostageInterface postage) {
        postage.visit(this);
    }
}

class DVD extends Disk {

    public DVD(double weight, int numOfDisks) {
        super(weight, numOfDisks);
    }

    @Override
    public void accept(PostageInterface postage) {
        postage.visit(this);
    }
}

class ShoppingCart {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public double calculatePostage() {
        Postage postage = new Postage();
        items.forEach(item -> item.accept(postage));
        return postage.getTotalPostage();
    }
}

class Postage implements PostageInterface {

    private double totalPostageForCart;

    public double getTotalPostage() {
        return totalPostageForCart;
    }

    @Override
    public void visit(Book book) {
        totalPostageForCart += (book.getPrice() < 10.0)
            ? book.getWeight()
            : book.getWeight() * 2;
    }

    @Override
    public void visit(CD cd) {
        totalPostageForCart += (cd.isSingle())
            ? cd.getWeight()
            : cd.getWeight() * cd.getNumOfDisks();
    }

    @Override
    public void visit(DVD dvd) {
        totalPostageForCart += (dvd.isSingle())
            ? dvd.getWeight() + 10
            : (dvd.getWeight() + 10) * dvd.getNumOfDisks();
    }
}
