---
title: Share
---
## Share


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **sharedEntityType** | [**SharedEntityTypeEnum**](#SharedEntityTypeEnum) |  |  [optional] |
| **sharedEntity** | [**UriReference**](UriReference.html) |  |  [optional] |
| **memberType** | [**MemberTypeEnum**](#MemberTypeEnum) |  |  [optional] |
| **member** | [**UriReference**](UriReference.html) |  |  [optional] |
| **sharedBy** | [**UriReference**](UriReference.html) |  |  [optional] |
| **workspace** | [**UriReference**](UriReference.html) |  |  [optional] |
| **user** | [**User**](User.html) |  |  [optional] |
| **group** | [**Group**](Group.html) |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="SharedEntityTypeEnum"></a>

## Enum: SharedEntityTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| DOCUMENT | &quot;DOCUMENT&quot; |
{: class="table table-striped"}


<a name="MemberTypeEnum"></a>

## Enum: MemberTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| USER | &quot;USER&quot; |
| GROUP | &quot;GROUP&quot; |
| PUBLIC | &quot;PUBLIC&quot; |
{: class="table table-striped"}



