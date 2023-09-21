package studyonline.java_annotation_approach;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// This is where we write all the configurations

@Configuration
@ComponentScan(basePackages = "studyonline.java_annotation_approach")
public class StudentConfig {

}
