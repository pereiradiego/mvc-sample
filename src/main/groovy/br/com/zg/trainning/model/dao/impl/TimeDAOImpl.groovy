package br.com.zg.trainning.model.dao.impl

import br.com.zg.trainning.model.dao.TimeDAO
import br.com.zg.trainning.model.entity.Time

/**
 * Created by diegoalves on 08/04/16.
 */
class TimeDAOImpl implements TimeDAO{
	List<Time> salvar(List<Time> listaTimes, Time time){
		listaTimes += time
	}
}
