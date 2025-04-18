package host;
import conversor.clase_binario_y_decimal;

public class encontrar_host_n {

    private String ipe_encontrado, red_original;
    private int ip1, ip2, ip3, ip4, prefijo, n_hos_encontrar;
    private int arregloIP[] = new int[32];

    public encontrar_host_n(int iip1, int iip2, int iip3, int iip4, int pprefijo, int nn_hos_encontrar) {
        ip1 = iip1;
        ip2 = iip2;
        ip3 = iip3;
        ip4 = iip4;
        prefijo = pprefijo;
        n_hos_encontrar = nn_hos_encontrar;
    }

    private void ipaux() {

//recibimos la ip en arreglos convetidos a binario
        int arregloip1[] = new int[8];
        int arregloip2[] = new int[8];
        int arregloip3[] = new int[8];
        int arregloip4[] = new int[8];

        clase_binario_y_decimal ip_prefijo = new clase_binario_y_decimal(); //1
        arregloip1 = ip_prefijo.get_arreglo_decimal_a_binario(ip1);

        clase_binario_y_decimal ip_prefijo2 = new clase_binario_y_decimal(); //2
        arregloip2 = ip_prefijo2.get_arreglo_decimal_a_binario(ip2);

        clase_binario_y_decimal ip_prefijo3 = new clase_binario_y_decimal();//3
        arregloip3 = ip_prefijo3.get_arreglo_decimal_a_binario(ip3);

        clase_binario_y_decimal ip_prefijo4 = new clase_binario_y_decimal();//4
        arregloip4 = ip_prefijo4.get_arreglo_decimal_a_binario(ip4);
        //llena todo en uno solo
        for (int g = 0; g < 8; g++) {
            arregloIP[g] = arregloip1[g];
        }
        int b = 0;
        for (int a = 8; a < 16; a++) {
            arregloIP[a] = arregloip2[b];
            b++;
        }
        int c = 0;
        for (int i = 16; i < 24; i++) {
            arregloIP[i] = arregloip3[c];
            c++;
        }
        int d = 0;
        for (int k = 24; k < 32; k++) {
            arregloIP[k] = arregloip4[d];
            d++;
        }
//---------------------aaa decimal
        int ipe1 = clase_binario_y_decimal.get_arreglo_binario_a_decimal(arregloip1);
        int ipe2 = clase_binario_y_decimal.get_arreglo_binario_a_decimal(arregloip2);
        int ipe3 = clase_binario_y_decimal.get_arreglo_binario_a_decimal(arregloip3);
        int ipe4 = clase_binario_y_decimal.get_arreglo_binario_a_decimal(arregloip4);
        //resultado
        red_original = ipe1 + "." + ipe2 + "." + ipe3 + "." + ipe4 + " /" + prefijo;

    }

    private void hallar_numero_host() {
        //convertir el numero host que quiere encontrar a binario
        int binario_numero_host_encon[] = new int[32 - prefijo];

        //RECOJEMOS EL NUMERO EN UN ARREGLO EN BINARIO
        clase_binario_y_decimal hayar = new clase_binario_y_decimal();
        binario_numero_host_encon = hayar.get_decimal_A_Binario_numeros(n_hos_encontrar, 32 - prefijo);

        //reemplazarmos el arreglo binario en el arreglo ip
        int k = binario_numero_host_encon.length;
        for (int i = arregloIP.length; i > prefijo; i--) {
            arregloIP[i - 1] = binario_numero_host_encon[k - 1];
            k--;
        }

        //recibimos la ip que se genero
        ipe_encontrado = clase_binario_y_decimal.get_arreglo_binario32_a_decimalString(arregloIP);

    }

    public String get_hostN_encontrar() {
        return n_hos_encontrar + "";
    }

    public String get_red_original() {
        ipaux();
        return red_original + "";
    }

    public String get_hostIp_encontrado() {
        hallar_numero_host();
        return ipe_encontrado + "";
    }
}
