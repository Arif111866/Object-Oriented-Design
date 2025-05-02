public class MainFactory {
    public static void main(String[] args) {
        AbstructFactory shapeFactory = FactoryProducer.getFactory(false);
        Shape shape1 = shapeFactory.getShape("rectangle");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("squar");
        shape2.draw();

        AbstructFactory roundedShapeFactory = FactoryProducer.getFactory(true);
        Shape shape3 = roundedShapeFactory.getShape("rectangle");
        shape3.draw();
        Shape shape4 = roundedShapeFactory.getShape("squar");
        shape4.draw();
    }
}