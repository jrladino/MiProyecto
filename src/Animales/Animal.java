package Animales;

public abstract class Animal {
    public String name;
    public int age;

    public abstract String makeSound();

    public String getInfo() {
        return "Name: " + name + ", Age: " + age;
    }
}