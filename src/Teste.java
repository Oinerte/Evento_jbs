import java.util.Arrays;
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


        // Criando participantes
        Participante p1 = new Participante("Fulano", "123456789", 987654321, new Date());
        Participante p2 = new Participante("Ciclano", "2345678", 2345678, new Date());

        // Criando evento
        Evento e = new Evento(new Date(), "Manhã");

        // Testando métodos
        // getData() e setData()
        Date data = new Date();
        e.setData(data);
        if (e.getData().equals(data)) {
            System.out.println("getData() e setData(): OK");
        } else {
            System.out.println("getData() e setData(): Falhou");
        }

        // getPeríodo() e setPeríodo()
        String periodo = "Tarde";
        e.setPeríodo(periodo);
        if (e.getPeríodo().equals(periodo)) {
            System.out.println("getPeríodo() e setPeríodo(): OK");
        } else {
            System.out.println("getPeríodo() e setPeríodo(): Falhou");
        }

        // getParticipantes()
        if (Arrays.equals(e.getParticipantes(), null)) {
            System.out.println("getParticipantes(): OK");
        } else {
            System.out.println("getParticipantes(): Falhou");
        }

        // adicionaParticipante() e getParticipantes()
        e.adicionaParticipante(p1);
        Participante[] participantes = e.getParticipantes();
        if (participantes.length == 1 && participantes[0].equals(p1)) {
            System.out.println("adicionaParticipante() e getParticipantes(): OK");
        } else {
            System.out.println("adicionaParticipante() e getParticipantes(): Falhou");
        }

        // removeParticipante() e getParticipantes()
        e.removeParticipante(p1);
        participantes = e.getParticipantes();
        if (participantes == null || participantes.length == 0) {
            System.out.println("removeParticipante() e getParticipantes(): OK");
        } else {
            System.out.println("removeParticipante() e getParticipantes(): Falhou");
        }
    }
}
