public class ContoCorrente {


    private double saldo;
    private int numero;


    private static int numeroUltimoContoCreato = 1000;


    private String tipo;


    private static final double tassoFamily = 0.01;
    private static final double tassoBusiness = 0.02;


    public ContoCorrente(double saldoIniziale, String tipoCliente) {
        saldo = saldoIniziale;
        tipo = tipoCliente;
        numeroUltimoContoCreato++;
        numero = numeroUltimoContoCreato;
    }


    public void deposita(double importo) {
        saldo += importo;
        System.out.println("Versati: " + importo + " euro");
    }


    public boolean preleva(double importo) {
        if (saldo < importo) {
            return false;
        } else {
            saldo -= importo;
            System.out.println("Prelevati: " + importo + " euro");
            return true;
        }
    }
    public double ottieniSaldo() {
        return saldo;
    }

    public int ottieniNumero() {
        return numero;
    }

    public static int ottieniUltimoNumero() {
        return numeroUltimoContoCreato;
    }

    public String getTipo() {
        return tipo;
    }

    public static double getTassoFamily() {
        return tassoFamily;
    }

    public static double getTassoBusiness() {
        return tassoBusiness;
    }


    public void maturaInteressi() {
        if (tipo.equalsIgnoreCase("family")) {
            saldo += saldo * tassoFamily;
        } else if (tipo.equalsIgnoreCase("business")) {
            saldo += saldo * tassoBusiness;
        }
        System.out.println("Interessi sono maturati il nuovo saldo è: " + saldo + " euro");
    }

    public static void setTassoFamily(double nuovoTasso) {
        if (nuovoTasso >= 0) {
            System.out.println("Tasso Family aggiornato a: " + nuovoTasso);
        }
    }

    public static void setTassoBusiness(double nuovoTasso) {
        if (nuovoTasso >= 0) {
            System.out.println("Tasso Business aggiornato a: " + nuovoTasso);
        }
    }
}

