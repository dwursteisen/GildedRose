package gilded.rose.strategy;

import gilded.rose.Item;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 08/09/12
 * Time: 16:58
 * To change this template use File | Settings | File Templates.
 */
public class ConjuredStrategy implements Strategy {

    private final DefaultStrategy defaultStrategy = new DefaultStrategy();

    @Override
    public void updateQuality(Item item) {
        defaultStrategy.updateQuality(item);
        defaultStrategy.updateQuality(item);
    }

    @Override
    public void updateSellIn(Item item) {
        defaultStrategy.updateSellIn(item);
    }
}
