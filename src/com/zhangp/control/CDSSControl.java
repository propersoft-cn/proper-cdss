package com.zhangp.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.drools.runtime.StatefulKnowledgeSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhangp.drools.KnowledgeBaseStartTool;
import com.zhangp.drools.KnowledgeBaseWorkSpace;
import com.zhangp.pojo.AdvicePojo;
import com.zhangp.pojo.AllergyPojo;
import com.zhangp.pojo.BreakPoint;
import com.zhangp.pojo.ClpAdvicePojo;
import com.zhangp.pojo.ClpPojo;
import com.zhangp.pojo.ErdPojo;
import com.zhangp.pojo.ExaPojo;
import com.zhangp.pojo.FeePojo;
import com.zhangp.pojo.HisPojo;
import com.zhangp.pojo.MroPojo;
import com.zhangp.pojo.OpPojo;
import com.zhangp.pojo.OrderPojo;

@Controller
@RequestMapping("rest/cdss.do")
public class CDSSControl {
	
	@RequestMapping(params = "method=fireRules9")
	public void fireRules9(HttpServletRequest request, HttpServletResponse response){
		
	
		String param = "";  
	      try {  
	          BufferedReader  bufferedReader =  new BufferedReader( new InputStreamReader( request.getInputStream() ));  
	          String nextLine = bufferedReader.readLine();  
	          while( nextLine != null )  
	          {  
	        	  param += nextLine;  
	              nextLine = bufferedReader.readLine();  
	          }  
	      } catch (Exception e) {  
	          e.printStackTrace();  
	      }
	      System.out.println("fireRules9==="+param);
		
		
		String s = param;

		
		response.setCharacterEncoding("gbk");  

		HisPojo hisPojo = JSON2Object(s);
		
		
		try {
			System.out.println("CDSS 7  success");
			
			StatefulKnowledgeSession ksession = KnowledgeBaseWorkSpace.getKbase7().newStatefulKnowledgeSession();


			ksession.insert(hisPojo);
			
			ksession.fireAllRules();
			
			ksession.dispose();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("CDSS 7 error");
		}
		
		
		JSONObject json = JSONObject.fromObject(hisPojo);//将java对象转换为json对象  
        String jsonStr = json.toString();//将json对象转换为字符串 
		
	    
	    PrintWriter out = null;
		
		try {
			out = response.getWriter(); 
			
			
	        out.append(jsonStr);  
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			out.close();
		}
		
	}
	
	@RequestMapping(params = "method=fireRules1")
	public void fireRules1(HttpServletRequest request, HttpServletResponse response){
		
	
		String param = "";  
	      try {  
	          BufferedReader  bufferedReader =  new BufferedReader( new InputStreamReader( request.getInputStream() ));  
	          String nextLine = bufferedReader.readLine();  
	          while( nextLine != null )  
	          {  
	        	  param += nextLine;  
	              nextLine = bufferedReader.readLine();  
	          }  
	      } catch (Exception e) {  
	          e.printStackTrace();  
	      }
	      System.out.println("入参=fireRules1==="+param);
		
		String s = param;
		
		response.setCharacterEncoding("gbk");  

		HisPojo hisPojo = JSON2Object(s);
		
		
		try {
			System.out.println("CDSS 1 成功");
			
//			StatefulKnowledgeSession ksession = knowledgeBaseTool.getKbase1().newStatefulKnowledgeSession();
			StatefulKnowledgeSession ksession = KnowledgeBaseWorkSpace.getKbase1().newStatefulKnowledgeSession();


			ksession.insert(hisPojo);
			
			ksession.fireAllRules();
			
			ksession.dispose();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("CDSS 1 失败");
		}
		
		
		JSONObject json = JSONObject.fromObject(hisPojo);//将java对象转换为json对象  
        String jsonStr = json.toString();//将json对象转换为字符串 
		
	    
	    PrintWriter out = null;
		
		try {
			out = response.getWriter(); 
			
			
	        out.append(jsonStr);  
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			out.close();
		}
		
	}

	
	@RequestMapping(params = "method=fireRules2")
	public void fireRules2(HttpServletRequest request, HttpServletResponse response){
		
	
		String param = "";  
	      try {  
	          BufferedReader  bufferedReader =  new BufferedReader( new InputStreamReader( request.getInputStream() ));  
	          String nextLine = bufferedReader.readLine();  
	          while( nextLine != null )  
	          {  
	        	  param += nextLine;  
	              nextLine = bufferedReader.readLine();  
	          }  
	      } catch (Exception e) {  
	          e.printStackTrace();  
	      }
	      System.out.println("入参=fireRules2==="+param);
		
		
		String s = param;

		
		response.setCharacterEncoding("gbk");  

		HisPojo hisPojo = JSON2Object(s);
		
		try {
			System.out.println("CDSS 2 成功");
			
			StatefulKnowledgeSession ksession = KnowledgeBaseWorkSpace.getKbase2().newStatefulKnowledgeSession();
			System.out.println("fireRules2=====2222"+ksession);
			ksession.insert(hisPojo);
			System.out.println("fireRules2===3333"+ksession);
			ksession.fireAllRules();
			System.out.println("AdvicePojos===444"+hisPojo.getAdvicePojos());
			ksession.dispose();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("CDSS 2 失败");
		}
		
		JSONObject json = JSONObject.fromObject(hisPojo);//将java对象转换为json对象  
		System.out.println("fireRules2===555");
        String jsonStr = json.toString();//将json对象转换为字符串        
        System.out.println("fireRules2===666"+jsonStr);
	    
	    PrintWriter out = null;
		
		try {
			out = response.getWriter(); 
			 System.out.println("fireRules2===777");	
			
	        out.append(jsonStr);   
	        System.out.println("fireRules2===888"+out);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			out.close();
		}
		
	}
	
