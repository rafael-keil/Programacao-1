
public class Aluno {

	// Atributos
	String nome;
	double media;
	
	//construtor
	public Aluno() {
		
	}
	
	//construtor
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	//exibir estado
	void exibeEstado() {
		System.out.println("M�dia do aluno " + nome + " � " + media);
	}
	
	public static void main(String args[]) {
		Aluno a = new Aluno();
		a.exibeEstado();

		Aluno a1;
		a1 = new Aluno("Amanda");
		a1.exibeEstado();
	}
}
