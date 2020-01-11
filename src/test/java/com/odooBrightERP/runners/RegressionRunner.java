package com.odooBrightERP.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features", //path to features
                    },
        //     features = "src/test/resources/features/activities/CalendarEvents.feature", //path to features
        glue = "com/odooBrightERP/step_definitions",    //path to step definitions
        dryRun = false, //by default it is false
        plugin = {"html:target/default-cucumber-reports",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        }
)

public class RegressionRunner {
}
