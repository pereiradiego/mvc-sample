package br.com.zg.trainning.model.business

import br.com.zg.trainning.model.dao.CampeonatoDAO
import br.com.zg.trainning.model.dao.impl.CampeonatoDAOImpl
import br.com.zg.trainning.model.entity.*

/**
 * Created by diegoalves on 11/04/16.
 */
class CampeonatoBusiness {
	private CampeonatoDAO campeonatoDAO = new CampeonatoDAOImpl()

	List<Campeonato> salvar(List<Campeonato> campeonatoList){
		campeonatoDAO.salvar(campeonatoList)
	}

	Campeonato salvarTimes(Campeonato campeonato, List<Time> times){
		campeonatoDAO.salvarTimes(campeonato, times)
	}
}
