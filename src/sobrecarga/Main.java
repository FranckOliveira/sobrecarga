package sobrecarga;

public class Main {
    public static void main(String[] args){

        System.out.println("Exercício quadrilátero");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("quadrado: "+ areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5d,5d);
        System.out.println("retangulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println("Trapezio: "+areaTrapezio);

        float areaLosango = Quadrilatero.area(5f,5f);
        System.out.println("Losango: " + areaLosango);


        /*Quadrilatero.area(5d,5d);
        Quadrilatero.area(7,8,9);
        Quadrilatero.area(5f,5f);*/
    }
}
