00:24:53,601 INFO  [org.jboss.as.server] (management-handler-thread - 1) WFLYSRV0010: Deployed "first-ee-app.war" (runtime-name : "first-ee-app.war")
^C00:26:12,344 INFO  [org.jboss.as.server] (Thread-1) WFLYSRV0272: Suspending server
00:26:12,347 INFO  [org.jboss.as.ejb3] (Thread-1) WFLYEJB0493: EJB subsystem suspension complete
00:26:12,348 INFO  [org.jboss.as.server] (Thread-1) WFLYSRV0220: Server shutdown has been requested via an OS signal
00:26:12,385 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-6) WFLYMAIL0002: Unbound mail session [java:jboss/mail/Default]
00:26:12,394 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 81) WFLYUT0022: Unregistered web context: '/first-ee-app' from server 'default-server'
00:26:12,416 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-3) WFLYJCA0010: Unbound data source [java:jboss/datasources/ExampleDS]
00:26:12,418 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0019: Host default-host stopping
00:26:12,420 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-6) WFLYJCA0019: Stopped Driver service with driver-name = h2
00:26:12,438 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 83) WFLYCLINF0003: Stopped client-mappings cache from ejb container
00:26:12,455 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0008: Undertow HTTP listener default suspending
00:26:12,455 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0008: Undertow HTTPS listener https suspending
00:26:12,459 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0007: Undertow HTTPS listener https stopped, was bound to 127.0.0.1:8443
00:26:12,459 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0007: Undertow HTTP listener default stopped, was bound to 127.0.0.1:8080
00:26:12,470 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0004: Undertow 2.1.0.Final stopping
00:26:12,471 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0028: Stopped deployment first-ee-app.war (runtime-name: first-ee-app.war) in 118ms
