package dicionario;

public class PalavraNaoEncontradaException extends RuntimeException {
    public PalavraNaoEncontradaException(){
        System.out.println("Palavra não encontrada no dicionário!");
    }
}