	@RequestMapping(params = "method=fireRules3")
	public void fireRules3(HttpServletRequest request, HttpServletResponse response){
		
	
		String param = "";  
	      try {  
	          BufferedReader  bufferedReader =  new BufferedReader( new InputStreamReader( request.getInputStream() ));  
	          String nextLine = bufferedReader.readLine();  
	          while( nextLine != null )  
	          {  
	        	  param += nextLine;  
	              nextLine = bufferedReader.readLine();  
	          }  
	      } catch (Exception e) {  
	          e.printStackTrace();  
	      }
	      System.out.println("入参=fireRules3==="+param);
		
		
		String s = param;

		
		response.setCharacterEncoding("gbk");  

		HisPojo hisPojo = JSON2Object(s);
		
		try {
			System.out.println("CDSS 3 成功");
			
//			StatefulKnowledgeSession ksession = knowledgeBaseTool.getKbase3().newStatefulKnowledgeSession();
			StatefulKnowledgeSession ksession = KnowledgeBaseWorkSpace.getKbase3().newStatefulKnowledgeSession();

			ksession.insert(hisPojo);
			
			ksession.fireAllRules();
			
			ksession.dispose();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("CDSS 3 失败");
		}
		
		JSONObject json = JSONObject.fromObject(hisPojo);//将java对象转换为json对象  
        String jsonStr = json.toString();//将json对象转换为字符串 
		
	    
	    PrintWriter out = null;
		
		try {
			out = response.getWriter(); 
			
			
	        out.append(jsonStr);  
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			out.close();
		}
		
	}
	
	
	@RequestMapping(params = "method=fireRules4")
	public void fireRules4(HttpServletRequest request, HttpServletResponse response){
		
	
		String param = "";  
	      try {  
	          BufferedReader  bufferedReader =  new BufferedReader( new InputStreamReader( request.getInputStream() ));  
	          String nextLine = bufferedReader.readLine();  
	          while( nextLine != null )  
	          {  
	        	  param += nextLine;  
	              nextLine = bufferedReader.readLine();  
	          }  
	      } catch (Exception e) {  
	          e.printStackTrace();  
	      }
	      System.out.println("入参=fireRules4==="+param);
		
		
		String s = param;

		
		response.setCharacterEncoding("gbk");  

		ClpPojo clpPojo = JSON2ObjectClpPojo(s);
		
		try {
			System.out.println("CDSS 4 成功");
//			StatefulKnowledgeSession ksession = knowledgeBaseTool.getKbase4().newStatefulKnowledgeSession();
			StatefulKnowledgeSession ksession = KnowledgeBaseWorkSpace.getKbase4().newStatefulKnowledgeSession();

			ksession.insert(clpPojo);
			ksession.fireAllRules();
			ksession.dispose();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("CDSS 4失败");
		}
		
		JSONObject json = JSONObject.fromObject(clpPojo);//将java对象转换为json对象  
        String jsonStr = json.toString();//将json对象转换为字符串 
		
	    
	    PrintWriter out = null;
		
		try {
			out = response.getWriter(); 
			
			
	        out.append(jsonStr);  
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			out.close();
		}
		
	}
	
