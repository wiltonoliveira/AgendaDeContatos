package br.ucsal.agenda;

import java.util.Date;

public interface IContato {
	
	public void setCpf (String cpf);
	public String getCpf();
	public void setNome(String nome);
	public String getNome();
	public void setEmail(String email);
	public String getEmail();
	public void setTelefone (String telefone);
	public String getTelefone();
	public void setLougradouro (String lougradouro);
	public String getLougradouro();
	public void setNumero(String num);
	public String getNumero();
	public void setBairro(String bairro);
	public String getBairro();
	public void setCidade(String cidade);
	public String getCidade();
	public void setDataDeNascimento(Date data);
	public Date getDataDeNascimento();
}
