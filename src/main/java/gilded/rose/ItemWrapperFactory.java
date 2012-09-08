package gilded.rose;

import gilded.rose.strategy.*;

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
        } else if (item.getName().contains("Backstage")) {
            return new ItemWrapper(item, new BackstageStrategie());
        } else if (item.getName().contains("Sulfuras")) {
            return new ItemWrapper(item, new SulfurasStrategy());
        } else if (item.getName().contains("Conjured")) {
            return new ItemWrapper(item, new ConjuredStrategy());
        }
        return new ItemWrapper(item, new DefaultStrategy());
    }
}
