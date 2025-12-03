public class MetodosAreas{
  public static double areaRectangulo(double base, doublea altura){
    return base*altura;
  }
  public static double areaCirculo(double radio){
    return Math.PI*radio*radio;
  }
  public static double areaCuadrado(double lado){
    return lado*lado;
  }
  public static void main(Strind[] args){
    double areaRect=areaRectangulo(5.0,3.0);
    double areaCir=areaCirculo(2.0);
     double areaCua=areaCuadrado(4.0);
    System.out.println("Area Rectangulo: "+areaRect);
    System.out.println("Area Circulo: "+areaCir);
    System.out.println("Area Cuadrado: "+areaCua);
  }
}
