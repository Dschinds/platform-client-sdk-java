---
title: DomainLogicalInterface
---
## DomainLogicalInterface


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
| **edgeUri** | **String** |  |  [optional] |
| **edgeAssignedId** | **String** |  |  [optional] |
| **friendlyName** | **String** | Friendly Name |  |
| **vlanTagId** | **Integer** |  |  [optional] |
| **hardwareAddress** | **String** | Hardware Address |  |
| **physicalAdapterId** | **String** | Physical Adapter Id |  |
| **ifStatus** | **String** |  |  [optional] |
| **interfaceType** | [**InterfaceTypeEnum**](#InterfaceTypeEnum) | The type of this network interface. |  [optional] |
| **routes** | [**List&lt;DomainNetworkRoute&gt;**](DomainNetworkRoute.html) | The list of routes assigned to this interface. |  [optional] |
| **addresses** | [**List&lt;DomainNetworkAddress&gt;**](DomainNetworkAddress.html) | The list of IP addresses on this interface.  Priority of dns addresses are based on order in the list. |  [optional] |
| **ipv4Capabilities** | [**DomainCapabilities**](DomainCapabilities.html) | IPv4 interface settings. |  [optional] |
| **ipv6Capabilities** | [**DomainCapabilities**](DomainCapabilities.html) | IPv6 interface settings. |  [optional] |
| **currentState** | [**CurrentStateEnum**](#CurrentStateEnum) |  |  [optional] |
| **lastModifiedUserId** | **String** |  |  [optional] |
| **lastModifiedCorrelationId** | **String** |  |  [optional] |
| **commandResponses** | [**List&lt;DomainNetworkCommandResponse&gt;**](DomainNetworkCommandResponse.html) |  |  [optional] |
| **inheritPhoneTrunkBasesIPv4** | **Boolean** | The IPv4 phone trunk base assignment will be inherited from the Edge Group. |  [optional] |
| **inheritPhoneTrunkBasesIPv6** | **Boolean** | The IPv6 phone trunk base assignment will be inherited from the Edge Group. |  [optional] |
| **useForInternalEdgeCommunication** | **Boolean** | This interface will be used for all internal edge-to-edge communication using settings from the edgeTrunkBaseAssignment on the Edge Group. |  [optional] |
| **externalTrunkBaseAssignments** | [**List&lt;TrunkBaseAssignment&gt;**](TrunkBaseAssignment.html) | External trunk base settings to use for external communication from this interface. |  [optional] |
| **phoneTrunkBaseAssignments** | [**List&lt;TrunkBaseAssignment&gt;**](TrunkBaseAssignment.html) | Phone trunk base settings to use for phone communication from this interface.  These settings will be ignored when \&quot;inheritPhoneTrunkBases\&quot; is true. |  [optional] |
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


<a name="InterfaceTypeEnum"></a>

## Enum: InterfaceTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| DIAGNOSTIC | &quot;DIAGNOSTIC&quot; |
| SYSTEM | &quot;SYSTEM&quot; |
{: class="table table-striped"}


<a name="CurrentStateEnum"></a>

## Enum: CurrentStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| INIT | &quot;INIT&quot; |
| CREATING | &quot;CREATING&quot; |
| UPDATING | &quot;UPDATING&quot; |
| OK | &quot;OK&quot; |
| EXCEPTION | &quot;EXCEPTION&quot; |
| DELETING | &quot;DELETING&quot; |
{: class="table table-striped"}



