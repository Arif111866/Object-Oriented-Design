public class FactoryProducer {
    public static AbstructFactory getFactory(boolean rounded){
        if(rounded)
            return new RoundedShapeFactory() ;
        // else
            // return new ShapeFactory() ;
        return null;
    }
}
