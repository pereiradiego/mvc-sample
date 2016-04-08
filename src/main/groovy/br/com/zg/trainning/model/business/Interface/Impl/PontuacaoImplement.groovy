package br.com.zg.trainning.model.business.Interface.Impl

import br.com.zg.trainning.model.business.Interface.Pontuacao
import br.com.zg.trainning.model.entity.Time

/**
 * Created by diegoalves on 07/04/16.
 */
class PontuacaoImplement implements Pontuacao{
	@Override
	int CalculaPontuacao(Time time) {

		int pontuacao

		pontuacao += time.quantVitoria * 3
		pontuacao += time.quantEmpate

		return pontuacao
	}

	Time Campeao(List<Time> times){
		Time timeCampeao = new Time()

		timeCampeao = listaClassificacao(times).first();

		return timeCampeao
	}

	List<Time> listaClassificacao(List<Time> times){
		times.sort{timeA, timeB ->
			if( CalculaPontuacao(timeA) != CalculaPontuacao(timeB) ){
				CalculaPontuacao(timeA) <=> CalculaPontuacao(timeB)
			}else if(timeA.quantVitoria != timeB.quantVitoria){
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
	}
}
