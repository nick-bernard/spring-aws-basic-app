package guru.springframework.bootstrap.profilesysout;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by nick on Nov 3, 2020
 */

@Component
@Profile("QA")
public class QAProfileSysOut {

    public QAProfileSysOut() {
        System.out.println("quality assurance!!!!!!!");
    }
}
