package BridgeDesignPattern.v2_shape_with_bridge.model;

import BridgeDesignPattern.v2_shape_with_bridge.color.Color;

public class Square extends Shape {

	public Square(Color color) {
		super(color);
	}
	
	@Override
	public void applyColor() {
		color.applyColor();
	}

}
