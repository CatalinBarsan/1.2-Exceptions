package nivel01.ejercicio01.main.java.com.modules;
import nivel01.ejercicio01.main.java.com.modules.salebuida.SaleBuidaException;
import nivel01.ejercicio01.main.java.com.modules.sales.Start;


public class Main {

    public static void main(String[] args){

        Start app = new Start();
        try {
            app.start();
        } catch (SaleBuidaException e) {
            throw new RuntimeException(e);
        }

    }
}

