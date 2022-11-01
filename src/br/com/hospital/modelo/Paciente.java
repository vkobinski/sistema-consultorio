// Done by: Victor Kobinski e Silva
// UEPG - State University of Ponta Grossa

package br.com.hospital.modelo;

public class Paciente {
	
	private Integer id;
	private String nomeCompleto;
	private String cpf;
	private String rg;
	private String dataDeNascimento;
	private String email;
	private String senha;
	private String telefone;
	private String escolaridade;
	private String nomeMae;
	private String profissao;
	private String cep;
	private String cidade;
	private String rua;
	private String bairro;
	private String numero;
	private String complemento;
	private String nacionalidade;
	private String uf;
	private String estadoCivil;
	private String sexo;
	private String tipoSanguineo;
	private String numeroCarteiraSus;
	
	public Paciente(String nomeCompleto, String cpf, String telefone, String email, String senha, String dataDeNascimento,   
			String cidade, String bairro, String cep, String uf, String estadoCivil, String rg, String nomeMae, String escolaridade, String profissao, String rua, 
			String complemento, String nacionalidade,    String sexo, String tipoSanguineo,
			String numeroCarteiraSus) {
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.rg = rg;
		this.senha = senha;
		this.dataDeNascimento = dataDeNascimento;
		this.email = email;
		this.nomeMae = nomeMae;
		this.telefone = telefone;
		this.escolaridade = escolaridade;
		this.profissao = profissao;
		this.cep = cep;
		this.cidade = cidade;
		this.rua = rua;
		this.bairro = bairro;
		this.complemento = complemento;
		this.nacionalidade = nacionalidade;
		this.uf = uf;
		this.estadoCivil = estadoCivil;
		this.sexo = sexo;
		this.tipoSanguineo = tipoSanguineo;
		this.numeroCarteiraSus = numeroCarteiraSus;
	}
	
	public Paciente(Integer id, String nomeCompleto, String cpf, String telefone, String email, String senha, String dataDeNascimento,   
			String cidade, String bairro, String cep, String uf, String estadoCivil, String rg, String nomeMae, String escolaridade, String profissao, String rua, 
			String complemento, String nacionalidade,    String sexo, String tipoSanguineo,
			String numeroCarteiraSus) {
		this.nomeCompleto = nomeCompleto;
		this.id = id;
		this.cpf = cpf;
		this.rg = rg;
		this.senha = senha;
		this.dataDeNascimento = dataDeNascimento;
		this.email = email;
		this.nomeMae = nomeMae;
		this.telefone = telefone;
		this.escolaridade = escolaridade;
		this.profissao = profissao;
		this.cep = cep;
		this.cidade = cidade;
		this.rua = rua;
		this.bairro = bairro;
		this.complemento = complemento;
		this.nacionalidade = nacionalidade;
		this.uf = uf;
		this.estadoCivil = estadoCivil;
		this.sexo = sexo;
		this.tipoSanguineo = tipoSanguineo;
		this.numeroCarteiraSus = numeroCarteiraSus;
	}
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public String getCpf() {
		return cpf;
	}
	public String getRg() {
		return rg;
	}
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public String getEmail() {
		return email;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getEscolaridade() {
		return escolaridade;
	}
	public String getProfissao() {
		return profissao;
	}
	public String getCep() {
		return cep;
	}
	public String getCidade() {
		return cidade;
	}
	public String getRua() {
		return rua;
	}
	public String getBairro() {
		return bairro;
	}
	public String getNumero() {
		return numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public String getUf() {
		return uf;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public String getSexo() {
		return sexo;
	}
	public String getTipoSanguineo() {
		return tipoSanguineo;
	}
	public String getNumeroCarteiraSus() {
		return numeroCarteiraSus;
	}

	public String getSenha() {
		return senha;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public Integer getId() {
		return id;
	}
	
	
	
}
