package DecoratorDesignPattern.decorator;


import DecoratorDesignPattern.Hamburger;
import DecoratorDesignPattern.HamburgerDekurimi;

public class Ketchup extends HamburgerDekurimi {

    public Ketchup(Hamburger hamburger) {
        super(hamburger);
    }

    public String make() {
        return super.make() + addKetchup();
    }

    public String addKetchup() {
        return " + Ketchup";
    }

}
