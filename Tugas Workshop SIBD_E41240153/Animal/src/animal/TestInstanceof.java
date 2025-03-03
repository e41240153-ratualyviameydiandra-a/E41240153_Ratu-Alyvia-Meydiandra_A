/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;
public class TestInstanceof {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeNoise(); // Output: talk

        Dog dog = new Dog();
        dog.makeNoise(); // Output: Bark

        Animal animaldog = new Dog();
        animaldog.makeNoise(); // Output: Bark

        if (animal instanceof Animal) {
            System.out.println("animal is Animal");
        }

        if (dog instanceof Animal) {
            System.out.println("dog is Animal");
        }

        if (animaldog instanceof Animal) {
            System.out.println("animaldog is Animal");
        }

        if (animal instanceof Dog) {
            System.out.println("animal is Dog");
        }
    }
}