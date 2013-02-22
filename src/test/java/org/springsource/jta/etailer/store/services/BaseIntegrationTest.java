package org.springsource.jta.etailer.store.services;

import config.ActiveMQBrokerConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springsource.jta.etailer.store.config.AtomikosJtaConfiguration;
import org.springsource.jta.etailer.store.config.StoreConfiguration;

@ContextConfiguration(
        loader = AnnotationConfigContextLoader.class,
        classes = { ActiveMQBrokerConfiguration.class, /* BitronixJtaConfiguration.class  AtomikosJtaConfiguration.class */AtomikosJtaConfiguration.class , StoreConfiguration.class}
)
public abstract class BaseIntegrationTest {
}
