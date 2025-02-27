
public class Usuario {
	
		private int codigo;
		private String login;
		private String senha;
		private String sexo;
		
		public Usuario() {
			this.codigo = -1;
			this.login = "";
			this.senha = "";
			this.sexo = "";
		}
		
		public Usuario(int codigo, String login, String senha, String sexo) {
			this.codigo = codigo;
			this.login = login;
			this.senha = senha ;
			this.sexo =  sexo;
		}
		
		
		public int getCodigo() {
			return codigo;
		}

		public void setId(int codigo) {
			this.codigo = codigo;
		}

		public String getLogin() {
			return login;
		}

		public void setNome(String login) {
			this.login = login;
		}

		public String getSenha() {
			return senha;
		}

		public void setEpisodios(String senha) {
			this.senha = senha;
		}

		public String getSexo() {
			return sexo;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		}

		@Override
		public String toString() {
			return "Usuarios : [Codigo = " + codigo + ", Login = " + login + ", Senha = " + senha + ", Sexo = " + sexo + "]";
		}

		
		
	
}
