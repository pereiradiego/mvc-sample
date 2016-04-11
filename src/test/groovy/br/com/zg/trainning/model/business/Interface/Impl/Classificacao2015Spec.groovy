package br.com.zg.trainning.model.business.Interface.Impl

import spock.lang.Specification
import br.com.zg.trainning.model.entity.Time

/**
 * Created by diegoalves on 08/04/16.
 */
class Classificacao2015Spec extends Specification {

	Classificacao2015 classificacao2015 = new Classificacao2015()

	def "realizaDesempate"() {
		setup:
		List<Time> times = []

		times += new Time(idTime: 2, nomeTime: 'time 2', quantVitoria: 12, quantEmpate: 4, quantDerrota: 5, quantGolPro: 28, quantGolContra: 15)
		times += new Time(idTime: 1, nomeTime: 'time 1', quantVitoria: 10, quantEmpate: 6, quantDerrota: 5, quantGolPro: 25, quantGolContra: 18)
		times += new Time(idTime: 3, nomeTime: 'time 3', quantVitoria: 10, quantEmpate: 6, quantDerrota: 5, quantGolPro: 18, quantGolContra: 16)

		when:
		times = classificacao2015.realizaDesempate(times)

		then:
		times[0].idTime == 2
		times[1].idTime == 1
		times[2].idTime == 3

	}

	def "realizaClassificacao"(){
		setup:
		List<Time> times =[]

		times += new Time(idTime: 2, nomeTime: 'time 2', quantVitoria: 12, quantEmpate: 4, quantDerrota: 5, quantGolPro: 28, quantGolContra: 15)
		times += new Time(idTime: 1, nomeTime: 'time 1', quantVitoria: 10, quantEmpate: 6, quantDerrota: 5, quantGolPro: 25, quantGolContra: 18)
		times += new Time(idTime: 3, nomeTime: 'time 3', quantVitoria: 10, quantEmpate: 6, quantDerrota: 5, quantGolPro: 18, quantGolContra: 16)

		when:

		times = classificacao2015.realizaClassificacao(times)

		then:
		times[0].idTime == 2
		times[1].idTime == 1
		times[2].idTime == 3
	}

	def "obtemCampeao"(){
		setup:
		List<Time> times = []
		Time campeao = new Time()

		times += new Time(idTime: 2, nomeTime: 'time 2', quantVitoria: 12, quantEmpate: 4, quantDerrota: 5, quantGolPro: 28, quantGolContra: 15)
		times += new Time(idTime: 1, nomeTime: 'time 1', quantVitoria: 10, quantEmpate: 6, quantDerrota: 5, quantGolPro: 25, quantGolContra: 18)
		times += new Time(idTime: 3, nomeTime: 'time 3', quantVitoria: 10, quantEmpate: 6, quantDerrota: 5, quantGolPro: 18, quantGolContra: 16)

		when:
		campeao = classificacao2015.obtemCampeao(times)

		then:
		campeao == times[0]
	}

	def "obtemLanterna"(){
		setup:
		List<Time> times = []
		Time lanterna = new Time()

		times += new Time(idTime: 2, nomeTime: 'time 2', quantVitoria: 12, quantEmpate: 4, quantDerrota: 5, quantGolPro: 28, quantGolContra: 15)
		times += new Time(idTime: 1, nomeTime: 'time 1', quantVitoria: 10, quantEmpate: 6, quantDerrota: 5, quantGolPro: 25, quantGolContra: 18)
		times += new Time(idTime: 3, nomeTime: 'time 3', quantVitoria: 10, quantEmpate: 6, quantDerrota: 5, quantGolPro: 18, quantGolContra: 16)

		when:
		lanterna = classificacao2015.obtemLanterna(times)

		then:
		lanterna == times[2]
	}
}
