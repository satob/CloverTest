package com.example.clovertest;

import java.io.FileNotFoundException;

import org.springframework.stereotype.Service;

import java11.Java11VarInLambdaParameter;

@Service
public class CloverTestService {

    public void testJava9Grammer() throws FileNotFoundException {
        java9.DiamondOperatorWithAnonymousClass.main(null);
        java9.InterfacePrivateMethod.main(null);
    }

    public void testJava11Grammer() {
        Java11VarInLambdaParameter v = new Java11VarInLambdaParameter();
        v.varInLambdaParameter();
    }

    public void testJava16Grammer() throws FileNotFoundException {
        java16.StaticMemberInInternalClass.main(null);
    }

    public void testBasicGrammer() {
        String hoge = getHoge();
        String fuga = getFuga(10);
        String piyo;
        piyo = getPiyo(9,9);
        piyo = getPiyo(11,9);
        piyo = getPiyo(9,11);
        piyo = getPiyo(11,11);
        System.out.println("Hello World!:" + hoge + ":" + fuga + ":" + piyo);
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
