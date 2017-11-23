package bbb;

import java.util.Collection;

public interface Customers {

	Collection<String> getMailAddresses();

	void addMailAddress(String adr);

	void removeMailAddress(String adr);

}