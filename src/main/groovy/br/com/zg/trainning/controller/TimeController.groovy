package br.com.zg.trainning.controller

import br.com.zg.trainning.model.business.TimeBusiness
import br.com.zg.trainning.model.entity.*

/**
 * Created by diegoalves on 11/04/16.
 */
class TimeController {
	TimeBusiness timeBusiness = new TimeBusiness()

	List<Time> salvarTime(List<Time> times, Time time){
		timeBusiness.salvar(times, time)
	}
}
