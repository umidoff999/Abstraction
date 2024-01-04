package org.example.abstraction_1;

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("mow mow");
    }
}
