public class ShapeFactory {
    public Shape getShape(String type){
        if(type == null)
            return null ;
        else if(type.equalsIgnoreCase("circle"))
            return new Circle() ;
        else if(type.equalsIgnoreCase("Rectangle"))
            return new Rectangle() ;
        else if(type.equalsIgnoreCase("squar"))
            return new Squar() ;
        else return null;
    }
}
