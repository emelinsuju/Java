package park; 

import zoo.Animal; 

public class MainDifferentPackage {
    public static void main(String[] args) {
        Animal myAnimal = new Animal("Elephant");
    
        System.out.println("Direct Access: " + myAnimal.species); 
    }
}
