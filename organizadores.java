
public class organizadores extends ministros {
	
	
	public organizadores(String nome, String numeroIdentificacao) {
		super(nome, numeroIdentificacao);
	}

	public String auxiliaProcesso;
	public String auxiliaRegra;
	
	public  String  getAuxiliaProcesso() {
		return auxiliaProcesso;
	}

	public  void  setAuxiliaProcesso(String  auxiliaProcesso) {
		this.auxiliaProcesso = auxiliaProcesso;
	}
	
	public  String  getAuxiliaRegra() {
		return auxiliaRegra;
	}

	public  void  setAuxiliaRegra(String  auxiliaRegra) {
		this.auxiliaRegra = auxiliaRegra;
	}
	
	
}
