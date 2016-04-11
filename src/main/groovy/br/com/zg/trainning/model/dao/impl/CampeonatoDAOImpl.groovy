package br.com.zg.trainning.model.dao.impl

import br.com.zg.trainning.model.dao.CampeonatoDAO
import br.com.zg.trainning.model.entity.Campeonato
import br.com.zg.trainning.model.entity.Time

/**
 * Created by diegoalves on 08/04/16.
 */
class CampeonatoDAOImpl implements CampeonatoDAO{
	List<Campeonato> salvar(List<Campeonato> listaCampeonatos, Campeonato campeonato){
		listaCampeonatos += campeonato

		return listaCampeonatos
	}

	Campeonato salvarTimes(Campeonato campeonato, List<Time> timesParticipantes){
		campeonato.times = timesParticipantes
	}

}
