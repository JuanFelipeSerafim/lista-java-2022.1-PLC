public class Quadrado implements FigurasGeometricas{
    private double l1;
    Quadrado(double l1){
        this.l1=l1;
    }
    public double calculateArea(){
        return this.l1*this.l1;
    }
    public double calculatePerimetro(){
        return 4*this.l1;
    }

}