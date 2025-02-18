---
title: TestExecutionResult
---
## TestExecutionResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **operations** | [**List&lt;TestExecutionOperationResult&gt;**](TestExecutionOperationResult.html) | Execution operations performed as part of the test |  [optional] |
| **error** | [**ErrorBody**](ErrorBody.html) | The final error encountered during the test that resulted in test failure |  [optional] |
| **finalResult** | **Object** | The final result of the test. This is the response that would be returned during normal action execution |  [optional] |
| **success** | **Boolean** | Indicates whether or not the test was a success |  [optional] |
{: class="table table-striped"}



