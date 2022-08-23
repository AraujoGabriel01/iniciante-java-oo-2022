
public class Aprendiz {
	private String nome;
    private int numeroIdentificacao;
    public String completaDesafio;
    public String compartilhar;
    public boolean participar;
    public String trazerDuvida;
	private static int total = 0;
	
	public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
       if(nome == null) {
           System.out.println("Nome inválido. Informe seu nome para continuar!");
           return;
       }
       this.nome = nome;
    }
	
	
	public int getNumeroIdentificacao(){
        return this.numeroIdentificacao;
    }

    public void setNumero(int numeroIdentificacao){
        if(numeroIdentificacao <= 0) {
            System.out.println("Identificacao inválida. Informe seu numero de identificacao para continuar!");
            return;
        }
        this.numeroIdentificacao = numeroIdentificacao;
    }
   
	public String getCompletaDesafio() {
		return completaDesafio;
	}
	
	public void setCompletaDesafio(String completaDesafio) {
		this.completaDesafio = completaDesafio;
	}
	
	public String getCompartilhar() {
		return compartilhar;
	}
	
	public void setCompartilhar(String compartilhar) {
		this.compartilhar = compartilhar;
	}
	
	public boolean getParticipar() {
		return this.participar;
	}
	
	public void setParticipar(boolean participar) {
		if(participar == false) {
			System.out.println("voce não confirmou sua presença!");
			return;
		} this.participar = participar;
	}
	
	public String getTrazerDuvida() {
		return trazerDuvida;
	}
	
	public void setTrazerDuvida(String trazerDuvida) {
		this.trazerDuvida = trazerDuvida;
	}
	
	public static int getTotal(){
        return Aprendiz.total;
    }
}