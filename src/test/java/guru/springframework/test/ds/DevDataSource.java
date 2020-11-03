package guru.springframework.test.ds;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by nick on Nov 3, 2020
 */
@Component
@Profile({"dev", "default"})
// when the profile "dev" is active, this bean will get pulled in
// if the dev profile is not active, the spring config will completely ignore this bean and it will not be brought into the context.
public class DevDataSource implements FakeDataSource {

    @Override
    public String getConnectionInfo() {
        return "I'm the Development DataSource.";
    }

}
