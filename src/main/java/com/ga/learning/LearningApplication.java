package com.ga.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ga.learning.springmvc.Course;

//@SpringBootApplication
public class LearningApplication {

	public static void main(String[] args) {
		// SpringApplication.run(LearningApplication.class, args);

		// TRADITIONAL SPRING MVC
		
		Course course = new Course(); course.setCourseId("C004");
		course.setCourseName("Microservices"); course.setDepartment("Java");
		
		//System.out.println(course.toString());
		
		ApplicationContext context = new
		ClassPathXmlApplicationContext("coursebean.xml"); Course course1 = (Course)
		context.getBean("coursebean_1"); Course course2 =
		context.getBean("coursebean_2", Course.class);
		
		//System.out.println("SPRING IOC IN ACTION");
		System.out.println(course1.toString());
		System.out.println(course2.toString());
		
		 /* Bean factory Resource resource = new ClassPathResource("coursebean.xml");
		 * BeanFactory beanFactory = new XmlBeanFactory(resource);
		 * 
		 * //Course course3 = (Course) beanFactory.getBean("coursebean_1");
		 * //System.out.println(course3.toString());
		 * 
		 * ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
		 * cxt.close();
		 */

		// SPRING BOOT
		/*
		 * ConfigurableApplicationContext cxt =
		 * SpringApplication.run(LearningApplication.class, args); Course crse =
		 * cxt.getBean(Course.class); crse.display();
		 */
		
		//AOP

		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("learning.xml");
		 * ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
		 * 
		 * LearningService ls = (LearningService) cxt.getBean("learningServiceProxy");
		 * //ls.setName("TEST" ); ls.helloLearner();
		 * 
		 * System.out.println("***************"); try { ls.invalidArgument();
		 * 
		 * } catch (Exception e) { }
		 */

	}

}
