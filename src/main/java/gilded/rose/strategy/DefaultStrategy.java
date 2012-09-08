package gilded.rose.strategy;

import gilded.rose.Item;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 08/09/12
 * Time: 16:11
 * To change this template use File | Settings | File Templates.
 */
public class DefaultStrategy implements Strategy {

    public static final int MIN_QUALITY_LIMIT = 0;
    public static final int MIN_SELLIN_LIMIT = 0;

    @Override
    public void updateQuality(Item item) {
        int quality = item.getQuality();
        if (quality <= MIN_QUALITY_LIMIT) {
            return;
        }

        int sellIn = item.getSellIn();
        if (sellIn < MIN_SELLIN_LIMIT) {
            item.setQuality(quality - 2);
        } else {
            item.setQuality(quality - 1);
        }
    }
}
