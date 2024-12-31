package BridgeDesignPattern.v2_shape_with_bridge.color;

// Definimi i ndërfaqes Color
// Kjo ndërfaqe siguron një metodë të përbashkët për të gjitha ngjyrat.
public interface Color {
	void applyColor(); // Metoda që duhet të implementohet nga të gjitha ngjyrat.
}