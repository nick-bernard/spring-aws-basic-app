package guru.test.config.external.props;

import guru.springframework.test.jms.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * Created by nick on Nov 1, 2020
 */

@Configuration
@PropertySource({"classpath:testing.properties", "classpath:encrypted-testing.properties"}) // modified to take a list of values
public class ExternalPropsMultiFile {

    @Autowired
    Environment env;

    @Bean
    public FakeJmsBroker fakeJmsBrokerMulti(){
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUrl(env.getProperty("guru.jms.server")); // accessing the property, referencing properties out of the properties file
        fakeJmsBroker.setPort(env.getRequiredProperty("guru.jms.port", Integer.class));
        fakeJmsBroker.setUser(env.getProperty("guru.jms.user"));
        fakeJmsBroker.setPassword(env.getProperty("guru.jms.encrypted.password")); // changed to "encrypted.password" from just "password"
        return fakeJmsBroker;
    }

}
