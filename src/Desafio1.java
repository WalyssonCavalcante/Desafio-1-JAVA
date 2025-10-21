package TiposDeDados;

public class Desafio1 {
    static void main() {
        // Ninja 1
        String nomeDoNinja1 = "Naruto Uzumaki";
        int idade1 = 16;
        String nomeDaMissao1 = "Encontrar o Bandido";
        char dificuldadeDaMissao1 = 'A';
        String statusDaMissao1 = "Em andamento";

        if(idade1 < 15){
            if(dificuldadeDaMissao1 == 'C' || dificuldadeDaMissao1 == 'D'){
                statusDaMissao1 = "Concluida";
            } else {
                statusDaMissao1 = "Não Concluida";
            }
        } else {
            statusDaMissao1 = "Concluida";
        }

        System.out.println("-------------------------------------------------");
        System.out.println("Nome do Ninja: " + nomeDoNinja1);
        System.out.println("Idade do Ninja: " + idade1);
        System.out.println("Nome da Missão: " + nomeDaMissao1);
        System.out.println("Dificuldade da Missão: " + dificuldadeDaMissao1);
        System.out.println("Status da Missão: " + statusDaMissao1);
        System.out.println("-------------------------------------------------");


        // Ninja 2
        String nomeDoNinja2 = "Sasuke Uchiha";
        int idade2 = 14;
        String nomeDaMissao2 = "Fazer Reconhecimento";
        char dificuldadeDaMissao2 = 'S';
        String statusDaMissao2 = "Em andamento";

        if(idade2 < 15){
            if(dificuldadeDaMissao2 == 'C' || dificuldadeDaMissao2 == 'D'){
                statusDaMissao2 = "Concluida";
            } else {
                statusDaMissao2 = "Não Concluida";
            }
        } else {
            statusDaMissao2 = "Concluida";
        }

        System.out.println("Nome do Ninja: " + nomeDoNinja2);
        System.out.println("Idade do Ninja: " + idade2);
        System.out.println("Nome da Missão: " + nomeDaMissao2);
        System.out.println("Dificuldade da Missão: " + dificuldadeDaMissao2);
        System.out.println("Status da Missão: " + statusDaMissao2);
        System.out.println("-------------------------------------------------");

        // Ninja 3
        String nomeDoNinja3 = "Sakura Haruno";
        int idade3 = 13;
        String nomeDaMissao3 = "Curar os Feridos";
        char dificuldadeDaMissao3 = 'D';
        String statusDaMissao3 = "Em andamento";

        if(idade3 < 15){
            if(dificuldadeDaMissao3 == 'C' || dificuldadeDaMissao3 == 'D'){
                statusDaMissao3 = "Concluida";
            } else {
                statusDaMissao3 = "Não Concluida";
            }
        } else {
            statusDaMissao3 = "Concluida";
        }

        System.out.println("Nome do Ninja: " + nomeDoNinja3);
        System.out.println("Idade do Ninja: " + idade3);
        System.out.println("Nome da Missão: " + nomeDaMissao3);
        System.out.println("Dificuldade da Missão: " + dificuldadeDaMissao3);
        System.out.println("Status da Missão: " + statusDaMissao3);
        System.out.println("-------------------------------------------------");
    }
}
