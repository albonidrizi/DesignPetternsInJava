package DecoratorDesignPattern;

import DecoratorDesignPattern.decorator.*;

/**
 *   @author Albon Idrizi https://www.linkedin.com/in/albonidrizi/
 *
 *   @Decorator Pattern lejon që funksionaliteti të shtohet në një objekt në mënyrë dinamike, pa ndryshuar strukturën e tij.
 *Në këtë rast:
 * @1 Ndërfaqja bazë: Hamburger përfaqëson një komponent bazë që ka metodën make().
 * @2 Klasa konkrete: Bread është komponenti bazë që implementon ndërfaqen Hamburger.
 * @3 Dekoruesi abstrakt: HamburgerDekurimi është një dekorues që merr një Hamburger ekzistues dhe e përmirëson atë.
 * @4 Dekoruesit konkretë: Meat, Sllad, Tomat, Ketchup, dhe Mayonez janë dekorues konkretë që shtojnë funksionalitete (p.sh., përbërës të ndryshëm) në mënyrë dinamike.
 * */

class Main {
    public static void main(String[] args) {


        // Krijimi i një hamburgeri me përbërës të ndryshëm
        Hamburger hamburger = new HamburgerDekurimi(new Meat(new Sllad(new Tomat(new Ketchup(new Mayonez(new Bread()))))));
        System.out.println(hamburger.make());

        // Krijimi i një hamburgeri me përbërës të ndryshëm
        Hamburger hamburger2 = new HamburgerDekurimi(new Meat(new Tomat(new Ketchup(new Bread()))));
        System.out.println(hamburger2.make());

        // Krijimi i një hamburgeri me përbërës të ndryshëm
        Hamburger hamburger3 = new HamburgerDekurimi(new Meat(new Mayonez(new Ketchup(new Bread()))));
        System.out.println(hamburger3.make());
    }
}
