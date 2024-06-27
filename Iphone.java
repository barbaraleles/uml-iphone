import java.util.Scanner;

public class Iphone implements ReprodutorMusical, NavegadorNaInternet, AparelhoTelefonico{
	Scanner sc = new Scanner(System.in);
	static String musica;
	static boolean continuarTocando = false;
	

    //AparelhoTelefonico
	public void ligar() {
		System.out.println("Disque o número:");
		String numeroTelefonico = sc.next();
		System.out.println("Chamando o número "+numeroTelefonico);
	}
	public void atender() {
		System.out.println("Chamada atendida.");
	}
	public void iniciarCorreioVoz() {
		System.out.println("Correio de voz iniciado.");
	}

    //NavegadorNaInternet
    public void exibirPagina() {
        System.out.println("Indique a url da página que deseja acessar:");
        String url = sc.next();
        System.out.println("Você está sendo redirecionado"+url);
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionada nova aba no seu navegador");
    }
    public void atualizarPagina() {
        System.out.println("Atualização realizado com sucesso.");
    }


	//ReprodutorMusical
	public void selecionarMusica() {
		System.out.printf("Selecione uma música: ");
		musica = sc.nextLine();
	}
	public void tocar() {
		continuarTocando = true;
		System.out.println("Música "+musica+" tocando.");
	}
	public void pausar() {
		continuarTocando = false;
		System.out.println("Música "+musica+" pausada.");
	}
	
}