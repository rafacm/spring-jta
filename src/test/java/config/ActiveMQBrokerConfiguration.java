package config;

import org.apache.activemq.broker.BrokerService;
import org.apache.activemq.broker.TransportConnector;
import org.junit.BeforeClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URI;

/**
 * Creates and embedded ActiveMQ broker for test purposes.
 */
@Configuration
public class ActiveMQBrokerConfiguration {

    @Bean(name = "broker")
    public BrokerService setUpEmbeddedActiveMQBroker() throws Throwable {
        BrokerService broker = new BrokerService();

        TransportConnector connector = new TransportConnector();
        connector.setUri(new URI("tcp://localhost:61616"));
        broker.addConnector(connector);
        broker.setPersistent(false);
        broker.start();

        return broker;
    }
}
