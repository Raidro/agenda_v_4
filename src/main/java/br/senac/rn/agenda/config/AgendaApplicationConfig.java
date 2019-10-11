package br.senac.rn.agenda.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AgendaApplicationConfig  implements WebMvcConfigurer {

    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**").allowedOrigins("https://a9261456-agenda-front.herokuapp.com/").allowedMethods("GET", "POST");
    }

}
