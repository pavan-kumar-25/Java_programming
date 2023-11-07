public class Aircraft {
  public static void main(String[] args) {
    Aerospace Air = new Aerospace("Boeing 747", 570);
    
    System.out.println(Air.name);
    System.out.println(Air.maxSpeed);
    
    Air.fly();
    Air.fly(30000);
    Air.fly("Atlantic ocean");
  }
}