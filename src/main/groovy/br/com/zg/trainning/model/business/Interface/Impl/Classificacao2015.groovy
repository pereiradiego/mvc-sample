package br.com.zg.trainning.model.business.Interface.Impl

import br.com.zg.trainning.model.business.Interface.CalculaPontuacao
import br.com.zg.trainning.model.business.Interface.Classificacao
import br.com.zg.trainning.model.entity.Time
/**
 * Created by diegoalves on 07/04/16.
 */
class Classificacao2015 implements  Classificacao{
	CalculaPontuacao2015 calculaPontuacao2015 = new CalculaPontuacao2015()

	List<Time> realizaDesempate(List<Time> times){

		times = times.sort { timeB, timeA ->

			int saldoGolA = timeA.quantGolPro - timeA.quantGolContra
			int saldoGolB = timeB.quantGolPro - timeB.quantGolContra

			if(calculaPontuacao2015.calculaPontuacaoTotal(timeA) != calculaPontuacao2015.calculaPontuacaoTotal(timeB)){
				calculaPontuacao2015.calculaPontuacaoTotal(timeA) <=> calculaPontuacao2015.calculaPontuacaoTotal(timeB)
			}else if(timeA.quantVitoria != timeB.quantVitoria){
				timeA.quantVitoria <=> timeB.quantVitoria
			}else if(saldoGolA != saldoGolB){
				saldoGolA <=> saldoGolB
			}else {
				timeA.quantGolPro <=> timeB.quantGolPro
			}
		}

		return times
	}

	List<Time> realizaClassificacao(List<Time> times){
		times = realizaDesempate(times)

		return  times
	}

	Time obtemCampeao(List<Time> times){
		times = realizaClassificacao(times)

		return times.first()
	}

	Time obtemLanterna(List<Time> times){
		times = realizaClassificacao(times)

		return times.last()
	}
}

