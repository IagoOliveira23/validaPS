package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo seletivo");
//          analisarCandidato(123.4);
//          analisarCandidato(2000.0);
//          analisarCandidato(2000.1);

//          selecaoCandidatos();
//          imprimirSelecionados();

            String candidatos[] = {"A", "B", "C", "D", "E"};
            for(String cand: candidatos){
                entrandoEmContato(cand);
            }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando) {
                tentativasRealizadas++;
            }else {
                System.out.println("Contato realizado com sucesso!");
            }
        }while (continuarTentando && tentativasRealizadas < 3);

        if(atendeu){
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa");
        }else {
            System.out.println("Não conseguimos contato com " + candidato + ", tentativas esgotadas");
        }
    }

    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados(){
        String candidatos[] = {"A", "B", "C", "D", "E"};
        System.out.println("Imprimindo a lista de candidados informando o indice do elemento");

        for(int i = 0; i < candidatos.length; i++){
            System.out.println("O candidato nº " + i + " é " + candidatos[i]);
        }

        System.out.println("Forma abreviada de iteração foreach");
        for(String cand: candidatos){
            System.out.println("O candidato selecionado foi: " + cand);
        }
    }

    static void selecaoCandidatos(){
        String candidatos[] = {"A", "B", "C", "D", "E", "F", "G", "H"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double pretensaoSalarial = gerarPretensaoSalarial();
            System.out.println("O candidato "+ candidato + " soliticou R$:" + pretensaoSalarial);
            if(salarioBase >= pretensaoSalarial){
                System.out.println("O candidato " + candidato + " foi selecionado");
                candidatosSelecionados++;
            }

            candidatoAtual++;
        }
    }

    static double gerarPretensaoSalarial(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double pretensaoSalarial){
        double salarioBase = 2000.0;
        if(salarioBase > pretensaoSalarial){
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == pretensaoSalarial) {
            System.out.println("Ligar para o candidato com contraproposta");
        }else {
            System.out.println("Aguardando resultado dos demais candidatos");
        }
    }
}
