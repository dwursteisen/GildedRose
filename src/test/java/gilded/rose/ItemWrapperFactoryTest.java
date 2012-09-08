package gilded.rose;

import gilded.rose.strategy.AgedBrieStrategy;
import gilded.rose.strategy.DefaultStrategy;
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
}
