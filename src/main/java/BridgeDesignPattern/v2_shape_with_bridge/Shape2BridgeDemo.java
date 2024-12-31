package BridgeDesignPattern.v2_shape_with_bridge;

import BridgeDesignPattern.v2_shape_with_bridge.color.*;
import BridgeDesignPattern.v2_shape_with_bridge.model.*;

/**
 *  *   @author Albon Idrizi https://www.linkedin.com/in/albonidrizi/
 *
 * @Bridge Pattern është një Structural Design Pattern që përdoret për të ndarë abstraksionin nga implementimi i saj,
 * duke i lejuar që të dyja të evoluojnë në mënyrë të pavarur. Ky model është i dobishëm kur duam të shmangim një
 * shpërthim të klasave si rezultat i shumë kombinimeve të abstraksionit dhe implementimit.
 *
 * Komponentët kryesorë të Bridge Pattern:
 * @1. Abstraction: Definon ndërfaqen e lartë që përdorin klientët dhe ruan një referencë për një implementim.
 * @2. Refined Abstraction: Zgjeron ndërfaqen bazë të abstraksionit.
 * @3. Implementor: Definon ndërfaqen për të gjitha klasat konkrete të implementimit.
 * @4. Concrete Implementor: Jep një implementim specifik të ndërfaqes së implementimit.
 * @5. Client: Përdor objektin e Abstraction për të bashkëvepruar me sistemin.
 * */

public class Shape2BridgeDemo {

	public static void main(String[] args) {

		Color blue = new Blue();
		Color green = new Green();

		// Krijimi i një objekti të tipit Circle me ngjyrën blu.
		Shape blueCircle = new Circle(blue);

		Shape redSquare = new Square(new Red());
		Shape greenCircle = new Circle(green);

		// Aplikimi i ngjyrës për rrethin blu.
		blueCircle.applyColor();

		redSquare.applyColor();
		greenCircle.applyColor();
	}
}