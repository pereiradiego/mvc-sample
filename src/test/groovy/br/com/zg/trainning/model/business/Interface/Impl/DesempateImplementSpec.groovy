package br.com.zg.trainning.model.business.Interface.Impl

import spock.lang.Specification
import br.com.zg.trainning.model.entity.Time

/**
 * Created by diegoalves on 08/04/16.
 */
class DesempateImplementSpec extends Specification {
	def "RealizaDesempate"() {
		given:

		List<Time> times = []

		times += time1
		times += time2
		times += time3
		times += time4

		expect:

		times[0].idTime == 2
		times[1].idTime == 4
		times[2].idTime == 1
		times[3].idTime == 3

		where:

		time1 = new Time(idTime: 1, nomeTime: 'time 1', quantVitoria: 10, quantEmpate: 5, quantDerrota: 6, quantGolPro: 25, quantGolContra: 18)
		time2 = new Time(idTime: 2, nomeTime: 'time 2', quantVitoria: 12, quantEmpate: 7, quantDerrota: 2, quantGolPro: 28, quantGolContra: 15)
		time3 = new Time(idTime: 3, nomeTime: 'time 3', quantVitoria: 9, quantEmpate: 9, quantDerrota: 3, quantGolPro: 18, quantGolContra: 16)
		time4 = new Time(idTime: 4, nomeTime: 'time 4', quantVitoria: 12, quantEmpate: 5, quantDerrota: 4, quantGolPro: 24, quantGolContra: 12)

	}
}
