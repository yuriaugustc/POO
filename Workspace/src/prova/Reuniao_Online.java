package prova;

import java.util.Objects;

public class Reuniao_Online extends Reuniao_Presencial{
    private String plataforma;

    public Reuniao_Online(Funcionario coordenador_reuniao, String data_reuniao, String horario_inicio, String horario_fim, String motivo) {
        super(coordenador_reuniao, data_reuniao, horario_inicio, horario_fim, motivo);
    }

    @Override
    public double calculaCusto() {
        double custo = 20;
        if(Objects.equals(this.getMotivo(), "Ponto de Controle")){
            custo += 100;
        }
        else if(Objects.equals(this.getMotivo(), "Novos Projetos")){
            custo += 200;
        }
        else{
            custo += 300;
        }
        if(this.getCoffe_break() == true) {
            custo += 300;
        }
        return custo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
}
