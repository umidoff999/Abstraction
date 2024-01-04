package org.example.abstraction_1;

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("Unknown sound");
    }

    public String getName() {
        return name;
    }
}
