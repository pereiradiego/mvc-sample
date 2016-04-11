package br.com.zg.trainning.model.business.Interface.Impl

import spock.lang.Specification
import br.com.zg.trainning.model.entity.Time
import br.com.zg.trainning.model.business.Interface.CalculaPontuacao

/**
 * Created by diegoalves on 11/04/16.
 */
class CalculaPontuacao2015Spec extends Specification {
	def "calculaPontuacaoTotal"() {
		setup:
		Time time = new Time()
		CalculaPontuacao2015 calculaPontuacao = new CalculaPontuacao2015()
		int pontuacao

		when:
		time.idTime = 1
		time.nomeTime = 'Ponte Preta'
		time.quantVitoria = 10
		time.quantDerrota = 11
		time.quantEmpate = 4
		time.quantGolPro = 14
		time.quantGolContra = 23

		pontuacao = calculaPontuacao.calculaPontuacaoTotal(time)


		then:
		pontuacao == 34
	}
}