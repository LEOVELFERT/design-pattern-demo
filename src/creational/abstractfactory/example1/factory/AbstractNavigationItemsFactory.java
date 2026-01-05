package creational.abstractfactory.example1.factory;

import creational.abstractfactory.example1.abstractProducts.Button;
import creational.abstractfactory.example1.abstractProducts.ScrollBar;

public interface AbstractNavigationItemsFactory {
    Button createButton();
    ScrollBar createScrollBar();
}
