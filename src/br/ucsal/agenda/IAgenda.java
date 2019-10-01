package br.ucsal.agenda;

public interface IAgenda {
	
	public void inserir(Contato contato);
	public void remover(String cpf);
	public Contato consultarPorCpf(String cpf);
	public Contato[] consultarPorBairro(String bairro);
	public Contato[] consultarPorCidade(String cidade);
	public void atualizar (Contato contato);
	public void imprimirContato (Contato contato);
	public void imprimirTodosContato();
	public void ordenaPorCpf(boolean reverse);
	public void ordenaPorNome(boolean reverse);
	public void ordenaPorDataDeNascimento(boolean reverse);
}
