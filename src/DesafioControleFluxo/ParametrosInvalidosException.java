package DesafioControleFluxo;

import java.util.Scanner;

public class ParametrosInvalidosException extends Exception{
    @Override
    public String getMessage() {
        return "o 2ª parâmetro deve ser maior que o 1ª";
    }
}
