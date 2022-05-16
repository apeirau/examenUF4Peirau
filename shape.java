// A sample class Shape which provides a method to get the Shape's area
class Shape {

  /**
   * @author alexpeirau
   *         Código de el examen M08_UF4
   * @return double
   */
  public double getArea() {
    return 0;
  }
}

// Añadido el JavaDoc 

/**
 * A Rectangle is a Shape with a specific width and height
 * 
 * @param width  anchura del rectangulo
 * @param height altura del rectangulo
 */
class Rectangle extends Shape { // extended form the Shape class
  private double width;
  private double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double getArea() {
    return width * height;
  }
}

/**
 * A Circle is a Shape with a specific radius
 * 
 * @param radius es el radio del circulo
 */
class Circle extends Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return 3.14 * radius * radius;
  }
}

/**
 * Class del Cuadrado añadido por mi
 * 
 * @param lado es el tamaño del lado de un cuadrado, todos los lados son iguales
 */
class Cuadrado extends Shape {
  private double lado;
  private double areaCuadrado;

  public Cuadrado(double lado) {
    this.lado = lado;
  }

  public double getLado() {
    return lado;
  }

  public void setLado(double lado) {
    this.lado = lado;
  }

  public double getareaCuadrado() {
    return areaCuadrado;
  }
}