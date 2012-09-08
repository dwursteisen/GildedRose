package gilded.rose;

import gilded.rose.strategy.AgedBrieStrategy;
import gilded.rose.strategy.BackstageStrategie;
import gilded.rose.strategy.DefaultStrategy;
import gilded.rose.strategy.SulfurasStrategy;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 08/09/12
 * Time: 16:15
 * To change this template use File | Settings | File Templates.
 */
public class ItemWrapperFactoryTest {

    @Test
    public void buildDefaultItem() {
        ItemWrapper wrapper = new ItemWrapperFactory().build(new Item("default", 20, 20));
        assertThat(wrapper.strategy).isInstanceOf(DefaultStrategy.class);
    }

    @Test
    public void buildAgedBrieItem() {
        ItemWrapper wrapper = new ItemWrapperFactory().build(new Item("Aged Brie", 20, 20));
        assertThat(wrapper.strategy).isInstanceOf(AgedBrieStrategy.class);
    }


    @Test
    public void buildSulfurasItem() {
        ItemWrapper wrapper = new ItemWrapperFactory().build(new Item("Sulfuras, Hand of Ragnaros", 20, 20));
        assertThat(wrapper.strategy).isInstanceOf(SulfurasStrategy.class);
    }

    @Test
    public void buildBackstageItem() {
        ItemWrapper wrapper = new ItemWrapperFactory().build(new Item("Backstage passes to a TAFKAL80ETC concert", 20, 20));
        assertThat(wrapper.strategy).isInstanceOf(BackstageStrategie.class);
    }
}
