package br.com.eduardo.gerenciador.servlet;

import java.util.Date;

public class Empresa {
	private Integer id;
	private String nome;
	private Date dataAbertura = new Date();
	public Integer getID() {
		return id;
	}
	public void setID(Integer iD) {
		id = iD;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
}
