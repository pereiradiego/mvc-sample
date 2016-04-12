package br.com.zg.trainning.controller

import br.com.zg.trainning.model.business.CampeonatoBusiness
import br.com.zg.trainning.model.business.TimeBusiness
import br.com.zg.trainning.model.entity.*
import br.com.zg.trainning.view.TimeView

/**
 * Created by diegoalves on 11/04/16.
 */
class TimeController {
	CampeonatoBusiness campeonatoBusiness
	TimeView timeView

	TimeController(CampeonatoBusiness campeonatoBusiness, TimeView timeView) {
		this.campeonatoBusiness = campeonatoBusiness
		this.timeView = timeView
	}

	Campeonato adicioneTimes(Campeonato campeonato) {
		adicioneTime(campeonato)
	}

	private Campeonato adicioneTime(Campeonato campeonato) {
		String nome = timeView.recebeNomeTime()
		int vitorias = timeView.recebeQuantVitoria().toInteger()
		int empates = timeView.recebeQuantEmpate().toInteger()
		int derrotas = timeView.recebeQuantDerrota().toInteger()
		int golsPro = timeView.recebeQuantGolPro().toInteger()
		int golsContra = timeView.recebeQuantGolContra().toInteger()

		Time time = new Time(
				nomeTime: nome,
				quantVitoria: vitorias,
				quantEmpate: empates,
				quantDerrota: derrotas,
				quantGolPro: golsPro,
				quantGolContra: golsContra
		)

		campeonato = campeonatoBusiness.salvarTimes(campeonato, time)
		String maisTimes = timeView.recebeCadastrarNovoTime()

		if (maisTimes == 'S' || maisTimes == 's') {
			adicioneTime(campeonato)
		}

		return campeonato
	}


	TimeBusiness timeBusiness = new TimeBusiness()

	List<Time> salvarTime(List<Time> times, Time time){
		timeBusiness.salvar(times, time)
	}

}
