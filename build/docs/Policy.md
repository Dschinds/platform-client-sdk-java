---
title: Policy
---
## Policy


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **modifiedDate** | [**Date**](Date.html) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **createdDate** | [**Date**](Date.html) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **order** | **Integer** |  |  [optional] |
| **description** | **String** |  |  [optional] |
| **enabled** | **Boolean** |  |  [optional] |
| **mediaPolicies** | [**MediaPolicies**](MediaPolicies.html) | Conditions and actions per media type |  [optional] |
| **conditions** | [**PolicyConditions**](PolicyConditions.html) | Conditions |  [optional] |
| **actions** | [**PolicyActions**](PolicyActions.html) | Actions |  [optional] |
| **policyErrors** | [**PolicyErrors**](PolicyErrors.html) |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}



