package br.com.zg.trainning.view

import br.com.zg.trainning.controller.CampeonatoController
import br.com.zg.trainning.controller.TimeController
import br.com.zg.trainning.model.entity.Campeonato
import br.com.zg.trainning.model.entity.Time

/**
 * Created by diegoalves on 11/04/16.
 */
class CampeonatoGUI {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
	static Campeonato campeonato;
	static List<Time> timesParticipantes =[]
	static List<Campeonato> campeonatoList = []

	private static void main(String[] args){
		cadastrarCampeonato()
		cadastrarTimes()
		campeonato.times = timesParticipantes

	}

	//Trecho de cadastro de campeonato
	static void cadastrarCampeonato(){
		println "Seja Bem Vindo"
		println "Qual é o nome do campeonato?"

		String nomeCampeonato = br.readLine()

		campeonato = new Campeonato(nomeCampeonato: nomeCampeonato, idCampeonato: 1, quantRodadas: 38)
		CampeonatoController campeonatoController = new CampeonatoController()
		campeonatoList = campeonatoController.salvarCampeonato(campeonatoList, campeonato)
	}

	//Trecho para cadastro de Times
	static void cadastrarTimes(){
		String resposta = "s"

		while (resposta == "s") {
			println "Insira a Lista de Times"

			println "Qual é o id do Time"
			int idTime = br.readLine().toInteger()

			println "Qual é o nome do Time?"
			String nomeTime = br.readLine()

			println "Qual o número de vitórias?"
			int quantVitoria = br.readLine().toInteger()

			println "Qual o número de derrotas?"
			int quantDerrota = br.readLine().toInteger()

			println "Qual o número de empates?"
			int quantEmpate = br.readLine().toInteger()

			println "Qual o número de gols pro"
			int quantGolPro = br.readLine().toInteger()

			println "Qual o número de gols contra"
			int quantGolContra = br.readLine().toInteger()

			Time time = new Time()
			time.idTime = idTime
			time.nomeTime = nomeTime
			time.quantVitoria = quantVitoria
			time.quantDerrota = quantDerrota
			time.quantEmpate = quantEmpate
			time.quantGolContra = quantGolContra
			time.quantGolPro = quantGolPro

			TimeController timeController = new TimeController()

			timesParticipantes = timeController.salvarTime(timesParticipantes, time)

			println "Deseja inserir outro time (s/n)?"
			resposta = br.readLine()
		}
	}
}
