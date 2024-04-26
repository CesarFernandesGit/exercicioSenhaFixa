import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int senha = 2002;

		System.out.printf("Digite a senha: ");
		senha = scanner.nextInt();
		
		while(senha != 2002) {
			System.out.printf("Senha Invalida! Tente novamente: ");
			senha = scanner.nextInt();
		}
		
		System.out.println("Acesso permitido!");
		
		scanner.close();
	}
	

}
