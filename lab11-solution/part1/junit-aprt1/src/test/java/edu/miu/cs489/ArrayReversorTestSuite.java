package edu.miu.cs489;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SuiteDisplayName("ArrayReversor TestSuite")
@SelectClasses(value = {ArrayReversorTest.class})
public class ArrayReversorTestSuite {

}
