package negociacao;

public class Negociacao {

    public boolean negociar(clube.Clube clubeInteressado, jogador.Jogador jogadorDeInteresse){

        if(jogadorDeInteresse.estaInteressado(clubeInteressado) && clubeInteressado.getSaldo() > jogadorDeInteresse.valorDeCompra()){

            clubeInteressado.atualizaSaldo(jogadorDeInteresse.valorDeCompra());

            jogadorDeInteresse.setClubeAtual(clubeInteressado);

            return true;

        }

        return false;

    }
}
