Reproduce the issue by running `sbt update`

Even though versionReconcilliation for cats-core is set to "semver", we're still getting errors
```
[error] coursier.error.conflict.StrictRule: Rule Strict(Set(ModuleMatcher(org.typelevel:cats-core_2.13)),Set(),false,true,true) not satisfied: coursier.params.rule.Strict$EvictedDependencies: Unsatisfied rule Strict(org.typelevel:cats-core_2.13): Found evicted dependencies:
[error] 
[error] org.typelevel:cats-core_2.13:2.1.0 (2.0.0 wanted)
[error] └─ org.typelevel:cats-effect_2.13:2.0.0
[error] 
[error] 	at coursier.params.rule.Rule.enforce(Rule.scala:21)
[error] 	at coursier.Resolve.recurseOnRules$1(Resolve.scala:137)
[error] 	at coursier.Resolve.$anonfun$ioWithConflicts0$5(Resolve.scala:169)
[error] 	at coursier.util.Task$.$anonfun$flatMap$2(Task.scala:14)
[error] 	at scala.concurrent.Future.$anonfun$flatMap$1(Future.scala:303)
[error] 	at scala.concurrent.impl.Promise.$anonfun$transformWith$1(Promise.scala:37)
[error] 	at scala.concurrent.impl.CallbackRunnable.run(Promise.scala:60)
[error] 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
[error] 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
[error] 	at java.base/java.lang.Thread.run(Thread.java:834)
[error] Caused by: coursier.params.rule.Strict$EvictedDependencies: Unsatisfied rule Strict(org.typelevel:cats-core_2.13): Found evicted dependencies:
[error] 
[error] org.typelevel:cats-core_2.13:2.1.0 (2.0.0 wanted)
[error] └─ org.typelevel:cats-effect_2.13:2.0.0
[error] 
[error] 	at coursier.params.rule.Strict.check(Strict.scala:38)
[error] 	at coursier.params.rule.Rule.enforce(Rule.scala:15)
[error] 	at coursier.Resolve.recurseOnRules$1(Resolve.scala:137)
[error] 	at coursier.Resolve.$anonfun$ioWithConflicts0$5(Resolve.scala:169)
[error] 	at coursier.util.Task$.$anonfun$flatMap$2(Task.scala:14)
[error] 	at scala.concurrent.Future.$anonfun$flatMap$1(Future.scala:303)
[error] 	at scala.concurrent.impl.Promise.$anonfun$transformWith$1(Promise.scala:37)
[error] 	at scala.concurrent.impl.CallbackRunnable.run(Promise.scala:60)
[error] 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
[error] 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
[error] 	at java.base/java.lang.Thread.run(Thread.java:834)
```
