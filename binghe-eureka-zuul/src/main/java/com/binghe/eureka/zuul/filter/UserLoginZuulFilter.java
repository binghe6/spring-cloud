package com.binghe.eureka.zuul.filter;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

/**
 * 通过判断请求中是否有token，如果有认为就是已经登录的，如果没有就认为是非法请求，响应401
 * @author dongsw
 *
 */
@Component
public class UserLoginZuulFilter extends ZuulFilter {

	//编写业务逻辑
	@Override
	public Object run() throws ZuulException {
		RequestContext requestContext = RequestContext.getCurrentContext();
		HttpServletRequest request = requestContext.getRequest();
		String token = request.getParameter("token");
		if(StringUtils.isEmpty(token)){
			requestContext.setSendZuulResponse(false); // 过滤该请求，不对其进行路由
			requestContext.setResponseStatusCode(401); // 设置响应状态码
			return null;
		}
		return null;
	}

	@Override
	public boolean shouldFilter() {
		// 返回一个Boolean值，判断该过滤器是否需要执行。返回true执行，返回false不执行。
		return true;
	}

	@Override
	public int filterOrder() {
		// 通过返回的int值来定义过滤器的执行顺序，数字越小优先级越高。
		return 0;
	}

	@Override
	public String filterType() {
		/*
		 * 返回字符串代表过滤器的类型
			a)	pre：请求在被路由之前执行
			b)	routing：在路由请求时调用
			c)	post：在routing和errror过滤器之后调用
			d)	error：处理请求时发生错误调用
		 */
		return "pre";
	}

}
