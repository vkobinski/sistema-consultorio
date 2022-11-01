// Done by: Victor Kobinski e Silva
// UEPG - State University of Ponta Grossa

package br.com.hospital.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.hospital.factory.ConnectionFactory;
import br.com.hospital.modelo.Paciente;

public class PacienteDAO {

	private Connection connection;
	
	public PacienteDAO() {
		this.connection = new ConnectionFactory().recuperarConexao();
	}
	
	public void adicionar(String nomeCompleto, String cpf, String rg, String dataDeNascimento, String email, String senha, String telefone,
			String escolaridade,String nomeMae, String profissao, String cep, String cidade, String rua, String bairro, String numero,
			String complemento, String nacionalidade, String uf, String estadoCivil, String sexo, String tipoSanguineo,
			String numeroCarteiraSus) {
		
		String sql = "INSERT INTO PACIENTE (nome, cpf, telefone, nome_usuario, senha, data_nascimento, cidade, bairro, cep, estado, estado_civil, rg, nome_mae, escolaridade, " +
		"profissao, rua, complemento, nacionalidade, sexo, tipo_sanguineo, numero_carteira_sus) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try{
			connection.setAutoCommit(false);
			}
		catch(SQLException e) {
			throw new RuntimeException(e);
		}
		
		try(PreparedStatement pst = this.connection.prepareStatement(sql)){
			
			pst.setString(1, nomeCompleto);
			pst.setString(2, cpf);
			pst.setString(3, telefone);
			pst.setString(4, email);
			pst.setString(5, senha);
			pst.setString(6, dataDeNascimento);
			pst.setString(7, cidade);
			pst.setString(8, bairro);
			pst.setString(9, cep);
			pst.setString(10, uf);
			pst.setString(11, escolaridade);
			pst.setString(12, estadoCivil);
			pst.setString(13, rg);
			pst.setString(13, nomeMae);
			pst.setString(14, escolaridade);
			pst.setString(15, profissao);
			pst.setString(16, rua);
			pst.setString(17, complemento);
			pst.setString(18, nacionalidade);
			pst.setString(19, sexo);
			pst.setString(20, tipoSanguineo);
			pst.setString(21, numeroCarteiraSus);
			pst.execute();
			connection.commit();
			
		}catch (SQLException e){
			throw new RuntimeException(e);
		}
		
	}
	
	public void adicionar(Paciente p) {
		
		String sql = "INSERT INTO PACIENTE (nome, cpf, telefone, nomeusuario, senha, data_nascimento, cidade, bairro, cep, estado, estado_civil, rg, nome_mae, escolaridade, " +
		"profissao, rua, complemento, nacionalidade, sexo, tipo_sanguineo, numero_carteira_sus) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try{
			connection.setAutoCommit(false);
			}
		catch(SQLException e) {
			throw new RuntimeException(e);
		}
		
		try(PreparedStatement pst = this.connection.prepareStatement(sql)){
			
			pst.setString(1, p.getNomeCompleto());
			pst.setString(2, p.getCpf());
			pst.setString(3, p.getTelefone());
			pst.setString(4, p.getEmail());
			pst.setString(5, p.getSenha());
			pst.setString(6, p.getDataDeNascimento());
			pst.setString(7, p.getCidade());
			pst.setString(8, p.getBairro());
			pst.setString(9, p.getCep());
			pst.setString(10, p.getUf());
			pst.setString(11, p.getEstadoCivil());
			pst.setString(12, p.getRg());
			pst.setString(13, p.getNomeMae());
			pst.setString(14, p.getEscolaridade());
			pst.setString(15, p.getProfissao());
			pst.setString(16, p.getRua());
			pst.setString(17, p.getComplemento());
			pst.setString(18, p.getNacionalidade());
			pst.setString(19, p.getSexo());
			pst.setString(20, p.getTipoSanguineo());
			pst.setString(21, p.getNumeroCarteiraSus());
			pst.execute();
			connection.commit();
			
		}catch (SQLException e){
			throw new RuntimeException(e);
		}
		
	}
	
	public List<Paciente> listar(){
		List<Paciente> pacientes = new ArrayList<Paciente>();
		String sql = "SELECT * FROM PACIENTE";
		try(PreparedStatement pst = connection.prepareStatement(sql)){
			pst.execute();
			
			ResultSet rs = pst.getResultSet();
			while(rs.next()) {
				pacientes.add(new Paciente(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19), rs.getString(20), rs.getString(21), rs.getString(22)));
			}
			
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return pacientes;
	}
	
	public Paciente procurar(Integer id) {
		String sql = "SELECT * FROM PACIENTE WHERE ID = ?";
		Paciente p = null;
		try(PreparedStatement pst = connection.prepareStatement(sql)){
			pst.setInt(1, id);
			pst.execute();
			ResultSet rs = pst.getResultSet();
			while(rs.next()) {
				p = new Paciente(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19), rs.getString(20), rs.getString(21), rs.getString(22));
			}
			
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return p;
	}
	
	public Paciente procurarPorNome(String nome) {
		String sql = "SELECT * FROM PACIENTE WHERE NOME = ?";
		Paciente p = null;
		try(PreparedStatement pst = connection.prepareStatement(sql)){
			pst.setString(1, nome);
			pst.execute();
			ResultSet rs = pst.getResultSet();
			while(rs.next()) {
				p = new Paciente(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19), rs.getString(20), rs.getString(21), rs.getString(22));
			}
			
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return p;
	}
	
	public Boolean procurarUsuarioSenha(String senha, String usuario) {
		String sql = "select nomeusuario, senha from paciente where senha = ?";
		try(PreparedStatement pst = connection.prepareStatement(sql)){
			pst.setString(1, senha);
			pst.execute();
			ResultSet rs = pst.getResultSet();
			while(rs.next()) {
				String sqlUsuario = rs.getString(1);
				String sqlSenha = rs.getString(2);
				
				
				if(sqlUsuario.equals(usuario) && sqlSenha.equals(senha)) {
					return true;
				}else {
					return false;
				}
			}
			
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return false;
	}
	
	
}
