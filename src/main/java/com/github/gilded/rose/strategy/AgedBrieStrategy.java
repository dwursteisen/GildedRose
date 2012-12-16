package com.github.gilded.rose.strategy;

import com.github.gilded.rose.Item;
import com.github.gilded.rose.Strategy;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 16/12/12
 * Time: 16:58
 * To change this template use File | Settings | File Templates.
 */
public class AgedBrieStrategy implements Strategy {
    private final Item item;

    public AgedBrieStrategy(Item item) {
        this.item = item;
    }

    public void invoke() {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
        }
        item.setSellIn(item.getSellIn() - 1);
        if (item.getSellIn() < 0) {
            if (item.getQuality() < 50) {
                item.setQuality(item.getQuality() + 1);
            }
        }
    }
}
