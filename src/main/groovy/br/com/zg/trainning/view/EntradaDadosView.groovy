package br.com.zg.trainning.view

/**
 * Created by diegoalves on 12/04/16.
 */
class EntradaDadosView {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in))

	protected static String pergunte(String pergunta) {
		print "$pergunta"
		String resposta = br.readLine()
		println ''
		return resposta
	}
}
