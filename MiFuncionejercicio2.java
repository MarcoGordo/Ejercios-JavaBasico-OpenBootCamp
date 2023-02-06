public class MiFuncionejercicio2 {
    public static void main(String[] args) {

        float res;
        res = precioiva(15);
        System.out.println(res);
    }

    public static float precioiva(float costo) {
        float iva = 0.5f;
        float total;
        total = costo + costo*iva ;

        return total;


    }
}
