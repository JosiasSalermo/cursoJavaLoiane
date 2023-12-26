package aula13;

public class CurtoCircuito {
    public static void main(String[] args) {

        boolean verdadeiro = true;
        boolean falso = false;
        boolean resultado1 = falso & verdadeiro; // Verifica os 2
        boolean resultado2 = falso && verdadeiro; // Verifica apenas o primeiro
        System.out.println(resultado1);
        System.out.println(resultado2);
    }
}
