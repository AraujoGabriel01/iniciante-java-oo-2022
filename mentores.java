
public class mentores extends ministros {
	
	public mentores(String nome, String numeroIdentificacao) {
		super(nome, numeroIdentificacao);
	}

	public String nome;
	public String numeroIdentificacao;
	public String criaDesafio;
	public String revisaDesafio;

	public  String  getCriaDesafio () {
		return criaDesafio ;
	}

	public  void  setCriaDesafio ( String  criaDesafio ) {
		this.criaDesafio = criaDesafio ;
	}


	public  String  getRevisaDesafio () {
		return revisaDesafio;
	}

	public  void  setRevisaDesafios (String  revisaDesafio) {
		this.revisaDesafio = revisaDesafio;
	}
}
