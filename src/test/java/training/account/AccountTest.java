package training.account;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

public class AccountTest {

// story 1003

    @Test
    public void accountApiTest() {
        Account a = new Account("testu", "testp", "testr");
        assertEquals(a.getUsername(), "testu");
        assertEquals(a.getPassword(), "testp");
        assertEquals(a.getRole(), "testr");
    }

    @Test
    public void accountEqualsTest() {
        Account a = new Account("testua", "testp", "testr");
        Account b = new Account("testu", "testp", "testr");
        assertEquals(a, b);
    }

    @Test
    public void accountNotEqualsTest() {
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
    public void accountHashTest() {
        Account a = new Account("testu", "testp", "testr");
        Account b = new Account("testu", "testp", "testr");
        assertEquals(a.hashCode(), b.hashCode());
    }


}