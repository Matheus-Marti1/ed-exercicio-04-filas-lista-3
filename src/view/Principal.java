package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.filaobj.Fila;
import controller.ImpressoraController;

public class Principal {

	public static void main(String[] args) {
		Fila f = new Fila();
		ImpressoraController iCont = new ImpressoraController();
		int opc = 0;
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(
					"Insira a opção desejada:\n1 - Inserir documento para impressão\n2 - Imprimir documentos\n9 - Sair"));
			switch (opc) {
			case 1:
				StringBuilder documentoBuilder = new StringBuilder();
				documentoBuilder.append(JOptionPane.showInputDialog("Insira o ID do PC:"));
				documentoBuilder.append(";");
				documentoBuilder.append(JOptionPane.showInputDialog("Insira o nome do documento:"));
				String documento = documentoBuilder.toString();
				iCont.insereDocumento(f, documento);
				break;

			case 2:
				iCont.imprime(f);
				break;
			case 9:
				System.exit(0);
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida. Insira novamente.");
			}
		}

	}

}
