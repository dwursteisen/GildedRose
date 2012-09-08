package gilded.rose;

import gilded.rose.strategy.Strategy;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 08/09/12
 * Time: 15:25
 * To change this template use File | Settings | File Templates.
 */
public class ItemWrapper {

    private final Item item;

    final Strategy strategy;

    public ItemWrapper(Item item, Strategy strategy) {
        this.item = item;
        this.strategy = strategy;
    }

    public void updateQuality() {
        this.strategy.updateQuality(item);
    }


    public void updateSellIn() {
        this.strategy.updateSellIn(item);
    }
}
