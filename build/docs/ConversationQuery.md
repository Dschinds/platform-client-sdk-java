---
title: ConversationQuery
---
## ConversationQuery


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **interval** | **String** | Specifies the date and time range of data being queried. Results will include conversations that both started on a day touched by the interval AND either started, ended, or any activity during the interval. Conversations that started before the earliest day of the interval will not be searched. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |  [optional] |
| **conversationFilters** | [**List&lt;AnalyticsQueryFilter&gt;**](AnalyticsQueryFilter.html) | Filters that target conversation-level data |  [optional] |
| **evaluationFilters** | [**List&lt;AnalyticsQueryFilter&gt;**](AnalyticsQueryFilter.html) | Filters that target quality management evaluation-level data |  [optional] |
| **surveyFilters** | [**List&lt;AnalyticsQueryFilter&gt;**](AnalyticsQueryFilter.html) | Filters that target quality management survey-level data |  [optional] |
| **mediaEndpointStatFilters** | [**List&lt;AnalyticsQueryFilter&gt;**](AnalyticsQueryFilter.html) | Filters that target call quality of service data |  [optional] |
| **segmentFilters** | [**List&lt;AnalyticsQueryFilter&gt;**](AnalyticsQueryFilter.html) | Filters that target individual segments within a conversation |  [optional] |
| **order** | [**OrderEnum**](#OrderEnum) | Sort the result set in ascending/descending order. Default is ascending |  [optional] |
| **orderBy** | [**OrderByEnum**](#OrderByEnum) | Specify which data element within the result set to use for sorting. The options  to use as a basis for sorting the results: conversationStart, segmentStart, and segmentEnd. If not specified, the default is conversationStart |  [optional] |
| **aggregations** | [**List&lt;AnalyticsQueryAggregation&gt;**](AnalyticsQueryAggregation.html) | Include faceted search and aggregate roll-ups describing your search results. This does not function as a filter, but rather, summary data about the data matching your filters |  [optional] |
| **paging** | [**PagingSpec**](PagingSpec.html) | Page size and number to control iterating through large result sets. Default page size is 25 |  [optional] |
{: class="table table-striped"}


<a name="OrderEnum"></a>

## Enum: OrderEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ASC | &quot;asc&quot; |
| DESC | &quot;desc&quot; |
{: class="table table-striped"}


<a name="OrderByEnum"></a>

## Enum: OrderByEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| CONVERSATIONSTART | &quot;conversationStart&quot; |
| CONVERSATIONEND | &quot;conversationEnd&quot; |
| SEGMENTSTART | &quot;segmentStart&quot; |
| SEGMENTEND | &quot;segmentEnd&quot; |
{: class="table table-striped"}



