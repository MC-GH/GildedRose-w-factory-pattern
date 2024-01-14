package com.gildedrose;

public class ConjuredItem extends Item{
    public ConjuredItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        decreaseQuality(2);
        sellIn--;
    }

    public void decreaseQuality() {
        if(quality > 0) quality--;
        if(quality > 0 && sellIn <= 0) quality--;
    }

    public void decreaseQuality(int frequency) {
        for (int i = 0; i < frequency; i++) {
            decreaseQuality();
        }
    }
}
