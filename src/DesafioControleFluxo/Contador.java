package DesafioControleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int parametro1 = teclado.nextInt();
        int parametro2 = teclado.nextInt();

        try{
            if(parametro1 < parametro2){
                contar(parametro1, parametro2);
            } else {
                throw new ParametrosInvalidosException();
            }
        } catch(ParametrosInvalidosException exception){
            System.out.println("Erro: " + exception.getMessage());
        }
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
        int contagem = parametro2 - parametro1;

        for(int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
}
