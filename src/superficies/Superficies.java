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
        //Constructores de la clase Modelo y Vista
        Modelo mod = new Modelo();
        Vista vis = new Vista();
        String shapeType;

        sc = new Scanner(System.in);

        //Preguntamos por pantalla cual es el area que se quiere calcular la obtenemos con un scanner
        System.out.println("What shape would you like to find the area of? (square, circle, triangle, rectangle):");
        shapeType = sc.nextLine();
        //Mandamos la eleccion de shapeType a la clase modelo.
        mod.setShapeType(shapeType);
        //Se muestra la eleccion que pusiste 
        System.out.println("You said: " + shapeType);

        //Ahora dependiendo de la eleccion mediate if procedemos a calcular las superficies
        if (shapeType.equals("square")) {
            //add area calculations for square
            float squareArea;
            float sideLength;

            //Preguntamos por scanner el lado del cuadrado
            System.out.println("what is the side length?");
            sideLength = sc.nextFloat();
            //mandamos el lado al setlado del Modelo
            mod.setSideLength(sideLength);
            squareArea = sideLength * sideLength;
            //Y mandamos el area tambien a Modelo
            mod.setSquareArea(squareArea);
            vis.imprimir(mod);

        }
        if (shapeType.equals("rectangle")) {
            //add area calculations for rectangle here
            float sideLength;
            float sideHeight;
            float rectangleArea;

            //Preguntamos ancho y alto del rectangulo y los mandamos a los setters y getters junto con el calculo del area
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

            //Preguntamos base y altura del triangulo y los mandamos a los setters y getters junto con el calculo del area
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

            //Preguntamos radio del circulo y lo mandamos a los setters y getters junto con el calculo del area
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
