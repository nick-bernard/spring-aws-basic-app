package guru.springframework.test.external.props;

import guru.springframework.test.jms.FakeJmsBroker;
//import guru.test.config.external.props.ExternalPropsMultiFile;
import guru.test.config.external.props.ExternalPropsMultiFileS4;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by nick on Nov 1, 2020
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ExternalPropsMultiFileS4.class)
public class PropertySourceMultiFileS4Test {

    @Autowired
    FakeJmsBroker fakeJmsBroker;

    @Test
    public void testPropsSet() throws Exception {
        assertEquals("10.10.10.123", fakeJmsBroker.getUrl());
        assertEquals(3330, fakeJmsBroker.getPort().intValue());
        assertEquals("Paul", fakeJmsBroker.getUser());
        assertEquals("%%%&&&###$$$", fakeJmsBroker.getPassword());
    }

}
