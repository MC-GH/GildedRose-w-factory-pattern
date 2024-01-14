package com.gildedrose;

public class StandardItem extends Item{

    public StandardItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if(quality <= 50 && quality > 0) quality--;
        if(sellIn < 0) quality--;
        sellIn--;
    }
}
