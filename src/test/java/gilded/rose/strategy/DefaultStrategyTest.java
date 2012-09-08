package gilded.rose.strategy;

import gilded.rose.Item;
import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 08/09/12
 * Time: 16:28
 * To change this template use File | Settings | File Templates.
 */
public class DefaultStrategyTest {

    private Item item;
    private DefaultStrategy strategy;

    @Before
    public void setUp() {
        item = new Item("Default", 10, 20);
        strategy = new DefaultStrategy();
    }

    @Test
    public void should_decrease_quality() throws Exception {
        assertThat(item.getQuality()).isEqualTo(20);
        strategy.updateQuality(item);
        assertThat(item.getQuality()).isEqualTo(19);
        strategy.updateQuality(item);
        assertThat(item.getQuality()).isEqualTo(18);

    }

    @Test
    public void should_not_decrease_quality_under_zero() {
        item.setQuality(1);
        strategy.updateQuality(item);
        assertThat(item.getQuality()).isEqualTo(0);
        strategy.updateQuality(item);
        assertThat(item.getQuality()).isEqualTo(0);
        strategy.updateQuality(item);
        assertThat(item.getQuality()).isEqualTo(0);

    }

    @Test
    public void should_decrease_twice_as_fast() {
        item.setQuality(10);
        item.setSellIn(-1);
        strategy.updateQuality(item);
        assertThat(item.getQuality()).isEqualTo(8);
        strategy.updateQuality(item);
        assertThat(item.getQuality()).isEqualTo(6);
        strategy.updateQuality(item);
        assertThat(item.getQuality()).isEqualTo(4);
        strategy.updateQuality(item);
        assertThat(item.getQuality()).isEqualTo(2);
        strategy.updateQuality(item);
        assertThat(item.getQuality()).isEqualTo(0);
        strategy.updateQuality(item);
        assertThat(item.getQuality()).isEqualTo(0);
    }


    @Test
    public void should_decrease_sellin() {
        item.setSellIn(10);
        strategy.updateSellIn(item);
        assertThat(item.getSellIn()).isEqualTo(9);
    }


}
