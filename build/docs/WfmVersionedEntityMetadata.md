---
title: WfmVersionedEntityMetadata
---
## WfmVersionedEntityMetadata


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **version** | **Integer** | The version of the associated entity.  Used to prevent conflicts on concurrent edits |  |
| **modifiedBy** | [**UserReference**](UserReference.html) | The user who last modified the associated entity |  [optional] |
| **dateModified** | [**Date**](Date.html) | The date the associated entity was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
{: class="table table-striped"}



