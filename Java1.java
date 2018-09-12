
package java1;

/*
make class Person
make static variable total person
make 2 persons
fields name age
toString
*/
public class Java1 {
  
    public static void main(String[] args) {
        Person p = new Person("Gale", 20);
        Person p11 = new Person();
        
        System.out.println(p.getName()); 
        p.setName("Lee");
        System.out.println(p.toString());
        Person p1 = new Person("Jhance", 23);
        System.out.println(p1.toString());
    }
    
}


class Person {
    private static int total_no_persons; 
     private String name; 
     public int age; 
     public Animal animal; 

     public Person() {}
     public Person(String name, int age) {
         this.name = name; 
         this.age = age; 
         this.total_no_persons++;
     }
    // Setter - void no return
     // Getter - data type ng irereturn at may return
     public void setName(String name) {
         this.name = name; 
     }
     public String getName() { 
         return name; 
     }          
     public String toString() {
         return  name + age + total_no_persons; 
     }
}



























/*
Car car1 = new Car("red", "ferari", 5);
        //System.out.println(car1.toString());
        System.out.println(car1.total_cars);
        Car car2 = new Car ("Black", "Range Rover", 4);
        System.out.println(car1.total_cars + " " + car2.total_cars);
        //System.out.println(car2.toString());
        Animal a = new Animal();
        System.out.println(a.Eat());


*/
class Car {
    public static int total_cars = 0;
    private String color;
    private String brand;
    private int num_of_wheels;
    
    //Constructor
    public Car(String color, String brand, int num_of_wheels) {
        this.color = color;
        this.brand = brand;
        this.num_of_wheels = num_of_wheels;
        total_cars++;
    }
    
    //Override
    public String toString() {
        return color + brand + num_of_wheels + " total car   " + total_cars;
     }
}