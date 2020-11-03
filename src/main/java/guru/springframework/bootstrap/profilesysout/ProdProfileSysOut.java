package guru.springframework.bootstrap.profilesysout;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by nick on Nov 3, 2020
 */

@Component
@Profile("PROD")
public class ProdProfileSysOut {

    public ProdProfileSysOut(){
        System.out.println("production!!!!!!!");
    }
}
