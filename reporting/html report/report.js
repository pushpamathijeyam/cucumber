$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Featurefiles/frgpwd.feature");
formatter.feature({
  "name": "To validate forgetten password functionality in fb",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@forget"
    }
  ]
});
formatter.scenario({
  "name": "to validate  forgotten password  using invalid mobile number",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@forget"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user have to be in fb login page",
  "keyword": "Given "
});
formatter.match({
  "location": "ForgetPassword.user_have_to_be_in_fb_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user  have to click forgotten password",
  "keyword": "And "
});
formatter.match({
  "location": "ForgetPassword.user_have_to_click_forgotten_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to enter invalid mobile number",
  "rows": [
    {
      "cells": [
        "phone number",
        "987654321o"
      ]
    },
    {
      "cells": [
        "username",
        "ammu"
      ]
    },
    {
      "cells": [
        "email",
        "ammu@gmail.com"
      ]
    },
    {
      "cells": [
        "password",
        "8987544"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "ForgetPassword.user_have_to_enter_invalid_mobile_number(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to click search button",
  "keyword": "And "
});
formatter.match({
  "location": "ForgetPassword.user_have_to_click_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to be in identity account page",
  "keyword": "Then "
});
formatter.match({
  "location": "ForgetPassword.user_have_to_be_in_identity_account_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/Featurefiles/login.feature");
formatter.feature({
  "name": "To validate login functionality in fb",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
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
formatter.step({
  "name": "User have to be in fb login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_have_to_be_in_fb_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login using invalid email and valid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "Enter  invalid email and valid password",
  "rows": [
    {
      "cells": [
        "Name",
        "phoneno",
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "ammu",
        "9876543210",
        "jeyam@gmail.com",
        "amm890"
      ]
    },
    {
      "cells": [
        "jegan",
        "8825663423",
        "werrt@gmail.com",
        "jegan345"
      ]
    },
    {
      "cells": [
        "murugan",
        "8765433221",
        "murugan@gmail.com",
        "murugan456"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.enter_invalid_email_and_valid_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "invalid credentils page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.invalid_credentils_page()"
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
formatter.step({
  "name": "User have to be in fb login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_have_to_be_in_fb_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login using email and password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "Enter valid email and invalid password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.enter_valid_email_and_invalid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "invalid credentils page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.invalid_credentils_page()"
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
formatter.step({
  "name": "User have to be in fb login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_have_to_be_in_fb_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login using email and password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@reg"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "Enter  invalid email and invalid password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.enter_invalid_email_and_invalid_password()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat org.baseclass.BaseClass.readDataFromExcel(BaseClass.java:343)\r\n\tat org.stepdef.LoginSteps.enter_invalid_email_and_invalid_password(LoginSteps.java:60)\r\n\tat ✽.Enter  invalid email and invalid password(src/test/resources/Featurefiles/login.feature:25)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "click login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.click_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "invalid credentils page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.invalid_credentils_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});