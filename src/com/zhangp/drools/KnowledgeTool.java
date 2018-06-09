package com.zhangp.drools;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderError;
import org.drools.builder.KnowledgeBuilderErrors;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;

/**
 * 引擎工具
 * 
 * @author zhangp
 * 
 */
public class KnowledgeTool {

	private static KnowledgeTool instance;

	public static KnowledgeTool getInstance() {
		if (instance == null)
			instance = new KnowledgeTool();
		return instance;
	}


	/**
	 * 初始化引擎
	 * 
	 * @return
	 * @throws Exception
	 */
	public KnowledgeBase readKnowledgeBase(Object[][] drls) throws Exception {

		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory
				.newKnowledgeBuilder();
		
		for (Object[] objects : drls) {
			kbuilder.add(ResourceFactory.newClassPathResource((String) objects[0]),
					(ResourceType) objects[1]);
		}
		
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
