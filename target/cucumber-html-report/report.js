$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TC1.feature");
formatter.feature({
  "line": 2,
  "name": "TC1",
  "description": "",
  "id": "tc1",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Palo-IT"
    }
  ]
});
formatter.background({
  "comments": [
    {
      "line": 4,
      "value": "#--------------------------------  Scenario Flow 1 --------------------------------------------------#"
    }
  ],
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "Launching the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonSteps.launching_the_browser()"
});
formatter.result({
  "duration": 15913282200,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Enter a text in Native androip app",
  "description": "",
  "id": "tc1;enter-a-text-in-native-androip-app",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@TC1"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "user should able to enter \"PALO IT - QA\" in search textbox",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "PALO IT - QA",
      "offset": 27
    }
  ],
  "location": "SearchProduct.user_should_able_to_enter_in_search_textbox(String)"
});
formatter.result({
  "duration": 17760979800,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.close_browser()"
});
formatter.result({
  "duration": 12132287100,
  "status": "passed"
});
formatter.after({
  "duration": 191300,
  "status": "passed"
});
});