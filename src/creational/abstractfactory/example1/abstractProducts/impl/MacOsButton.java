package creational.abstractfactory.example1.abstractProducts.impl;

import creational.abstractfactory.example1.abstractProducts.Button;

public class MacOsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering MacOs Ui...");
    }
}
