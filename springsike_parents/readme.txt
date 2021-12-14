




[死磕 Spring] --- IOC 之深入理解 Spring IoC
https://www.cmsblogs.com/article/1391375268060467200


20211204-20211208   第一轮学习



20211208   第二轮学习

package com.tiza.leo.springsike_apiservice01.loadBean
   public static void main(String[] args) {
        ClassPathResource classPathResource = new ClassPathResource("bean.xml");
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        beanDefinitionReader.loadBeanDefinitions(classPathResource);
    }



https://blog.csdn.net/wei198621/article/details/121943421

package com.tiza.leo.springsike_apiservice01.Test02LookUpMethod

   public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean.xml");
        //ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Display display = (Display) context.getBean("display");
        display.display();
    }


package com.tiza.leo.springsike_apiservice01.Test03Replace

  public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean.xml");
        Method method = (Method) context.getBean("method");
        method.display();
    }

