package AccountTest;

import com.techlabs.publisher.Account;
import com.techlabs.subscriber.EmailObserver;
import com.techlabs.subscriber.SmsObserver;

public class AccountTest {
	public static void main(String[] args) {

		Account acc = new Account(101, "abc", 5000);
		// acc.deposit(500);
		acc.addObserver(new SmsObserver());
		acc.addObserver(new EmailObserver());
		acc.deposit(500);
	}

}
