package superficies;

/**
 *
 * @author Alex Urcera
 */
public class Vista {

    //El metodo imprimir recibe un objeto de tipo Modelo y visualiza el calculo de las areas de los objetos
    public void imprimir(Modelo mod) {
        //Mediante if recogemos el shapeType y dependiendo de la eleccion que elijas te muestra el area del objeto seleccionado 
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
