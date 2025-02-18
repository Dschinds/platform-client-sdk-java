---
title: WfmUserNotification
---
## WfmUserNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The immutable globally unique identifier for the object. |  |
| **mutableGroupId** | **String** | The group ID of the notification (mutable, may change  on update) |  |
| **timestamp** | [**Date**](Date.html) | The timestamp for this notification. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum) | The type of this notification |  [optional] |
| **shiftTrade** | [**ShiftTradeNotification**](ShiftTradeNotification.html) | A shift trade notification.  Only set if type == ShiftTrade |  [optional] |
| **markedAsRead** | **Boolean** | Whether this notification has been marked \&quot;read\&quot; |  |
| **agentNotification** | **Boolean** | Whether this notification is for an agent |  [optional] |
| **otherNotificationIdsInGroup** | **List&lt;String&gt;** | Other notification IDs in group.  This field is only populated in real-time notifications |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| SHIFTTRADE | &quot;ShiftTrade&quot; |
{: class="table table-striped"}



