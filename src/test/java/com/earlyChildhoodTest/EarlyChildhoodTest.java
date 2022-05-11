package com.earlyChildhoodTest;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./features",
                 glue = "com.stepDefinition",
                 tags = "@Smoke",
                 monochrome = true,
                 plugin ={"pretty", "html:target/BDDReport.html"})

public class EarlyChildhoodTest {

}
