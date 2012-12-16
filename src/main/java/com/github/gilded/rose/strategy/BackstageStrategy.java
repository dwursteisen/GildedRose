package com.github.gilded.rose.strategy;

import com.github.gilded.rose.Item;
import com.github.gilded.rose.Strategy;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 16/12/12
 * Time: 17:00
 * To change this template use File | Settings | File Templates.
 */
public class BackstageStrategy implements Strategy {
    private Item item;

    public BackstageStrategy(Item item) {
        this.item = item;
    }

    public void invoke() {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);

            if (item.getSellIn() < 11) {
                if (item.getQuality() < 50) {
                    item.setQuality(item.getQuality() + 1);
                }
            }

            if (item.getSellIn() < 6) {
                if (item.getQuality() < 50) {
                    item.setQuality(item.getQuality() + 1);
                }
            }
        }
        item.setSellIn(item.getSellIn() - 1);
        if (item.getSellIn() < 0) {
            item.setQuality(item.getQuality() - item.getQuality());
        }
    }
}
