---
title: UpdateActivityCodeRequest
---
## UpdateActivityCodeRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of the activity code |  [optional] |
| **category** | [**CategoryEnum**](#CategoryEnum) | The activity code&#39;s category. Attempting to change the category of a default activity code will return an error |  [optional] |
| **lengthInMinutes** | **Integer** | The default length of the activity in minutes |  [optional] |
| **countsAsPaidTime** | **Boolean** | Whether an agent is paid while performing this activity |  [optional] |
| **countsAsWorkTime** | **Boolean** | Indicates whether or not the activity should be counted as work time |  [optional] |
| **agentTimeOffSelectable** | **Boolean** | Whether an agent can select this activity code when creating or editing a time off request |  [optional] |
| **metadata** | [**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata.html) | Version metadata for the associated management unit&#39;s list of activity codes |  |
{: class="table table-striped"}


<a name="CategoryEnum"></a>

## Enum: CategoryEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ONQUEUEWORK | &quot;OnQueueWork&quot; |
| BREAK | &quot;Break&quot; |
| MEAL | &quot;Meal&quot; |
| MEETING | &quot;Meeting&quot; |
| OFFQUEUEWORK | &quot;OffQueueWork&quot; |
| TIMEOFF | &quot;TimeOff&quot; |
| TRAINING | &quot;Training&quot; |
| UNAVAILABLE | &quot;Unavailable&quot; |
| UNSCHEDULED | &quot;Unscheduled&quot; |
{: class="table table-striped"}



