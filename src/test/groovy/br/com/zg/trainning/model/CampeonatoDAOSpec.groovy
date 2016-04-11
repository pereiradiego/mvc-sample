package br.com.zg.trainning.model

import br.com.zg.trainning.model.dao.CampeonatoDAO
import br.com.zg.trainning.model.dao.impl.CampeonatoDAOImpl
import br.com.zg.trainning.model.entity.Campeonato
import spock.lang.Specification

class CampeonatoDAOSpec extends Specification {

	def 'campeonatoSalvar'(){
		setup:
		CampeonatoDAO campeonatoDAO = new CampeonatoDAOImpl()
		List<Campeonato> listaCampeonato = []
		Campeonato campeonato = new Campeonato()

		when:

		campeonato.idCampeonato = 1
		campeonato.nomeCampeonato = /Campeonato Brasileiro 2015/
		campeonato.quantRodadas = 38
		listaCampeonato = campeonatoDAO.salvar(listaCampeonato,campeonato)

		then:
		listaCampeonato.size() == 1
	}
}
