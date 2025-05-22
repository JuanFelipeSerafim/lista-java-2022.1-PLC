import java.lang.Math;
public class Triangulo implements FigurasGeometricas{
    private double l1,l2,l3;
    
    Triangulo(double l1,double l2,double l3){
        this.l1=l1;
        this.l2=l2;
        this.l3=l3;
    }

    public double calculateArea(){
        double semiperimetro=(l1+l2+l3)/2.0;
        return Math.sqrt(semiperimetro*(semiperimetro-l1)*(semiperimetro-l2)*(semiperimetro-l3));
    }

    public double calculatePerimetro(){
        return (l1+l2+l3);
    }
}