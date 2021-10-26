package prova;

public abstract class Reuniao {
    private Funcionario coordenador_reuniao;
    private String data_reuniao;
    private String horario_inicio;
    private String horario_fim;
    private String motivo;

    public Reuniao(Funcionario coordenador_reuniao, String data_reuniao, String horario_inicio, String horario_fim, String motivo) {
        this.coordenador_reuniao = coordenador_reuniao;
        this.data_reuniao = data_reuniao;
        this.horario_inicio = horario_inicio;
        this.horario_fim = horario_fim;
        this.motivo = motivo;
    }

    public abstract double calculaCusto();

    public Funcionario getCoordenador_reuniao() {
        return coordenador_reuniao;
    }

    public void setCoordenador_reuniao(Funcionario coordenador_reuniao) {
        this.coordenador_reuniao = coordenador_reuniao;
    }

    public String getData_reuniao() {
        return data_reuniao;
    }

    public void setData_reuniao(String data_reuniao) {
        this.data_reuniao = data_reuniao;
    }

    public String getHorario_inicio() {
        return horario_inicio;
    }

    public void setHorario_inicio(String horario_inicio) {
        this.horario_inicio = horario_inicio;
    }

    public String getHorario_fim() {
        return horario_fim;
    }

    public void setHorario_fim(String horario_fim) {
        this.horario_fim = horario_fim;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}
