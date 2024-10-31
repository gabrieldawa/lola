package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import util.BDConfig;

public class ConexaoMysql {
	private Connection conexao;

	public ConexaoMysql() {
	}

	public Connection getConexao() {
		return conexao;
	}

	public void setConexao(Connection conexao) {
		this.conexao = conexao;
	}

	// abrirConexao
	public void abrirConexao() {
		try {
			String url = "jdbc:mysql://"+BDConfig.IP+":"+BDConfig.PORTA+"/"+BDConfig.NOME_BD;
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.conexao = DriverManager.getConnection(url, BDConfig.USUARIO, BDConfig.SENHA);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	// fecharConexao
	public void fecharConexao() {
		if (this.conexao != null) {
			try {
				this.conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}