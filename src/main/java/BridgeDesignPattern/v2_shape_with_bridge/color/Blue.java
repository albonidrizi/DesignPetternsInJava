package BridgeDesignPattern.v2_shape_with_bridge.color;

// Implementimi i ndërfaqes Color për ngjyrën blu (Blue).
public class Blue implements Color {

	@Override
	public void applyColor() {
		// Mesazh që tregon se po aplikohet ngjyra blu.
		System.out.println("Applying blue color");
	}
}