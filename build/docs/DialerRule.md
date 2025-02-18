---
title: DialerRule
---
## DialerRule


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The identifier of the rule. |  [optional] |
| **name** | **String** | The name of the rule. |  |
| **order** | **Integer** | The ranked order of the rule. Rules are processed from lowest number to highest. |  [optional] |
| **category** | [**CategoryEnum**](#CategoryEnum) | The category of the rule. |  |
| **conditions** | [**List&lt;Condition&gt;**](Condition.html) | A list of Conditions. All of the Conditions must evaluate to true to trigger the actions. |  |
| **actions** | [**List&lt;DialerAction&gt;**](DialerAction.html) | The list of actions to be taken if the conditions are true. |  [optional] |
{: class="table table-striped"}


<a name="CategoryEnum"></a>

## Enum: CategoryEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| DIALER_PRECALL | &quot;DIALER_PRECALL&quot; |
| DIALER_WRAPUP | &quot;DIALER_WRAPUP&quot; |
{: class="table table-striped"}



