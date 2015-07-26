import controller.Home;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

/**
 * Created by 24digital on 7/26/15.
 */
public class HomeControllerTest {
    @Test
    public void testHome() throws Exception {
        Home home = new Home();
        MockMvc  standalone = MockMvcBuilders.standaloneSetup(home).build();
     //   standalone.perform(MockMvcRequestBuilders.get("/")).andExpect(ResultMatcher.view().name("home"));
    }
}
