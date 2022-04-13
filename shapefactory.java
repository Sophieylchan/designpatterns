public class shapefactory extends abstractfactory {

    @Override 
    public shape getShape(String shapeType){    
        if(shapeType.equalsIgnoreCase("circle")){
           return new circle();
    
    }
    return null;
}
}