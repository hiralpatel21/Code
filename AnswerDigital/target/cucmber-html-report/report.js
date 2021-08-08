$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("KeyPresses.feature");
formatter.feature({
  "line": 1,
  "name": "Automate  key process on menu",
  "description": "",
  "id": "automate--key-process-on-menu",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7688737927,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify the Valid Username and InValid Password",
  "description": "",
  "id": "automate--key-process-on-menu;verify-the-valid-username-and-invalid-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@key"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on key process icon",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I should see the new page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDef.i_am_on_home_page()"
});
formatter.result({
  "duration": 468902446,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDef.i_click_on_key_process_icon()"
});
formatter.result({
  "duration": 3608169916,
  "status": "passed"
});
formatter.match({
  "location": "KeyProcessStepDef.i_should_see_the_new_page()"
});
formatter.result({
  "duration": 162508,
  "status": "passed"
});
formatter.after({
  "duration": 10774972363,
  "status": "passed"
});
});