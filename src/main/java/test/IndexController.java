/*
 * Copyright 2002-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for sending the user to the login view.
 *
 * @author Rob Winch
 *
 */
@RestController
public class IndexController {
	
	@RequestMapping(method=RequestMethod.GET, path="/")
	public String index() {
		return "index";
	}
	@RequestMapping(method=RequestMethod.GET, path="/saiu")
	public String saiu() {
		return "saiu";
	}
	@RequestMapping(method=RequestMethod.GET, path="/logout")
	public String sair(HttpServletRequest arg0) {
		arg0.getSession(true).invalidate();
		SecurityContextHolder.clearContext();
		System.out.println("saindo");
		return "sair";
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/expired")
	public String expired() {
		return "expired";
	}
}
