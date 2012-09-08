package gilded.rose;

import gilded.rose.strategy.AgedBrieStrategy;
import gilded.rose.strategy.DefaultStrategy;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 08/09/12
 * Time: 16:14
 * To change this template use File | Settings | File Templates.
 */
public class ItemWrapperFactory {

    public ItemWrapper build(Item item) {
        if (item.getName().contains("Aged Brie")) {
            return new ItemWrapper(item, new AgedBrieStrategy());
        }
        return new ItemWrapper(item, new DefaultStrategy());
    }
}
