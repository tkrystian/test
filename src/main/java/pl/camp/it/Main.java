package pl.camp.it;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(5);
        tree.add(8);
        tree.add(4);
        tree.add(19);
        tree.add(1);
        tree.add(16);
        System.out.println("Czy drzewo posiada 15?: " + tree.contains(15));
        System.out.println("Czy drzewo posiada 4?: " + tree.contains(4));
        System.out.println("Min: " + tree.min());
        System.out.println("Max: " + tree.max());
    }
}