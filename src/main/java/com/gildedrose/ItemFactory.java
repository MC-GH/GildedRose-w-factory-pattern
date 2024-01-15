package com.gildedrose;

public class ItemFactory {

    public Item createItem (String name, int sellIn, int quality) {
        if(name == null) {
            return null;
        }

        switch(name.toUpperCase()) {
            case "AGED BRIE":
                return new AgedBrie(name, sellIn,quality);
            case "BACKSTAGE PASSES TO A TAFKAL80ETC CONCERT":
                return new BackstagePass(name, sellIn,quality);
            case "SULFURAS, HAND OF RAGNAROS":
                return new Sulfuras(name, sellIn, quality);
            case "CONJURED ITEM":
                return new ConjuredItem(name,sellIn,quality);
            default:
                return new StandardItem(name, sellIn, quality);
        }

    }


}
