package guru.springframework.bootstrap.profilesysout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


/**
 * Created by nick on Nov 3, 2020
 * The profilesysout package is designed to provide some system out messages in the
 * console for us to see what profile is being active.
 */

@Component
@Profile("default")
public class DefaultProfileSysOut {

    @Autowired
    public DefaultProfileSysOut(@Value("${guru.springframework.profile.message}")  String msg) {
        System.out.println("default!!!!!!");
        System.out.println(msg);
    }
}
