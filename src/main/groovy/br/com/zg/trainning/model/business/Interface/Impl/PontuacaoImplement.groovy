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
}
