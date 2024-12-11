public class parte2 {
    public static void main(String[]args){
        circulo figura1 = new circulo(2);
        rectangulo figura2 = new rectangulo(1,2);
        cuadrado figura3 = new cuadrado(3);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3,5);
        System.out.println("El área del círculo es = " + figura1.calcularArea());
        System.out.println("El perimetro del círculo es = " + figura1.calcularPerimetro());
        System.out.println("El área del rectángulo es = " + figura2.calcularArea());
        System.out.println("El perímetro del rectángulo es = " + figura2.calcularPerimetro());
        System.out.println("El área del cuadrado es = " + figura3.calcularArea());
        System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerimetro());
        System.out.println("El área del triángulo es = " + figura4.calcularArea());
        System.out.println("El perímetro del triángulo es = " + figura4.calcularPerimetro());
        figura4.determinarTipoTriangulo();
    }
}
class circulo {
    int radio;
    circulo(int radio){
         this.radio=radio;
    }
    double calcularArea(){
        return Math.PI*Math.pow(radio,2);
    }
    double calcularPerimetro(){
        return Math.PI*2*radio;
    }
}
class rectangulo {
    int base;
    int altura;
    rectangulo(int base,int altura){
        this.base=base;
        this.altura=altura;}
    double calcularArea(){
        return base*altura;}
    double calcularPerimetro(){
        return (2*base)+(2*altura);}
}
class cuadrado {
    int lado;
    cuadrado(int lado){
        this.lado=lado;}
    double calcularArea(){
        return Math.pow(lado,2);}
    double calcularPerimetro(){
        return 4*lado;}
}
class TrianguloRectangulo {
    int base,altura;
    TrianguloRectangulo(int base, int altura){
        this.base=base;
        this.altura=altura;}
    double calcularArea(){
        return (base*altura)/2;}
    double calcularPerimetro(){
        return base+altura+calcularHipotenusa();}
    double calcularHipotenusa(){
        return Math.pow((base*base)+(altura*altura),0.5);}
    void determinarTipoTriangulo(){
        if ((base==altura)&&(base==calcularHipotenusa())&&(altura==calcularHipotenusa())){
            System.out.println("Es un triángulo equilátero");}
        else if ((base!=altura)&&(altura!=calcularHipotenusa())&&(base!=calcularHipotenusa())){
            System.out.println("Es un triángulo escaleno");}
        else
            System.out.println("es un triángulo isósceles");}
    }