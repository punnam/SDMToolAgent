package com.dmtool.rest.controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import com.dmtool.domain.AgentInfo;

/**
 * FundsController class will expose a series of RESTful endpoints
 */
@Controller
public class AgentInfoController {

	@Autowired
	private View jsonView_i;
	
	private @Autowired HttpServletRequest request;
	
	private static final String DATA_FIELD = "data";
	private static final String ERROR_FIELD = "error";
	private String sDMToolServerUrl= "";

	private static final Logger logger_c = Logger.getLogger(AgentInfoController.class);
	public static boolean isEmpty(String s_p) {
		return (null == s_p) || s_p.trim().length() == 0;
	}
	
	@RequestMapping(value = "/rest/getAgentInfo/", method = RequestMethod.GET)
	public ModelAndView getAgentInfo() throws IOException {
		String host = request.getRemoteHost();
		int remotePort = request.getRemotePort();
		String remoteUser = request.getRemoteUser();
		String remoteAddress = request.getRemoteAddr();
		String serverName = request.getServerName();
		int serverPort = request.getServerPort();
		AgentInfo agentInfo = new AgentInfo(host, remotePort, remoteUser, remoteAddress,serverName,serverPort);
		sendPOST(agentInfo);
		logger_c.debug("Returing Agent Info: " + agentInfo.toString());
		return new ModelAndView(jsonView_i, DATA_FIELD, agentInfo);
	}


	/**
	 * Create an error REST response.
	 *
	 * @param sMessage
	 *            the s message
	 * @return the model and view
	 */
	private ModelAndView createErrorResponse(String sMessage) {
		return new ModelAndView(jsonView_i, ERROR_FIELD, sMessage);
	}
	
	/**
	 * Injector methods.
	 *
	 * @param view
	 *            the new json view
	 */
	public void setJsonView(View view) {
		jsonView_i = view;
	}

	private void sendPOST(AgentInfo agentInfo) throws IOException {
		//String POST_URL = "http://localhost:8080/SDMTool/rest/saveAgentInfo/";
		// http://localhost:8080/SDMTool/index.html#/
		ObjectMapper mapper = new ObjectMapper();

		// Object to JSON in String
		String jsonInString = mapper.writeValueAsString(agentInfo);

		CloseableHttpClient client = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(sDMToolServerUrl);
		StringEntity entity = new StringEntity(jsonInString);
		entity.setContentType("application/json");
		httpPost.setEntity(entity);
		// httpPost.setHeader("Accept", "application/json");
		// httpPost.setHeader("Content-type", "application/json");

		CloseableHttpResponse response = client.execute(httpPost);
		System.out.println(response.getStatusLine().getStatusCode());
		System.out.println(response.getStatusLine().getReasonPhrase());
		client.close();

	}
	

	private  String getStringFromInputStream(InputStream is) {
		if(true){
			return "";
		}	
		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();

		
		try {

			br = new BufferedReader(new InputStreamReader(is));
			String line = br.readLine();	
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return sb.toString();

	}
	
	@RequestMapping(value = "/rest/executeCommand/", method = RequestMethod.POST)
	private String executeCommand(String command) {
		Process p;
		StringBuilder  sb = new StringBuilder();
		try {
			p = Runtime.getRuntime().exec(command);
			InputStream error = p.getErrorStream();
			InputStream output = p.getInputStream();
			String errorString = getStringFromInputStream(error);
			String outputString = getStringFromInputStream(output);
			sb.append(errorString);
			sb.append(System.lineSeparator());
			sb.append(outputString);
			return sb.toString();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sb.toString();
	}
	@RequestMapping(value = "/rest/setUrl/", method = RequestMethod.POST)
	public String setSDMToolServerUrl(String urls) {
		String url = request.getParameter("SdmServerUrl");
		sDMToolServerUrl = url;
		return "true";
	}
} 																											