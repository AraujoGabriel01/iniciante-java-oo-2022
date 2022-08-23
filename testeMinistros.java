
public class testeMinistros {
	public static void main(String[] args) {
		
		organizadores organizador1 = new organizadores("Maria", "478359758-82");
		organizador1.setMinistraEventos("bate papo sobre o mundo java");
		organizador1.setInicioEvento("inicio do evento as 10:00");
		organizador1.setFimEvento("fim do evento as 11:30");
		
		
		mentores mentor1 = new mentores("Joao", "288579538-74");
		mentor1.setCriaDesafio("Desafio: fazer um sistema que represente o movimento codar !");
		mentor1.setMinistraEventos("Dicas para concluir o desafio");
		mentor1.setTiraDuvida("alguma duvida?");
		
		
		System.out.println("tema do evento: " + organizador1.getMinistraEventos() + "\n"+ organizador1.getInicioEvento() + "\n"
				+ organizador1.getFimEvento());
		
		
		System.out.println(mentor1.getCriaDesafio() + "\n" + "Tema do evento" + mentor1.getMinistraEventos() + "\n" 
				+ mentor1.getTiraDuvida());
		
	}
}
