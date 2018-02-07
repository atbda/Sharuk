
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestSpringDI {
    public static void main(String[] args) {
        //One time initialization in a project
        BeanFactory f = new XmlBeanFactory(new ClassPathResource("spring.xml"));
       
        MessageRenderer mr=(MessageRenderer)f.getBean("renderer");        
        mr.render();
    }    
}
