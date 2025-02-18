---
title: InteractionStatsAlert
---
## InteractionStatsAlert


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | Name of the rule that generated the alert |  |
| **dimension** | [**DimensionEnum**](#DimensionEnum) | The dimension of concern. |  |
| **dimensionValue** | **String** | The value of the dimension. |  |
| **metric** | [**MetricEnum**](#MetricEnum) | The metric to be assessed. |  |
| **mediaType** | [**MediaTypeEnum**](#MediaTypeEnum) | The media type. |  |
| **numericRange** | [**NumericRangeEnum**](#NumericRangeEnum) | The comparison descriptor used against the metric&#39;s value. |  |
| **statistic** | [**StatisticEnum**](#StatisticEnum) | The statistic of concern for the metric. |  |
| **value** | **Double** | The threshold value. |  |
| **ruleId** | **String** | The id of the rule. |  |
| **unread** | **Boolean** | Indicates if the alert has been read. |  |
| **startDate** | [**Date**](Date.html) | The date/time the alert was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  |
| **endDate** | [**Date**](Date.html) | The date/time the owning rule exiting in alarm status. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **notificationUsers** | [**List&lt;User&gt;**](User.html) | The ids of users who were notified of alarm state change. |  |
| **alertTypes** | **List&lt;String&gt;** | A collection of notification methods. |  |
| **ruleUri** | **String** |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="DimensionEnum"></a>

## Enum: DimensionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| QUEUEID | &quot;queueId&quot; |
| USERID | &quot;userId&quot; |
{: class="table table-striped"}


<a name="MetricEnum"></a>

## Enum: MetricEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| TABANDON | &quot;tAbandon&quot; |
| TANSWERED | &quot;tAnswered&quot; |
| TTALK | &quot;tTalk&quot; |
| NOFFERED | &quot;nOffered&quot; |
| THANDLE | &quot;tHandle&quot; |
| NTRANSFERRED | &quot;nTransferred&quot; |
| OSERVICELEVEL | &quot;oServiceLevel&quot; |
| TWAIT | &quot;tWait&quot; |
| THELD | &quot;tHeld&quot; |
| TACW | &quot;tAcw&quot; |
{: class="table table-striped"}


<a name="MediaTypeEnum"></a>

## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| VOICE | &quot;voice&quot; |
| CHAT | &quot;chat&quot; |
| EMAIL | &quot;email&quot; |
| CALLBACK | &quot;callback&quot; |
| MESSAGE | &quot;message&quot; |
{: class="table table-striped"}


<a name="NumericRangeEnum"></a>

## Enum: NumericRangeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| GT | &quot;gt&quot; |
| GTE | &quot;gte&quot; |
| LT | &quot;lt&quot; |
| LTE | &quot;lte&quot; |
| EQ | &quot;eq&quot; |
| NE | &quot;ne&quot; |
{: class="table table-striped"}


<a name="StatisticEnum"></a>

## Enum: StatisticEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| COUNT | &quot;count&quot; |
| MIN | &quot;min&quot; |
| RATIO | &quot;ratio&quot; |
| MAX | &quot;max&quot; |
{: class="table table-striped"}



