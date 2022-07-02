package com.example.clovertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CloverTestApplication {

	public static void main(String[] args) {
        String hoge = getHoge();
        String fuga = getFuga(10);
        String piyo;
        piyo = getPiyo(9,9);
        piyo = getPiyo(11,9);
        piyo = getPiyo(9,11);
        piyo = getPiyo(11,11);
        System.out.println("Hello World!:" + hoge + ":" + fuga + ":" + piyo);

        SpringApplication.run(CloverTestApplication.class, args);
	}

    public static String getHoge() {
        return "HogeHoge";
    }

    public static String getFuga(int y) {
        int x = 13;
        String fuga = "Fuga";

        if (x > 10) {
            fuga = "Fuga x > 10";
        }

        if (x < 10) {
            fuga = "x < 10";
        }

        if (x > 10 && y > 20) {
            fuga = "Fuga x > 10 And y > 20";
        }

        if (x > 10 || y > 20) {
            fuga = "Fuga x > 10 Or y > 20";
        }

        return fuga;
    }

    public static String getPiyo(int x, int y) {
        String piyo = "Piyo";
        if (x < 10 && y < 10) {
            piyo = "Piyo x > 10 And y > 10";
        } else if (x > 10 && y < 10) {
            piyo = "Piyo x > 10 And y < 10";
        } else if (x < 10 && y > 10) {
            piyo = "Piyo x < 10 And y > 10";
        } else if (x >= 10 && y >= 10) {
            piyo = "Piyo x > 10 And y > 10";
        }
        return piyo;
    }
}
