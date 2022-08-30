package com.cust.tags;

import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class MyTagHandler extends TagSupport {
	public int doStartTag() {
		try {
			JspWriter out = pageContext.getOut();
			out.println("Custom Tag!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
	}
}
