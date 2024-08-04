package Demo;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class Activity2 {
	
	@Test
	void notEnoughFunds() {
		BankAccount bankacc = new BankAccount(10);
		assertThrows(NotEnoughFundsException.class, () -> bankacc.withdraw(10), "Not sufficient balance");
	}
	
	@Test
	void enoughFunds() {
		BankAccount bankacc = new BankAccount(100);
		assertDoesNotThrow(() -> bankacc.withdraw(100));
	}
}
