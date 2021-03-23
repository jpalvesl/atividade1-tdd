package com.gmail.jpalvesl101;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestCadastro {
    Cadastro c = new Cadastro();

    @Test
    public void CadastroDeveFuncionar() {
        Usuario user1 = new Usuario("João Lima", "15/06/1999", false);
        Usuario user2 = new Usuario("Pedro Alves", "12/09/2006", false);
        Usuario user3 = new Usuario("Maria Costa", "17/11/2003", false);

        Assertions.assertTrue(c.cadastrar(user1));
        Assertions.assertTrue(c.cadastrar(user2));
        Assertions.assertTrue(c.cadastrar(user3));
    }

    @Test
    public void CadastroNaoDeveFuncionar() {
        Usuario user0 = new Usuario(null, null, null);
        Usuario user1 = new Usuario(null, "15/06/1999", false);
        Usuario user2 = new Usuario("Maria Costa", null, false);
        Usuario user3 = new Usuario("Maria Costa", "17/11/2003", null);
        Usuario user4 = new Usuario("Maria Costa123", "17/11/2003", true);
        Usuario user5 = new Usuario("jpalvesl101@gmaill.com", "17/11/2003", true);
        Usuario user6 = new Usuario("João Pedro", "33/11/2003", true);
        Usuario user7 = new Usuario("João Pedro", "20/13/2003", true);
        Usuario user8 = new Usuario("João Pedro", "oizinho", true);


        Assertions.assertFalse(c.cadastrar(user0));
        Assertions.assertFalse(c.cadastrar(user1));
        Assertions.assertFalse(c.cadastrar(user2));
        Assertions.assertFalse(c.cadastrar(user3));
        Assertions.assertFalse(c.cadastrar(user4));
        Assertions.assertFalse(c.cadastrar(user5));
        Assertions.assertFalse(c.cadastrar(user6));
        Assertions.assertFalse(c.cadastrar(user7));
        Assertions.assertFalse(c.cadastrar(user8));
    }
}
