//[wallet-core](../../../index.md)/[eu.europa.ec.eudi.wallet.issue.openid4vci](../index.md)/[IssueEvent](index.md)

# IssueEvent

interface [IssueEvent](index.md) : [OpenId4VciResult](../-open-id4-vci-result/index.md)

Events related to document issuance.

#### Inheritors

| |
|---|
| [Started](-started/index.md) |
| [Finished](-finished/index.md) |
| [Failure](-failure/index.md) |
| [DocumentIssued](-document-issued/index.md) |
| [DocumentFailed](-document-failed/index.md) |
| [DocumentRequiresUserAuth](-document-requires-user-auth/index.md) |
| [DocumentDeferred](-document-deferred/index.md) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [androidJvm]<br>object [Companion](-companion/index.md) |
| [DocumentDeferred](-document-deferred/index.md) | [androidJvm]<br>data class [DocumentDeferred](-document-deferred/index.md)(val documentId: DocumentId, val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val docType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [IssueEvent](index.md)<br>Document issuance deferred. |
| [DocumentFailed](-document-failed/index.md) | [androidJvm]<br>data class [DocumentFailed](-document-failed/index.md)(val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val docType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val cause: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) : [IssueEvent](index.md), [OpenId4VciResult.Erroneous](../-open-id4-vci-result/-erroneous/index.md)<br>Document issuance failed. |
| [DocumentIssued](-document-issued/index.md) | [androidJvm]<br>data class [DocumentIssued](-document-issued/index.md)(val documentId: DocumentId, val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val docType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [IssueEvent](index.md)<br>Document issued successfully. |
| [DocumentRequiresUserAuth](-document-requires-user-auth/index.md) | [androidJvm]<br>data class [DocumentRequiresUserAuth](-document-requires-user-auth/index.md)(val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val docType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val cryptoObject: [BiometricPrompt.CryptoObject](https://developer.android.com/reference/kotlin/androidx/biometric/BiometricPrompt.CryptoObject.html)?, val resume: () -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html), val cancel: () -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)) : [IssueEvent](index.md)<br>The document issuance requires user authentication. |
| [Failure](-failure/index.md) | [androidJvm]<br>data class [Failure](-failure/index.md)(val cause: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) : [IssueEvent](index.md), [OpenId4VciResult.Erroneous](../-open-id4-vci-result/-erroneous/index.md)<br>The issuance failed. |
| [Finished](-finished/index.md) | [androidJvm]<br>data class [Finished](-finished/index.md)(val issuedDocuments: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;DocumentId&gt;) : [IssueEvent](index.md)<br>The issuance has finished. |
| [Started](-started/index.md) | [androidJvm]<br>data class [Started](-started/index.md)(val total: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) : [IssueEvent](index.md)<br>The issuance was started. |
