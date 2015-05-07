package superficies;

import java.util.Scanner;

/**
 * Examen de MVC 3ª Avaliación
 *
 * @author damian
 */
public class Superficies {
    
    private static Scanner sc;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Modelo mod = new Modelo();
        Vista vis = new Vista();
        String shapeType;
        
        sc = new Scanner(System.in);
        
        System.out.println("What shape would you like to find the area of? (square, circle, triangle, rectangle):");
        shapeType = sc.nextLine();
        mod.setShapeType(shapeType);
        System.out.println("You said: " + shapeType);
        
        if (shapeType.equals("square")) {
            //add area calculations for square
            float squareArea;
            float sideLength;
            
            System.out.println("what is the side length?");
            sideLength = sc.nextFloat();
            mod.setSideLength(sideLength);
            squareArea = sideLength * sideLength;
            mod.setSquareArea(squareArea);
            vis.imprimir(mod);
            
        }
        if (shapeType.equals("rectangle")) {
            //add area calculations for rectangle here
            float sideLength;
            float sideHeight;
            float rectangleArea;
            
            System.out.println("what is the rectangles width?");
            sideLength = sc.nextFloat();
            mod.setSideLength(sideLength);
            System.out.println("What is the rectangles height?");
            sideHeight = sc.nextFloat();
            mod.setSideHeight(sideHeight);
            rectangleArea = sideLength * sideHeight;
            mod.setRectangleArea(rectangleArea);
            vis.imprimir(mod);
            
        }
        if (shapeType.equals("triangle")) {
            //add area calculations for triangle here
            float baseLength;
            float height;
            float triangleArea;
            
            System.out.println("What is the base length of the triangle?");
            baseLength = sc.nextFloat();
            mod.setBaseLength(baseLength);
            System.out.println("What is the height of the triangle?");
            height = sc.nextFloat();
            mod.setHeight(height);
            triangleArea = (float) (0.5 * baseLength * height);
            mod.setTriangleArea(triangleArea);
            vis.imprimir(mod);
            
        }
        if (shapeType.equals("circle")) {
            //add area calculations for a circle here
            float radius;
            float circleArea;
            
            System.out.println("What is the radius of the circle?");
            radius = sc.nextFloat();
            mod.setRadius(radius);
            circleArea = radius * radius;
            circleArea = (float) (3.14159265 * circleArea);
            mod.setCircleArea(circleArea);
            vis.imprimir(mod);
        }
        
    }
}
