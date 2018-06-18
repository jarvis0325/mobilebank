package tw.com.webcomm.functions;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.apache.jmeter.engine.util.CompoundVariable;
import org.apache.jmeter.functions.AbstractFunction;
import org.apache.jmeter.functions.InvalidVariableException;
import org.apache.jmeter.samplers.SampleResult;
import org.apache.jmeter.samplers.Sampler;

public class LoginFun extends AbstractFunction {

	// 自定义function的描述
	private static final List<String> desc = new LinkedList<String>();
	static {
		desc.add("SC LoginFun");
	}

	// function名称
	private static final String KEY = "__LoginFun";

	// 传入参数的值
	private Object[] values;

	public List<String> getArgumentDesc() {
		return desc;
	}

	@Override
	public String execute(SampleResult previousResult, Sampler currentSampler) throws InvalidVariableException {
		String jwtToken = new String(((CompoundVariable) values[0]).execute().trim());
		String clientPublicKey = getVariables().get("vars.clientPublicKey");
		String clientPrivateKey = getVariables().get("vars.clientPrivateKey");
		return "LoginFun:" + jwtToken + "|" + clientPublicKey + "|" + clientPrivateKey;
	}

	@Override
	public String getReferenceKey() {
		return KEY;
	}

	@Override
	public void setParameters(Collection<CompoundVariable> parameters) throws InvalidVariableException {
		// checkParameterCount(parameters, MIN_PARA_COUNT, MAX_PARA_COUNT); //检查参数的个数是否正确
		values = parameters.toArray(); // 将值存入类变量中
	}

}
