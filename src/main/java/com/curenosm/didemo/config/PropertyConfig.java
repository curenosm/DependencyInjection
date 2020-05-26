package com.curenosm.didemo.config;

import com.curenosm.didemo.examplebeans.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/* ORDEN DE OBTENCIÓN Y SUSTITUCION DE PROPIEDADES (ARRIBA MÁYOR PRIORIDAD)
* 1. Devtools global settings properties (~/.spring-boot-devtools.properties)
* 2. @TestPropertySource annotations
* 3. @SpringBootTest#properties
* 4. Command line arguments
* 5. Properties from SPRING_APPLICATION_JSON (JSON como variable de entorno o del sistema)
* 6. ServletConfig init parameters
* 7. ServletContext init paramenters
* 8. JNDI attributes from java:comp/env
* 9. Java system properties ( System.getProperties() )
* 10. OS Environment variables
* 11. Un RandomValuePropertySource que tenga propiedades solo en random.*
* 12. Profile specific application properties fuera del jar empaquetado (application-{properties}.properties y
*                                                                       variantes de YAML)
* 13. Profile specific application properties dentro del jar empaquetado (application-{properties}.properties y
*                                                                       variantes de YAML)
* 14. Application properties fuera del jar empaquetado (application.properties y variantes de YAML)
* 15. Application properties dentro del jar empaquetado (application.properties y variantes de YAML)
* 16. Anotaciones PropertySource en @Configuration classes
* 17. Default properties especificadas usando SpringApplication.setDefaultProperties
*
* */


@Configuration
// @PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
// @PropertySources({
//         @PropertySource("classpath:datasource.properties"),
//         @PropertySource("classpath:jms.properties")
// })
public class PropertyConfig {

    // Para usar variables de entorno
    // @Autowired
    // Environment env;

    @Value("${curenosm.username}")
    String user;

    @Value("${curenosm.password}")
    String password;

    @Value("${curenosm.dburl}")
    String url;

    @Value("${curenosm.jms.username}")
    String jmsUsername;

    @Value("${curenosm.jms.password}")
    String jmsPassword;

    @Value("${curenosm.jms.url}")
    String jmsURL;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        // Para usar variables de entorno
        // fakeDataSource.setUsername(env.getProperty("USERNAME"));
        fakeDataSource.setUsername(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);

        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUsername(jmsUsername);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsURL);
        return fakeJmsBroker;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){

        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer =
                new PropertySourcesPlaceholderConfigurer();

        return propertySourcesPlaceholderConfigurer;
    }
}
