package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.Listeners;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features", 
glue="TestCase",
monochrome =true //display the console output in a proper readable format
,dryRun = false
//,tags = "@BookStore"
)
        
@Listeners({ExtentITestListenerClassAdapter.class})
public class TestRunner extends AbstractTestNGCucumberTests{
   
}



