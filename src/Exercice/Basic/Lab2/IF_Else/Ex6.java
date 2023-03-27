package Exercice.Basic.Lab2.IF_Else;

import java.time.LocalDate;

public class Ex6 {
    public static void main(String[] args) {
        // Obținem data curentă
        LocalDate dataCurenta = LocalDate.now();
        System.out.println("Data zilei curente este ="+dataCurenta);
        // Obținem data zilei următoare
        LocalDate dataUrmatoare = dataCurenta.plusDays(1);

        // Afisam rezultatul
        System.out.println("Data zilei urmatoare este: " + dataUrmatoare);
    }
}
