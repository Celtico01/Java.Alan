package cursoJava.aula36.ex1;



public class TesteAula36 {

	public static void main(String[] args) {
		Agenda agenda0 = new Agenda("Alan's");
		
		Contato contato0 = new Contato();
		Contato contato1 = new Contato();
		Contato contato2 = new Contato();
		
		contato0.setNome("Alan");
		contato0.setEmail("alanmesquita2022@gmail.com");
		contato0.setTelefone("99 99999-9999");
		
		contato1.setNome("Murilo");
		contato1.setTelefone("xxxxx");
		contato1.setEmail("xxxxxxxxxx");
		
		contato2.setNome("Pedro Henrique");
		contato2.setTelefone("zzzzzzz");
		contato2.setEmail("zzzzzzzzzzzzzzzzz");
		
		Contato[] contatos = new Contato[3];
		
		contatos[0] = contato0;
		contatos[1] = contato1;
		contatos[2] = contato2;
		
		agenda0.setContatos(contatos);
		
		if(agenda0 != null && agenda0.getContatos() != null) {
			System.out.println("Nome: " + agenda0.getNome());
			for(Contato dado : agenda0.getContatos()) {
				System.out.println("----------------------------------------");
				System.out.println("Nome: " + dado.getNome());
				System.out.println("Email: " + dado.getEmail());
				System.out.println("Telefone: " + dado.getTelefone());
				System.out.println("----------------------------------------");
			}
		}
		
	
	}
}
