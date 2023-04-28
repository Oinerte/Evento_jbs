import java.sql.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a data do seu evento:");
        String entrada1 = sc.nextLine();
        Date data = Date.valueOf(entrada1);

        System.out.println("Digite o período do seu evento:");
        String periodo = sc.nextLine();

        Evento evento = new Evento(data, periodo);

        System.out.println("Digite o número de participantes que deseja inserir:");
        String entrada2 = sc.nextLine();
        int numeroParticipantes = Integer.parseInt(entrada2);

        for(int i = 0; i < numeroParticipantes; i+=1){
            System.out.println("Digite o  do seu participante:");
            String nome = sc.nextLine();


            System.out.println("Digite o  do seu participante:");
            String cpf = sc.nextLine();

            System.out.println("Digite o  do seu participante:");
            String entrada5 = sc.nextLine();
            int telefone = Integer.parseInt(entrada5);

            System.out.println("Digite o  do seu participante:");
            String entrada6 = sc.nextLine();
            Date data_nasc = Date.valueOf(entrada6);

            evento.adicionaParticipante(new Participante(nome, cpf, telefone, data_nasc));
        }


    }
}