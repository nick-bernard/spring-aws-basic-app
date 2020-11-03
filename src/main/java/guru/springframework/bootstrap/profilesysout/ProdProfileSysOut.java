package guru.springframework.bootstrap.profilesysout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by nick on Nov 3, 2020
 */

@Component
@Profile("PROD")
public class ProdProfileSysOut {

    @Autowired
    public ProdProfileSysOut(@Value("${guru.springframework.profile.message}") String msg){
        System.out.println("production!!!!!!!");
        System.out.println(msg);
    }
}
