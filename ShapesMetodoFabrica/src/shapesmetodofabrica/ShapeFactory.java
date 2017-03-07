
package shapesmetodofabrica;

/**
 *
 * @author Giseli
 */
public class ShapeFactory {
    public static Shape getShape(String shapeType){
        Shape shape;
        Object classeReflection = null;
	try {
            classeReflection = Class.forName(shapeType).newInstance();            
	    } catch (InstantiationException e) {
	    e.printStackTrace();
	} catch (IllegalAccessException e) {
            e.printStackTrace();
	} catch (ClassNotFoundException e) {
	    e.printStackTrace();
	}        
        shape = (Shape) classeReflection;

        return shape;     
    }
    /*public static Shape getShape(String shapeType){
        Shape shape;
        
        if(shape.equalsIgnoreCase("circle")){
            shape = new Circle;
        } else if(shape.equalsIgnoreCase){
            
        }
        return shape;
    }*/
}
