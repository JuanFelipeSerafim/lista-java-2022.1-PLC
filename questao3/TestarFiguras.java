public class TestarFiguras{

    public static void main(String[] args) {
        FigurasGeometricas[] a={new Quadrado(5.3),new Trapezio(25, 4, 10, 17, 8), new Triangulo(5,7,8)};
        System.out.println(a[0].calculateArea());
        System.out.println(a[0].calculatePerimetro());
        System.out.println(a[1].calculateArea());
        System.out.println(a[1].calculatePerimetro());
        System.out.println(a[2].calculateArea());
        System.out.println(a[2].calculatePerimetro());
        
    }



}