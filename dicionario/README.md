# dicionario.Dicionario

![dicionario](https://www.xerpa.com.br/blog/wp-content/uploads/sites/2/2019/09/dicionário-de-rh.jpg)

Neste exercício vamos modelar um dicionário que armazena palavras em Português e sua respectiva tradução para o Inglês, bem como palavras do Inglês e sua equivalente em Português.

## Classe dicionario.Dicionario.java

Esta será a classe central da aplicação e deve possuir como públicos **somente** os métodos explicados abaixo:

### adicionarPalavra()
Inicialmente, nosso dicionário será vazio e, por meio deste método, vamos cadastrando as palavras. Os parametros deste método devem ser a **palavra** do tipo String, a **traducao** desta palavra, também do tipo String, e o **dicionario** no qual ela será vinculada do tipo dicionario.TipoDicionario.

Por fim, o método deverá possuir a seguinte assinatura: 

`public void adicionarPalavra(String palavra, String traducao, dicionario.TipoDicionario dicionario)`

### traduzir()
Este método receberá como parâmetro a **palavra** pela qual se busca a tradução e o **dicionario** no qual ela deve ser pesquisada.

Quando a palavra não existir no dicionário pesquisado, o sistema deve lançar uma exceção do tipo `unchecked` chamada `dicionario.PalavraNaoEncontradaException`. 

O sistema também deve traduzir a palavra sem diferenciar letras maiúsculas e minúsculas.

Por fim, o método deverá possuir a seguinte assinatura: 

`public String traduzir(String palavra, dicionario.TipoDicionario dicionarioDeBusca)`

## Enumerador dicionario.TipoDicionario.java
Este enumerador será utilizado para classificar os dicionários de Inglês e Português. Sendo assim, seus valores deverão ser `INGLES` e `PORTUGUES`.

## Mapas
Devem ser utilizados os recursos do Map, conforme vistos em aula, para cadastrar as palavras onde a chave é a palavra pesquisada e o valor a sua tradução. Como dica final, crie um mapa para as palavras em Português e um mapa para as palavras do Inglês.

## Teste de Exemplo

```java
import dicionario.PalavraNaoEncontradaException;

@Test
public void deveTraduzirCarroELivroDoInglesParaPortuguesEDoPortuguesParaOIngles(){
        dicionario.Dicionario dicionario=new dicionario.Dicionario();
        dicionario.adicionarPalavra("Carro","Car",dicionario.TipoDicionario.INGLES);
        dicionario.adicionarPalavra("Livro","Book",dicionario.TipoDicionario.INGLES);
        dicionario.adicionarPalavra("Tiger","Tigre",dicionario.TipoDicionario.PORTUGUES);
        dicionario.adicionarPalavra("Paper","Papel",dicionario.TipoDicionario.PORTUGUES);

        assertEquals("Car",dicionario.traduzir("carro",dicionario.TipoDicionario.INGLES));
        assertEquals("Book",dicionario.traduzir("lIVRO",dicionario.TipoDicionario.INGLES));

        assertEquals("Papel",dicionario.traduzir("pApEr",dicionario.TipoDicionario.PORTUGUES));
        assertEquals("Tigre",dicionario.traduzir("TIGER",dicionario.TipoDicionario.PORTUGUES));
        }

@Test(expected = PalavraNaoEncontradaException.class)
public void deveLancarExceptionQuandoUmaPalavraNaoForEncontrada(){
        dicionario.Dicionario dicionario=new dicionario.Dicionario();
        dicionario.adicionarPalavra("Carro","Car",dicionario.TipoDicionario.INGLES);
        dicionario.adicionarPalavra("Livro","Book",dicionario.TipoDicionario.INGLES);

        String traducao=dicionario.traduzir("Caneta",dicionario.TipoDicionario.INGLES);
        }
```
## Testes Obrigatórios

* Devem existir **obrigatóriamente** na solução entregue testes unitários com os seguintes nomes:

    - deveTraduzirCarroELivroDoInglesParaPortuguesEDoPortuguesParaOIngles
    - deveLancarExceptionQuandoUmaPalavraNaoForEncontrada
