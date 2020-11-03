package guru.springframework.test.ds;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by nick on Nov 3, 2020
 */
@Component
@Profile("qa") // stands for quality assurance
public class QADataSource implements FakeDataSource {

    @Override
    public String getConnectionInfo() {
        return "I'm the QA DataSource.";
    }
}
