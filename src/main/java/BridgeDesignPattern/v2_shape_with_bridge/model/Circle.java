package BridgeDesignPattern.v2_shape_with_bridge.model;


import BridgeDesignPattern.v2_shape_with_bridge.color.Color;

// Kjo klasë përfaqëson një rreth specifik (Circle)
// Trashëgon klasën Shape dhe implementon metodën applyColor.
public class Circle extends Shape {

	// Konstruktor që thërret konstruktorin e klasës bazë (Shape).
	public Circle(Color color) {
		super(color);
	}

	@Override
	public void applyColor() {
		// Aplikon ngjyrën duke përdorur referencën color.
		color.applyColor();
	}
}
