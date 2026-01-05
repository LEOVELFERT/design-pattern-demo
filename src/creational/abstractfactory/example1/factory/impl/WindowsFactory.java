package creational.abstractfactory.example1.factory.impl;

import creational.abstractfactory.example1.abstractProducts.Button;
import creational.abstractfactory.example1.abstractProducts.ScrollBar;
import creational.abstractfactory.example1.abstractProducts.impl.WindowsButton;
import creational.abstractfactory.example1.abstractProducts.impl.WindowsScrollBar;
import creational.abstractfactory.example1.factory.AbstractNavigationItemsFactory;

public class WindowsFactory implements AbstractNavigationItemsFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new WindowsScrollBar();
    }
}
