public class MainFactory {
    public static void main(String[] args) {
       ShapeFactory shapeFactory = new ShapeFactory() ;
       Shape shape = shapeFactory.getShape("circle") ;
       if (shape != null) {
           shape.draw(); 
       }
       shape = shapeFactory.getShape("squar");
       if(shape != null){
            shape.draw();
       }

    }
}
