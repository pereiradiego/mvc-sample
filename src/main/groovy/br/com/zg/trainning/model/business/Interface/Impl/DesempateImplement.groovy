package br.com.zg.trainning.model.business.Interface.Impl

import br.com.zg.trainning.model.business.Interface.Desempate
import br.com.zg.trainning.model.entity.Time
/**
 * Created by diegoalves on 07/04/16.
 */
class DesempateImplement implements  Desempate{

	List<Time> realizaDesempate(List<Time> times){

		times.sort{it.quantVitoria}
		times.sort{it.quantGolPro}
		if(times.count() == 2){
			//logica do confronto direto
		}
		times.sort{it.quantGolPro}
		times.sort{-it.quantGolContra}

		return times

	}

}
