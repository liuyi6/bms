package com.luis.bms.security;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.luis.bms.common.request.Request;
import com.luis.bms.common.response.Response;
import com.luis.bms.common.utils.ResultCode;

@Aspect
@Component("authorityAspect")
public class AuthorityAspect implements MethodInterceptor {

	@Autowired
	private HttpServletRequest req;

	@SuppressWarnings("rawtypes")
	Response response = new Response();

	private static String streamNo;

	// @Pointcut(value = "execution(* com.luis.bms..*Controller.*(..))")
	@SuppressWarnings("rawtypes")
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object target = null;
		if (doAuthority(invocation)) {
			target = invocation.proceed();
			if (target instanceof Response) {
				((Response) target).setStreamNo(streamNo);
			}
		} else {
			target = response;
		}
		return target;
	}

	private boolean doAuthority(MethodInvocation invocation) {
		boolean authFlag = true;
		Cookie[] cookies = req.getCookies();
		String token = req.getParameter("token");
		streamNo = req.getParameter("streamNo");
		String loginUserId = req.getParameter("loginUserId");
		if (StringUtils.isEmpty(token)) {
			token = getValueByCookie(cookies, "token");
		}
		if (StringUtils.isEmpty(token)) {
			token = req.getHeader("token");
		}
		if (StringUtils.isEmpty(streamNo)) {
			streamNo = getValueByCookie(cookies, "streamNo");
		}
		if (StringUtils.isEmpty(loginUserId)) {
			loginUserId = getValueByCookie(cookies, "loginUserId");
		}
		Object[] objects = invocation.getArguments();
		for (Object obj : objects) {
			if (obj instanceof Request) {
				Request request = (Request) obj;
				if (StringUtils.isEmpty(token)) {
					token = request.getToken();
				}
				if (StringUtils.isEmpty(streamNo)) {
					streamNo = request.getStreamNo();
				}
				if (StringUtils.isEmpty(loginUserId)) {
					loginUserId = request.getLoginUserId();
				}
			}
		}
		response.setStreamNo(streamNo);
		if (StringUtils.isEmpty(token)) {
			response.setResultState(ResultCode.EMPTY_TOKEN);
			authFlag = false;
			return authFlag;
		}
		if (StringUtils.isEmpty(loginUserId)) {
			response.setResultState(ResultCode.EMPTY_LOGINUSERID);
			authFlag = false;
			return authFlag;
		}
		return authFlag;
	}

	private static String getValueByCookie(Cookie[] cookies, String key) {
		if (null != cookies && cookies.length > 0) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equalsIgnoreCase(key)) {
					return cookie.getValue();
				}
			}
		}
		return null;
	}
}
