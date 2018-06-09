package com.zhangp.demo3;

import java.util.ArrayList;
import java.util.List;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderError;
import org.drools.builder.KnowledgeBuilderErrors;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;

import com.zhangp.pojo.AdvicePojo;
import com.zhangp.pojo.OrderPojo;
import com.zhangp.pojo.ExaPojo;
import com.zhangp.pojo.HisPojo;


public class RuleTest {

	public static void main(String[] args) throws Exception {
		
		KnowledgeBase kbase = readKnowledgeBase();

		StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
		
		
		HisPojo hisPojo = new HisPojo();
		
		OrderPojo orderPojo = new OrderPojo();
		
		orderPojo.setOrderCode("2C010002");
		
		List<OrderPojo> orderPojos = new ArrayList<OrderPojo>();
		
		orderPojos.add(orderPojo);
		
		hisPojo.setOrderPojos(orderPojos);
		
		List<ExaPojo> exaPojos = new ArrayList<ExaPojo>();
		
		ExaPojo exaPojo = new ExaPojo();
		
		exaPojo.setTestitemCode("736058");
		
		exaPojo.setTestValue(new Double(0));
		
		exaPojo.setTestUnit("ng/ml");
		
		exaPojos.add(exaPojo);
		
		hisPojo.setExaPojos(exaPojos);
		
		hisPojo.setAge(new Integer(11));
		
		ksession.insert(hisPojo);
		
		ksession.fireAllRules();
		
		List<AdvicePojo> advicePojos = hisPojo.getAdvicePojos();
		
		for (AdvicePojo advicePojo : advicePojos) {
			System.out.println("ID: " + advicePojo.getKnowladgeId() + "  LEVEL: " + advicePojo.getLevel() + "  ADVICE: " + advicePojo.getAdviceText());
		}
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	private static KnowledgeBase readKnowledgeBase() throws Exception {

		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory
				.newKnowledgeBuilder();
		
		kbuilder.add(ResourceFactory
				.newClassPathResource("com/zhangp/demo3/dt01.xls"),
				ResourceType.DTABLE);
		
		KnowledgeBuilderErrors errors = kbuilder.getErrors();

		if (errors.size() > 0) {

			for (KnowledgeBuilderError error : errors) {

				System.err.println(error);
				
			}

			throw new IllegalArgumentException("Could not parse knowledge.");

		}

		KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();

		kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());

		return kbase;
	}

}
