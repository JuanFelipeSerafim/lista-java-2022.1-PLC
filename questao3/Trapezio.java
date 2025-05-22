public class Trapezio implements FigurasGeometricas{
    private double bM,b,l1,l2,altura;
    
    Trapezio(double bM,double b,double l1,double l2,double altura){
        this.bM=bM;
        this.b=b;
        this.l1=l1;
        this.l2=l2;
        this.altura=altura;
    }

    public double calculateArea(){
        return ((this.bM+this.b)*this.altura/2);
    }

    public double calculatePerimetro(){
        return (l1+l2+bM+b);
    }
}