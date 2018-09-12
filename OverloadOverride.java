
package java1;


public class OverloadOverride {
    
    public static void main(String[] args) {
        Student student = new Student();
        student.walk();
        student.walk(1);
        student.walk(2); 
        
        Person person = new Person(); 
        person.walk(); 
        person.walk(1); 
       student.study();
       student.study(2);
       
       Teacher teacher = new Teacher(); 
       teacher.educate(); 
       teacher.educate(3); 
    }
    
}
/*
class Person, Student, Teacher
Student extends Person
Teacher extends Person

walk()
walk(int i)

*/
    class Person { 
        public void walk() {}
        public void walk(int a){
             System.out.println("Hi i'm a person");
        }

        }
    
        class Student extends Person  { 
             public void study() {}
             public void study(int b) { 
                   System.out.println("Hi i'm a student");
                 }
             public void walk(int cab) {
                 System.out.println("Omg");
            }
        }
             
        class Teacher extends Person { 
            public void educate() {} 
            public void educate(int c) {
                System.out.println("Hi i'm a teacher");
            }
            
            
            
        
}