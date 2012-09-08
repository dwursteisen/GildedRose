package gilded.rose.strategy;

import gilded.rose.Item;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 08/09/12
 * Time: 16:36
 * To change this template use File | Settings | File Templates.
 */
public class BackstageStrategie implements Strategy {

    public static final int CONCERT_LIMIT = 0;
    public static final int BY_THIRD_LIMIT = 5;
    public static final int BY_TWO_LIMIT = 10;

    @Override
    public void updateQuality(Item item) {
        int sellIn = item.getSellIn();
        int quality = item.getQuality();

        if (sellIn <= CONCERT_LIMIT) {
            item.setQuality(0);
        } else if (sellIn <= BY_THIRD_LIMIT) {
            item.setQuality(quality + 3);
        } else if (sellIn <= BY_TWO_LIMIT) {
            item.setQuality(quality + 2);
        } else {
            item.setQuality(quality + 1);
        }
    }

    @Override
    public void updateSellIn(Item item) {
        item.setSellIn(item.getSellIn() - 1);
    }
}
