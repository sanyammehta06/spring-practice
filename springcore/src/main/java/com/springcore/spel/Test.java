package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/config.xml");
	Demo demo1 = (Demo)context.getBean("demo");
	System.out.println(demo1);
	
//	SpelExpressionParser temp = new SpelExpressionParser();
//	 Expression expression = temp.parseExpression("22+44");
//	System.out.println(expression.getValue());
}
}
