---
title: VisibilityCondition
---
## VisibilityCondition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **combiningOperation** | [**CombiningOperationEnum**](#CombiningOperationEnum) |  |  [optional] |
| **predicates** | **List&lt;Object&gt;** | A list of strings, each representing the location in the form of the Answer Option to depend on. In the format of \&quot;/form/questionGroup/{questionGroupIndex}/question/{questionIndex}/answer/{answerIndex}\&quot; or, to assume the current question group, \&quot;../question/{questionIndex}/answer/{answerIndex}\&quot;. Note: Indexes are zero-based |  [optional] |
{: class="table table-striped"}


<a name="CombiningOperationEnum"></a>

## Enum: CombiningOperationEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| AND | &quot;AND&quot; |
| OR | &quot;OR&quot; |
{: class="table table-striped"}



