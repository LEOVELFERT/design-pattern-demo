package creational.abstractfactory.example1;

import creational.abstractfactory.example1.abstractProducts.Button;
import creational.abstractfactory.example1.abstractProducts.ScrollBar;
import creational.abstractfactory.example1.factory.AbstractNavigationItemsFactory;
import creational.abstractfactory.example1.factory.impl.MacOsFactory;

public class Application {

    private Button button;
    private ScrollBar scrollBar;

    public Application(AbstractNavigationItemsFactory factory) {
        this.button = factory.createButton();
        this.scrollBar = factory.createScrollBar();
    }

    public void renderUi() {
        button.render();
        scrollBar.scroll();
    }

    public static void main(String[] args) {
        AbstractNavigationItemsFactory factory = new MacOsFactory();
        Application application = new Application(factory);
        application.renderUi();
    }
}
