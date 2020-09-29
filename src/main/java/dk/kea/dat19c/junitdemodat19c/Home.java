package dk.kea.dat19c.junitdemodat19c;

import dk.kea.dat19c.junitdemodat19c.Service.Calculator;

import java.util.ArrayList;

public class Home {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        System.out.println(cal.add(17, 25));

    }
}
