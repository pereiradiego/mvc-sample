package br.com.zg.trainning.model

import br.com.zg.trainning.model.entity.Campeonato
import spock.lang.Specification

class CampeonatoSpec extends Specification {

	def 'quando criar campeonato definir as propriedades corretamente'(){
		given:
		Campeonato campeonato = new Campeonato(
				idCampeonato: idCampeonato,
				nomeCampeonato: nomeCampeonato,
				quantRodadas: quantRodadas
		)

		expect:
		campeonato.idCampeonato == idCampeonato
		campeonato.nomeCampeonato == nomeCampeonato
		campeonato.quantRodadas == quantRodadas

		where:
		idCampeonato = 1
		nomeCampeonato = /Campeonato Brasileiro 2015/
		quantRodadas = 38
	}
}
