
package superficies;

/**
 *
 * @author Alex Urcera
 */
public class Vista {
    
    
    
    public void imprimir(Modelo mod){
        if (mod.getShapeType().equalsIgnoreCase("square")) {
          System.out.println("The area for your square: " + mod.getSquareArea());  
        }
        if (mod.getShapeType().equalsIgnoreCase("rectangle")) {
            System.out.println("The area for your rectangle is: " + mod.getRectangleArea());
                   }
        if (mod.getShapeType().equalsIgnoreCase("triangle")) {
            System.out.println("Your triangles area is: " + mod.getTriangleArea());
        }
        if (mod.getShapeType().equalsIgnoreCase("circle")) {
            System.out.println("Your Circles area is " + mod.getCircleArea());
        }
        
        
        
    }
}
