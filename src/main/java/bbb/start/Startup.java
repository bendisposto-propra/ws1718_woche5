package bbb.start;

import bbb.Credentials;
import bbb.Customers;
import bbb.MailService;
import bbb.MarketingApp;
import bbb.Thermometer;
import services.DerbyCustomerRepository;
import services.FileCredentials;
import services.GMailSender;
import services.OpenWeatherMapForecast;

public class Startup {

	public static void main(String[] args) throws Exception {

		Credentials credentials = new FileCredentials();
		MailService mailer = new GMailSender(credentials);
		Thermometer therometer = new OpenWeatherMapForecast(credentials);
		Customers customers = new DerbyCustomerRepository();

		MarketingApp app = new MarketingApp(therometer, mailer, customers);
		app.marketingLoop();

	}

}
