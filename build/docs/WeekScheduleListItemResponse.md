---
title: WeekScheduleListItemResponse
---
## WeekScheduleListItemResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **weekDate** | **String** | First day of this week schedule in yyyy-MM-dd format |  [optional] |
| **description** | **String** | Description of the week schedule |  [optional] |
| **published** | **Boolean** | Whether the week schedule is published |  [optional] |
| **generationResults** | [**WeekScheduleGenerationResult**](WeekScheduleGenerationResult.html) | Summary of the results from the schedule run |  [optional] |
| **shortTermForecast** | [**ShortTermForecastReference**](ShortTermForecastReference.html) | Short term forecast associated with this schedule |  [optional] |
| **metadata** | [**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata.html) | Version metadata for this work plan |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}



