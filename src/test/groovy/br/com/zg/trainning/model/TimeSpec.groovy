package br.com.zg.trainning.model

import br.com.zg.trainning.model.entity.Time
import spock.lang.Specification

class TimeSpec extends Specification {
	def 'quando criar um time definir as propriedades corretamente'(){
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

		expect:
		time.idTime == idTime

		where:
		idTime = 1
		nomeTime = 'Ponte Preta'
		quantVitoria = 10
		quantDerrota = 11
		quantEmpate = 4
		quantGolPro = 14
		quantGolContra = 23
	}
}
