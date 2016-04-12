package br.com.zg.trainning.view

/**
 * Created by diegoalves on 12/04/16.
 */
class TimeLinhaComandoView extends EntradaDadosView implements TimeView{

	String recebeIdTime() {
		pergunte 'Qual o id do Time'
	}

	String recebeNomeTime(){
		pergunte 'Qual o nome do time?'
	}

	String recebeQuantVitoria(){
		pergunte 'Qual o número de vitórias?'
	}

	String recebeQuantEmpate(){
		pergunte 'Qual o número de empates?'
	}

	String recebeQuantDerrota(){
		pergunte 'Qual o número de derrotas?'
	}

	String recebeQuantGolPro(){
		pergunte 'Qual o número de gols pro?'
	}

	String recebeQuantGolContra(){
		pergunte 'Qual o número de gols contra?'
	}

	String recebeCadastrarNovoTime(){
		pergunte 'Deseja cadastrar novo time?'
	}
}
