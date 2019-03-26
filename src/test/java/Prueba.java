/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.avionesreservas2.Avion;
import com.mycompany.avionesreservas2.Inicio;
import com.mycompany.avionesreservas2.Silla;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alexander Martinez
 */
public class Prueba {

    public Prueba() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void Prueba() {
        int cedula = 1070970279;
        int codigoAvion = 1;
        char letraSilla = 'B';
        int columnaSilla = 2;
        String respuesta;
        String nombre = "Yesid";
        String resultado = String.valueOf('B' + 2);
        Inicio ini = new Inicio();
        List<Avion> listaAvion;
        listaAvion = ini.traerAvion();
        respuesta = ini.reservarPrueba(listaAvion, cedula, codigoAvion, columnaSilla, nombre, letraSilla);
        List<Silla> listaSilla;

        assertEquals(resultado, respuesta);

    }

}
