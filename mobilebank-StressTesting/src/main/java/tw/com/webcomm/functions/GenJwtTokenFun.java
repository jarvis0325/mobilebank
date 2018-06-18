package tw.com.webcomm.functions;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.apache.jmeter.engine.util.CompoundVariable;
import org.apache.jmeter.functions.AbstractFunction;
import org.apache.jmeter.functions.InvalidVariableException;
import org.apache.jmeter.samplers.SampleResult;
import org.apache.jmeter.samplers.Sampler;

public class GenJwtTokenFun extends AbstractFunction {

	// 自定义function的描述
	private static final List<String> desc = new LinkedList<String>();
	static {
		desc.add("SC GenJwtTokenFun");
	}

	// function名称
	private static final String KEY = "__GenJwtTokenFun";

	public List<String> getArgumentDesc() {
		return desc;
	}

	@Override
	public String execute(SampleResult previousResult, Sampler currentSampler) throws InvalidVariableException {
		String clientPublicKey = getVariables().get("vars.clientPublicKey");
		String clientPrivateKey = getVariables().get("vars.clientPrivateKey");
		return "GenJwtTokenFun:" + clientPublicKey + "|" + clientPrivateKey;
	}

	@Override
	public String getReferenceKey() {
		return KEY;
	}

	@Override
	public void setParameters(Collection<CompoundVariable> parameters) throws InvalidVariableException {
		// checkParameterCount(parameters, MIN_PARA_COUNT, MAX_PARA_COUNT); //检查参数的个数是否正确
		// values = parameters.toArray(); // 将值存入类变量中
	}

}
