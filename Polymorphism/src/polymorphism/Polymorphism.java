
package polymorphism;

public class Polymorphism {

 
    public static void main(String[] args) {
        
        Food lush[] = new Food[2]; 
        lush[0] = new Crepe(); 
        lush[1] = new Fries(); 
        
            for (int x =0; x <2; x++) { 
                lush[x].Eat(); 
            }
        
    }
    
}
    

