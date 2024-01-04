package org.example.abstraction_1;

class Duck extends Animal {
    public Duck(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("quack quack");
    }
}
