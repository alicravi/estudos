

import javax.swing.JOptionPane;

public class TesteTestando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TesteBoolean tb = new TesteBoolean();
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Entre com um numero: "));
		
		boolean result = tb.testando(num);
			
		if (!result){
			System.out.println("Numero diferente de 2!");
		} else {
			System.out.println("Numero igual a 2!");
		}

	}

}
