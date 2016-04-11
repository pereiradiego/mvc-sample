package br.com.zg.trainning.model

import br.com.zg.trainning.model.dao.TimeDAO
import br.com.zg.trainning.model.dao.impl.TimeDAOImpl
import br.com.zg.trainning.model.entity.Time
import spock.lang.Specification

class TimeDAOSpec extends Specification {
	def 'Salvar'(){
		setup:
		TimeDAO timeDAO = new TimeDAOImpl()
		Time time = new Time();
		List<Time> times = []

		when:
		time.idTime = 1
		time.nomeTime = 'Ponte Preta'
		time.quantVitoria = 10
		time.quantDerrota = 11
		time.quantEmpate = 4
		time.quantGolPro = 14
		time.quantGolContra = 23
		times = timeDAO.salvar(times, time)

		then:
		times.size() == 1

	}
}
