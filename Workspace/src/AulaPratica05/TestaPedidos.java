package AulaPratica05;

public class TestaPedidos{
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido("123.456.789-10", "01/09/2021");
        pedido1.pedir_pizza("Barbecue", "Catupiry", "Chedar");
        pedido1.pedir_sanduba("Frances", "Salsicha", "SEM SALADA");
        System.out.println("\nPedido nro°1: ");
        System.out.println("Sanduiches: " + pedido1.getContS());
        System.out.println("Pizzas: " + pedido1.getContP());
        System.out.println("TOTAL: " + pedido1.total_pedido());

        Pedido pedido2 = new Pedido("987.654.321.01", "02/09/2021");
        pedido2.pedir_sanduba("Italiano", "Soja", "Alface e Tomate");
        pedido2.pedir_sanduba("Baguete", "Porco", "Repolho");
        pedido2.pedir_sanduba("Queijo", "Pelota", "Sem");
        pedido2.pedir_sanduba("Normal", "Frango", "Pepino");
        pedido2.pedir_sanduba("Queimado", "Tamandua", "Beringela");
        int aux = pedido2.pedir_sanduba("Cru", "Pato", "Samambaia");
        if(aux == -1)
            System.out.println("\nSinto Muito, o limite de pedidos para Sanduiches foi alcançado;");
        System.out.println("Pedido nro°2: ");
        System.out.println("Sanduiches: " + pedido2.getContS());
        System.out.println("Pizzas: " + pedido2.getContP());
        System.out.println("TOTAL: " + pedido2.total_pedido());
    }
}
