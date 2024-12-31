package DecoratorDesignPattern.decorator;


import DecoratorDesignPattern.Hamburger;
import DecoratorDesignPattern.HamburgerDekurimi;

public class Tomat extends HamburgerDekurimi {

    public Tomat(Hamburger hamburger) {
        super(hamburger);
    }

    public String make() {
        return super.make() + addTomat();
    }

    public String addTomat() {
        return " + Tomat";
    }


}
