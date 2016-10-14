package training.person;

import org.junit.Test;
import training.account.Account;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

public class PersonTest {

// story 1003

    @Test
    public void personApiTest() {
        Account a = new Account("testu", "testp", "testr");
        assertEquals(a.getUsername(), "testu");
        assertEquals(a.getPassword(), "testp");
        assertEquals(a.getRole(), "testr");
    }

    @Test
    public void personEqualsTest() {
        Account a = new Account("testua", "testp", "testr");
        Account b = new Account("testu", "testp", "testr");
        assertEquals(a, b);
    }

    @Test
    public void personNotEqualsTest() {
        Account a = new Account("1testu", "testp", "testr");
        Account b = new Account("testu", "testp", "testr");
        assertNotSame(a, b);

        a = new Account("testu", "testp", "testr");
        b = new Account("testu", "testp1", "testr");
        assertNotSame(a, b);

        a = new Account("testu", "testp", "testr");
        b = new Account("testu", "testp", "testr1");
        assertNotSame(a, b);

        a = new Account("testu1", "testp", "testr");
        b = new Account("testu", "testp", "testr1");
        assertNotSame(a, b);
    }

    @Test
    public void personNotEqualsTest2() {
        Account a = new Account("1testu", "testp", "testr");
        Account b = new Account("testu", "testp", "testr");
        assertNotSame(a, b);

        a = new Account("testu", "testp", "testr");
        b = new Account("testu", "testp1", "testr");
        assertNotSame(a, b);

        a = new Account("testu", "testp", "testr");
        b = new Account("testu", "testp", "testr1");
        assertNotSame(a, b);

// story 1004
        if (true) throw new RuntimeException("This test is failing now");

        a = new Account("testu1", "testp", "testr");
        b = new Account("testu", "testp", "testr1");
        assertNotSame(a, b);
    }

    @Test
    public void personEquals2AccountsTest() {
        Account a, b = null;
        a = new Account("testua", "testp", "testr");
        if (Math.random() > 0.5)
            b = new Account("testu", "testp", "testr");
        assertEquals(a, b);
    }

    @Test
    public void personEqualsCornerCasesTest() {
        Account a, b = null;
        a = null;
        if (Math.random() > 0.5)
            b = new Account("testu", "testp", "testr");
        assertEquals(a, b);
    }

    @Test
    public void personToStringTest() {
        Account a = null;
        if (Math.random() > 0.5)
            a = new Account("testu", "testp", "testr");
        assertEquals("testu", a.toString());
    }

    @Test
    public void personPersistencyTest() {
        Account a = null;
        if (Math.random() > 0.3)
            a = new Account("testu", "testp", "testr");
        assertEquals("testu", a.toString());
    }

    @Test
    public void personHashTest() {
        Account a = new Account("testu", "testp", "testr");
        Account b = new Account("testu", "testp", "testr");
        assertEquals(a.hashCode(), b.hashCode());
    }


}
      
   
   
   
   
   
   
   
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
