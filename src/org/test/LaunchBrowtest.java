package org.test;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class LaunchBrowtest extends BaseClass {
	public static void main(String[] args) throws Exception {
	
	launchApp("https://www.goibibo.com/");
	enterText("//input[@placeholder='From']", "chennai");
	
	
	}
	



}
