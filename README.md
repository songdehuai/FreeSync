### FreeSync 一个轻量级消息总线

> 	简介

1.   仅有一个文件，两个类,6个方法。
2.   内部使用 <a href="https://www.jianshu.com/p/d0b37b927c48">`ConcurrentHashMap`</a>
3.   支持多频道
4.   DSL语法让使用起来更爽
5.   纯kotlin开发
6.   等你自己发掘

> 	使用方式

1.   添加订阅
```kotlin
 FreeSync.default().addCall<String>(key = this) {
 	log("订阅1:${it}")
 }
```
2.   调用订阅
```kotlin
FreeSync.default().call<String>(key = this, value = "哈哈哈哈")
```

> 	多渠道使用方式


1.   通过`FreeSync.with(key: Any)`添加订阅

```kotlin
 FreeSync.with(key: Any).addCall<String>(key = this) {
 	log("订阅1:${it}")
 }
```
2.   通过`FreeSync.with(key: Any)`调用订阅
```kotlin
FreeSync.with(key: Any).call<String>(key = this, value = "哈哈哈哈")
```