package tradearea;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tradearea.warehouse.MOMSender;

@SpringBootApplication
public class WarehouseMomApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(WarehouseMomApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		String flag = new String("receiver");
		for(String arg:args) {
			flag = arg;
		}

		if ( flag.toLowerCase().equals("sender") )
			new MOMSender();
		else
			new windpark.MOMReceiver();

	}
}
