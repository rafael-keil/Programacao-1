package exeptions;

public class PosicaoOcupadaException extends RuntimeException {
    public PosicaoOcupadaException(){
        super("Posição já ocupada!");
    }
}
