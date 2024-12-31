package BridgeDesignPattern.v1_shape_without_bridge;

public class WithoutBridgeDemo {
    public static void main(String[] args) {
        Shape redCircle = new RedCircle();
        Shape blueSquare = new BlueSquare();
        Shape greenCircle = new GreenCircle();
        Shape redSquare = new RedSquare();

        redCircle.applyColor();
        blueSquare.applyColor();
        greenCircle.applyColor();
        redSquare.applyColor();
    }
}