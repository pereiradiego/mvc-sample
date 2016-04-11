package br.com.zg.trainning.model.business.Interface.Impl

import br.com.zg.trainning.model.business.Interface.CalculaPontuacao
import br.com.zg.trainning.model.entity.Time

/**
 * Created by diegoalves on 07/04/16.
 */
class CalculaPontuacao2015 implements CalculaPontuacao{

	private final int PONTO_POR_VITORIA = 3
	private final int PONTO_EMPATE = 1
	@Override
	int calculaPontuacaoTotal(Time time) {
		int pontuacao

		pontuacao += time.quantVitoria * PONTO_POR_VITORIA
		pontuacao += time.quantEmpate * PONTO_EMPATE

		return pontuacao
	}
}
