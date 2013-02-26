package config;

import org.apache.activemq.broker.BrokerService;
import org.apache.activemq.broker.TransportConnector;
import org.junit.BeforeClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.inject.Inject;
import java.net.URI;

/**
 * Creates and embedded ActiveMQ broker for test purposes.
 */
@Configuration
@PropertySource("services.properties")
public class ActiveMQEmbeddedBrokerConfiguration {

    @Inject
    private Environment environment ;

    @Bean(name = "broker")
    public BrokerService setUpEmbeddedActiveMQBroker() throws Throwable {
        BrokerService broker = new BrokerService();

        TransportConnector connector = new TransportConnector();
        connector.setUri(new URI(this.environment.getProperty("jms.broker.url")));
        broker.addConnector(connector);
        broker.setPersistent(false);
        broker.start();

        return broker;
    }
}
