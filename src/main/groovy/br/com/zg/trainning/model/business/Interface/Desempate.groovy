package br.com.zg.trainning.model.business.Interface

import br.com.zg.trainning.model.entity.Time

/**
 * Created by diegoalves on 07/04/16.
 */
interface Desempate {
	List<Time> realizaDesempate(List<Time> times)
}
