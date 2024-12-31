package BridgeDesignPattern.v2_shape_with_bridge;

import BridgeDesignPattern.v2_shape_with_bridge.color.*;
import BridgeDesignPattern.v2_shape_with_bridge.model.*;


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