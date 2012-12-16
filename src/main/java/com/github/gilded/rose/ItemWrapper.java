package com.github.gilded.rose;


import com.github.gilded.rose.strategy.StrategyFactory;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 16/12/12
 * Time: 16:35
 * To change this template use File | Settings | File Templates.
 */
class ItemWrapper {
    private final StrategyFactory strategyFactory = new StrategyFactory();
    private Item item;

    public ItemWrapper(Item item) {
        this.item = item;
    }

    public void update() {
        Strategy strategy = strategyFactory.buildStrategyForItem(item);
        strategy.invoke();
    }

}
