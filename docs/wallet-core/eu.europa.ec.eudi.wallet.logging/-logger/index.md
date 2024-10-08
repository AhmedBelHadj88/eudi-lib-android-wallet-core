//[wallet-core](../../../index.md)/[eu.europa.ec.eudi.wallet.logging](../index.md)/[Logger](index.md)

# Logger

[androidJvm]\
fun interface [Logger](index.md)

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [androidJvm]<br>object [Companion](-companion/index.md) |
| [Level](-level/index.md) | [androidJvm]<br>annotation class [Level](-level/index.md)<br>Log level for the OpenId4Vci issuer |
| [Record](-record/index.md) | [androidJvm]<br>data class [Record](-record/index.md)(val level: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val instant: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html) = Instant.now(), val message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val thrown: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null, val sourceClassName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val sourceMethod: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) |

## Functions

| Name | Summary |
|---|---|
| [log](log.md) | [androidJvm]<br>abstract fun [log](log.md)(record: [Logger.Record](-record/index.md)) |
