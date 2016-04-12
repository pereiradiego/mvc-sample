package br.com.zg.trainning.controller

import br.com.zg.trainning.model.business.Interface.Impl.Classificacao2015
import br.com.zg.trainning.model.entity.Campeonato
import br.com.zg.trainning.model.entity.Time

/**
 * Created by diegoalves on 12/04/16.
 */
class ClassificacaoController {
	Classificacao2015 classificacao2015 = new Classificacao2015()

	Time obtemCampeao(List<Time> timeList){
		classificacao2015.obtemCampeao(timeList)
	}

	Time obtemLanterna(List<Time> timeList){
		classificacao2015.obtemLanterna(timeList)
	}

	List<Time> obtemTabelaClassificacao(Campeonato campeonato){
		return classificacao2015.realizaClassificacao(campeonato.times)
	}
}
