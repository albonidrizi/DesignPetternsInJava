package DecoratorDesignPattern.decorator;

import DecoratorDesignPattern.Hamburger;

public class Bread implements Hamburger {
    @Override
    public String make() {
        return " Hamburger me Bread";
    }
}
