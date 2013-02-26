package org.springsource.jta.etailer.store.services;

import config.ActiveMQEmbeddedBrokerConfiguration;
import org.apache.activemq.broker.BrokerService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springsource.jta.etailer.store.config.BitronixJtaConfiguration;
import org.springsource.jta.etailer.store.config.MessagingConfiguration;
import org.springsource.jta.etailer.store.config.PersistenceConfiguration;

import javax.inject.Inject;

@ContextConfiguration(
        loader = AnnotationConfigContextLoader.class,
        classes = { ActiveMQEmbeddedBrokerConfiguration.class,
                    PersistenceConfiguration.class, MessagingConfiguration.class, BitronixJtaConfiguration.class }
)
public abstract class BaseIntegrationTest {

    @Inject
    BrokerService broker;

}
