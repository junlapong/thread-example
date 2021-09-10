# thread-example

```
mvn clean package
```

```
$ java -jar target/thread-example-jar-with-dependencies.jar

[17:56:37.739 ICT] INFO  [main] example.AsyncApp.putMq() - (1) PUT...
[17:56:37.741 ICT] INFO  [main] example.AsyncApp.main() - (3) NEXT STEP
[17:56:37.741 ICT] INFO  [GetNotify-Thread] example.AsyncApp.run() - (2) GET...
[17:56:37.742 ICT] INFO  [GetNotify-Thread] example.AsyncApp.run() - START LONG RUNNING PROCESS
[17:56:42.753 ICT] INFO  [GetNotify-Thread] example.AsyncApp.getMq() - Long time no see
[17:56:42.754 ICT] INFO  [GetNotify-Thread] example.AsyncApp.run() - END LONG RUNNING PROCESS
```
