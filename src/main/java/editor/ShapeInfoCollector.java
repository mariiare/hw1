package editor;



public class ShapeInfoCollector {

    public String getInfo(ShapeCharacteristic [] characteristic,Shape s ){
        if (characteristic.length>=3){
            throw new IllegalArgumentException("there is only two charecteristics, but you trying to  pass more");

        }

        StringBuilder sb = new StringBuilder();
       if (ShapeCharacteristic.NAME ==(characteristic[1])){
           sb.append(" name is = ");
           sb.append(s.getName());
       }
       if (ShapeCharacteristic.COLOR == (characteristic[0])){
           sb.append(" color is = ");
           sb.append(s.getColor());
       }
       return sb.toString();

    }
}
