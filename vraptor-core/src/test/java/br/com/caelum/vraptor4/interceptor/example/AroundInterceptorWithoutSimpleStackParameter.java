package br.com.caelum.vraptor4.interceptor.example;

import br.com.caelum.vraptor4.AroundCall;
import br.com.caelum.vraptor4.Intercepts;

@Intercepts
public class AroundInterceptorWithoutSimpleStackParameter {

	@AroundCall
	public void intercept(){
		
	}
}