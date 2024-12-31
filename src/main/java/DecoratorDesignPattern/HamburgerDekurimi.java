package DecoratorDesignPattern;

public class HamburgerDekurimi implements Hamburger {

    protected Hamburger hamburger;

    public HamburgerDekurimi(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    @Override
    public String make() {
        return hamburger.make();
    }

}
