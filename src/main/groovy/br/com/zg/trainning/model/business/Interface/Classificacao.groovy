package br.com.zg.trainning.model.business.Interface

import br.com.zg.trainning.model.entity.Time

/**
 * Created by diegoalves on 07/04/16.
 */
interface Classificacao {
	List<Time> realizaDesempate(List<Time> times)
	List<Time> realizaClassificacao(List<Time> times)
}
