---
title: QueueConversationSocialExpressionEventTopicMessageDetails
---
## QueueConversationSocialExpressionEventTopicMessageDetails


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **messageId** | **String** |  |  [optional] |
| **messageTime** | [**Date**](Date.html) |  |  [optional] |
| **messageStatus** | [**MessageStatusEnum**](#MessageStatusEnum) |  |  [optional] |
| **messageSegmentCount** | **Integer** |  |  [optional] |
| **media** | [**List&lt;QueueConversationSocialExpressionEventTopicMessageMedia&gt;**](QueueConversationSocialExpressionEventTopicMessageMedia.html) |  |  [optional] |
| **stickers** | [**List&lt;QueueConversationSocialExpressionEventTopicMessageSticker&gt;**](QueueConversationSocialExpressionEventTopicMessageSticker.html) |  |  [optional] |
{: class="table table-striped"}


<a name="MessageStatusEnum"></a>

## Enum: MessageStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| QUEUED | &quot;QUEUED&quot; |
| SENT | &quot;SENT&quot; |
| FAILED | &quot;FAILED&quot; |
| RECEIVED | &quot;RECEIVED&quot; |
| DELIVERY_SUCCESS | &quot;DELIVERY_SUCCESS&quot; |
| DELIVERY_FAILED | &quot;DELIVERY_FAILED&quot; |
| READ | &quot;READ&quot; |
{: class="table table-striped"}



