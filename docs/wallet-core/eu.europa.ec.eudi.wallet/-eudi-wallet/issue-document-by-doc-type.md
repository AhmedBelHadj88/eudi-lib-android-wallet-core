//[wallet-core](../../../index.md)/[eu.europa.ec.eudi.wallet](../index.md)/[EudiWallet](index.md)/[issueDocumentByDocType](issue-document-by-doc-type.md)

# issueDocumentByDocType

[androidJvm]\
fun [~~issueDocumentByDocType~~](issue-document-by-doc-type.md)(docType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), txCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, executor: [Executor](https://developer.android.com/reference/kotlin/java/util/concurrent/Executor.html)? = null, onEvent: [OpenId4VciManager.OnIssueEvent](../../eu.europa.ec.eudi.wallet.issue.openid4vci/-open-id4-vci-manager/-on-issue-event/index.md))

---

### Deprecated

Use EudiWallet.createOpenId4VciManager() to create an instance of OpenId4VciManager and use the OpendId4VciManager.issueDocumentByDocType() instead

---

Issue a document using the OpenId4VCI protocol

#### Parameters

androidJvm

| | |
|---|---|
| docType | the document type to issue |
| txCode | the transaction code for pre-authorized issuing |
| executor | the executor defines the thread on which the callback will be called. If null, the callback will be called on the main thread |
| onEvent | the callback to be called when the document is issued |

#### See also

| |
|---|
| [OpenId4VciManager.issueDocumentByDocType](../../eu.europa.ec.eudi.wallet.issue.openid4vci/-open-id4-vci-manager/issue-document-by-doc-type.md) |
| [OpenId4VciManager.OnIssueEvent](../../eu.europa.ec.eudi.wallet.issue.openid4vci/-open-id4-vci-manager/-on-issue-event/index.md) | on how to handle the result |
| [IssueEvent.DocumentRequiresUserAuth](../../eu.europa.ec.eudi.wallet.issue.openid4vci/-issue-event/-document-requires-user-auth/index.md) | on how to handle user authentication |

#### Throws

| | |
|---|---|
| [IllegalStateException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-state-exception/index.html) | if [EudiWalletConfig.openId4VciConfig](../-eudi-wallet-config/open-id4-vci-config.md) is not set |
