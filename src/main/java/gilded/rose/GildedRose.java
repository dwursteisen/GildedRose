package gilded.rose;

import java.util.ArrayList;
import java.util.List;


public class GildedRose {

    private static List<Item> items = null;

    /**
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("OMGHAI!");

        items = new ArrayList<Item>();
        items.add(new Item("+5 Dexterity Vest", 10, 20));
        items.add(new Item("Aged Brie", 2, 0));
        items.add(new Item("Elixir of the Mongoose", 5, 7));
        items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new Item("Conjured Mana Cake", 3, 6));

        updateQuality();
    }


    private final static ItemWrapperFactory factory = new ItemWrapperFactory();

    public static void updateQuality() {
        for (Item item : items) {
            ItemWrapper wrapper = factory.build(item);
            wrapper.updateQuality();
            wrapper.updateSellIn();
        }
    }

}