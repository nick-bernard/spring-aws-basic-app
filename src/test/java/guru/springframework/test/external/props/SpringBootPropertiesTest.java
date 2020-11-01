package guru.springframework.test.external.props;

import guru.springframework.SpringCoreDevOpsApplication;
import guru.springframework.test.jms.FakeJmsBroker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by nick on Nov 1, 2020
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(SpringCoreDevOpsApplication.class)
@WebIntegrationTest
@TestPropertySource("/application.properties")
public class SpringBootPropertiesTest {
    @Autowired
    FakeJmsBroker fakeJmsBroker;

    @Test
    public void testPropsSet() throws Exception {
        assertEquals("10.10.10.123", fakeJmsBroker.getUrl());
        assertEquals(3330, fakeJmsBroker.getPort().intValue());
        assertEquals("Paul", fakeJmsBroker.getUser());
        assertEquals("McCartney", fakeJmsBroker.getPassword());
    }

}
