
public class teste_aprendizes {
	public static void main(String[] args) {
		
		 Aprendiz aluno = new Aprendiz();
		aluno.setNome("Gabriel");
		aluno.setNumero(40028922);
		aluno.setParticipar(true);
		aluno.setTrazerDuvida("Como fazer o uso correto da heranca?");
		aluno.setCompletaDesafio("Desafio completo");
		aluno.setCompartilhar("O resultado do meu desafio esta no repositorio do meu gitHub");
		
		System.out.println(" aluno: " + aluno.getNome() + "\n identificacao: " + aluno.getNumeroIdentificacao() + 
				"\n presenca confirmada: " + aluno.getParticipar() + "\n duvida: " + aluno.getTrazerDuvida() + 
				"\n status do desafio: " + aluno.getCompletaDesafio() + "\n compartilhando: " + aluno.getCompartilhar()
				+ "\n total de alunos: " + Aprendiz.getTotal());
		
	}
}
