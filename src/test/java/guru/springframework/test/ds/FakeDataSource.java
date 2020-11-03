package guru.springframework.test.ds;

/**
 * Created by nick on Nov 3, 2020
 */
public interface FakeDataSource {

    // This is meant to mimic the data source interface of the java specification.
    // Three implementations of this.
    String getConnectionInfo();
}
