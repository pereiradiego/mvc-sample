package br.com.zg.trainning.model.dao

import br.com.zg.trainning.model.entity.Campeonato
import br.com.zg.trainning.model.entity.Time

/**
 * Created by diegoalves on 08/04/16.
 */
interface CampeonatoDAO {
	List<Campeonato> salvar(List<Campeonato> listaCampeonatos, Campeonato campeonato)
	Campeonato salvarTimes(Campeonato campeonato, List<Time> listaTimesParticipantes)
}
