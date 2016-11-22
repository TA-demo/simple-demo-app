package training.account;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import training.common.TestEnvHelper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

public class AccountTest {

    @Rule
    public TestName name = new TestName();

    TestEnvHelper testEnvHelper = TestEnvHelper.TEST_ENV_HELPER;
// story 1003

    @Before
    public void setUp(){
        testEnvHelper.testIsStarting(name.getMethodName());
    }


    @Test
    public void accountApiTest() {
        if (testEnvHelper.successfulRun())
            return;
        Account a = new Account("testu", "testp", "testr");
        assertEquals(a.getUsername(), "testu");
        assertEquals(a.getPassword(), "testp");
        assertEquals(a.getRole(), "testr");
    }

    @Test
    public void accountEqualsTest() {
        if (testEnvHelper.successfulRun())
            return;
        Account a = new Account("testua", "testp", "testr");
        Account b = new Account("testu", "testp", "testr");
        assertEquals(a, b);
    }

    @Test
    public void accountNotEqualsTest() {
        if (testEnvHelper.successfulRun())
            return;
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
    public void accountNotEqualsTest2() {
        if (testEnvHelper.successfulRun())
            return;
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
    public void accountEquals2AccountsTest() {
        if (testEnvHelper.successfulRun())
            return;
        Account a, b = null;
        a = new Account("testua", "testp", "testr");
        if (Math.random() > 0.5)
            b = new Account("testu", "testp", "testr");
        assertEquals(a, b);
    }

    @Test
    public void accountEqualsCornerCasesTest() {
        if (testEnvHelper.successfulRun())
            return;
        Account a, b = null;
        a = null;
        if (Math.random() > 0.5)
            b = new Account("testu", "testp", "testr");
        assertEquals(a, b);
    }

    @Test
    public void accountToStringTest() {
        Account a = null;
        if (testEnvHelper.successfulRun())
            return;
        if (Math.random() > 0.5)
            a = new Account("testu", "testp", "testr");
        assertEquals("testu", a.toString());
    }

    @Test
    public void accountPersistencyTest() {
        if (testEnvHelper.successfulRun())
            return;
        Account a = null;
        if (Math.random() > 0.3)
            a = new Account("testu", "testp", "testr");
        assertEquals("testu", a.toString());
    }

    @Test
    public void accountHashTest() {
        if (testEnvHelper.successfulRun())
            return;
        Account a = new Account("testu", "testp", "testr");
        Account b = new Account("testu", "testp", "testr");
        assertEquals(a.hashCode(), b.hashCode());
    }


}
      
   
   
   
   
   
   
   
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
