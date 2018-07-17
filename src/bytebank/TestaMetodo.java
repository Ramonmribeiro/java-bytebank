package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		System.out.println("Saldo inicio contaDoPaulo: " + contaDoPaulo.saldo);
		
		boolean conseguiuRetirar = contaDoPaulo.saca(200);
		System.out.println(conseguiuRetirar);
		System.out.println("Novo saldo contaDoPaulo: " + contaDoPaulo.saldo);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		System.out.println("Primeiro saldo contaDaMarcela: " + contaDaMarcela.saldo);
		
		if(contaDaMarcela.transfere(1300, contaDoPaulo)){
			System.out.println("transferencia feita com sucesso");
		}else{
			System.out.println("transferencia não realizada, faltou saldo");
		}
		System.out.println("Saldo contaDaMarcela: " + contaDaMarcela.saldo);
		System.out.println("Saldo contaDoPaulo: " + contaDoPaulo.saldo);

	}

}
