package ArrayCheck;

public class Main {

    public static void main(String[] args) {

        String[][] arr = new String[][]{{"1", "2", "3", "4"},
                {"5", "6", "g", "8"},
                {"1", "2", "3", "6"},
                {"9", "1", "7", "0"}};
        try {
            try {
                int result = ArrayCheck(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива превышен!");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("Неправильное значение массива");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }

    }


    public static int ArrayCheck(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (String[] strings : arr) {
            if (strings.length != 4) {
                throw new MyArraySizeException();
            }
            for (String string : strings) {
                try {
                    count = count + Integer.parseInt(string);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException();
                }
            }

        }
        return count;
    }

}
