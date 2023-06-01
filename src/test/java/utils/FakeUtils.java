package utils;

import com.github.javafaker.Faker;

public class FakeUtils {

    public static String getFakeBookName() {
        return new Faker().harryPotter().spell();
    }
}
