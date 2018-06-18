package tw.com.webcomm.javasampler;

import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

public class Test1 extends AbstractJavaSamplerClient {

	public SampleResult runTest(JavaSamplerContext context) {
		SampleResult resuts = new SampleResult();
		resuts.sampleStart();
		try {
			
			resuts.setDataEncoding("UTF-8");
			resuts.setResponseCodeOK();
			resuts.setResponseData("{\"signature\":\"3044022016DB794DE8DD00650DEF46C341F1B4ED8C9B88F1B11C80FF0AF8CA4ED4B7A89E02207966D4A8A7F7A80F1BDBA935F67F85184C033BB626FCC91CABCF4E1AB8CE1332\",\"header\":{\"jwt\":\"eyJjdHkiOiJKV1QiLCJlbmMiOiJBMjU2R0NNIiwiYWxnIjoiZGlyIn0..1doPGPHTsE4_IASd.aeuOt9Y_6A0EnsjJkjW20-Ic2I56YZ9zFj4QOH1jrh9NpF4aIFsBbAPM2oR0qZWy2ZYOnwz466m7DwPxzR_OfUcwgvC7pgTBX6cq2Vh7zTOL1oTy47LIB6fPOMsjmXLy_P4MXub_ou3JfFhC3oc9RHGX6arr6r1FrqlFty1tz35y4NwVO9i7teT5uYvgGq57KSC9LLisUogl0B0LEihpqijOPGeWOZ80XfpErbeiARzAfWn3dvAp9K5-780wDJdgWp0t_qVRJxkuflEAgwYp7WnKJZN1vfzPU0lM2hQPzWcvfStwR4uvJoiewxIpujSdGG5o4AFUH1xIiCbLnk5uNbFZckPw44AjPluGwbB1xdDNB1mP69Aq5fzSRlu0y1CsSTCRXbQgqsPYECkup4Z7rsFqTcjfKkmdCKntK7Kw2nucHUj_saodGaDwUY_v5NV0TmkdDrmZW3HQ0m6gZM2BiaB7-S_avKUKDUtL2E21oBrnac99AMCcLYbPf_pc1xEBPygnkfgVRjcHfUF6nwxAjPHMR-cLiyC7LE3RYUG1XWAjMUoxY0Qsx_jti-wPdbml4gP934EEyzydNNQrcY4uuj6QB2ZU5CieTBjAy7U4J0DqfOpTcoJ9HODQLqhabhV-fx49eUDd5STsp0v5NwlXKvBofwmKzMZM4NUn97qdPnbKf3uvmjoS6q7RL4KFp_vtCC3eTrYUkBv3FxFmIrl1iNxXT1dik6H5MFSWFwycxnN6QXRB9o2gbYNe_7IvYTGHL_wl13kdsab4U7We0IALmxHkSZdVK1n9eu024VoeU5wQp8IT9vbNxIA7Wk9oEgYCwe1Aq1-XgvLNVTPhO8nVYiIkjvafLlZuqaHSYba_43JSXgCRx0TUdfesND7czacHSmFYIr7nBim20twfJOVwXcsF-FPiMqCc-CMmTW3muC0EpC_Boy-AEgFhFiYuZzGTUPTuN0g-.fEj1u2-Jhi8WMRHqa4izgQ\",\"deviceInfo\":{\"osVersion\":\"osVersion\",\"os\":\"IOS\",\"deviceModel\":\"deviceModel\",\"version\":\"com.scb.mb.tw;1.0.0\",\"udid\":\"1.1.1\"},\"locale\":\"zh_tw\"},\"body\":{}}".getBytes());
			resuts.setSuccessful(true);
		} catch (Exception e) {
			resuts.setSuccessful(false);
		}
		resuts.sampleEnd();
		
		return resuts;
	}

}
