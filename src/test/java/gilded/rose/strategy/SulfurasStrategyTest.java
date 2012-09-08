package gilded.rose.strategy;

import gilded.rose.Item;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 08/09/12
 * Time: 16:33
 * To change this template use File | Settings | File Templates.
 */
public class SulfurasStrategyTest {


    @Test
    public void should_never_be_updated() {
        Item blabla = new Item("blabla", 20, 15);
        SulfurasStrategy strategy = new SulfurasStrategy();
        strategy.updateQuality(blabla);
        strategy.updateSellIn(blabla);
        assertThat(blabla.getQuality()).isEqualTo(15);
        assertThat(blabla.getSellIn()).isEqualTo(20);

    }

}
