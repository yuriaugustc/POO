public class Tempo{
    private int hora, minuto, segundo;

    public Tempo CriaTempo(Tempo h1){
        Tempo t1 = new Tempo(hora, minuto);
        t1 = new Tempo(t1.hora, t1.minuto);
        return t1;
    }
    public Tempo(){
    }

    public Tempo(int h1, int m1){
        if(h1 <= 23 && h1 >= 0)
            hora = h1;
        else
            hora = 0;
        if(m1 <= 59 && m1 >= 0)
            minuto = m1;
        else
            minuto = 0;
        segundo = 0;
    }
    public void Sethora(int h1){
        if(h1 <= 23 && h1 >= 0)
            hora = h1;
        else
            hora = 0;
        minuto = 0;
        segundo = 0;
    }
    public String GetTempo(){
        if (hora < 10) {
            if (minuto < 10) {
                return "0" + hora + ":0" + minuto + ":0" + segundo;
            } else {
                return "0" + hora + ":" + minuto + ":0" + segundo;
            }
        }
        else{
            if (minuto < 10) {
                return hora + ":0" + minuto + ":0" + segundo;
            } else {
                return hora + ":" + minuto + ":0" + segundo;
            }
        }
    }
    public String IncMin(){
        if(minuto == 59) {
            minuto = 0;
            if(hora == 23)
                hora = 0;
            else
                hora += 1;
        }
        else
            minuto += 1;
        return hora + ":" + minuto + ":" + segundo;
    }
    public String DecMin(){
        if(minuto == 0) {
            minuto = 59;
            if(hora == 0)
                hora = 23;
            else
                hora -= 1;
        }
        else
            minuto -= 1;
        return hora + ":" + minuto + ":" + segundo;
    }
}
