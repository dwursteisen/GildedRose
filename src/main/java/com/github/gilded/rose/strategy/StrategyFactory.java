package com.github.gilded.rose.strategy;

import com.github.gilded.rose.Item;
import com.github.gilded.rose.Strategy;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 16/12/12
 * Time: 17:06
 * To change this template use File | Settings | File Templates.
 */
public class StrategyFactory {

    public Strategy buildStrategyForItem(Item item) {
        Strategy strategy;
        if ("Aged Brie".equals(item.getName())) {
            strategy = new AgedBrieStrategy(item);
        } else if ("Backstage passes to a TAFKAL80ETC concert".equals(item.getName())) {
            strategy = new BackstageStrategy(item);
        } else if ("Sulfuras, Hand of Ragnaros".equals(item.getName())) {
            strategy = new SulgurasStrategy(item);
        } else {
            strategy = new OtherStrategy(item);
        }
        return strategy;
    }
}
