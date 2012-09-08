package gilded.rose.strategy;

import gilded.rose.Item;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 08/09/12
 * Time: 16:23
 * To change this template use File | Settings | File Templates.
 */
public class AgedBrieStrategyTest {

    private AgedBrieStrategy strategy = new AgedBrieStrategy();

    @Test
    public void should_not_update_quality_over_50() {
        Item item = new Item("blabla", 12, 49);
        strategy.updateQuality(item);

        assertThat(item.getQuality()).isLessThanOrEqualTo(50);
        strategy.updateQuality(item);
        assertThat(item.getQuality()).isLessThanOrEqualTo(50);
        strategy.updateQuality(item);
        assertThat(item.getQuality()).isLessThanOrEqualTo(50);

    }

    @Test
    public void should_increase_quality_with_aged_brie() {
        Item item = new Item("blabla", 12, 20);
        strategy.updateQuality(item);
        assertThat(item.getQuality()).isEqualTo(21);
    }

    @Test
    public void should_decrease_sellin() {
        Item item = new Item("blabla", 12, 20);
        item.setSellIn(10);
        strategy.updateSellIn(item);
        assertThat(item.getSellIn()).isEqualTo(9);
    }


}
