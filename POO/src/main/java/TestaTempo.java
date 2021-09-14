public class TestaTempo {
    public static void main(String Args[]){
        Tempo time = new Tempo(23, 59);
        Tempo time1 = new Tempo();
        System.out.println("Tempo setado a partir da hora e minuto: " + time.GetTempo());
        time.IncMin();
        System.out.println("Tempo incrementando um: " + time.GetTempo());
        time = new Tempo(7, 50);
        System.out.println("Tempo re-setado para servir de base para tempo1: " + time.GetTempo());
        time1.CriaTempo(time);
        System.out.println("Tempo1 setado a partir de outro tempo: " + time1.GetTempo()); // nao consegui fazer funcionar :'(
        Tempo time2 = new Tempo( 12, 12);
        System.out.println("Tempo2 base para adicionar e remover minutos: " + time2.GetTempo());
        time2.IncMin();
        System.out.println("Tempo2 incrementado: "+ time2.GetTempo());
        time2.DecMin();
        System.out.println("Tempo2 decrementado: " + time2.GetTempo());
        Tempo time3 = new Tempo(0, 0);
        time3.Sethora(24);
        System.out.println("Tempo3 setado a partir da hora(setada com 24): " + time3.GetTempo());
        time3.DecMin();
        System.out.println("Tempo3 zerado decrementando um: " + time3.GetTempo());
        time3.Sethora(23);
        System.out.println("Re-setando o tempo3 com 23 hrs: " + time3.GetTempo());
    }
}
