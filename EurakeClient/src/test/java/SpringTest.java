import com.discovery.client.DiscoveryClientApp;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Huws
 * @date 2022/5/11 11:14
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = DiscoveryClientApp.class)
public class SpringTest {

    @LocalServerPort
    private int port;

    private URL base;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Before
    public void setUp() throws MalformedURLException {
        this.base = new URL("http://localhost:" + port + "/hello");
    }

    @Test
    public void getHello() {
        ResponseEntity<String> responseEntity = testRestTemplate.getForEntity(base.toString(), String.class);
        System.out.println(responseEntity.getBody());
    }
}