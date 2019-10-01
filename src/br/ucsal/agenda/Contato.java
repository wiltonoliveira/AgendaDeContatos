package br.ucsal.agenda;

import java.util.Date;


public class Contato implements IContato {

	
	String cpf, nome, email, numero,telefone, lougradouro, bairro, cidade;
	Date data;
	
	@Override
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String getCpf() {
		return cpf;
	}

	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String getEmail() {
		return email;
	}

	@Override
	public void setTelefone(String telefone) {
		this.telefone = telefone;		
	}

	@Override
	public String getTelefone() {
		return telefone;
	}

	@Override
	public void setLougradouro(String lougradouro) {
		this.lougradouro = lougradouro;		
	}

	@Override
	public String getLougradouro() {
		return lougradouro;
	}

	@Override
	public void setNumero(String num) {
		this.numero = num;		
	}

	@Override
	public String getNumero() {
		return numero;
	}

	@Override
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	@Override
	public String getBairro() {
		return bairro;
	}

	@Override
	public void setCidade(String cidade) {
		// TODO Auto-generated method stub
		this.cidade = cidade;
	}

	@Override
	public String getCidade() {
		// TODO Auto-generated method stub
		return cidade;
	}

	@Override
	public void setDataDeNascimento(Date data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Date getDataDeNascimento() {
		// TODO Auto-generated method stub
		return data;
	}

}
