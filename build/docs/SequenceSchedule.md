---
title: SequenceSchedule
---
## SequenceSchedule


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **dateCreated** | [**Date**](Date.html) | Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **dateModified** | [**Date**](Date.html) | Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **version** | **Integer** | Required for updates, must match the version number of the most recent update |  [optional] |
| **intervals** | [**List&lt;ScheduleInterval&gt;**](ScheduleInterval.html) | A list of intervals during which to run the associated CampaignSequence. |  |
| **timeZone** | **String** | The time zone for this SequenceSchedule. For example, Africa/Abidjan. |  |
| **sequence** | [**UriReference**](UriReference.html) | The CampaignSequence that this SequenceSchedule is for. |  |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}



