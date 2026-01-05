package creational.abstractfactory.example1.abstractProducts.impl;

import creational.abstractfactory.example1.abstractProducts.Button;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("rendering the windows ui");
    }
}