	@RequestMapping(params = "method=fireRules5")
	public void fireRules5(HttpServletRequest request, HttpServletResponse response){
		
	
		String param = "";  
	      try {  
	          BufferedReader  bufferedReader =  new BufferedReader( new InputStreamReader( request.getInputStream() ));  
	          String nextLine = bufferedReader.readLine();  
	          while( nextLine != null )  
	          {  
	        	  param += nextLine;  
	              nextLine = bufferedReader.readLine();  
	          }  
	      } catch (Exception e) {  
	          e.printStackTrace();  
	      }
	      System.out.println("入参=fireRules5==="+param);
		
		
		String s = param;

		
		response.setCharacterEncoding("gbk");  

		HisPojo hisPojo = JSON2Object(s);
		
		try {
			System.out.println("CDSS 5 成功");
			
//			StatefulKnowledgeSession ksession = knowledgeBaseTool.getKbase1().newStatefulKnowledgeSession();
			StatefulKnowledgeSession ksession = KnowledgeBaseWorkSpace.getKbase1().newStatefulKnowledgeSession();


			ksession.insert(hisPojo);
			
			ksession.fireAllRules();
			
			ksession.dispose();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("CDSS 5 失败");
		}
		
		JSONObject json = JSONObject.fromObject(hisPojo);//将java对象转换为json对象  
        String jsonStr = json.toString();//将json对象转换为字符串 
		
	    
	    PrintWriter out = null;
		
		try {
			out = response.getWriter(); 
			
			
	        out.append(jsonStr);  
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			out.close();
		}
		
	}
	
	/**
	 * 将json字符串转换为java对象 
	 * @param jsonStrRe
	 * @return
	 */
	public HisPojo JSON2Object(String jsonStrRe){ 
  
         JSONObject obj = JSONObject.fromObject(jsonStrRe);//将json字符串转换为json对象  
         HisPojo hisPojo = (HisPojo)JSONObject.toBean(obj,HisPojo.class);//将建json对象转换为Person对象 
         hisPojo = parseJsonToHisPojo(hisPojo,obj);
         return hisPojo;
    }
    
	/**
	 * 将json字符串转换为java对象  
	 * @param jsonStrRe
	 * @return
	 */
    public ClpPojo JSON2ObjectClpPojo(String jsonStrRe){ 
  
         JSONObject obj = JSONObject.fromObject(jsonStrRe);//将json字符串转换为json对象  
         ClpPojo clpPojo = (ClpPojo)JSONObject.toBean(obj,ClpPojo.class);//将建json对象转换为Person对象  
         clpPojo = parseJsonToClpPojo(clpPojo,obj);
         return clpPojo;
    }
    
