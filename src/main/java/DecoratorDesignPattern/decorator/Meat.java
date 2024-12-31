package DecoratorDesignPattern.decorator;


import DecoratorDesignPattern.Hamburger;
import DecoratorDesignPattern.HamburgerDekurimi;

public class Meat extends HamburgerDekurimi {

    public Meat(Hamburger hamburger) {
        super(hamburger);
    }

    public String make() {
        return super.make() + addMeat();
    }

    public String addMeat() {
        return " + Meat";
    }
}
