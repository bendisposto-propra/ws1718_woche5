package bbb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;

public class MarketingTest {

	public class FakeDatabase implements Customers {
		@Override
		public Collection<String> getMailAddresses() {
			return Arrays.asList("jens@bendisposto.de");
		}

		@Override
		public void addMailAddress(String adr) {
		}

		@Override
		public void removeMailAddress(String adr) {
		}
	}

	@Test
	public void onAWarmDayWeSendAMail() {
		final ArrayList<String> sent = new ArrayList<>();
		MailService fakeMail = (mail) -> {
			sent.add(mail);
		};
		Customers fakeDatabase = new FakeDatabase();
		new MarketingApp(() -> 31, fakeMail, fakeDatabase).doMarketing();
		Assert.assertEquals("jens@bendisposto.de", sent.get(0));
	}

	@Test
	public void onColdDaysNoMailIsSent() {
		final ArrayList<String> sent = new ArrayList<>();
		MailService fakeMail = (mail) -> {
			sent.add(mail);
		};
		Customers fakeDatabase = new FakeDatabase();
		new MarketingApp(() -> 15, fakeMail, fakeDatabase).doMarketing();
		Assert.assertEquals(0, sent.size());
	}

}
