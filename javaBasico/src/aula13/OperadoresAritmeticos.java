package aula13;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int resultado = 1 + 2;
        System.out.println(resultado);

        // Subtração
        resultado = resultado - 1;
        System.out.println(resultado);

        // Multiplicação
        resultado = resultado * 2;
        System.out.println(resultado);

        // Divisão
        resultado = resultado / 2;
        System.out.println(resultado);

        // Soma
        resultado = resultado + 8;
        System.out.println(resultado);

        // Módulo
        resultado = resultado % 7;
        System.out.println(resultado);

        // Concatenação
        String primeiroNome = "Esta é ";
        String segundoNome = "uma String concatenada.";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);

        // Incrementar
        resultado = resultado + 1;
        System.out.println(resultado);

        resultado++;
        System.out.println(resultado); // 5

        System.out.println(resultado++);
        /* Mesma coisa que
        * System.out.println(resultado);
        * resultado = resultado + 1;
        * ou
        * resultado += 1;
        * */

        System.out.println(++resultado); // 7
        /*Mesma coisa que
        * resultado +=1;
        * System.out.println(resultado);
        * */

        // Decremento
        resultado--;
        System.out.println(resultado);// 6

        System.out.println(resultado--); // 6
        System.out.println(--resultado); // 4

    }
}
