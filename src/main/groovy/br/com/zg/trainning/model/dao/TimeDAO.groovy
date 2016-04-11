package br.com.zg.trainning.model.dao

import br.com.zg.trainning.model.entity.Time

/**
 * Created by diegoalves on 08/04/16.
 */
interface TimeDAO {
	List<Time> salvar(List<Time> listaTimes, Time time)
}
