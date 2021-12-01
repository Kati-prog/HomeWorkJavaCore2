package HW3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //   1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
        String[] array = {"cat", "dog", "horse", "pig"};
        swapElements(array, 0, 1);
        movingFruits();
    }

    public static void swapElements(Object[] array, int firstIndex, int secondIndex) {
        Object temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
        printArray(array);
    }

    private static void printArray(Object[] array) {
        System.out.println(Arrays.toString(array));
    }

    private static void movingFruits() {
        FruitBox<Apple> appleBox = new FruitBox<>(1);
        FruitBox<Orange> orangeBox = new FruitBox<>(1.5);
        FruitBox<Apple> appleBox2 = new FruitBox<>(1);

        for (int i = 0; i < 3; i++) {
            orangeBox.addFruit(new Orange());
            appleBox.addFruit(new Apple());
            appleBox2.addFruit(new Apple());
        }

        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        appleBox2.addFruit(new Apple());


        System.out.println("Weight appleBox: " + appleBox.getBoxWeight());
        System.out.println("Weight orangeBox: " + orangeBox.getBoxWeight());
        System.out.println("Weights equals - " + appleBox.compare(orangeBox));

        appleBox.addFruits(appleBox2);

    }
}

