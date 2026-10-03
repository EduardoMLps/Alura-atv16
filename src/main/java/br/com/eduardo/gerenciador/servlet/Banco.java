package br.com.eduardo.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	public void adicionar(Empresa empresa) {
		empresa.setID(Banco.chaveSequencial++);
		lista.add(empresa);
	}

	public List<Empresa> getLista() {
		return lista;
	}

	public static void setLista(List<Empresa> lista) {
		Banco.lista = lista;
	}

}
