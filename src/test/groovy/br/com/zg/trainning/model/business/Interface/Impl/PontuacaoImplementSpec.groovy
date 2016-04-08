package br.com.zg.trainning.model.business.Interface.Impl

import spock.lang.Specification
import br.com.zg.trainning.model.entity.Time

/**
 * Created by diegoalves on 08/04/16.
 */
class PontuacaoImplementTest extends Specification {
	def "CalculaPontuacao"() {
		given:
		given:
		Time time = new Time(
				idTime: idTime,
				nomeTime: nomeTime,
				quantVitoria: quantVitoria,
				quantDerrota: quantDerrota,
				quantEmpate: quantEmpate,
				quantGolPro: quantGolPro,
				quantGolContra: quantGolContra,
		)
		int pontuacao = pontuacao

		expect:


		where:
		idTime = 1
		nomeTime = 'Ponte Preta'
		quantVitoria = 10
		quantDerrota = 11
		quantEmpate = 4
		quantGolPro = 14
		quantGolContra = 23

		pontuacao = 34

	}
}
