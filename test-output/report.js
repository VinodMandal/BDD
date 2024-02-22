$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/vinod/eclipse-workspace/DummyBDD/src/test/java/Feature/login.feature");
formatter.feature({
  "name": "I want to login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login to dashboard",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User in login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdef.user_in_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter un and pwd",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef.enter_un_and_pwd()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login successfull",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.login_successfull()"
});
formatter.result({
  "status": "passed"
});
});