package com.github.gilded.rose;

import org.fest.assertions.api.Assertions;
import org.junit.Test;


public class GildedRoseTest {

    @Test
    public void should_test_system() {
        GildedRose inn = new GildedRose();
        inn.updateQuality();
        Assertions.assertThat(Assertions.extractProperty("quality").from(inn.getItems())).containsExactly(19, 1, 6, 80, 21, 5);
    }


    @Test
    public void should_test_system_numerus_update() {
        GildedRose inn = new GildedRose();
        inn.updateQuality();
        inn.updateQuality();
        inn.updateQuality();
        inn.updateQuality();
        inn.updateQuality();
        inn.updateQuality();
        inn.updateQuality();
        inn.updateQuality();
        inn.updateQuality();
        inn.updateQuality();
        inn.updateQuality();
        inn.updateQuality();
        inn.updateQuality();
        inn.updateQuality();
        Assertions.assertThat(Assertions.extractProperty("quality").from(inn.getItems())).containsExactly(2, 26, 0, 80, 47, 0);
    }
}
