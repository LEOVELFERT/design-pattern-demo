package creational.observer.impl;

import observer.Observer;

public class MobileDevice implements Observer {
    @Override
    public void update(int temp) {
        System.out.println("The temperature has been updated in the Mobile device :" + temp);
    }
}
