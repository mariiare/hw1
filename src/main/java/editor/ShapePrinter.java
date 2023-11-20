package editor;

public interface ShapePrinter {
    public  default void print(Shape shape){
        System.out.println(shape.getName());
    }
    public void print(Shape shape, ShapeCharacteristic[] characteristics);
}
