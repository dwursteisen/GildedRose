package gilded.rose.strategy;

import gilded.rose.Item;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 08/09/12
 * Time: 16:12
 * To change this template use File | Settings | File Templates.
 */
public class AgedBrieStrategy implements Strategy {

    public static final int MAX_QUALITY_LIMIT = 50;

    @Override
    public void updateQuality(Item item) {
        int quality = item.getQuality();
        if (quality >= MAX_QUALITY_LIMIT) {
            return;
        }
        item.setQuality(quality + 1);
    }
}
