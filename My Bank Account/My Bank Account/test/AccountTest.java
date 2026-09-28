import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    private Account myAccount;

    @BeforeEach
    public void resetBalance_toZero() {

        myAccount = new Account(1994);
    }

    @Test
    public void show_thatICanDeposit_5kInMyAccount(){
        myAccount.deposit(5000);
        assertEquals(5000, myAccount.checkBalance(1994));
    }

    @Test
    public void showThatICannot_depositNegativeAmount() {
        myAccount.deposit(-5000);
        assertEquals(0, myAccount.checkBalance(1994));
    }
    @Test
    public void showThatICanWithdraw() {
        myAccount.deposit(5000);
        boolean result = myAccount.withdraw(2000,1994);
        assertTrue(result);
        assertEquals(3000, myAccount.checkBalance(1994));
    }
    @Test
    public void showThatICannot_withdrawNegativeAmount() {
        myAccount.deposit(5000);
        boolean result = myAccount.withdraw(-2000,1994);
        assertFalse(result);
        assertEquals(5000, myAccount.checkBalance(1994));
    }
    @Test
    public void cannotWithdraw_moreThanBalance() {
        myAccount.deposit(5000);
        boolean result = myAccount.withdraw(7000,1994);
        assertFalse(result);
        assertEquals(5000, myAccount.checkBalance(1994));
    }
    @Test
    public void cannotCheckBalance_withWrongPIN() {
        myAccount.deposit(5000);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            myAccount.checkBalance(1234);
        });

        assertEquals("Invalid PIN", exception.getMessage());
    }

    @Test
    public void testThatICannot_withdrawWithWrongPIN() {
        myAccount.deposit(5000);
        boolean result = myAccount.withdraw(3000,1234);

        assertFalse(result);
        assertEquals(5000, myAccount.checkBalance(1994));
    }
}
