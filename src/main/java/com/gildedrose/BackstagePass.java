package com.gildedrose;

public class BackstagePass extends Item{

    public BackstagePass(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {

        if(sellIn > 10) {
            increaseQuality();
        } else if(sellIn > 5) {
            increaseQualityFrequency(2);
        } else if(sellIn >= 0) {
            increaseQualityFrequency(3);
        } else {
            quality = 0;
        }
        sellIn--;
    }

    public void increaseQualityFrequency(int frequency) {
        for (int i = 0; i < frequency; i++) {
            increaseQuality();
        }
    }

    public void increaseQuality() {
        if(quality < 50) quality++;
    }
}
