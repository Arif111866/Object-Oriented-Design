public class ShapeFactory extends AbstructFactory {
    @Override
    public Shape getShape(String type){
        if(type.equalsIgnoreCase("rectangle"))
            return new Ractangle() ;
        else if(type.equalsIgnoreCase("squar"))
            return new Squar() ;
        return null ;
    }
}
