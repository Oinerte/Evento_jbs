import java.util.Date;

public class Teste {
    public static void main(String[] args) {
        // Criação do objeto Participante
        Date dataNasc = new Date(2000, 1, 1);
        Participante p = new Participante("João", "123.456.789-00", 12345678, dataNasc);

        // Teste do método getNome()
        String nomeEsperado = "João";
        String nomeObtido = p.getNome();
        if (nomeEsperado.equals(nomeObtido)) {
            System.out.println("Método getNome(): OK");
        } else {
            System.out.println("Método getNome(): Falhou");
        }

        // Teste do método setTelefone()
        int telefoneEsperado = 87654321;
        p.setTelefone(telefoneEsperado);
        int telefoneObtido = p.getTelefone();
        if (telefoneEsperado == telefoneObtido) {
            System.out.println("Método setTelefone(): OK");
        } else {
            System.out.println("Método setTelefone(): Falhou");
        }

        // Teste do método setData_nasc()
        Date dataNascEsperada = new Date(1990, 1, 1);
        p.setData_nasc(dataNascEsperada);
        Date dataNascObtida = p.getData_nasc();
        if (dataNascEsperada.equals(dataNascObtida)) {
            System.out.println("Método setData_nasc(): OK");
        } else {
            System.out.println("Método setData_nasc(): Falhou");
        }

        //Teste do método adicionaParticipante()
        Participante p1 = new Participante("João", "123.456.789-00", 1111, new Date());
        Participante p2 = new Participante("Maria", "987.654.321-00", 2222, new Date());
        Evento evento = new Evento(new Date(), "manhã");
        evento.adicionaParticipante(p1);
        evento.adicionaParticipante(p2);
        Participante[] participantes = evento.getParticipantes();
        System.out.println("Participantes do evento:");
        for (Participante p3 : participantes) {
            System.out.println(p3.getNome());
        }

        //Teste do método removeParticipante()
        evento.removeParticipante(p1);
        participantes = evento.getParticipantes();
        System.out.println("Participantes do evento após a remoção:");
        for (Participante p4 : participantes) {
            System.out.println(p4.getNome());
        }

        //Teste do método setData()
        Date novaData = new Date(2023, 4, 30);
        evento.setData(novaData);
        System.out.println("Nova data do evento: " + evento.getData());

        //Teste do método setPeríodo()
        evento.setPeríodo("tarde");
        System.out.println("Novo período do evento: " + evento.getPeríodo());
    }
}
