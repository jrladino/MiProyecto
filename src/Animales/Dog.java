package Animales;

public class Dog extends Animal {
    public Dog(String name, String raza, int age, int size) {

        this.name = name;
        this.raza = raza;
        this.age = age;
        this.size = size;
    }

    @Override
    public String makeSound() {
        return "Woof!";
    }
}
