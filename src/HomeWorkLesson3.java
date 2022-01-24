import java.util.Arrays;

public class HomeWorkLesson3 {
    public static void main(String[] args) {
        arrayReplacementNumber();
        arrayHundred();
        arrayThree();
        arrayFor();
        System.out.println(Arrays.toString(retArray(33,55)));
        arrayMinMax();

    }

    // Задать массив 0 и 1, с помощью цикла заменить 0 на 1, 1 на 0
    private static void arrayReplacementNumber() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 2);
        }
        System.out.println(Arrays.toString(array) + " -  Исходный массив ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0)
                array[i] = 0;
            else
                array[i] = 1;
        }
        System.out.println(Arrays.toString(array) + " - Измененный массив");

    }
    //  Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100
    private static void arrayHundred() {
        int[] arrayHundred = new int[100];
        for (int i = 0; i < arrayHundred.length; i++) {
            arrayHundred[i] = i + 1;
        }
        System.out.println(Arrays.toString(arrayHundred));
    }
    // Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2
    private static void arrayThree() {
        int[] arrayThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arrayThree) + " -  Исходный массив ");
        for (int i = 0; i < arrayThree.length; i++) {
            if (arrayThree[i] < 6)
                arrayThree[i] = arrayThree[i] * 2;
        }
        System.out.println(Arrays.toString(arrayThree) + " - Измененный массив");

    }
    //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
    //полнить его диагональные элементы единицами.
    private static void arrayFor() {
        int length = 4;
        int[][] arrayFor = new int[length][length];
        for (int i = 0; i < arrayFor.length; i++) {
            System.out.println();
            for (int j = 0; j < arrayFor.length; j++) {
                if ((i == j) || (i + j == length - 1))
                    arrayFor[i][j] = 1;
                else
                    arrayFor[i][j] = 0;
                System.out.print(arrayFor[i][j] +"  ");
            }
        }


    }
    // Написать метод, принимающий на вход два аргумента: len и initialValue,
    // и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue
    public static int[] retArray (int len, int initialValue){
        int[] array5 = new int[len];
        System.out.println();
        for (int i = 0; i < array5.length; i++){
            array5[i] = initialValue;
        }
        return array5;

    }
    //Задать одномерный массив и найти в нем минимальный и максимальный элементы.
    private static void arrayMinMax() {
        int[] arrayMinMax = new int[10];
        for (int i = 0; i < arrayMinMax.length; i++) {
            arrayMinMax[i] = (int) (Math.random() * 10);
        }
            System.out.println(Arrays.toString(arrayMinMax) + " Исходный массив");
        Arrays.sort(arrayMinMax);
        System.out.println(arrayMinMax[0] + " - Минимальный элемент массива " + arrayMinMax[arrayMinMax.length - 1] + " - максимальный элемент массива");


        }
        //сделал,что успел, понимание по заданию с ** есть, с *** сложнее)









}


