package org.example;

public class ProDustCleaner extends DustCleaner {
    public void cleanDust() {
        System.out.println("Odkurzam");
    }

    @Override
    public void displayBrand() {
        System.out.println("ProDust");
    }
}
