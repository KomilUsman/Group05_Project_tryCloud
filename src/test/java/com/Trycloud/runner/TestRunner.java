package com.Trycloud.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = "com/Trycloud/step_definitions",
        publish = true,
        plugin = {"pretty", "html:target/cucumber_report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target"},
        dryRun = false
      , tags = "@smoke"
)

public class TestRunner {


}
