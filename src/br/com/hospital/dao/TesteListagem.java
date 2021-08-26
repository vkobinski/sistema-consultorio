package br.com.hospital.dao;

import java.util.List;

import br.com.hospital.modelo.Paciente;

public class TesteListagem {

	public static void main(String[] args) {
		List<Paciente> pacientes = new PacienteDAO().listar();
		pacientes.forEach(p -> System.out.println(p.getId() + " - " + p.getNomeCompleto()));
		
	}
	
}
