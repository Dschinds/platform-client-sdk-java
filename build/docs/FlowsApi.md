---
title: FlowsApi
---
## FlowsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**postAnalyticsFlowsAggregatesQuery**](FlowsApi.html#postAnalyticsFlowsAggregatesQuery) | Query for flow aggregates |
{: class="table-striped"}

<a name="postAnalyticsFlowsAggregatesQuery"></a>

# **postAnalyticsFlowsAggregatesQuery**



> [AggregateQueryResponse](AggregateQueryResponse.html) postAnalyticsFlowsAggregatesQuery(body)

Query for flow aggregates



Wraps POST /api/v2/analytics/flows/aggregates/query  

Requires ANY permissions: 

* analytics:flowAggregate:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.FlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

FlowsApi apiInstance = new FlowsApi();
AggregationQuery body = new AggregationQuery(); // AggregationQuery | query
try {
    AggregateQueryResponse result = apiInstance.postAnalyticsFlowsAggregatesQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowsApi#postAnalyticsFlowsAggregatesQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**AggregationQuery**](AggregationQuery.html)| query | 
{: class="table-striped"}


### Return type

[**AggregateQueryResponse**](AggregateQueryResponse.html)

