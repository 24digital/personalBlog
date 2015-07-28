import controller.Home;
import model.BlogRepository;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.mock;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * Created by 24digital on 7/26/15.
 */
public class HomeControllerTest {
    @Test
    public void testHome() throws Exception {
        BlogRepository repository = mock(BlogRepository.class);
        Home controller = new Home(repository);
        MockMvc  standalone = MockMvcBuilders.standaloneSetup(controller).build();
        standalone.perform(MockMvcRequestBuilders.get("/")).andExpect(view().name("index"));
    }


}
