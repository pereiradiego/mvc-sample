package br.com.zg.trainning.view

import br.com.zg.trainning.model.entity.Time

/**
 * Created by diegoalves on 12/04/16.
 */
class CampeonatoLinhaComandoView extends EntradaDadosView implements CampeonatoView{

	String recebeIdCampeonato(){
		pergunte 'Qual o id do campeonato?'
	}

	String recebeNomeCampeonato() {
		pergunte 'Qual o nome do Campeonato?'
	}

	String recebeOperacao() {
		println ''
		println 'Selecione uma operação'
		println '[1] Saber o campeão'
		println '[2] Saber o lanterna'
		println '[3] Exibir tabela'
		println '[0] Encerrar'

		pergunte ''
	}

	void exibeCampeao(Time time) {
		println "O campeão é o $time.nomeTime!"
	}

	void exibeLanterna(Time time) {
		println "O lanterna é o $time.nomeTime!"
	}
	void exibeTabela(List<Time> times) {
		times.eachWithIndex { Time entry, int i ->
			println("${i+1} ${entry.nomeTime}")
		}
	}
}
