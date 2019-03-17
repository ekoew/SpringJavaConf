package co.ekoew;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings({ "deprecation", "unused" })
public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);
		Operator ops1 = context.getBean(Operator.class);
		ops1.setOpid(101);
		ops1.setOpcodename("Ash");
		ops1.setOpname("Eliza Cohen");
		ops1.setOpctu("FBI SWAT");
		ops1.getOpid();
		ops1.getOpcodename();
		ops1.getOpname();
		ops1.getOpctu();
		ops1.getStats();
	}
}
