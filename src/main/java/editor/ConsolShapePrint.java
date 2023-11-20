package editor;

public class ConsolShapePrint implements ShapePrinter{
    private ShapeInfoCollector collector = new ShapeInfoCollector();




    @Override
    public void print(Shape shape, ShapeCharacteristic[] characteristics) {
        System.out.println(collector.getInfo(characteristics, shape));

    }
}
