---
title: OutboundRoute
---
## OutboundRoute


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the entity. |  |
| **description** | **String** | The resource&#39;s description. |  [optional] |
| **version** | **Integer** | The current version of the resource. |  [optional] |
| **dateCreated** | [**Date**](Date.html) | The date the resource was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **dateModified** | [**Date**](Date.html) | The date of the last modification to the resource. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **modifiedBy** | **String** | The ID of the user that last modified the resource. |  [optional] |
| **createdBy** | **String** | The ID of the user that created the resource. |  [optional] |
| **state** | [**StateEnum**](#StateEnum) | Indicates if the resource is active, inactive, or deleted. |  [optional] |
| **modifiedByApp** | **String** | The application that last modified the resource. |  [optional] |
| **createdByApp** | **String** | The application that created the resource. |  [optional] |
| **classificationTypes** | **List&lt;String&gt;** | The site associated to the outbound route. |  |
| **enabled** | **Boolean** |  |  [optional] |
| **distribution** | [**DistributionEnum**](#DistributionEnum) |  |  [optional] |
| **externalTrunkBases** | [**List&lt;UriReference&gt;**](UriReference.html) | Trunk base settings of trunkType \&quot;EXTERNAL\&quot;.  This base must also be set on an edge logical interface for correct routing. |  [optional] |
| **site** | [**Site**](Site.html) | The site associated to the outbound route. |  [optional] |
| **managed** | **Boolean** | Is this outbound route being managed remotely. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ACTIVE | &quot;active&quot; |
| INACTIVE | &quot;inactive&quot; |
| DELETED | &quot;deleted&quot; |
{: class="table table-striped"}


<a name="DistributionEnum"></a>

## Enum: DistributionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| SEQUENTIAL | &quot;SEQUENTIAL&quot; |
| RANDOM | &quot;RANDOM&quot; |
{: class="table table-striped"}



