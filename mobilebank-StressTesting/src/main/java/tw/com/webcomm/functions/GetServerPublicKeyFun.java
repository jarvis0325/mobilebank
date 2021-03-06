package tw.com.webcomm.functions;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.apache.jmeter.engine.util.CompoundVariable;
import org.apache.jmeter.functions.AbstractFunction;
import org.apache.jmeter.functions.InvalidVariableException;
import org.apache.jmeter.samplers.SampleResult;
import org.apache.jmeter.samplers.Sampler;

public class GetServerPublicKeyFun extends AbstractFunction {

	// 自定义function的描述
	private static final List<String> desc = new LinkedList<String>();
	static {
		desc.add("SC GetServerPublicKeyFun");
	}

	// function名称
	private static final String KEY = "__GetServerPublicKeyFun";

	public List<String> getArgumentDesc() {
		return desc;
	}

	@Override
	public String execute(SampleResult previousResult, Sampler currentSampler) throws InvalidVariableException {
		Random rand = new Random();
		int n = rand.nextInt(500) + 1;
		String clientPublicKey = "clientPublicqazxsw" + n;
		String clientPrivateKey = "clientPrivatefdsaq" + n;
		getVariables().put("vars.clientPublicKey", clientPublicKey);
		getVariables().put("vars.clientPrivateKey", clientPrivateKey);
		return "GetServerPublicKeyFun:" + clientPublicKey + "|" + clientPrivateKey;
	}

	@Override
	public String getReferenceKey() {
		return KEY;
	}

	@Override
	public void setParameters(Collection<CompoundVariable> arg0) throws InvalidVariableException {
		// TODO Auto-generated method stub
	}

}
