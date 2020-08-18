package software.xdev.graylog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Hello world!
 *
 */
public class App
{
	public static void main(final String[] args)
	{
		final Logger log = LogManager.getLogger(App.class);
		log.error("Test", new RuntimeException("boom"));
	}
}
