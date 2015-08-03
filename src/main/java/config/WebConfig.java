package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by 24digital on 7/26/15.
 */
@Configuration
@EnableWebMvc
@ComponentScan({"controller","model"})
public class WebConfig extends WebMvcConfigurerAdapter

{
@Bean
    public ViewResolver viewResolver()
{
    InternalResourceViewResolver view = new InternalResourceViewResolver();
    view.setPrefix("/WEB-INF/views/");
    view.setSuffix(".jsp");
    view.setExposeContextBeansAsAttributes(true);
    return view;
}
}
