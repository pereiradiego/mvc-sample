package br.com.zg.trainning.main

/**
 * Created by diegoalves on 12/04/16.
 */
import br.com.zg.trainning.controller.CampeonatoController
import br.com.zg.trainning.controller.TimeController
import br.com.zg.trainning.model.business.CampeonatoBusiness
import br.com.zg.trainning.model.business.Interface.Classificacao
import br.com.zg.trainning.model.business.Interface.Impl.Classificacao2015
import br.com.zg.trainning.model.business.interfaces.Classificacao
import br.com.zg.trainning.model.business.interfaces.impl.Classificacao2015
import br.com.zg.trainning.model.dao.CampeonatoDAO
import br.com.zg.trainning.model.dao.impl.CampeonatoDAOImpl
import br.com.zg.trainning.view.CampeonatoLinhaComandoView
import br.com.zg.trainning.view.CampeonatoLinhaDeComandoView
import br.com.zg.trainning.view.CampeonatoView
import br.com.zg.trainning.view.TimeLinhaComandoView
import br.com.zg.trainning.view.TimeLinhaDeComandoView
import br.com.zg.trainning.view.TimeView

class MainApplication {

	public static void main(String[] args) {
		executaAplicacao()
	}

	static void executaAplicacao(){
		TimeView timeView = new TimeLinhaComandoView()
		CampeonatoView campeonatoView = new CampeonatoLinhaComandoView()
		CampeonatoDAO campeonatoDAO = new CampeonatoDAOImpl()
		Classificacao classificacao = new Classificacao2015()

		CampeonatoBusiness campeonatoBusiness = new CampeonatoBusiness(campeonatoDAO)
		TimeController timeController = new TimeController(campeonatoBusiness, timeView)
		CampeonatoController campeonatoController = new CampeonatoController(campeonatoBusiness, timeController, campeonatoView, classificacao)

		campeonatoController.iniciaCampeonato()
	}
}
