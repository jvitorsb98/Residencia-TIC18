package empresaTransporte;

public class PontoDeParada {
	
	private static int numeroDePontos;
	
	private int id;
	private String nome;
	private String endereco;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public PontoDeParada(String nome, String endereco) {
		numeroDePontos++;
		id = numeroDePontos;
		this.nome = nome;
		this.endereco = endereco;
	}
	
	
	
	

}
