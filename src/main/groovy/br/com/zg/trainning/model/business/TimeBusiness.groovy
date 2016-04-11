package br.com.zg.trainning.model.business

import br.com.zg.trainning.model.dao.TimeDAO
import br.com.zg.trainning.model.dao.impl.TimeDAOImpl
import br.com.zg.trainning.model.entity.*

/**
 * Created by diegoalves on 11/04/16.
 */
class TimeBusiness {
	private TimeDAO timeDAO = new TimeDAOImpl()

	List<Time> salvar(List<Time> times, Time time){
		timeDAO.salvar(times, time)
	}
}
