package creational.abstractfactory.example1.factory.impl;

import creational.abstractfactory.example1.abstractProducts.Button;
import creational.abstractfactory.example1.abstractProducts.ScrollBar;
import creational.abstractfactory.example1.abstractProducts.impl.MacOsButton;
import creational.abstractfactory.example1.abstractProducts.impl.MacOsScrollBar;
import creational.abstractfactory.example1.factory.AbstractNavigationItemsFactory;

public class MacOsFactory implements AbstractNavigationItemsFactory {
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new MacOsScrollBar();
    }
}
