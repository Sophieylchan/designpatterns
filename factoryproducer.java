public class factoryproducer {
    public static abstractfactory getFactory(boolean rounded){   
        if(rounded){
           return new shapefactory();         
        }else{
           return new shapefactory();
        }
     }
}
