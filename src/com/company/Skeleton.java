package com.company;

public class Skeleton extends Boss {
    private int name;

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public Skeleton(int health, int damage, int name) {
        super(health, damage);
        this.name = name;
    }
    public String prinlnfo () {
        return super.printlnfo() + " " + name;


    }
}
