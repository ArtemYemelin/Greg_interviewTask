package hello.world.interviewTask.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("helloworld");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/registration").setViewName("registration");
        registry.addViewController("/spas").setViewName("registration");
    }
}
