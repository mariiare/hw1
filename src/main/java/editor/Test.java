package editor;

public class Test {
    public static void main(String[] args) {
        Shape circle = new Circle("circle1", "#4908");
        Shape circle2 = new Circle("circle2", "#4909");
        ShapeCharacteristic [] characteristics = {ShapeCharacteristic.COLOR, ShapeCharacteristic.NAME};

        ShapePrinter sp = new ConsolShapePrint();
        sp.print(circle);
        sp.print(circle2, characteristics);

        Shape quad = new Quad("quad1", "#5908");
        Shape quad2 = new Quad("quad2", "#5909");

        sp.print(quad);
        sp.print(quad2, characteristics);

        Shape triangle = new Triangle("triangle1", "#6908");
        Shape triangle2 = new Triangle("triangle2", "#6909");

        sp.print(triangle);
        sp.print(triangle2, characteristics);

        Shape rectangle = new Rectangle("rectangle1", "#7908");
        Shape rectangle2 = new Rectangle("rectangle2", "#7909");

        sp.print(rectangle);
        sp.print(rectangle2, characteristics);
    }
}
