---
title: DocumentationSearchCriteria
---
## DocumentationSearchCriteria


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **endValue** | **String** | The end value of the range. This field is used for range search types. |  [optional] |
| **values** | **List&lt;String&gt;** | A list of values for the search to match against |  [optional] |
| **startValue** | **String** | The start value of the range. This field is used for range search types. |  [optional] |
| **fields** | **List&lt;String&gt;** | Field names to search against |  [optional] |
| **value** | **String** | A value for the search to match against |  [optional] |
| **operator** | [**OperatorEnum**](#OperatorEnum) | How to apply this search criteria against other criteria |  [optional] |
| **group** | [**List&lt;DocumentationSearchCriteria&gt;**](DocumentationSearchCriteria.html) | Groups multiple conditions |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum) | Search Type |  |
{: class="table table-striped"}


<a name="OperatorEnum"></a>

## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| AND | &quot;AND&quot; |
| OR | &quot;OR&quot; |
| NOT | &quot;NOT&quot; |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| EXACT | &quot;EXACT&quot; |
| STARTS_WITH | &quot;STARTS_WITH&quot; |
| CONTAINS | &quot;CONTAINS&quot; |
| TERM | &quot;TERM&quot; |
| TERMS | &quot;TERMS&quot; |
| MATCH_ALL | &quot;MATCH_ALL&quot; |
| SIMPLE | &quot;SIMPLE&quot; |
| QUERY_STRING | &quot;QUERY_STRING&quot; |
| MULTI_MATCH | &quot;MULTI_MATCH&quot; |
{: class="table table-striped"}



