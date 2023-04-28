import java.util.Arrays;
import java.util.Date;

public class Evento {
    private Participante[] participantes;
    private Date data;
    private String período;

    public Evento(Date data, String período) {
        this.data = data;
        this.período = período;
        this.participantes = new Participante[0];
    }

    public Participante[] getParticipantes() {
        return participantes;
    }

    public void removeParticipante(Participante participante) {
        int index = -1;
        for(int i = 0; i < this.participantes.length; i+=1){
            if(this.participantes[i] == participante){
                index = i;
            }
        }

        if(index >= 0){
            Participante[] novaLista = new Participante[this.participantes.length -1];
            for(int i = 0; i < this.participantes.length; i+=1){
                if(this.participantes[i] != participante){
                    novaLista[i] = this.participantes[i];
                }
            }
        }else{
            System.out.println("Participante não encontrado");
        }
    }

    public void adicionaParticipante(Participante participante){
        Participante[] novaLista = new Participante[this.participantes.length+1];
        for(int i =0; i < this.participantes.length; i+=1){
            novaLista[i] = this.participantes[i];
        }
        novaLista[novaLista.length-1] = participante;
        this.participantes = novaLista;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getPeríodo() {
        return período;
    }

    public void setPeríodo(String período) {
        this.período = período;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "participantes=" + Arrays.toString(participantes) +
                ", data=" + data +
                ", período='" + período + '\'' +
                '}';
    }
}
