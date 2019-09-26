$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:stepdef/exception.feature");
formatter.feature({
  "name": "Exception feature file",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Scenario Number One",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Raise an exception",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefs.raiseException()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: Fail it!!\r\n\tat stepdef.Stepdefs.raiseException(Stepdefs.java:23)\r\n\tat ✽.Raise an exception(classpath:stepdef/exception.feature:4)\r\n",
  "status": "failed"
});
formatter.uri("classpath:stepdef/scenariooutlines.feature");
formatter.feature({
  "name": "Scenario Outlines feature file",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Scenario Outline Row \u003crow_num\u003e",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Write a \u0027given\u0027 step with precondition in \u0027\u003cscenario_num\u003e\u0027",
  "keyword": "Given "
});
formatter.step({
  "name": "Complete action in \u0027when\u0027 step in \u0027\u003cscenario_num\u003e\u0027",
  "keyword": "When "
});
formatter.step({
  "name": "Validate the outcome in \u0027then\u0027 step in \u0027\u003cscenario_num\u003e\u0027",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "scenario_num",
        "row_num"
      ]
    },
    {
      "cells": [
        "Scenario Outline One",
        "1"
      ]
    },
    {
      "cells": [
        "Scenario Outline Two",
        "2"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Scenario Outline Row 1",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Write a \u0027given\u0027 step with precondition in \u0027Scenario Outline One\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefs.step(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Complete action in \u0027when\u0027 step in \u0027Scenario Outline One\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefs.step(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the outcome in \u0027then\u0027 step in \u0027Scenario Outline One\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefs.step(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Scenario Outline Row 2",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Write a \u0027given\u0027 step with precondition in \u0027Scenario Outline Two\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefs.step(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Complete action in \u0027when\u0027 step in \u0027Scenario Outline Two\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefs.step(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the outcome in \u0027then\u0027 step in \u0027Scenario Outline Two\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefs.step(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("classpath:stepdef/scenarios.feature");
formatter.feature({
  "name": "Scenarios feature file",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Scenario Number One",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Write a \u0027given\u0027 step with precondition in \u0027Scenario One\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefs.step(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Complete action in \u0027when\u0027 step in \u0027Scenario One\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefs.step(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the outcome in \u0027then\u0027 step in \u0027Scenario One\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefs.step(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Scenario Number Two",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Write a \u0027given\u0027 step with precondition in \u0027Scenario Two\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefs.step(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Complete action in \u0027when\u0027 step in \u0027Scenario Two\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefs.step(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the outcome in \u0027then\u0027 step in \u0027Scenario Two\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefs.step(String,String)"
});
formatter.result({
  "status": "passed"
});
});