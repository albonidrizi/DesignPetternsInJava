package BridgeDesignPattern.v1_shape_without_bridge;

// Forma Circle për çdo ngjyrë
public class RedCircle extends Shape {
    @Override
    public void applyColor() {
        System.out.println("Applying Red color to Circle.");
    }
}
