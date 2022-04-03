package ru.job4j.oop;

public class Cat {

    private String name;
    private String food;

    public void show() {
        System.out.println(this.name);
        System.out.println(this.food);
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.giveNick("gav");
        gav.eat("kotleta");
        System.out.println("There are " + gav.name + "'s food.");
        gav.show();
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("black");
        System.out.println("There are " + black.name + "'s food.");
        black.show();
    }
}