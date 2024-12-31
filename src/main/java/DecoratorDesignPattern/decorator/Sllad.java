package DecoratorDesignPattern.decorator;


import DecoratorDesignPattern.Hamburger;
import DecoratorDesignPattern.HamburgerDekurimi;

public class Sllad extends HamburgerDekurimi {
    public Sllad(Hamburger hamburger) {
        super(hamburger);
    }

    public String make() {
        return super.make() + addSllad();
    }

    public String addSllad() {
        return " + Sllad";
    }
}
