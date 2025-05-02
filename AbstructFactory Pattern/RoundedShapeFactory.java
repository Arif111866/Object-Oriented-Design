public class RoundedShapeFactory extends AbstructFactory {
    @Override
    public  Shape getShape(String type){
        if(type.equalsIgnoreCase("rectangle"))
            return new RoundedRectangle() ;
        else if(type.equalsIgnoreCase("squar"))
            return new RoundeSquar() ;
        return null ;
    }
}
