package creational.abstractfactory.example1.abstractProducts.impl;

import creational.abstractfactory.example1.abstractProducts.ScrollBar;

public class WindowsScrollBar implements ScrollBar {
    @Override
    public void scroll() {
        System.out.println("Scrolling windows ui...");
    }
}
