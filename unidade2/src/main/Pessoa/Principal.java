import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		//Conectando com o DB
		DAO dao = new DAO();
		dao.conectar();
		
		//Entrada de Dados
		Scanner input = new Scanner(System.in);
		String opcao;
		
		do{
			System.out.println("Escolha uma opção :");
			System.out.println("1) Listar");
			System.out.println("2) Inserir");
			System.out.println("3) Excluir");
			System.out.println("4) Atualizar");
			System.out.println("5) Sair");
			
			opcao = input.nextLine();
			
			if(opcao.equals("1")) {
				Usuario[] usuario = dao.getUsuarios();
				
				for(int i = 0; i < usuario.length; i++) {
					String saidaUsuario = usuario[i].toString();
					System.out.println(saidaUsuario);
				}
				
			}else if(opcao.equals("2")) {
				String login,senha,sexo;
				int codigo;
				
				System.out.println("Informe o codigo que deseja :");
				codigo = input.nextInt();
				
				//Limpar o buffer
				input.nextLine();
				
				System.out.println("Informe o login :");
				login = input.nextLine();
				
				System.out.println("Informe a senha :");
				senha = input.nextLine();
				
				System.out.println("Informe o sexo (M para masculino ou F para Feminino) :");
				sexo = input.nextLine();
				
				Usuario usuario = new Usuario(codigo,login,senha,sexo);
				
				if(dao.inserirUsuario(usuario) == true) {
					System.out.println("Adicionado com sucesso !");
				}else {
					System.out.println("Não foi possivel ser adicionado");
				}
			}else if(opcao.equals("3")) {
				int codigo;
				System.out.println("Informe o codigo do Usuario que deseja excluir :");
				codigo = input.nextInt();
				//Limpa Buffer
				input.nextLine();
				
				if(dao.excluirUsuario(codigo)) {
					System.out.println("Excluido com Sucesso");
				}else {
					System.out.println("Ocorreu um Problema !!");
				}
				
			}else if(opcao.equals("4")){
				String login,senha,sexo;
				int codigo;
				
				System.out.println("Informe o codigo do usuario que quer atualizar :");
				codigo = input.nextInt();
				//Limpa Buffer
				input.nextLine();
				
				System.out.println("Informe o novo login : ");
				login = input.nextLine();
				
				System.out.println("Informe a nova senha :");
				senha = input.nextLine();
				
				System.out.println("Informe o sexo do novo login :");
				sexo = input.nextLine();
				
				Usuario novoUsuario = new Usuario(codigo,login,senha,sexo);
				
				if(dao.atualizarUsuario(novoUsuario)) {
					System.out.println("Ocorreu tudo bem.");
				}else {
					System.out.println("Ocorreu um erro.");
				}
				
			}else if(!opcao.equals("5")){
				System.out.println("Opção não válida !!");
			}
			
		}while(!opcao.equals("5"));
		
		input.close();
	}
}
