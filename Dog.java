package org.example.abstraction_1;


class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    @Override
    public void sound() {
        System.out.println("bow bow");
    }
}

