
package shapesmetodofabrica;

/**
 *
 * @author Giseli
 */
public class FactoryPatternDemo {

    
    public static void main(String[] args) {
        Shape shape;
        shape = ShapeFactory.getShape("shapesmetodofabrica.Circle");
        shape.drawn();
        
        shape = ShapeFactory.getShape("shapesmetodofabrica.Square");
        shape.drawn();
        
        shape = ShapeFactory.getShape("shapesmetodofabrica.Triangle");
        shape.drawn();
        
    }
    
}
