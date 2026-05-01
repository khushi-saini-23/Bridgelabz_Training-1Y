package com.IOT;
import java.util.*;
public class IOTSensor {
    public static void main(String[] args) {

        List<Double> readings = Arrays.asList(95.5, 39.2, 13.9, 80.0, 20.1);

        double threshold = 22.0;

        readings.stream()
                .filter(r -> r > threshold)
                .forEach(r -> System.out.println("Reading: " + r));
    }
}
