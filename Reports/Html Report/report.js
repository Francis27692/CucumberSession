$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/FBLogin.feature");
formatter.feature({
  "name": "To validate Login functionality using Facebook Application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User have to enter facebook login by google chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefiniton.user_have_to_enter_facebook_login_by_google_chrome()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "    To validate login by using valid email and invalid password",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@Sanity"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "User have to enter  invalid email and invalid password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefiniton.user_have_to_enter_invalid_email_and_invalid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefiniton.user_have_to_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to reach invalid login credentials page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefiniton.user_have_to_reach_invalid_login_credentials_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User have to enter facebook login by google chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefiniton.user_have_to_enter_facebook_login_by_google_chrome()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "    To validate login by using invalid email and invalid password",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@Smoke"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "User have to enter  invalid email and invalid password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefiniton.user_have_to_enter_invalid_email_and_invalid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefiniton.user_have_to_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to reach invalid login credentials page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefiniton.user_have_to_reach_invalid_login_credentials_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/FeatureFiles/ForgotPass.feature");
formatter.feature({
  "name": "",
  "description": "To validate functionality of forgotten password in facebook application",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@ForgotPass"
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "To validate forgotten password functionality",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ForgotPass"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User have to enter facebook login by using google chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefiniton.user_have_to_enter_facebook_login_by_using_google_chrome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to click forgotten password link",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefiniton.user_have_to_click_forgotten_password_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to enter valid email",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefiniton.user_have_to_enter_valid_email()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@placeholder\u003d\u0027Email address or obile number\u0027]\"}\n  (Session info: chrome\u003d96.0.4664.110)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-RKQ5HS7S\u0027, ip: \u0027192.168.0.106\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_291\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 96.0.4664.110, chrome: {chromedriverVersion: 96.0.4664.45 (76e4c1bb2ab46..., userDataDir: C:\\Users\\anton\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:51383}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: f574bb9e7519c9145445dab9815a8f71\n*** Element info: {Using\u003dxpath, value\u003d//input[@placeholder\u003d\u0027Email address or obile number\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.sendKeys(Unknown Source)\r\n\tat org.base.BaseClass.fillText(BaseClass.java:71)\r\n\tat org.stepdefinition.StepDefiniton.user_have_to_enter_valid_email(StepDefiniton.java:128)\r\n\tat ✽.User have to enter valid email(file:src/test/resources/FeatureFiles/ForgotPass.feature:11)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User have to click the search button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefiniton.user_have_to_click_the_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User have to redirect Reset your password page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefiniton.user_have_to_redirect_Reset_your_password_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});