	/**
	 * 将json字符串转换为java对象
	 * @param hisPojo
	 * @param obj
	 * @return
	 */
	public HisPojo parseJsonToHisPojo(HisPojo hisPojo, JSONObject obj) {
		String jsonS = obj.get("orderPojos").toString();
		List<OrderPojo> objs = new ArrayList<OrderPojo>();
		JSONArray jsonArray = JSONArray.fromObject(jsonS);
		for (int i = 0; i < jsonArray.size(); i++) {
			JSONObject jsonObject = jsonArray.getJSONObject(i);
			OrderPojo obj11 = (OrderPojo) JSONObject.toBean(jsonObject,
					OrderPojo.class);
			objs.add(obj11);
		}
		hisPojo.setOrderPojos(objs);
		
		jsonS = obj.get("chestpainOrderPojos").toString();
		  objs = new ArrayList<OrderPojo>();
		  jsonArray = JSONArray.fromObject(jsonS);
			for (int i = 0; i < jsonArray.size(); i++) {
				JSONObject jsonObject = jsonArray.getJSONObject(i);
				OrderPojo obj11 = (OrderPojo) JSONObject.toBean(jsonObject,
						OrderPojo.class);
				objs.add(obj11);
			}
		   hisPojo.setChestpainOrderPojos(objs);
		   //用于护士单次执行界面
		   
			  jsonS = obj.get("singleExeOrderPojos").toString();
			  objs = new ArrayList<OrderPojo>();
			  jsonArray = JSONArray.fromObject(jsonS);
			 		for (int i = 0; i < jsonArray.size(); i++) {
						JSONObject jsonObject = jsonArray.getJSONObject(i);
						OrderPojo obj11 = (OrderPojo) JSONObject.toBean(jsonObject,
								OrderPojo.class);
						objs.add(obj11);
					}
			hisPojo.setsingleExeOrderPojos(objs);

		jsonS = obj.get("lastOrderPojos").toString();
		objs = new ArrayList<OrderPojo>();
		jsonArray = JSONArray.fromObject(jsonS);
		for (int i = 0; i < jsonArray.size(); i++) {
			JSONObject jsonObject = jsonArray.getJSONObject(i);
			OrderPojo obj11 = (OrderPojo) JSONObject.toBean(jsonObject,
					OrderPojo.class);
			objs.add(obj11);
		}
		hisPojo.setLastOrderPojos(objs);

		String jsonNames = obj.get("exaPojos").toString();
		List<ExaPojo> objsExaPojo = new ArrayList<ExaPojo>();
		jsonArray = JSONArray.fromObject(jsonNames);
		for (int i = 0; i < jsonArray.size(); i++) {
			JSONObject jsonObject = jsonArray.getJSONObject(i);
			ExaPojo obj11 = (ExaPojo) JSONObject.toBean(jsonObject,
					ExaPojo.class);
//			if(obj11.getTestValueText().length() == 0){
//				obj11.setTestValueText(null);
//			}
			objsExaPojo.add(obj11);
		}
		hisPojo.setExaPojos(objsExaPojo);

		jsonNames = obj.get("lastExaPojos").toString();
		objsExaPojo = new ArrayList<ExaPojo>();
		jsonArray = JSONArray.fromObject(jsonNames);
		for (int i = 0; i < jsonArray.size(); i++) {
			JSONObject jsonObject = jsonArray.getJSONObject(i);
			ExaPojo obj11 = (ExaPojo) JSONObject.toBean(jsonObject,
					ExaPojo.class);
			objsExaPojo.add(obj11);
		}
		hisPojo.setLastExaPojos(objsExaPojo);

		jsonNames = obj.get("breakPoints").toString();
		List<BreakPoint> objsBreakPoint = new ArrayList<BreakPoint>();
		jsonArray = JSONArray.fromObject(jsonNames);
		for (int i = 0; i < jsonArray.size(); i++) {
			JSONObject jsonObject = jsonArray.getJSONObject(i);
			BreakPoint obj11 = (BreakPoint) JSONObject.toBean(jsonObject,
					BreakPoint.class);
			objsBreakPoint.add(obj11);
		}
		hisPojo.setBreakPoints(objsBreakPoint);

		jsonNames = obj.get("advicePojos").toString();
		List<AdvicePojo> objsAdvicePojo = new ArrayList<AdvicePojo>();
		jsonArray = JSONArray.fromObject(jsonNames);
		for (int i = 0; i < jsonArray.size(); i++) {
			JSONObject jsonObject = jsonArray.getJSONObject(i);
			AdvicePojo obj11 = (AdvicePojo) JSONObject.toBean(jsonObject,
					AdvicePojo.class);
			objsAdvicePojo.add(obj11);
		}
		hisPojo.setAdvicePojos(objsAdvicePojo);

		jsonNames = obj.get("erdPojos").toString();
		List<ErdPojo> objsErdPojo = new ArrayList<ErdPojo>();
		jsonArray = JSONArray.fromObject(jsonNames);
		for (int i = 0; i < jsonArray.size(); i++) {
			JSONObject jsonObject = jsonArray.getJSONObject(i);
			ErdPojo obj11 = (ErdPojo) JSONObject.toBean(jsonObject,
					ErdPojo.class);
			objsErdPojo.add(obj11);
		}
		hisPojo.setErdPojos(objsErdPojo);

		jsonNames = obj.get("allergyPojos").toString();
		List<AllergyPojo> objsAllergyPojo = new ArrayList<AllergyPojo>();
		jsonArray = JSONArray.fromObject(jsonNames);
		for (int i = 0; i < jsonArray.size(); i++) {
			JSONObject jsonObject = jsonArray.getJSONObject(i);
			AllergyPojo obj11 = (AllergyPojo) JSONObject.toBean(jsonObject,
					AllergyPojo.class);
			objsAllergyPojo.add(obj11);
		}
		hisPojo.setAllergyPojos(objsAllergyPojo);

		return hisPojo;
	}

