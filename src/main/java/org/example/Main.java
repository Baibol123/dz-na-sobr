package org.example;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        test(23, 10);
        test(generateRandomAge(), 10);
    }

    public static int generateRandomAge() {
        Random random = new Random();
        int minAge = 1; // Минимальный возраст
        int maxAge = 100; // Максимальный возраст
        return random.nextInt(maxAge - minAge + 1) + minAge;
    }

    public static void test(int age, int legalAge) {
        System.out.println("Возраст: " + age);
        if (age >= legalAge) {
            System.out.println("Можно идти гулять");
        } else {
            System.out.println("Нельзя идти гулять");
        }
    }
}