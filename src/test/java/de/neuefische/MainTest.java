package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

   @Test
    void getById() {
       try {
           //Wir versuchen die Methode auszuführen von der wir eine Exception erwarten
           Main.getById("2");
           //Fliegt unerwarteter Weise keine Exception, soll die fail methode den Test fehlschlagen lassen!
           fail("Expected Exception, but non was thrown");
       }catch (IdNotFoundException e){} //Fliegt, wie erwartet eine Exception, so darf der Test "durchlaufen" und wird grün!
    }

    @Test
    void getById2(){
       //Vergleicht die angegebene Exceptionklasse mit der tatsächlich "geworfenen" beim Ausführen der Methode
       assertThrows(IdNotFoundException.class, () -> Main.getById("2"));
    }
}