package br.com.zg.trainning.view

import br.com.zg.trainning.model.entity.Time

/**
 * Created by diegoalves on 12/04/16.
 */
interface CampeonatoView {
	String recebeIdCampeonato()
	String recebeNomeCampeonato()
	String recebeOperacao()

	void exibeCampeao(Time time)
	void exibeLanterna(Time time)
	void exibeTabela(List<Time> time)
}
