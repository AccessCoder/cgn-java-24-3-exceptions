package de.neuefische;

import java.io.IOException;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kunde: DURST!");
        String beverage = orderFromWaiter();

        System.out.println("Kunde: Genießt " + beverage);


    }

    public static String orderFromWaiter() {
        System.out.println("Kellner: Bestellung aufgenommen");
        String beverage = null;
        try {
           beverage = getBeverageFromFridge().orElseThrow(() -> new Exception("Kühlschrank kaputt"));
       }catch (Exception e){
           beverage = "ein kaltes Bier aus einem anderen Kühlschrank";
       }
        System.out.println("Kellner: " + beverage + " geholt");
        return "ein eiskaltes " + beverage;
    }

    public static Optional<String> getBeverageFromFridge() {
       return Optional.ofNullable(null);
    }

    public static String getById(String id) throws IdNotFoundException {
        if (id.equals("1")){
            return "Hallo";
        }else {
            throw new IdNotFoundException("No Object with id: " + id);
        }
    }
}
