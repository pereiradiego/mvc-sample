package br.com.zg.trainning.controller

import br.com.zg.trainning.model.business.CampeonatoBusiness
import br.com.zg.trainning.model.entity.Campeonato

/**
 * Created by diegoalves on 11/04/16.
 */
class CampeonatoController {
	CampeonatoBusiness campeonatoBusiness = CampeonatoBusiness()

	List<Campeonato> salvarCampeonato(List<Campeonato> campeonatoList, Campeonato campeonato){
		campeonatoBusiness.salvar(campeonatoList, campeonato)
	}
}
