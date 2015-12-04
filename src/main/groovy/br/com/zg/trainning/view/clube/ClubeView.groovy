package br.com.zg.trainning.view.clube

import br.com.zg.trainning.view.campeonato.CampeonatoView

import static br.com.zg.trainning.view.campeonato.CampeonatoView.entrada


class ClubeView implements EntradaDadosClube{


	@Override
	String solicitaNomeClube() {
		print "Insira o nome do clube: "
		return entrada.nextLine()
	}

	@Override
	String solicitaNumeroVitorias() {
		print "Insira o número de vitórias: "
		return entrada.nextLine()
	}

	@Override
	String solicitaNumeroEmpates() {
		print "Insira o número de empates: "
		return entrada.nextLine()

	}

	@Override
	String solicitaNumeroDerrotas() {
		print "Insira o número de derrotas: "
		return entrada.nextLine()
	}

	@Override
	String solicitaNumeroGolsPro() {
		print "Insira o número de Gols Pró: "
		return entrada.nextLine()
	}

	@Override
	String solicitaNumeroGolsContra() {
		print "Insira o número de Gols Contra: "
		return entrada.nextLine()
	}

	@Override
	String verificaFimInclusao() {
		print "Deseja incluir outro clube? (S/N): "
		return entrada.nextLine()
	}


}
