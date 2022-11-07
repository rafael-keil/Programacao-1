package exeptions;

public class PersonagemJaEstaNoMapaException extends RuntimeException {
    public PersonagemJaEstaNoMapaException(){
        super("Personagem já está no mapa!");
    }
}
