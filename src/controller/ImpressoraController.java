package controller;

import br.edu.fateczl.filaobj.Fila;

public class ImpressoraController {

	public ImpressoraController() {
		super();
	}
	
	public void insereDocumento(Fila f, String documento) {
		f.insert(documento);
	}
	
	public void imprime(Fila f) {
		while (!f.isEmpty()) {
			try {
				String arquivo = (String) f.remove();
				String[] arquivoPartes = arquivo.split(";");
				System.out.println("[#PC: " + arquivoPartes[0] + " - Arquivo: " + arquivoPartes[1] + "]");
				double tempoImpressao = (Math.random()) + 1;
				Thread.sleep((long) tempoImpressao);
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
	}

}
