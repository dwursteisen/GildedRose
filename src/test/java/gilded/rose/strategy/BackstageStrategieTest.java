package gilded.rose.strategy;

import gilded.rose.Item;
import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 08/09/12
 * Time: 16:37
 * To change this template use File | Settings | File Templates.
 */
public class BackstageStrategieTest {

    private BackstageStrategie strategie;
    private Item item;

    @Before
    public void setUp() {
        strategie = new BackstageStrategie();
        item = new Item("blabla", 40, 10);
    }

    @Test
    public void should_increace_quality() {
        strategie.updateQuality(item);
        assertThat(item.quality).isEqualTo(11);
    }

    @Test
    public void should_increace_quality_twice() {
        item.setSellIn(10);
        strategie.updateQuality(item);
        assertThat(item.quality).isEqualTo(12);
    }

    @Test
    public void should_increace_quality_by_tree() {
        item.setSellIn(5);
        strategie.updateQuality(item);
        assertThat(item.quality).isEqualTo(13);
    }

    @Test
    public void should_set_quality_to_zero_after_concert() {
        item.setSellIn(-1);
        strategie.updateQuality(item);
        assertThat(item.quality).isEqualTo(0);
    }

}
