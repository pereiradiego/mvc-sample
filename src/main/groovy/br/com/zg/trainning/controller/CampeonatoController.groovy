package br.com.zg.trainning.controller

import br.com.zg.trainning.model.business.CampeonatoBusiness
import br.com.zg.trainning.model.business.Interface.Classificacao
import br.com.zg.trainning.model.entity.Campeonato
import br.com.zg.trainning.model.entity.Time
import br.com.zg.trainning.view.CampeonatoView

/**
 * Created by diegoalves on 11/04/16.
 */
class CampeonatoController {

	public static final int SABER_CAMPEAO = 1
	public static final int SABER_LANTERNA = 2
	public static final int ENCERRAR = 0

	private CampeonatoBusiness campeonatoBusiness
	private TimeController timeController
	private CampeonatoView campeonatoView
	private Classificacao classificacao

	public CampeonatoController(CampeonatoBusiness campeonatoBusiness, TimeController timeController, CampeonatoView campeonatoView, Classificacao classificacao) {
		this.campeonatoBusiness = campeonatoBusiness
		this.timeController = timeController
		this.campeonatoView = campeonatoView
		this.classificacao = classificacao
	}

	void iniciaCampeonato() {
		Campeonato campeonato = criaCampeonato()
		pergunteOperacao(campeonato)
	}

	private Campeonato criaCampeonato() {
		String nome = campeonatoView.recebeNomeCampeonato()
		Campeonato campeonato = new Campeonato(nome: nome)

		timeController.salvarTime(campeonato)

		return campeonato
	}

	private void pergunteOperacao(Campeonato campeonato) {
		int operacao = campeonatoView.recebeOperacao().toInteger()

		switch (operacao) {
			case SABER_CAMPEAO:
				Time campeao = classificacao.obtemCampeao(campeonato.times)
				campeonatoView.exibeCampeao(campeao)

				pergunteOperacao(campeonato)
				break
			case SABER_LANTERNA:
				Time lanterna = classificacao.obtemLanterna(campeonato.times)
				campeonatoView.exibeLanterna(lanterna)

				pergunteOperacao(campeonato)
				break
			case ENCERRAR:
				break
		}
	}
}
