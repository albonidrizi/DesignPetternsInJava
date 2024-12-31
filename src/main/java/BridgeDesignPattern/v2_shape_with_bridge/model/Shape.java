package BridgeDesignPattern.v2_shape_with_bridge.model;


import BridgeDesignPattern.v2_shape_with_bridge.color.Color;

// Kjo është klasa abstrakte Shape
// Ajo përmban referencën e ndërfaqes Color dhe siguron bazën për të gjitha format.
public abstract class Shape {

	// Variabla për të mbajtur referencën e ngjyrës.
	Color color;

	// Konstruktor që injekton një objekt të tipit Color.
	public Shape(Color color) {
		this.color = color; // Lidhja e formës me ngjyrën.
	}

	// Metoda abstrakte që do të implementohet nga format specifike.
	public abstract void applyColor();
}
