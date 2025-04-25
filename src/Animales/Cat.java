package Animales;

public class Cat extends Animal {
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String makeSound() {
        return "Meow!";
    }
    
}