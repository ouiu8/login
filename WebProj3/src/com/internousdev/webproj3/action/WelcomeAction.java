package com.internousdev.webproj3.action;

import com.opensymphony.xwork2.ActionSupport;

public class WelcomeAction extends ActionSupport {

	/*このクラスでexecute()メソッドを実行するとSUCCESSを返す*/
	public String execute(){
		return SUCCESS;
	}

}
