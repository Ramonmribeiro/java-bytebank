package bytebank;

public class TesteReferencia {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo da segunda:" + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("novo saldo segunda: " + segundaConta.saldo);
		System.out.println("novo saldo primeira: " + primeiraConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("São a mesma conta");
		}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
	}

}
