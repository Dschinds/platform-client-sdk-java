---
title: CreateQueueRequest
---
## CreateQueueRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The queue name |  |
| **division** | [**WritableDivision**](WritableDivision.html) | The division to which this entity belongs. |  [optional] |
| **description** | **String** | The queue description. |  [optional] |
| **dateCreated** | [**Date**](Date.html) | The date the queue was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **dateModified** | [**Date**](Date.html) | The date of the last modification to the queue. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **modifiedBy** | **String** | The ID of the user that last modified the queue. |  [optional] |
| **createdBy** | **String** | The ID of the user that created the queue. |  [optional] |
| **memberCount** | **Integer** | The number of users in the queue. |  [optional] |
| **mediaSettings** | [**Map&lt;String, MediaSetting&gt;**](MediaSetting.html) | The media settings for the queue. Valid key values: CALL, CALLBACK, CHAT, EMAIL, MESSAGE, SOCIAL_EXPRESSION, VIDEO_COMM |  [optional] |
| **bullseye** | [**Bullseye**](Bullseye.html) | The bulls-eye settings for the queue. |  [optional] |
| **acwSettings** | [**AcwSettings**](AcwSettings.html) | The ACW settings for the queue. |  [optional] |
| **skillEvaluationMethod** | [**SkillEvaluationMethodEnum**](#SkillEvaluationMethodEnum) | The skill evaluation method to use when routing conversations. |  [optional] |
| **queueFlow** | [**UriReference**](UriReference.html) | The in-queue flow to use for conversations waiting in queue. |  [optional] |
| **whisperPrompt** | [**UriReference**](UriReference.html) | The prompt used for whisper on the queue, if configured. |  [optional] |
| **autoAnswerOnly** | **Boolean** | Specifies whether the configured whisper should play for all ACD calls, or only for those which are auto-answered. |  [optional] |
| **callingPartyName** | **String** | The name to use for caller identification for outbound calls from this queue. |  [optional] |
| **callingPartyNumber** | **String** | The phone number to use for caller identification for outbound calls from this queue. |  [optional] |
| **defaultScripts** | [**Map&lt;String, Script&gt;**](Script.html) | The default script Ids for the communication types. |  [optional] |
| **outboundMessagingAddresses** | [**QueueMessagingAddresses**](QueueMessagingAddresses.html) | The messaging addresses for the queue. |  [optional] |
| **outboundEmailAddress** | [**QueueEmailAddress**](QueueEmailAddress.html) |  |  [optional] |
| **sourceQueueId** | **String** | The id of an existing queue to copy the settings from when creating a new queue. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="SkillEvaluationMethodEnum"></a>

## Enum: SkillEvaluationMethodEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| NONE | &quot;NONE&quot; |
| BEST | &quot;BEST&quot; |
| ALL | &quot;ALL&quot; |
{: class="table table-striped"}