	public ClpPojo parseJsonToClpPojo(ClpPojo clpPojo, JSONObject obj) {
		String jsonS = obj.get("clpAdvicePojos").toString();
		List<ClpAdvicePojo> objs = new ArrayList<ClpAdvicePojo>();
		JSONArray jsonArray = JSONArray.fromObject(jsonS);
		for (int i = 0; i < jsonArray.size(); i++) {
			JSONObject jsonObject = jsonArray.getJSONObject(i);
			ClpAdvicePojo obj11 = (ClpAdvicePojo) JSONObject.toBean(jsonObject,
					ClpAdvicePojo.class);
			objs.add(obj11);
		}
		clpPojo.setClpAdvicePojos(objs);

		return clpPojo;
	}
	
	
	
	
	@RequestMapping(params = "method=fireMroRule")
	public void fireMroRule(HttpServletRequest request, HttpServletResponse response){

		String param = "";
		try {
			BufferedReader  bufferedReader =  new BufferedReader( new InputStreamReader( request.getInputStream() ));
			String nextLine = bufferedReader.readLine();
			while( nextLine != null ){
				param += nextLine;
				nextLine = bufferedReader.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("入参=fireRules1==="+param);
		
		String s = param;
		
		response.setCharacterEncoding("gbk");  

		JSONObject obj = JSONObject.fromObject(s); 
		MroPojo mroPojo = (MroPojo) JSONObject.toBean(obj, MroPojo.class);//将建json对象转换为Person对象
		
		String jst = obj.get("opPojos").toString();
		List<OpPojo> opPojos = new ArrayList<OpPojo>();
		JSONArray jsonArray = JSONArray.fromObject(jst);
		for (int i = 0; i < jsonArray.size(); i++) {
			JSONObject jsonObject = jsonArray.getJSONObject(i);
			OpPojo opPojo = (OpPojo) JSONObject.toBean(jsonObject,
					OpPojo.class);
			opPojos.add(opPojo);
		}
		mroPojo.setOpPojos(opPojos);
		
		jst = obj.get("opBookPojos").toString();
		List<OpPojo> opBookPojos = new ArrayList<OpPojo>();
		jsonArray = JSONArray.fromObject(jst);
		for (int i = 0; i < jsonArray.size(); i++) {
			JSONObject jsonObject = jsonArray.getJSONObject(i);
			OpPojo opPojo = (OpPojo) JSONObject.toBean(jsonObject,
					OpPojo.class);
			opBookPojos.add(opPojo);
		}
		mroPojo.setOpBookPojos(opBookPojos);
		
		jst = obj.get("feePojos").toString();
		List<FeePojo> feePojos = new ArrayList<FeePojo>();
		jsonArray = JSONArray.fromObject(jst);
		for (int i = 0; i < jsonArray.size(); i++) {
			JSONObject jsonObject = jsonArray.getJSONObject(i);
			FeePojo feePojo = (FeePojo) JSONObject.toBean(jsonObject,
					FeePojo.class);
			feePojos.add(feePojo);
		}
		mroPojo.setFeePojos(feePojos);
		
		try {
			System.out.println("fireMroRule 成功");
			
			System.out.println(KnowledgeBaseWorkSpace.getKbaseMroFlow());
			
			StatefulKnowledgeSession ksession = KnowledgeBaseWorkSpace.getKbaseMroFlow().newStatefulKnowledgeSession();

			ksession.insert(mroPojo);
			
			ksession.startProcess("mro02");
			
			ksession.fireAllRules();
			
			ksession.dispose();
			
			
			System.out.println(mroPojo);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("fireMroRule 失败");
		}
		
		
		JSONObject json = JSONObject.fromObject(mroPojo);//将java对象转换为json对象  
        String jsonStr = json.toString();//将json对象转换为字符串 
		
	    
	    PrintWriter out = null;
		
		try {
			out = response.getWriter(); 
			
			
	        out.append(jsonStr);  
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			out.close();
		}
		
	}
	
	
	@RequestMapping(params = "method=fireRules6")
	public void fireRules6(HttpServletRequest request, HttpServletResponse response){
		
	
		String param = "";  
	      try {  
	          BufferedReader  bufferedReader =  new BufferedReader( new InputStreamReader( request.getInputStream() ));  
	          String nextLine = bufferedReader.readLine();  
	          while( nextLine != null )  
	          {  
	        	  param += nextLine;  
	              nextLine = bufferedReader.readLine();  
	          }  
	      } catch (Exception e) {  
	          e.printStackTrace();  
	      }
	      System.out.println("入参=fireRules6==="+param);
		
		
		String s = param;

		
		response.setCharacterEncoding("gbk");  

		HisPojo hisPojo = JSON2Object(s);
		
		
		try {
			System.out.println("CDSS 6 成功");
			
			StatefulKnowledgeSession ksession = KnowledgeBaseWorkSpace.getKbase5().newStatefulKnowledgeSession();
			
			ksession.insert(hisPojo);			
			ksession.fireAllRules();
			ksession.dispose();
			
			List<AdvicePojo> advicePojos = hisPojo.getAdvicePojos();
			List<String> adviceList = new ArrayList<String>();
			List<String> orderList = new ArrayList<String>();
			List<String> orderCodeList = new ArrayList<String>();
			for (AdvicePojo advicePojo : advicePojos) {
				String aa = advicePojo.getOrderCode()+";"+advicePojo.getTransHospCode()+";"+advicePojo.getOptitemCode()+";"+advicePojo.getDevCode() +";"  +advicePojo.getMedQty();
				String bb = advicePojo.getOrderCode()+";"+advicePojo.getTransHospCode()+";"+advicePojo.getOptitemCode()+";" +advicePojo.getDevCode() ;

				if(!adviceList.contains(aa)){
					adviceList.add(aa);
				}
				
				if(!orderList.contains(bb)){
					orderList.add(bb);
				}
				
				if(!orderCodeList.contains(advicePojo.getOrderCode())){
					orderCodeList.add(advicePojo.getOrderCode());
				}

			}
			
			for (int i = 0; i < adviceList.size(); i++) {
				System.out.println(adviceList.get(i));
			}
			
			System.out.println("------------------");
			
		    advicePojos = new ArrayList<AdvicePojo>();
			AdvicePojo advicePojo = new AdvicePojo();
			for (int i = 0; i < orderList.size(); i++) {
				System.out.println(orderList.get(i));
				List<String> aa = new ArrayList<String>();
				for (int j = 0; j < adviceList.size(); j++) {
					if(adviceList.get(j).contains(orderList.get(i))){
						aa.add(adviceList.get(j));
					}
					
				}
				
				if(aa.size() > 0){
					System.out.println("aa---0------"+aa.get(0));
					if(aa.size() == 1){
						advicePojo = new AdvicePojo();
						String pojo[] = aa.get(0).split(";");
						advicePojo.setOrderCode(pojo[0]);
						advicePojo.setTransHospCode(pojo[1]);
						advicePojo.setOptitemCode(pojo[2]);
						advicePojo.setMedQty(Double.parseDouble(pojo[4]));
						advicePojo.setRemarks("N");
						advicePojos.add(advicePojo);
					}else{
						advicePojo = new AdvicePojo();
						String [] pojo = aa.get(0).split(";");
						advicePojo.setOrderCode(pojo[0]);
						advicePojo.setTransHospCode(pojo[1]);
						advicePojo.setOptitemCode(pojo[2]);
						double qty = Double.parseDouble(pojo[4]);
						for (int k = 1; k < aa.size(); k++) {
							System.out.println("aa---"+k+"------"+aa.get(k));
							pojo = aa.get(k).split(";");
							if(qty < Double.parseDouble(pojo[4])){
								qty = Double.parseDouble(pojo[4]);
							}
						}
						
						advicePojo.setMedQty(qty);
						advicePojo.setRemarks("N");
						advicePojos.add(advicePojo);
					}
					
					
				}
				
			}
			
			
			hisPojo.setAdvicePojos(advicePojos);
			
			hisPojo.setOrderCodeList(orderCodeList);
			
			ksession = KnowledgeBaseWorkSpace.getKbase6().newStatefulKnowledgeSession();
			
			ksession.insert(hisPojo);			
			ksession.fireAllRules();
			ksession.dispose();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("CDSS 6 失败");
		}
		
		
		JSONObject json = JSONObject.fromObject(hisPojo);//将java对象转换为json对象  
        String jsonStr = json.toString();//将json对象转换为字符串 
		
	    
	    PrintWriter out = null;
		
		try {
			out = response.getWriter(); 
			
			
	        out.append(jsonStr);  
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			out.close();
		}
		
	}
	
	//用于护士单次执行界面
	@RequestMapping(params = "method=fireRules7")
	public void fireRules7(HttpServletRequest request, HttpServletResponse response){

		String param = "";  
	      try {  
	          BufferedReader  bufferedReader =  new BufferedReader( new InputStreamReader( request.getInputStream() ));  
	          String nextLine = bufferedReader.readLine();  
	          while( nextLine != null )  
	          {  
	        	  param += nextLine;  
	              nextLine = bufferedReader.readLine();  
	          }  
	      } catch (Exception e) {  
	          e.printStackTrace();  
	      }
	      System.out.println("入参=fireRules7==="+param);	
		String s = param;
		response.setCharacterEncoding("gbk");  
		HisPojo hisPojo = JSON2Object(s);	
		try {
			System.out.println("INWCDSS成功");

			StatefulKnowledgeSession ksession = KnowledgeBaseWorkSpace.getInwRule().newStatefulKnowledgeSession();
			ksession.insert(hisPojo);		 	
			ksession.fireAllRules();			 
			ksession.dispose();			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("INWCDSS失败");
		}		
		JSONObject json = JSONObject.fromObject(hisPojo);//将java对象转换为json对象  
        String jsonStr = json.toString();//将json对象转换为字符串     
	    PrintWriter out = null;
		
		try {
			out = response.getWriter(); 
	        out.append(jsonStr); 
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			out.close();
		}
		
	}
	//用于单病种转入界面
	@RequestMapping(params = "method=fireRules8")
	public void fireRules8(HttpServletRequest request, HttpServletResponse response){

		String param = "";  
	      try {  
	          BufferedReader  bufferedReader =  new BufferedReader( new InputStreamReader( request.getInputStream() ));  
	          String nextLine = bufferedReader.readLine();  
	          while( nextLine != null )  
	          {  
	        	  param += nextLine;  
	              nextLine = bufferedReader.readLine();  
	          }  
	      } catch (Exception e) {  
	          e.printStackTrace();  
	      }
	      System.out.println("入参=fireRules8==="+param);	
		String s = param;
		response.setCharacterEncoding("gbk");  
		HisPojo hisPojo = JSON2Object(s);
		try {
			System.out.println("INWCDSS成功");	
			StatefulKnowledgeSession ksession = KnowledgeBaseWorkSpace.getSingleTranferRule().newStatefulKnowledgeSession();
			ksession.insert(hisPojo);		 		
			ksession.fireAllRules();			 
			ksession.dispose();			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("INWCDSS失败");
		}		
		JSONObject json = JSONObject.fromObject(hisPojo);//将java对象转换为json对象  
        String jsonStr = json.toString();//将json对象转换为字符串     
	    PrintWriter out = null;
		
		try {
			out = response.getWriter(); 
	        out.append(jsonStr); 
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			out.close();
		}
		
	}
}
