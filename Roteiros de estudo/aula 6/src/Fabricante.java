public class Fabricante {

    String nome;
    String site;
    String pais;

    public Fabricante(String nome, String site, String pais) {
        this.nome = nome;
        this.site = site;
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

}
