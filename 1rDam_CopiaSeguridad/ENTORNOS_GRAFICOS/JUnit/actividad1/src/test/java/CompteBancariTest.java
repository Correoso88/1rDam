import org.junit.jupiter.api.Test;
import es.cide.entornos.CompteBancari;
import static org.junit.jupiter.api.Assertions.*;
public class CompteBancariTest {

    @Test
    public void IngressarIncrementaSaldo() {
        CompteBancari compte = new CompteBancari(100);
        compte.ingressar(50);
        assertEquals(150, compte.consultarSaldo());
    }

    @Test
    public void RetirarDisminueixSaldo() {
        CompteBancari compte = new CompteBancari(100);
        compte.retirar(40);
        assertEquals(60, compte.consultarSaldo());
    }

    @Test
    public void RetirarMesDelCompteLlançaExcepcio() {
        CompteBancari compte = new CompteBancari(100);
        assertThrows(IllegalArgumentException.class, () -> {
            compte.retirar(200);
        });
    }

    @Test
    public void ConsultarSaldoRetornaCorrecte() {
        CompteBancari compte = new CompteBancari(75);
        assertEquals(75, compte.consultarSaldo());
    }
}