---
title: EventLog
---
## EventLog


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **errorEntity** | [**UriReference**](UriReference.html) |  |  [optional] |
| **relatedEntity** | [**UriReference**](UriReference.html) |  |  [optional] |
| **timestamp** | [**Date**](Date.html) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **level** | [**LevelEnum**](#LevelEnum) |  |  [optional] |
| **category** | [**CategoryEnum**](#CategoryEnum) |  |  [optional] |
| **correlationId** | **String** |  |  [optional] |
| **eventMessage** | [**EventMessage**](EventMessage.html) |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="LevelEnum"></a>

## Enum: LevelEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| INFO | &quot;INFO&quot; |
| WARNING | &quot;WARNING&quot; |
| ERROR | &quot;ERROR&quot; |
{: class="table table-striped"}


<a name="CategoryEnum"></a>

## Enum: CategoryEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| CALLBACK | &quot;CALLBACK&quot; |
| CALL_RESTRICTION | &quot;CALL_RESTRICTION&quot; |
| CALL_RULE | &quot;CALL_RULE&quot; |
| CAMPAIGN | &quot;CAMPAIGN&quot; |
| CAMPAIGN_RULE | &quot;CAMPAIGN_RULE&quot; |
| CONTACT | &quot;CONTACT&quot; |
| CONTACT_LIST_FILTER | &quot;CONTACT_LIST_FILTER&quot; |
| DNC_LIST | &quot;DNC_LIST&quot; |
| ENTITY_LIMIT | &quot;ENTITY_LIMIT&quot; |
| IMPORT_ERROR | &quot;IMPORT_ERROR&quot; |
| ORGANIZATION_CONFIGURATION | &quot;ORGANIZATION_CONFIGURATION&quot; |
| SCHEDULE | &quot;SCHEDULE&quot; |
{: class="table table-striped"}



