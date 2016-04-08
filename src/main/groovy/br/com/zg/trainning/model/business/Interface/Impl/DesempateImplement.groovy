package br.com.zg.trainning.model.business.Interface.Impl

import br.com.zg.trainning.model.business.Interface.Desempate
import br.com.zg.trainning.model.entity.Time
/**
 * Created by diegoalves on 07/04/16.
 */
class DesempateImplement implements  Desempate{

	List<Time> realizaDesempate(List<Time> times){

		times.sort { timeA, timeB ->
			if(timeA.quantVitoria != timeB.quantVitoria){
				timeA <=> timeB
			}else if((timeA.quantGolPro-timeA.quantGolContra) != (timeB.quantGolPro-timeB.quantGolContra)){
				timeA <=> timeB
			}else if(times.count() == 2){
				//Logica de confronto direto
				//Aplica critérios de desempate
			}else {
				//Sorteio em caso de empate em todos os critérios anteriores
				Collections.shuffle(timeA,timeB)
			}
		}

		return times
	}
}

