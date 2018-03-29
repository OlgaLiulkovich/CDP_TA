:: Beginning of hub batch file
set SERVER_VERSION=3.11.0
set TASK_NAME=SeleniumServerNode4
set NODE_PORT=5557
set HUB_PORT=4444
set REGISTER_IP=localhost
java -Dwebdriver.ie.driver=selenium-server-standalone-3.11.0.jar -jar selenium-server-standalone-%SERVER_VERSION%.jar -role node -hub http://%REGISTER_IP%:%HUB_PORT%/grid/register -browser "browserName=firefox, version=59, maxInstances=5,platform=WINDOWS" -port %NODE_PORT%
:: End of hub batch file
pause
