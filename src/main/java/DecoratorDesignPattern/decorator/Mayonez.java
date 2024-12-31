package DecoratorDesignPattern.decorator;


import DecoratorDesignPattern.Hamburger;
import DecoratorDesignPattern.HamburgerDekurimi;

public class Mayonez extends HamburgerDekurimi {

    public Mayonez(Hamburger hamburger) {
        super(hamburger);
    }

    public String make() {
        return super.make() + addMayonez();
    }

    public String addMayonez() {
        return " + Mayonez";
    }
}
