public class ObjectNew implements Movimenta{

    private String propriedade;
    private String valor;
    private int x;
    private int y;

    public ObjectNew() {

    }

    public void setPropriedade(String propriedade) {
        this.propriedade = propriedade;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void sobe(){
        y++;
    }

    public void desce(){
        y--;
    }

    public static void main(String args[]){
        System.out.println("Hello...");

        ObjectNew on = new ObjectNew();

        on.setPropriedade("p1");

        on.setValor ("1");
    }
}
