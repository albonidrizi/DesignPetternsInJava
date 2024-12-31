package BridgeDesignPattern.v1_shape_without_bridge;

// Forma Square për çdo ngjyrë
public class RedSquare extends Shape {
    @Override
    public void applyColor() {
        System.out.println("Applying Red color to Square.");
    }
}
