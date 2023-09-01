public class Cylinder_01 {
    class Cylinder {
  private int height;
  private int radius;
  public int getRaduis(){
    return radius;
  }
    public void setRadius(int r){
      this.radius = r;
  }
  public int getHeight(){
    return height;
  }
    public void setHeight(int h){
     this.height = h;
  }
  public double area(){
    return 2 * 3.14 * radius * radius + 2 * 3.14 * radius * height;
  }
  public double volume(){
    return 3.14 * radius * radius * height;
  }
  public Cylinder (int r, int h) {
this.radius = r;
this.height = h;
}
}  
class Rectangle{
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
  public static void main(String[] args) {
      // Cylinder cy = new Cylinder(9,12);
      // Rectangle r = new Rectangle(12, 56);
      //   cy.setRadius(9);
        // System.out.println("volume " + cy.volume());
        // cy.setHeight(12);
        //  System.out.println("area " + cy.area());
        
        // System.out.println(r.getLength());
        // System.out.println(r.getBreadth());
    }
}
