import functions.MyLIb;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int MAX_PRODUCTES = 100;
        String [][] llistaproductes = new String[MAX_PRODUCTES][2];
        int [] llistaquantitats = new int[MAX_PRODUCTES];
        float[] llistapreus = new float[MAX_PRODUCTES];
        int comptadorProductes = 0;
        int fila =0;
        boolean bucle1 = true;
        String descripcio = null;
        float preu = 0;
        int quantitat = 0;

        llistaproductes[comptadorProductes][0] = "1";
        llistaproductes[comptadorProductes][1] = "Enciam ";
        llistaquantitats[comptadorProductes] = 10;
        llistapreus[comptadorProductes] = 1.56f;
        comptadorProductes++;
        llistaproductes[comptadorProductes][0] = "2";
        llistaproductes[comptadorProductes][1] = "Taronja (Kg) ";
        llistaquantitats[comptadorProductes] = 12;

        llistapreus[comptadorProductes] = 0.99f;
        comptadorProductes++;
        llistaproductes[comptadorProductes][0] = "3";
        llistaproductes[comptadorProductes][1] = "Pera (Kg) ";
        llistaquantitats[comptadorProductes] = 12;
        llistapreus[comptadorProductes] = 1.29f;
        comptadorProductes++;
        llistaproductes[comptadorProductes][0] = "4";
        llistaproductes[comptadorProductes][1] = "Mandarina (Kg) ";
        llistaquantitats[comptadorProductes] = 20;
        llistapreus[comptadorProductes] = 1.49f;
        comptadorProductes++;

        llistaproductes[comptadorProductes][0] = "5";
        llistaproductes[comptadorProductes][1] = "Síndria ";
        llistaquantitats[comptadorProductes] = 14;
        llistapreus[comptadorProductes] = 6.29f;
        comptadorProductes++;

        while (bucle1){
            MyLIb.mostraMenuInici();
            int opcio= sc.nextInt();
            sc.nextLine();
            switch (opcio){
                case 0:
                    bucle1 = false;
                    break;
                case 1:
                    System.out.println("Referencia:");
                    String referencia = sc.nextLine();
                    fila =MyLIb.comprobarReferencia(llistaproductes,fila,referencia);
                    if (MyLIb.comprobarReferencia(llistaproductes,fila,referencia)==-1){
                        System.out.println("Descripció: ");
                         descripcio = sc.nextLine();
                        System.out.println("preu");
                        preu = sc.nextFloat();
                    }else {
                        System.out.println("Quantitat que arriba:");
                        quantitat = sc.nextInt();
                    }
                    System.out.println("Quantitat que arriba:");
                    quantitat = sc.nextInt();
                    llistaproductes[comptadorProductes][0] = referencia;
                    llistaproductes[comptadorProductes][1] = descripcio;
                    llistaquantitats[comptadorProductes] = quantitat;
                    llistapreus[comptadorProductes] = preu;
                    comptadorProductes++;
                    break;
                case 2:
                    String[] refs = new String[MAX];
                    int[] quants = new int[MAX];

            }
        }



    }
}
