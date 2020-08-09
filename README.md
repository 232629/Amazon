# Amazon (test task)

Run test use:
  mvn test -Dbrowser=firefox
  mvn test -Dbrowser=chrome
  mvn test -Dbrowser=selenoid 
    For Selenoid need to set URL your selenoid server and browser (src/main/java/infrastructure/Config.java SELENOID_URL, SELENOID_BROWSER, SELENOID_BROWSER_VERSION)
  Default chrome (mvn test)

Generate report: 
mvn allure:serve
