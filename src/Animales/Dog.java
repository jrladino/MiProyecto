package Animales;

public class Dog extends Animal {
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String makeSound() {
        return "Woof!";
    }
}
