package guru.springframework.test.dstest;

import guru.springframework.test.config.DataSourceConfig;
import guru.springframework.test.ds.FakeDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by nick on Nov, 2020
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(DataSourceConfig.class)
//@ActiveProfiles("prod") // telling Spring that this is the bean we want
public class DataSourceTest {

    private FakeDataSource fakeDataSource;

    @Autowired
    public void setFakeDataSource(FakeDataSource fakeDataSource) {
        this.fakeDataSource = fakeDataSource;
    }

    @Test
    public void TestDataSource() {

        System.out.println(fakeDataSource.getConnectionInfo());
    }
}
