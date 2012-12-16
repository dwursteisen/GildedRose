package com.github.gilded.rose;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 16/12/12
 * Time: 16:36
 * To change this template use File | Settings | File Templates.
 */
public class ItemWrapperTest {

    @Test
    public void should_update() {
        Item item = new Item("Aged Brie", 5, 10);
        ItemWrapper wrapper = new ItemWrapper(item);
        wrapper.update();
        assertThat(item.getQuality()).isEqualTo(11);
        wrapper.update();
        assertThat(item.getQuality()).isEqualTo(12);
        wrapper.update();
        assertThat(item.getQuality()).isEqualTo(13);
        wrapper.update();
        assertThat(item.getQuality()).isEqualTo(14);
        wrapper.update();
        assertThat(item.getQuality()).isEqualTo(15);

    }
}
