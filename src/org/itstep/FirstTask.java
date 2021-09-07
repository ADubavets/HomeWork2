package org.itstep;

public class FirstTask {
    public static void main(String[] args) {

        /*Задание 1. Обнулить бит в нулевом разряде числа N. Остальные биты не должны изменить свое значение.
        Вывести на консоль в двоичном виде.*/
        byte ib = 0b01010101;
        byte resultExercise1 = (byte) ((~(1 << 0)) & ib);
        System.out.printf("Exercise 1: first binary number - %s. Result number - %s %n",
                Integer.toBinaryString(ib),
                Integer.toBinaryString(resultExercise1));

        /*Задание 3. Установить i-й бит числа N равным 1. Вывести результат на консоль в двоичном виде.*/
        byte resultExercise2 = (byte) ((1<<1) | resultExercise1);
        System.out.printf("Exercise 3: first binary number - %s. Result number - %s %n",
                Integer.toBinaryString(resultExercise1),
                Integer.toBinaryString(resultExercise2));

        /*Задание 5. Установить i-й бит числа N равным 0. Вывести результат на консоль в двоичном виде.*/
        byte resultExercise3 = (byte) (~(1<<4) & resultExercise2);
        System.out.printf("Exercise 5: first binary number - %s. Result number - %s %n",
                Integer.toBinaryString(resultExercise2),
                Integer.toBinaryString(resultExercise3));

        /*Задание 7. Определить значение i-го бита числа N. Вывести результат на консоль в двоичном виде.*/
        int high = 0;
        byte resultExercise4 = resultExercise3;
        while (high != 4) {
            resultExercise4 = (byte) (resultExercise3 >> high);
            high++;
        }
        if (resultExercise4 % 2 == 0)
            System.out.printf("Exercise 7: the value of the 4-th bit of the number %s - 0 %n",
                Integer.toBinaryString(resultExercise3),
                Integer.toBinaryString(resultExercise4));
        else
            System.out.printf("Exercise 7: the value of the " + high + " bit of the number %s - 1 %n",
                Integer.toBinaryString(resultExercise3),
                Integer.toBinaryString(resultExercise4));

        /*Задание 9. Определить, имеют ли числа M и N разные знаки, используя только побитовые и условные операторы.*/
        int m = -15;
        int n = 11;
        if (m < 0 && n > 0)
            System.out.printf("Exercise 9: A numbers %s and %s have different signs %n",
                    Integer.toString(m),
                    Integer.toString(n));
        else
            System.out.printf("Exercise 9: A numbers %s and %s have same signs %n",
                    Integer.toString(m),
                    Integer.toString(n));

        /*Задание 11. Посчитать и вывести на консоль количество единичных
        битов в числе N. Вывести на консоль исходное число в двоичном виде и результат.*/
        byte result = (byte) (n);
        high = 0;
        while (result != 0) {
            if (result % 2 == 1) high++;
            result = (byte) (result >> 1);
        }
        System.out.printf("Exercise 11: The number of single bits in the number " + n +
                " is " + high + " pieces {Bin: %s}.",Integer.toBinaryString(n));

    }
}
