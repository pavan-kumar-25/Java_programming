 public class Aerospace {

  public String name; //data members
  public int maxSpeed;
  
  public Aerospace()   //default constructer
 {  
    this.name = "";
    this.maxSpeed = 0;
  }


//constructer overloading.....
  public Aerospace(String name) 
{
    this.name = name;
  }

  public Aerospace(String name, int maxSpeed) 
{
    this.name = name;
    this.maxSpeed = maxSpeed;
  }


//method overloading....
  public void fly() {
    System.out.println(name + " is flying.");
  }

  public void fly(int height) {
    System.out.println(name + " is flying at " + height + " ft.");
  }

  public void fly(String location) {
    System.out.println(name + " is flying over " + location);
  }

}