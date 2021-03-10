import com.mashibing.lookupMethod.GetBeanTest;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MyTest1 {
//	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("tx.xml");
//	}

	@Test
	public void test1(){
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("tx.xml"));
	}

	@Test
	public void test2(){
		ApplicationContext context = new ClassPathXmlApplicationContext("lookupTest.xml");
		GetBeanTest test = context.getBean("getBeanTest", GetBeanTest.class);
		test.showMe();
	}
}
