package br.com.zg.trainning.model.business.Interface.Impl

import br.com.zg.trainning.model.business.Interface.CalculaPontuacao
import br.com.zg.trainning.model.entity.Time

/**
 * Created by diegoalves on 07/04/16.
 */
class CalculaPontuacao2015 implements CalculaPontuacao{

	private int ponto_vitoria = 3
	private int ponto_empate = 1
	@Override
	int CalculaPontuacaoTotal(Time time) {

		int pontuacao

		pontuacao += time.quantVitoria * ponto_vitoria
		pontuacao += time.quantEmpate * ponto_empate

		return pontuacao
	}
}
