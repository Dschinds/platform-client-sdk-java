---
title: QueueConversationVideoEventTopicSocialExpression
---
## QueueConversationVideoEventTopicSocialExpression


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **state** | [**StateEnum**](#StateEnum) |  |  [optional] |
| **id** | **String** |  |  [optional] |
| **socialMediaId** | **String** |  |  [optional] |
| **socialMediaHub** | **String** |  |  [optional] |
| **socialUserName** | **String** |  |  [optional] |
| **previewText** | **String** |  |  [optional] |
| **recordingId** | **String** |  |  [optional] |
| **held** | **Boolean** |  |  [optional] |
| **provider** | **String** |  |  [optional] |
| **scriptId** | **String** |  |  [optional] |
| **peerId** | **String** |  |  [optional] |
| **disconnectType** | [**DisconnectTypeEnum**](#DisconnectTypeEnum) |  |  [optional] |
| **startHoldTime** | [**Date**](Date.html) |  |  [optional] |
| **connectedTime** | [**Date**](Date.html) |  |  [optional] |
| **disconnectedTime** | [**Date**](Date.html) |  |  [optional] |
| **additionalProperties** | **Object** |  |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ALERTING | &quot;ALERTING&quot; |
| DIALING | &quot;DIALING&quot; |
| CONTACTING | &quot;CONTACTING&quot; |
| OFFERING | &quot;OFFERING&quot; |
| CONNECTED | &quot;CONNECTED&quot; |
| DISCONNECTED | &quot;DISCONNECTED&quot; |
| TERMINATED | &quot;TERMINATED&quot; |
| NONE | &quot;NONE&quot; |
{: class="table table-striped"}


<a name="DisconnectTypeEnum"></a>

## Enum: DisconnectTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ENDPOINT | &quot;ENDPOINT&quot; |
| CLIENT | &quot;CLIENT&quot; |
| SYSTEM | &quot;SYSTEM&quot; |
| TIMEOUT | &quot;TIMEOUT&quot; |
| TRANSFER | &quot;TRANSFER&quot; |
| TRANSFER_CONFERENCE | &quot;TRANSFER_CONFERENCE&quot; |
| TRANSFER_CONSULT | &quot;TRANSFER_CONSULT&quot; |
| TRANSFER_FORWARD | &quot;TRANSFER_FORWARD&quot; |
| TRANSFER_NOANSWER | &quot;TRANSFER_NOANSWER&quot; |
| TRANSFER_NOTAVAILABLE | &quot;TRANSFER_NOTAVAILABLE&quot; |
| TRANSPORT_FAILURE | &quot;TRANSPORT_FAILURE&quot; |
| ERROR | &quot;ERROR&quot; |
| PEER | &quot;PEER&quot; |
| OTHER | &quot;OTHER&quot; |
| SPAM | &quot;SPAM&quot; |
| UNCALLABLE | &quot;UNCALLABLE&quot; |
{: class="table table-striped"}



