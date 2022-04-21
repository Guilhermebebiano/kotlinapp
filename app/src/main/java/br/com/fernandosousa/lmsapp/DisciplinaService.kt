package br.com.fernandosousa.lmsapp

object DisciplinaService {

    fun getDisciplinas(): List<Disciplina> {
        val disciplinas = mutableListOf<Disciplina>()

        for (i in 1..20) {
            val d = Disciplina()
            d.nome = "Disciplina $i"
            d.ementa = "Ementa $i"
            d.professor = "Professor $i"
            d.foto = "https://nova-escola-producao.s3.amazonaws.com/VhBEcXRUkERtazZvjpNAsuQx3w9wXVbXB4wBeGXFPAWJykhAcxwrkJEvRb6Z/gettyimages-debate-praticas-sala-de-aula.jpg"

            disciplinas.add(d)
        }
        return disciplinas
    }
}