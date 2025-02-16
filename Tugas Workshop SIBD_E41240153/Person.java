/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package person;

public class Person {
    // Declare a variable for the person's name
    private String name;  
    // Declare a variable for the person's age
    private int age;  
    // Create a constructor that will initialize the name and age variables
    public Person(String name, int age) {
        this.name = name;  
        this.age = age;    
    }
    // Create a method called getName() that will return the person's name
    public String getName() {
        return name;  // Mengembalikan nilai dari variabel 'name'
    }
    // Create a method called setName() that will set the person's name
    public void setName(String name) {
        this.name = name;  
    }
    // Create a method called getAge() that will return the person's age
    public int getAge() {
        return age;  
    }
    // Create a method called setAge() that will set the person's age
    public void setAge(int age) {
        this.age = age;  
    }
}

  

   