---
title: Recording
---
## Recording


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **conversationId** | **String** |  |  [optional] |
| **path** | **String** |  |  [optional] |
| **startTime** | **String** |  |  [optional] |
| **endTime** | **String** |  |  [optional] |
| **media** | **String** | The type of media that the recording is. At the moment that could be audio, chat, or email. |  [optional] |
| **annotations** | [**List&lt;Annotation&gt;**](Annotation.html) | Annotations that belong to the recording. |  [optional] |
| **transcript** | [**List&lt;ChatMessage&gt;**](ChatMessage.html) | Represents a chat transcript |  [optional] |
| **emailTranscript** | [**List&lt;RecordingEmailMessage&gt;**](RecordingEmailMessage.html) | Represents an email transcript |  [optional] |
| **messagingTranscript** | [**List&lt;RecordingMessagingMessage&gt;**](RecordingMessagingMessage.html) | Represents a messaging transcript |  [optional] |
| **fileState** | [**FileStateEnum**](#FileStateEnum) | Represents the current file state for a recording. Examples: Uploading, Archived, etc |  [optional] |
| **restoreExpirationTime** | [**Date**](Date.html) | The amount of time a restored recording will remain restored before being archived again. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **mediaUris** | [**Map&lt;String, MediaResult&gt;**](MediaResult.html) | The different mediaUris for the recording. |  [optional] |
| **estimatedTranscodeTimeMs** | **Long** |  |  [optional] |
| **actualTranscodeTimeMs** | **Long** |  |  [optional] |
| **archiveDate** | [**Date**](Date.html) | The date the recording will be archived. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **archiveMedium** | [**ArchiveMediumEnum**](#ArchiveMediumEnum) | The type of archive medium used. Example: CloudArchive |  [optional] |
| **deleteDate** | [**Date**](Date.html) | The date the recording will be deleted. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **maxAllowedRestorationsForOrg** | **Integer** | How many archive restorations the organization is allowed to have. |  [optional] |
| **remainingRestorationsAllowedForOrg** | **Integer** | The remaining archive restorations the organization has. |  [optional] |
| **sessionId** | **String** | The session id represents an external resource id, such as email, call, chat, etc |  [optional] |
| **users** | [**List&lt;User&gt;**](User.html) | The users participating in the conversation |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="FileStateEnum"></a>

## Enum: FileStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ARCHIVED | &quot;ARCHIVED&quot; |
| AVAILABLE | &quot;AVAILABLE&quot; |
| DELETED | &quot;DELETED&quot; |
| RESTORED | &quot;RESTORED&quot; |
| RESTORING | &quot;RESTORING&quot; |
| UPLOADING | &quot;UPLOADING&quot; |
| ERROR | &quot;ERROR&quot; |
{: class="table table-striped"}


<a name="ArchiveMediumEnum"></a>

## Enum: ArchiveMediumEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| CLOUDARCHIVE | &quot;CLOUDARCHIVE&quot; |
{: class="table table-striped"}



