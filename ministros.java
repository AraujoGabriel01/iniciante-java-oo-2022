
public class ministros {
	public String nome;
	public String numeroIdentificacao;
	public String ministraEvento;
	public String inicioEvento;
	public String fimEvento;
	public String tiraDuvida;
	
	public ministros(String nome, String numeroIdentificacao) {
		this.nome = nome;
		this.numeroIdentificacao = numeroIdentificacao;
		//System.out.println("mentor instanciado: " + numeroIdentificacao);
	}
	 
	
	public  String  getMinistraEventos() {
		return  ministraEvento;
	}

	public  void  setMinistraEventos(String ministraEvento) {
		this.ministraEvento = ministraEvento;
	}
	
	public  String  getInicioEvento() {
		return  inicioEvento;
	}

	public  void  setInicioEvento(String inicioEvento) {
		this.inicioEvento = inicioEvento;
	}
	
	public  String  getFimEvento() {
		return  inicioEvento;
	}

	public  void  setFimEvento(String fimEvento) {
		this.fimEvento = fimEvento;
	}
	
	public  String  getTiraDuvida() {
		return  inicioEvento;
	}

	public  void  setTiraDuvida(String tiraDuvida) {
		this.tiraDuvida = tiraDuvida;
	}
}
