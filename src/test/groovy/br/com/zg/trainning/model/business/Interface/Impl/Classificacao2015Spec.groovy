package br.com.zg.trainning.model.business.Interface.Impl

import spock.lang.Specification
import br.com.zg.trainning.model.entity.Time

/**
 * Created by diegoalves on 08/04/16.
 */
class Classificacao2015Spec extends Specification {
	def "RealizaDesempate"() {
		setup:
		List<Time> times = []
		Classificacao2015 classificacao2015 = new Classificacao2015()

		times += new Time(idTime: 2, nomeTime: 'time 2', quantVitoria: 12, quantEmpate: 4, quantDerrota: 5, quantGolPro: 28, quantGolContra: 15)
		times += new Time(idTime: 1, nomeTime: 'time 1', quantVitoria: 10, quantEmpate: 6, quantDerrota: 5, quantGolPro: 25, quantGolContra: 18)
		times += new Time(idTime: 3, nomeTime: 'time 3', quantVitoria: 10, quantEmpate: 6, quantDerrota: 5, quantGolPro: 18, quantGolContra: 16)

		when:
		times = classificacao2015.realizaDesempate(times)

		then:
		times.each {
			println it.idTime
		}
		times[0].idTime == 2
		times[1].idTime == 1
		times[2].idTime == 3

	}
}
