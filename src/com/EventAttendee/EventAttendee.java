package com.EventAttendee;
import java.util.*;
public class EventAttendee {
    public static void main(String[] args) {

        List<String> attendees = Arrays.asList("Khushi", "Kajal", "Anjali", "Muskan");

        attendees.forEach(name ->
                System.out.println("Welcome " + name + " to the event!")
        );
    }
}
