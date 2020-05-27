package org.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class FirstCry {
@BeforeClass
private void launch() {
System.out.println("hai");
}
@AfterClass
private void close() {
	System.out.println("hai");
}
@BeforeMethod
private void startTime() {
	System.out.println("hai");
}
@AfterMethod
private void endTime() {
	System.out.println("hai");
}
}
