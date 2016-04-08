package br.com.zg.trainning.model.business.Interface.Impl

import br.com.zg.trainning.model.business.Interface.Desempate
import br.com.zg.trainning.model.entity.Time
/**
 * Created by diegoalves on 07/04/16.
 */
class DesempateImplement implements  Desempate{

	List<Time> realizaDesempate(List<Time> times){

		times = times.sort { timeA, timeB ->
			int saldoGolA = timeA.quantGolPro - timeA.quantGolContra
			int saldoGolB = timeB.quantGolPro - timeB.quantGolContra

			if(timeA.quantVitoria != timeB.quantVitoria){
				timeA.quantVitoria <=> timeB.quantVitoria
			}else if(saldoGolA != saldoGolB){
				saldoGolA <=> saldoGolB
			}else {
				timeA.quantGolPro <=> timeB.quantGolPro
			}
		}

		return times
	}
}

