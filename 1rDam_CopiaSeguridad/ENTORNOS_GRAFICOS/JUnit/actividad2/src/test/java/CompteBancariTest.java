import org.junit.jupiter.api.Test;
import es.cide.entornos.CompteBancari;
import static org.junit.jupiter.api.Assertions.*;
public class CompteBancariTest {

    @Test
    public void IngressarIncrementaSaldo() {
        CompteBancari compte = new CompteBancari(100);
        compte.ingressar(20);
        assertEquals(120, compte.consultarSaldo());
    }

    @Test
    public void RetirarDisminueixSaldo() {
        CompteBancari compte = new CompteBancari(100);
        compte.retirar(20);
        assertEquals(80, compte.consultarSaldo());
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
        CompteBancari compte = new CompteBancari(100);
        assertEquals(100, compte.consultarSaldo());
    }
}