package prova;

import java.util.Objects;

public class Reuniao_Presencial extends Reuniao {
    private boolean coffe_break;

    public Reuniao_Presencial(Funcionario coordenador_reuniao, String data_reuniao, String horario_inicio, String horario_fim, String motivo) {
        super(coordenador_reuniao, data_reuniao, horario_inicio, horario_fim, motivo);
    }

    @Override
    public double calculaCusto() {
        double custo = 0;
        if(Objects.equals(this.getMotivo(), "Ponto de Controle")){
            custo += 100;
        }
        else if(Objects.equals(this.getMotivo(), "Novos Projetos")){
            custo += 200;
        }
        else{
            custo += 300;
        }
        if(coffe_break == true) {
            custo += 300;
        }
        return custo;
    }

    public boolean getCoffe_break() {
        return coffe_break;
    }

    public void setCoffe_break(boolean coffe_break) {
        this.coffe_break = coffe_break;
    }
}
