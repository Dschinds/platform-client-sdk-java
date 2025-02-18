---
title: AnalyticsUserPresenceRecord
---
## AnalyticsUserPresenceRecord


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **startTime** | [**Date**](Date.html) | The start time of the record. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **endTime** | [**Date**](Date.html) | The end time of the record. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **systemPresence** | [**SystemPresenceEnum**](#SystemPresenceEnum) | The user&#39;s system presence |  [optional] |
| **organizationPresenceId** | **String** | The identifier for the user&#39;s organization presence |  [optional] |
| **durationMilliseconds** | **Long** | The duration of the status (in milliseconds) |  [optional] |
{: class="table table-striped"}


<a name="SystemPresenceEnum"></a>

## Enum: SystemPresenceEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| AVAILABLE | &quot;AVAILABLE&quot; |
| AWAY | &quot;AWAY&quot; |
| BUSY | &quot;BUSY&quot; |
| OFFLINE | &quot;OFFLINE&quot; |
| IDLE | &quot;IDLE&quot; |
| ON_QUEUE | &quot;ON_QUEUE&quot; |
| MEAL | &quot;MEAL&quot; |
| TRAINING | &quot;TRAINING&quot; |
| MEETING | &quot;MEETING&quot; |
| BREAK | &quot;BREAK&quot; |
{: class="table table-striped"}



