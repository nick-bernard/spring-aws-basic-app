package guru.springframework.bootstrap.profilesysout;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by nick on Nov 3, 2020
 */

@Component
@Profile("DEV")
public class DevProfileSysOut {

    public DevProfileSysOut() {
        System.out.println("development!!!!!!!");
    }
}
