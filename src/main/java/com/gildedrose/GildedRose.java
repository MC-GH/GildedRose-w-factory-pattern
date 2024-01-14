package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for(Item item : items) {
            item.updateQuality();
        }
    }

    public static void main(String[] args) {
        ItemFactory itemFactory = new ItemFactory();

        Item defaultItem = itemFactory.createItem("standardItem",20,10);
        System.out.println("Initial quality default item: " + defaultItem.quality);
        defaultItem.updateQuality();
        System.out.println("Updated quality default item: " + defaultItem.quality);

        Item backstagePass = itemFactory.createItem("BACKSTAGE PASS",3,10);
        System.out.println("Initial quality backstage pass: " + backstagePass.quality);
        backstagePass.updateQuality();
        System.out.println("Initial quality backstage pass: " + backstagePass.quality);

    }

}