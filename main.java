public class main {
    public static void main(String [] args) {
//get shape factory
abstractfactory shapeFactory = factoryproducer.getFactory(false);
//get an object of Shape circle
shape shape1 = shapeFactory.getShape("circle");
//call draw method of Shape circle
shape1.draw();
}
}
