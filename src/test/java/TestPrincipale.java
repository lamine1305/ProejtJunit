import org.junit.*;

import static org.junit.Assert.*;


public class TestPrincipale {

    Principale pr,pr2;

    @Test
    public void testSalaireNet() {
        assertEquals(3080.5, pr.calculSalaireNet(4000),1);
    }

    @Test
    public void testObjectNull() {
        assertNull(pr2);
        assertNotNull(pr);

    }

    @Before
    public void avantTest()
    {
        pr= new Principale();
        System.out.println("avant lancement de chaque  test ");
        pr.raux  = 0.77;
    }

//@After est appelé après chaque méthode de test


}
