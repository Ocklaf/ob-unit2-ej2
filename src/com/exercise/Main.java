package com.exercise;

public class Main {
    public static void main(String[] args) {
        System.out.println(getPriceWithTaxes(100));
    }

    public static float getPriceWithTaxes(float price) {
        return price * 1.21f;
    }
}