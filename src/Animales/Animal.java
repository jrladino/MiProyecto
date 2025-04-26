package Animales;

public abstract class Animal {
    public String name;
    public String raza;
    public int age;
    public int size;

    public abstract String makeSound();

    public String getInfo() {
        return "Name: " + name + ", Raza: " + raza + ", Age: " + age + ", Size: " + size;
    }
}