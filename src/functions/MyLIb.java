package functions;

public class MyLIb {

    public static void mostraMenuInici() {
        System.out.println("Menú principal");
        System.out.println("0 - Sortir");
        System.out.println("1 - Afegir producte");
        System.out.println("2 - Venda");
        System.out.println("3 - Comprovar vendes");
    }

    public static int comprobarReferencia(String[][] llistaproductes, int fila, String referencia) {
        llistaproductes = new String[100][2];

        for (int i =0; i<llistaproductes[0].length; i++){
                if (llistaproductes[i].equals(referencia)){
                    return i;
                }
        }
        return -1;
    }
    //fer funcio qe si troba torni el num de la fila sa de fer servir vries vegades sino torna menys 1


}
