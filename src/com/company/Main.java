package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
   Boss boss= new Boss(25, 150);
   boss.weapon.setName("pneumatic"); boss.weapon.setType("gas");
        System.out.println(boss.printlnfo());

        Skeleton skeleton= new Skeleton(25, 250, 70);
        skeleton.weapon.setName("gas");
        skeleton.weapon.setType("machine");

        System.out.println(skeleton.prinlnfo());

        Skeleton skeleton1 = new Skeleton(17, 290, 75);
        skeleton1.weapon.setName("pneumatic");
        skeleton1.weapon.setType("pistol");

        System.out.println(skeleton1.printlnfo());



    }
}
