---
title: RoutingApi
---
## RoutingApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteRoutingEmailDomain**](RoutingApi.html#deleteRoutingEmailDomain) | Delete a domain |
| [**deleteRoutingEmailDomainRoute**](RoutingApi.html#deleteRoutingEmailDomainRoute) | Delete a route |
| [**deleteRoutingQueue**](RoutingApi.html#deleteRoutingQueue) | Delete a queue |
| [**deleteRoutingQueueUser**](RoutingApi.html#deleteRoutingQueueUser) | Delete queue member |
| [**deleteRoutingQueueWrapupcode**](RoutingApi.html#deleteRoutingQueueWrapupcode) | Delete a wrap-up code from a queue |
| [**deleteRoutingSkill**](RoutingApi.html#deleteRoutingSkill) | Delete Routing Skill |
| [**deleteRoutingSmsPhonenumber**](RoutingApi.html#deleteRoutingSmsPhonenumber) | Delete a phone number provisioned for SMS. |
| [**deleteRoutingUtilization**](RoutingApi.html#deleteRoutingUtilization) | Delete utilization settings and revert to system defaults. |
| [**deleteRoutingWrapupcode**](RoutingApi.html#deleteRoutingWrapupcode) | Delete wrap-up code |
| [**deleteUserRoutinglanguage**](RoutingApi.html#deleteUserRoutinglanguage) | Remove routing language from user |
| [**deleteUserRoutingskill**](RoutingApi.html#deleteUserRoutingskill) | Remove routing skill from user |
| [**getRoutingEmailDomain**](RoutingApi.html#getRoutingEmailDomain) | Get domain |
| [**getRoutingEmailDomainRoute**](RoutingApi.html#getRoutingEmailDomainRoute) | Get a route |
| [**getRoutingEmailDomainRoutes**](RoutingApi.html#getRoutingEmailDomainRoutes) | Get routes |
| [**getRoutingEmailDomains**](RoutingApi.html#getRoutingEmailDomains) | Get domains |
| [**getRoutingEmailSetup**](RoutingApi.html#getRoutingEmailSetup) | Get email setup |
| [**getRoutingLanguages**](RoutingApi.html#getRoutingLanguages) | Get the list of supported languages. |
| [**getRoutingMessageRecipient**](RoutingApi.html#getRoutingMessageRecipient) | Get a recipient |
| [**getRoutingMessageRecipients**](RoutingApi.html#getRoutingMessageRecipients) | Get recipients |
| [**getRoutingQueue**](RoutingApi.html#getRoutingQueue) | Get details about this queue. |
| [**getRoutingQueueEstimatedwaittime**](RoutingApi.html#getRoutingQueueEstimatedwaittime) | Get Estimated Wait Time |
| [**getRoutingQueueMediatypeEstimatedwaittime**](RoutingApi.html#getRoutingQueueMediatypeEstimatedwaittime) | Get Estimated Wait Time |
| [**getRoutingQueueUsers**](RoutingApi.html#getRoutingQueueUsers) | Get the members of this queue |
| [**getRoutingQueueWrapupcodes**](RoutingApi.html#getRoutingQueueWrapupcodes) | Get the wrap-up codes for a queue |
| [**getRoutingQueues**](RoutingApi.html#getRoutingQueues) | Get list of queues. |
| [**getRoutingQueuesDivisionviews**](RoutingApi.html#getRoutingQueuesDivisionviews) | Get a paged listing of simplified queue objects, filterable by name, queue ID(s), or division ID(s). |
| [**getRoutingQueuesDivisionviewsAll**](RoutingApi.html#getRoutingQueuesDivisionviewsAll) | Get a paged listing of simplified queue objects.  Can be used to get a digest of all queues in an organization. |
| [**getRoutingQueuesMe**](RoutingApi.html#getRoutingQueuesMe) | Get a paged listing of queues the user is a member of. |
| [**getRoutingSkill**](RoutingApi.html#getRoutingSkill) | Get Routing Skill |
| [**getRoutingSkills**](RoutingApi.html#getRoutingSkills) | Get the list of routing skills. |
| [**getRoutingSmsAvailablephonenumbers**](RoutingApi.html#getRoutingSmsAvailablephonenumbers) | Get a list of available phone numbers for SMS provisioning. |
| [**getRoutingSmsPhonenumber**](RoutingApi.html#getRoutingSmsPhonenumber) | Get a phone number provisioned for SMS. |
| [**getRoutingSmsPhonenumbers**](RoutingApi.html#getRoutingSmsPhonenumbers) | Get a list of provisioned phone numbers. |
| [**getRoutingUtilization**](RoutingApi.html#getRoutingUtilization) | Get the utilization settings. |
| [**getRoutingWrapupcode**](RoutingApi.html#getRoutingWrapupcode) | Get details about this wrap-up code. |
| [**getRoutingWrapupcodes**](RoutingApi.html#getRoutingWrapupcodes) | Get list of wrapup codes. |
| [**getUserRoutinglanguages**](RoutingApi.html#getUserRoutinglanguages) | List routing language for user |
| [**getUserRoutingskills**](RoutingApi.html#getUserRoutingskills) | List routing skills for user |
| [**patchRoutingQueueUser**](RoutingApi.html#patchRoutingQueueUser) | Update the ring number OR joined status for a User in a Queue |
| [**patchRoutingQueueUsers**](RoutingApi.html#patchRoutingQueueUsers) | Join or unjoin a set of users for a queue |
| [**patchUserRoutinglanguage**](RoutingApi.html#patchUserRoutinglanguage) | Update routing language proficiency or state. |
| [**patchUserRoutinglanguagesBulk**](RoutingApi.html#patchUserRoutinglanguagesBulk) | Add bulk routing language to user. Max limit 50 languages |
| [**patchUserRoutingskillsBulk**](RoutingApi.html#patchUserRoutingskillsBulk) | Bulk add routing skills to user |
| [**postAnalyticsQueuesObservationsQuery**](RoutingApi.html#postAnalyticsQueuesObservationsQuery) | Query for queue observations |
| [**postRoutingEmailDomainRoutes**](RoutingApi.html#postRoutingEmailDomainRoutes) | Create a route |
| [**postRoutingEmailDomains**](RoutingApi.html#postRoutingEmailDomains) | Create a domain |
| [**postRoutingLanguages**](RoutingApi.html#postRoutingLanguages) | Create Language |
| [**postRoutingQueueUsers**](RoutingApi.html#postRoutingQueueUsers) | Bulk add or delete up to 100 queue members |
| [**postRoutingQueueWrapupcodes**](RoutingApi.html#postRoutingQueueWrapupcodes) | Add up to 100 wrap-up codes to a queue |
| [**postRoutingQueues**](RoutingApi.html#postRoutingQueues) | Create a queue |
| [**postRoutingSkills**](RoutingApi.html#postRoutingSkills) | Create Skill |
| [**postRoutingSmsAddresses**](RoutingApi.html#postRoutingSmsAddresses) | Provision an Address for SMS |
| [**postRoutingSmsPhonenumbers**](RoutingApi.html#postRoutingSmsPhonenumbers) | Provision a phone number for SMS |
| [**postRoutingWrapupcodes**](RoutingApi.html#postRoutingWrapupcodes) | Create a wrap-up code |
| [**postUserRoutinglanguages**](RoutingApi.html#postUserRoutinglanguages) | Add routing language to user |
| [**postUserRoutingskills**](RoutingApi.html#postUserRoutingskills) | Add routing skill to user |
| [**putRoutingEmailDomainRoute**](RoutingApi.html#putRoutingEmailDomainRoute) | Update a route |
| [**putRoutingMessageRecipient**](RoutingApi.html#putRoutingMessageRecipient) | Update a recipient |
| [**putRoutingQueue**](RoutingApi.html#putRoutingQueue) | Update a queue |
| [**putRoutingSmsPhonenumber**](RoutingApi.html#putRoutingSmsPhonenumber) | Update a phone number provisioned for SMS. |
| [**putRoutingUtilization**](RoutingApi.html#putRoutingUtilization) | Update the utilization settings. |
| [**putRoutingWrapupcode**](RoutingApi.html#putRoutingWrapupcode) | Update wrap-up code |
| [**putUserRoutingskill**](RoutingApi.html#putUserRoutingskill) | Update routing skill proficiency or state. |
| [**putUserRoutingskillsBulk**](RoutingApi.html#putUserRoutingskillsBulk) | Replace all routing skills assigned to a user |
{: class="table-striped"}

<a name="deleteRoutingEmailDomain"></a>

# **deleteRoutingEmailDomain**



> Void deleteRoutingEmailDomain(domainId)

Delete a domain



Wraps DELETE /api/v2/routing/email/domains/{domainId}  

Requires ANY permissions: 

* routing:email:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String domainId = "domainId_example"; // String | domain ID
try {
    apiInstance.deleteRoutingEmailDomain(domainId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingEmailDomain");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domainId** | **String**| domain ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteRoutingEmailDomainRoute"></a>

# **deleteRoutingEmailDomainRoute**



> Void deleteRoutingEmailDomainRoute(domainName, routeId)

Delete a route



Wraps DELETE /api/v2/routing/email/domains/{domainName}/routes/{routeId}  

Requires ANY permissions: 

* routing:email:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String domainName = "domainName_example"; // String | email domain
String routeId = "routeId_example"; // String | route ID
try {
    apiInstance.deleteRoutingEmailDomainRoute(domainName, routeId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingEmailDomainRoute");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domainName** | **String**| email domain | 
| **routeId** | **String**| route ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteRoutingQueue"></a>

# **deleteRoutingQueue**



> Void deleteRoutingQueue(queueId, forceDelete)

Delete a queue



Wraps DELETE /api/v2/routing/queues/{queueId}  

Requires ANY permissions: 

* routing:queue:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
Boolean forceDelete = true; // Boolean | forceDelete
try {
    apiInstance.deleteRoutingQueue(queueId, forceDelete);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingQueue");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **queueId** | **String**| Queue ID | 
| **forceDelete** | **Boolean**| forceDelete | [optional] 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteRoutingQueueUser"></a>

# **deleteRoutingQueueUser**



> Void deleteRoutingQueueUser(queueId, memberId)

Delete queue member



Wraps DELETE /api/v2/routing/queues/{queueId}/users/{memberId}  

Requires ANY permissions: 

* routing:queue:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
String memberId = "memberId_example"; // String | Member ID
try {
    apiInstance.deleteRoutingQueueUser(queueId, memberId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingQueueUser");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **queueId** | **String**| Queue ID | 
| **memberId** | **String**| Member ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteRoutingQueueWrapupcode"></a>

# **deleteRoutingQueueWrapupcode**



> Void deleteRoutingQueueWrapupcode(queueId, codeId)

Delete a wrap-up code from a queue



Wraps DELETE /api/v2/routing/queues/{queueId}/wrapupcodes/{codeId}  

Requires ANY permissions: 

* routing:queue:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
String codeId = "codeId_example"; // String | Code ID
try {
    apiInstance.deleteRoutingQueueWrapupcode(queueId, codeId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingQueueWrapupcode");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **queueId** | **String**| Queue ID | 
| **codeId** | **String**| Code ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteRoutingSkill"></a>

# **deleteRoutingSkill**



> Void deleteRoutingSkill(skillId)

Delete Routing Skill



Wraps DELETE /api/v2/routing/skills/{skillId}  

Requires ANY permissions: 

* routing:skill:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String skillId = "skillId_example"; // String | Skill ID
try {
    apiInstance.deleteRoutingSkill(skillId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingSkill");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **skillId** | **String**| Skill ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteRoutingSmsPhonenumber"></a>

# **deleteRoutingSmsPhonenumber**



> Void deleteRoutingSmsPhonenumber(addressId)

Delete a phone number provisioned for SMS.



Wraps DELETE /api/v2/routing/sms/phonenumbers/{addressId}  

Requires ANY permissions: 

* sms:phoneNumber:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String addressId = "addressId_example"; // String | Address ID
try {
    apiInstance.deleteRoutingSmsPhonenumber(addressId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingSmsPhonenumber");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **addressId** | **String**| Address ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteRoutingUtilization"></a>

# **deleteRoutingUtilization**



> Void deleteRoutingUtilization()

Delete utilization settings and revert to system defaults.



Wraps DELETE /api/v2/routing/utilization  

Requires ANY permissions: 

* routing:utilization:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
try {
    apiInstance.deleteRoutingUtilization();
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingUtilization");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

null (empty response body)

<a name="deleteRoutingWrapupcode"></a>

# **deleteRoutingWrapupcode**



> Void deleteRoutingWrapupcode(codeId)

Delete wrap-up code



Wraps DELETE /api/v2/routing/wrapupcodes/{codeId}  

Requires ANY permissions: 

* routing:wrapupCode:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String codeId = "codeId_example"; // String | Wrapup Code ID
try {
    apiInstance.deleteRoutingWrapupcode(codeId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingWrapupcode");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **codeId** | **String**| Wrapup Code ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteUserRoutinglanguage"></a>

# **deleteUserRoutinglanguage**



> Void deleteUserRoutinglanguage(userId, languageId)

Remove routing language from user



Wraps DELETE /api/v2/users/{userId}/routinglanguages/{languageId}  

Requires ANY permissions: 

* routing:skill:assign
* admin

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
String languageId = "languageId_example"; // String | languageId
try {
    apiInstance.deleteUserRoutinglanguage(userId, languageId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteUserRoutinglanguage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **languageId** | **String**| languageId | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteUserRoutingskill"></a>

# **deleteUserRoutingskill**



> Void deleteUserRoutingskill(userId, skillId)

Remove routing skill from user



Wraps DELETE /api/v2/users/{userId}/routingskills/{skillId}  

Requires ANY permissions: 

* routing:skill:assign
* admin

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
String skillId = "skillId_example"; // String | skillId
try {
    apiInstance.deleteUserRoutingskill(userId, skillId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteUserRoutingskill");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **skillId** | **String**| skillId | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="getRoutingEmailDomain"></a>

# **getRoutingEmailDomain**



> [InboundDomain](InboundDomain.html) getRoutingEmailDomain(domainId)

Get domain



Wraps GET /api/v2/routing/email/domains/{domainId}  

Requires ANY permissions: 

* routing:email:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String domainId = "domainId_example"; // String | domain ID
try {
    InboundDomain result = apiInstance.getRoutingEmailDomain(domainId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingEmailDomain");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domainId** | **String**| domain ID | 
{: class="table-striped"}


### Return type

[**InboundDomain**](InboundDomain.html)

<a name="getRoutingEmailDomainRoute"></a>

# **getRoutingEmailDomainRoute**



> [InboundRoute](InboundRoute.html) getRoutingEmailDomainRoute(domainName, routeId)

Get a route



Wraps GET /api/v2/routing/email/domains/{domainName}/routes/{routeId}  

Requires ANY permissions: 

* routing:email:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String domainName = "domainName_example"; // String | email domain
String routeId = "routeId_example"; // String | route ID
try {
    InboundRoute result = apiInstance.getRoutingEmailDomainRoute(domainName, routeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingEmailDomainRoute");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domainName** | **String**| email domain | 
| **routeId** | **String**| route ID | 
{: class="table-striped"}


### Return type

[**InboundRoute**](InboundRoute.html)

<a name="getRoutingEmailDomainRoutes"></a>

# **getRoutingEmailDomainRoutes**



> [InboundRouteEntityListing](InboundRouteEntityListing.html) getRoutingEmailDomainRoutes(domainName, pageSize, pageNumber, pattern)

Get routes



Wraps GET /api/v2/routing/email/domains/{domainName}/routes  

Requires ANY permissions: 

* routing:email:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String domainName = "domainName_example"; // String | email domain
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String pattern = "pattern_example"; // String | Filter routes by the route's pattern property
try {
    InboundRouteEntityListing result = apiInstance.getRoutingEmailDomainRoutes(domainName, pageSize, pageNumber, pattern);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingEmailDomainRoutes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domainName** | **String**| email domain | 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pattern** | **String**| Filter routes by the route&#39;s pattern property | [optional] 
{: class="table-striped"}


### Return type

[**InboundRouteEntityListing**](InboundRouteEntityListing.html)

<a name="getRoutingEmailDomains"></a>

# **getRoutingEmailDomains**



> [InboundDomainEntityListing](InboundDomainEntityListing.html) getRoutingEmailDomains()

Get domains



Wraps GET /api/v2/routing/email/domains  

Requires ANY permissions: 

* routing:email:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
try {
    InboundDomainEntityListing result = apiInstance.getRoutingEmailDomains();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingEmailDomains");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**InboundDomainEntityListing**](InboundDomainEntityListing.html)

<a name="getRoutingEmailSetup"></a>

# **getRoutingEmailSetup**



> [EmailSetup](EmailSetup.html) getRoutingEmailSetup()

Get email setup



Wraps GET /api/v2/routing/email/setup  

Requires ANY permissions: 

* routing:email:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
try {
    EmailSetup result = apiInstance.getRoutingEmailSetup();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingEmailSetup");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**EmailSetup**](EmailSetup.html)

<a name="getRoutingLanguages"></a>

# **getRoutingLanguages**



> [LanguageEntityListing](LanguageEntityListing.html) getRoutingLanguages(pageSize, pageNumber, sortOrder, name, id)

Get the list of supported languages.



Wraps GET /api/v2/routing/languages  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortOrder = "ASC"; // String | Ascending or descending sort order
String name = "name_example"; // String | Name
List<String> id = Arrays.asList("id_example"); // List<String> | id
try {
    LanguageEntityListing result = apiInstance.getRoutingLanguages(pageSize, pageNumber, sortOrder, name, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingLanguages");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **sortOrder** | **String**| Ascending or descending sort order | [optional] [default to ASC]<br />**Values**: ascending, descending 
| **name** | **String**| Name | [optional] 
| **id** | [**List&lt;String&gt;**](String.html)| id | [optional] 
{: class="table-striped"}


### Return type

[**LanguageEntityListing**](LanguageEntityListing.html)

<a name="getRoutingMessageRecipient"></a>

# **getRoutingMessageRecipient**



> [Recipient](Recipient.html) getRoutingMessageRecipient(recipientId)

Get a recipient



Wraps GET /api/v2/routing/message/recipients/{recipientId}  

Requires ANY permissions: 

* routing:message:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String recipientId = "recipientId_example"; // String | Recipient ID
try {
    Recipient result = apiInstance.getRoutingMessageRecipient(recipientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingMessageRecipient");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **recipientId** | **String**| Recipient ID | 
{: class="table-striped"}


### Return type

[**Recipient**](Recipient.html)

<a name="getRoutingMessageRecipients"></a>

# **getRoutingMessageRecipients**



> [RecipientListing](RecipientListing.html) getRoutingMessageRecipients(messengerType, pageSize, pageNumber)

Get recipients



Wraps GET /api/v2/routing/message/recipients  

Requires ANY permissions: 

* routing:message:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String messengerType = "messengerType_example"; // String | Messenger Type
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    RecipientListing result = apiInstance.getRoutingMessageRecipients(messengerType, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingMessageRecipients");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **messengerType** | **String**| Messenger Type | [optional]<br />**Values**: sms, facebook, twitter, line, whatsapp 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
{: class="table-striped"}


### Return type

[**RecipientListing**](RecipientListing.html)

<a name="getRoutingQueue"></a>

# **getRoutingQueue**



> [Queue](Queue.html) getRoutingQueue(queueId)

Get details about this queue.



Wraps GET /api/v2/routing/queues/{queueId}  

Requires ANY permissions: 

* routing:queue:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
try {
    Queue result = apiInstance.getRoutingQueue(queueId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingQueue");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **queueId** | **String**| Queue ID | 
{: class="table-striped"}


### Return type

[**Queue**](Queue.html)

<a name="getRoutingQueueEstimatedwaittime"></a>

# **getRoutingQueueEstimatedwaittime**



> [EstimatedWaitTimePredictions](EstimatedWaitTimePredictions.html) getRoutingQueueEstimatedwaittime(queueId, conversationId)

Get Estimated Wait Time



Wraps GET /api/v2/routing/queues/{queueId}/estimatedwaittime  

Requires ANY permissions: 

* routing:queue:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | queueId
String conversationId = "conversationId_example"; // String | conversationId
try {
    EstimatedWaitTimePredictions result = apiInstance.getRoutingQueueEstimatedwaittime(queueId, conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingQueueEstimatedwaittime");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **queueId** | **String**| queueId | 
| **conversationId** | **String**| conversationId | [optional] 
{: class="table-striped"}


### Return type

[**EstimatedWaitTimePredictions**](EstimatedWaitTimePredictions.html)

<a name="getRoutingQueueMediatypeEstimatedwaittime"></a>

# **getRoutingQueueMediatypeEstimatedwaittime**



> [EstimatedWaitTimePredictions](EstimatedWaitTimePredictions.html) getRoutingQueueMediatypeEstimatedwaittime(queueId, mediaType)

Get Estimated Wait Time



Wraps GET /api/v2/routing/queues/{queueId}/mediatypes/{mediaType}/estimatedwaittime  

Requires ANY permissions: 

* routing:queue:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | queueId
String mediaType = "mediaType_example"; // String | mediaType
try {
    EstimatedWaitTimePredictions result = apiInstance.getRoutingQueueMediatypeEstimatedwaittime(queueId, mediaType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingQueueMediatypeEstimatedwaittime");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **queueId** | **String**| queueId | 
| **mediaType** | **String**| mediaType | 
{: class="table-striped"}


### Return type

[**EstimatedWaitTimePredictions**](EstimatedWaitTimePredictions.html)

<a name="getRoutingQueueUsers"></a>

# **getRoutingQueueUsers**



> [QueueMemberEntityListing](QueueMemberEntityListing.html) getRoutingQueueUsers(queueId, pageSize, pageNumber, sortBy, expand, joined, name, profileSkills, skills, languages, routingStatus, presence)

Get the members of this queue



Wraps GET /api/v2/routing/queues/{queueId}/users  

Requires ANY permissions: 

* routing:queue:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortBy = "name"; // String | Sort by
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand.
Boolean joined = true; // Boolean | Filter by joined status
String name = "name_example"; // String | Filter by queue member name
List<String> profileSkills = Arrays.asList("profileSkills_example"); // List<String> | Filter by profile skill
List<String> skills = Arrays.asList("skills_example"); // List<String> | Filter by skill
List<String> languages = Arrays.asList("languages_example"); // List<String> | Filter by language
List<String> routingStatus = Arrays.asList("routingStatus_example"); // List<String> | Filter by routing status
List<String> presence = Arrays.asList("presence_example"); // List<String> | Filter by presence
try {
    QueueMemberEntityListing result = apiInstance.getRoutingQueueUsers(queueId, pageSize, pageNumber, sortBy, expand, joined, name, profileSkills, skills, languages, routingStatus, presence);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingQueueUsers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **queueId** | **String**| Queue ID | 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **sortBy** | **String**| Sort by | [optional] [default to name] 
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand. | [optional]<br />**Values**: routingStatus, presence, conversationSummary, outOfOffice, geolocation, station, authorization, profileSkills, certifications, locations, groups, skills, languages, languagePreference, employerInfo, biography 
| **joined** | **Boolean**| Filter by joined status | [optional] 
| **name** | **String**| Filter by queue member name | [optional] 
| **profileSkills** | [**List&lt;String&gt;**](String.html)| Filter by profile skill | [optional] 
| **skills** | [**List&lt;String&gt;**](String.html)| Filter by skill | [optional] 
| **languages** | [**List&lt;String&gt;**](String.html)| Filter by language | [optional] 
| **routingStatus** | [**List&lt;String&gt;**](String.html)| Filter by routing status | [optional] 
| **presence** | [**List&lt;String&gt;**](String.html)| Filter by presence | [optional] 
{: class="table-striped"}


### Return type

[**QueueMemberEntityListing**](QueueMemberEntityListing.html)

<a name="getRoutingQueueWrapupcodes"></a>

# **getRoutingQueueWrapupcodes**



> [WrapupCodeEntityListing](WrapupCodeEntityListing.html) getRoutingQueueWrapupcodes(queueId, pageSize, pageNumber)

Get the wrap-up codes for a queue



Wraps GET /api/v2/routing/queues/{queueId}/wrapupcodes  

Requires ANY permissions: 

* routing:queue:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    WrapupCodeEntityListing result = apiInstance.getRoutingQueueWrapupcodes(queueId, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingQueueWrapupcodes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **queueId** | **String**| Queue ID | 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
{: class="table-striped"}


### Return type

[**WrapupCodeEntityListing**](WrapupCodeEntityListing.html)

<a name="getRoutingQueues"></a>

# **getRoutingQueues**



> [QueueEntityListing](QueueEntityListing.html) getRoutingQueues(pageSize, pageNumber, sortBy, name, active, divisionId)

Get list of queues.



Wraps GET /api/v2/routing/queues  

Requires ANY permissions: 

* routing:queue:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortBy = "name"; // String | Sort by
String name = "name_example"; // String | Name
Boolean active = true; // Boolean | Active
List<String> divisionId = Arrays.asList("divisionId_example"); // List<String> | Division ID(s)
try {
    QueueEntityListing result = apiInstance.getRoutingQueues(pageSize, pageNumber, sortBy, name, active, divisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingQueues");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **sortBy** | **String**| Sort by | [optional] [default to name] 
| **name** | **String**| Name | [optional] 
| **active** | **Boolean**| Active | [optional] 
| **divisionId** | [**List&lt;String&gt;**](String.html)| Division ID(s) | [optional] 
{: class="table-striped"}


### Return type

[**QueueEntityListing**](QueueEntityListing.html)

<a name="getRoutingQueuesDivisionviews"></a>

# **getRoutingQueuesDivisionviews**



> [QueueEntityListing](QueueEntityListing.html) getRoutingQueuesDivisionviews(pageSize, pageNumber, sortBy, sortOrder, name, id, divisionId)

Get a paged listing of simplified queue objects, filterable by name, queue ID(s), or division ID(s).



Wraps GET /api/v2/routing/queues/divisionviews  

Requires ANY permissions: 

* routing:queue:search

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
Integer pageSize = 25; // Integer | Page size [max value is 100]
Integer pageNumber = 1; // Integer | Page number [max value is 5]
String sortBy = "name"; // String | Sort by
String sortOrder = "asc"; // String | Sort order
String name = "name_example"; // String | Name
List<String> id = Arrays.asList("id_example"); // List<String> | Queue ID(s)
List<String> divisionId = Arrays.asList("divisionId_example"); // List<String> | Division ID(s)
try {
    QueueEntityListing result = apiInstance.getRoutingQueuesDivisionviews(pageSize, pageNumber, sortBy, sortOrder, name, id, divisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingQueuesDivisionviews");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size [max value is 100] | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number [max value is 5] | [optional] [default to 1] 
| **sortBy** | **String**| Sort by | [optional] [default to name]<br />**Values**: name, id, divisionId 
| **sortOrder** | **String**| Sort order | [optional] [default to asc]<br />**Values**: asc, desc, score 
| **name** | **String**| Name | [optional] 
| **id** | [**List&lt;String&gt;**](String.html)| Queue ID(s) | [optional] 
| **divisionId** | [**List&lt;String&gt;**](String.html)| Division ID(s) | [optional] 
{: class="table-striped"}


### Return type

[**QueueEntityListing**](QueueEntityListing.html)

<a name="getRoutingQueuesDivisionviewsAll"></a>

# **getRoutingQueuesDivisionviewsAll**



> [QueueEntityListing](QueueEntityListing.html) getRoutingQueuesDivisionviewsAll(pageSize, pageNumber, sortBy, sortOrder)

Get a paged listing of simplified queue objects.  Can be used to get a digest of all queues in an organization.



Wraps GET /api/v2/routing/queues/divisionviews/all  

Requires ANY permissions: 

* routing:queue:search

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
Integer pageSize = 25; // Integer | Page size [max value is 500]
Integer pageNumber = 1; // Integer | Page number
String sortBy = "name"; // String | Sort by
String sortOrder = "asc"; // String | Sort order
try {
    QueueEntityListing result = apiInstance.getRoutingQueuesDivisionviewsAll(pageSize, pageNumber, sortBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingQueuesDivisionviewsAll");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size [max value is 500] | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **sortBy** | **String**| Sort by | [optional] [default to name]<br />**Values**: name, id, divisionId 
| **sortOrder** | **String**| Sort order | [optional] [default to asc]<br />**Values**: asc, desc, score 
{: class="table-striped"}


### Return type

[**QueueEntityListing**](QueueEntityListing.html)

<a name="getRoutingQueuesMe"></a>

# **getRoutingQueuesMe**



> [UserQueueEntityListing](UserQueueEntityListing.html) getRoutingQueuesMe(joined, pageSize, pageNumber, sortBy, sortOrder)

Get a paged listing of queues the user is a member of.



Wraps GET /api/v2/routing/queues/me  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
Boolean joined = true; // Boolean | Joined
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortBy = "name"; // String | Sort by
String sortOrder = "asc"; // String | Sort order
try {
    UserQueueEntityListing result = apiInstance.getRoutingQueuesMe(joined, pageSize, pageNumber, sortBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingQueuesMe");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **joined** | **Boolean**| Joined | [optional] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **sortBy** | **String**| Sort by | [optional] [default to name] 
| **sortOrder** | **String**| Sort order | [optional] [default to asc] 
{: class="table-striped"}


### Return type

[**UserQueueEntityListing**](UserQueueEntityListing.html)

<a name="getRoutingSkill"></a>

# **getRoutingSkill**



> [RoutingSkill](RoutingSkill.html) getRoutingSkill(skillId)

Get Routing Skill



Wraps GET /api/v2/routing/skills/{skillId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String skillId = "skillId_example"; // String | Skill ID
try {
    RoutingSkill result = apiInstance.getRoutingSkill(skillId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingSkill");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **skillId** | **String**| Skill ID | 
{: class="table-striped"}


### Return type

[**RoutingSkill**](RoutingSkill.html)

<a name="getRoutingSkills"></a>

# **getRoutingSkills**



> [SkillEntityListing](SkillEntityListing.html) getRoutingSkills(pageSize, pageNumber, name, id)

Get the list of routing skills.



Wraps GET /api/v2/routing/skills  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String name = "name_example"; // String | Filter for results that start with this value
List<String> id = Arrays.asList("id_example"); // List<String> | id
try {
    SkillEntityListing result = apiInstance.getRoutingSkills(pageSize, pageNumber, name, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingSkills");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **name** | **String**| Filter for results that start with this value | [optional] 
| **id** | [**List&lt;String&gt;**](String.html)| id | [optional] 
{: class="table-striped"}


### Return type

[**SkillEntityListing**](SkillEntityListing.html)

<a name="getRoutingSmsAvailablephonenumbers"></a>

# **getRoutingSmsAvailablephonenumbers**



> [SMSAvailablePhoneNumberEntityListing](SMSAvailablePhoneNumberEntityListing.html) getRoutingSmsAvailablephonenumbers(countryCode, phoneNumberType, region, city, areaCode, pattern, addressRequirement)

Get a list of available phone numbers for SMS provisioning.

This request will return up to 30 random phone numbers matching the criteria specified.  To get additional phone numbers repeat the request.

Wraps GET /api/v2/routing/sms/availablephonenumbers  

Requires ANY permissions: 

* sms:phoneNumber:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String countryCode = "countryCode_example"; // String | The ISO 3166-1 alpha-2 country code of the county for which available phone numbers should be returned
String phoneNumberType = "phoneNumberType_example"; // String | Type of available phone numbers searched
String region = "region_example"; // String | Region/province/state that can be used to restrict the numbers returned
String city = "city_example"; // String | City that can be used to restrict the numbers returned
String areaCode = "areaCode_example"; // String | Area code that can be used to restrict the numbers returned
String pattern = "pattern_example"; // String | A pattern to match phone numbers. Valid characters are '*' and [0-9a-zA-Z]. The '*' character will match any single digit.
String addressRequirement = "addressRequirement_example"; // String | This indicates whether the phone number requires to have an Address registered.
try {
    SMSAvailablePhoneNumberEntityListing result = apiInstance.getRoutingSmsAvailablephonenumbers(countryCode, phoneNumberType, region, city, areaCode, pattern, addressRequirement);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingSmsAvailablephonenumbers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **countryCode** | **String**| The ISO 3166-1 alpha-2 country code of the county for which available phone numbers should be returned | 
| **phoneNumberType** | **String**| Type of available phone numbers searched |<br />**Values**: local, mobile, tollfree 
| **region** | **String**| Region/province/state that can be used to restrict the numbers returned | [optional] 
| **city** | **String**| City that can be used to restrict the numbers returned | [optional] 
| **areaCode** | **String**| Area code that can be used to restrict the numbers returned | [optional] 
| **pattern** | **String**| A pattern to match phone numbers. Valid characters are &#39;*&#39; and [0-9a-zA-Z]. The &#39;*&#39; character will match any single digit. | [optional] 
| **addressRequirement** | **String**| This indicates whether the phone number requires to have an Address registered. | [optional]<br />**Values**: none, any, local, foreign 
{: class="table-striped"}


### Return type

[**SMSAvailablePhoneNumberEntityListing**](SMSAvailablePhoneNumberEntityListing.html)

<a name="getRoutingSmsPhonenumber"></a>

# **getRoutingSmsPhonenumber**



> [SmsPhoneNumber](SmsPhoneNumber.html) getRoutingSmsPhonenumber(addressId)

Get a phone number provisioned for SMS.



Wraps GET /api/v2/routing/sms/phonenumbers/{addressId}  

Requires ANY permissions: 

* sms:phoneNumber:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String addressId = "addressId_example"; // String | Address ID
try {
    SmsPhoneNumber result = apiInstance.getRoutingSmsPhonenumber(addressId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingSmsPhonenumber");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **addressId** | **String**| Address ID | 
{: class="table-striped"}


### Return type

[**SmsPhoneNumber**](SmsPhoneNumber.html)

<a name="getRoutingSmsPhonenumbers"></a>

# **getRoutingSmsPhonenumbers**



> [SmsPhoneNumberEntityListing](SmsPhoneNumberEntityListing.html) getRoutingSmsPhonenumbers(phoneNumber, phoneNumberType, phoneNumberStatus, pageSize, pageNumber)

Get a list of provisioned phone numbers.



Wraps GET /api/v2/routing/sms/phonenumbers  

Requires ANY permissions: 

* sms:phoneNumber:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String phoneNumber = "phoneNumber_example"; // String | Filter on phone number address. Allowable characters are the digits '0-9' and the wild card character '\\*'. If just digits are present, a contains search is done on the address pattern. For example, '317' could be matched anywhere in the address. An '\\*' will match multiple digits. For example, to match a specific area code within the US a pattern like '1317*' could be used.
String phoneNumberType = "phoneNumberType_example"; // String | Filter on phone number type
String phoneNumberStatus = "phoneNumberStatus_example"; // String | Filter on phone number status
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    SmsPhoneNumberEntityListing result = apiInstance.getRoutingSmsPhonenumbers(phoneNumber, phoneNumberType, phoneNumberStatus, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingSmsPhonenumbers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **phoneNumber** | **String**| Filter on phone number address. Allowable characters are the digits &#39;0-9&#39; and the wild card character &#39;\\*&#39;. If just digits are present, a contains search is done on the address pattern. For example, &#39;317&#39; could be matched anywhere in the address. An &#39;\\*&#39; will match multiple digits. For example, to match a specific area code within the US a pattern like &#39;1317*&#39; could be used. | [optional] 
| **phoneNumberType** | **String**| Filter on phone number type | [optional]<br />**Values**: local, mobile, tollfree 
| **phoneNumberStatus** | **String**| Filter on phone number status | [optional]<br />**Values**: active, invalid, porting 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
{: class="table-striped"}


### Return type

[**SmsPhoneNumberEntityListing**](SmsPhoneNumberEntityListing.html)

<a name="getRoutingUtilization"></a>

# **getRoutingUtilization**



> [Utilization](Utilization.html) getRoutingUtilization()

Get the utilization settings.



Wraps GET /api/v2/routing/utilization  

Requires ANY permissions: 

* routing:utilization:manage
* routing:utilization:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
try {
    Utilization result = apiInstance.getRoutingUtilization();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingUtilization");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**Utilization**](Utilization.html)

<a name="getRoutingWrapupcode"></a>

# **getRoutingWrapupcode**



> [WrapupCode](WrapupCode.html) getRoutingWrapupcode(codeId)

Get details about this wrap-up code.



Wraps GET /api/v2/routing/wrapupcodes/{codeId}  

Requires ANY permissions: 

* routing:wrapupCode:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String codeId = "codeId_example"; // String | Wrapup Code ID
try {
    WrapupCode result = apiInstance.getRoutingWrapupcode(codeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingWrapupcode");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **codeId** | **String**| Wrapup Code ID | 
{: class="table-striped"}


### Return type

[**WrapupCode**](WrapupCode.html)

<a name="getRoutingWrapupcodes"></a>

# **getRoutingWrapupcodes**



> [WrapupCodeEntityListing](WrapupCodeEntityListing.html) getRoutingWrapupcodes(pageSize, pageNumber, sortBy, name)

Get list of wrapup codes.



Wraps GET /api/v2/routing/wrapupcodes  

Requires ANY permissions: 

* routing:wrapupCode:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortBy = "name"; // String | Sort by
String name = "name_example"; // String | Name
try {
    WrapupCodeEntityListing result = apiInstance.getRoutingWrapupcodes(pageSize, pageNumber, sortBy, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingWrapupcodes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **sortBy** | **String**| Sort by | [optional] [default to name]<br />**Values**: name, id 
| **name** | **String**| Name | [optional] 
{: class="table-striped"}


### Return type

[**WrapupCodeEntityListing**](WrapupCodeEntityListing.html)

<a name="getUserRoutinglanguages"></a>

# **getUserRoutinglanguages**



> [UserLanguageEntityListing](UserLanguageEntityListing.html) getUserRoutinglanguages(userId, pageSize, pageNumber, sortOrder)

List routing language for user



Wraps GET /api/v2/users/{userId}/routinglanguages  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortOrder = "ASC"; // String | Ascending or descending sort order
try {
    UserLanguageEntityListing result = apiInstance.getUserRoutinglanguages(userId, pageSize, pageNumber, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getUserRoutinglanguages");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **sortOrder** | **String**| Ascending or descending sort order | [optional] [default to ASC]<br />**Values**: ascending, descending 
{: class="table-striped"}


### Return type

[**UserLanguageEntityListing**](UserLanguageEntityListing.html)

<a name="getUserRoutingskills"></a>

# **getUserRoutingskills**



> [UserSkillEntityListing](UserSkillEntityListing.html) getUserRoutingskills(userId, pageSize, pageNumber, sortOrder)

List routing skills for user



Wraps GET /api/v2/users/{userId}/routingskills  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortOrder = "ASC"; // String | Ascending or descending sort order
try {
    UserSkillEntityListing result = apiInstance.getUserRoutingskills(userId, pageSize, pageNumber, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getUserRoutingskills");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **sortOrder** | **String**| Ascending or descending sort order | [optional] [default to ASC]<br />**Values**: ascending, descending 
{: class="table-striped"}


### Return type

[**UserSkillEntityListing**](UserSkillEntityListing.html)

<a name="patchRoutingQueueUser"></a>

# **patchRoutingQueueUser**



> [QueueMember](QueueMember.html) patchRoutingQueueUser(queueId, memberId, body)

Update the ring number OR joined status for a User in a Queue



Wraps PATCH /api/v2/routing/queues/{queueId}/users/{memberId}  

Requires ANY permissions: 

* routing:queue:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
String memberId = "memberId_example"; // String | Member ID
QueueMember body = new QueueMember(); // QueueMember | Queue Member
try {
    QueueMember result = apiInstance.patchRoutingQueueUser(queueId, memberId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#patchRoutingQueueUser");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **queueId** | **String**| Queue ID | 
| **memberId** | **String**| Member ID | 
| **body** | [**QueueMember**](QueueMember.html)| Queue Member | 
{: class="table-striped"}


### Return type

[**QueueMember**](QueueMember.html)

<a name="patchRoutingQueueUsers"></a>

# **patchRoutingQueueUsers**



> [QueueMemberEntityListing](QueueMemberEntityListing.html) patchRoutingQueueUsers(queueId, body)

Join or unjoin a set of users for a queue



Wraps PATCH /api/v2/routing/queues/{queueId}/users  

Requires ANY permissions: 

* routing:queue:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
List<QueueMember> body = Arrays.asList(new QueueMember()); // List<QueueMember> | Queue Members
try {
    QueueMemberEntityListing result = apiInstance.patchRoutingQueueUsers(queueId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#patchRoutingQueueUsers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **queueId** | **String**| Queue ID | 
| **body** | [**List&lt;QueueMember&gt;**](QueueMember.html)| Queue Members | 
{: class="table-striped"}


### Return type

[**QueueMemberEntityListing**](QueueMemberEntityListing.html)

<a name="patchUserRoutinglanguage"></a>

# **patchUserRoutinglanguage**



> [UserRoutingLanguage](UserRoutingLanguage.html) patchUserRoutinglanguage(userId, languageId, body)

Update routing language proficiency or state.



Wraps PATCH /api/v2/users/{userId}/routinglanguages/{languageId}  

Requires ANY permissions: 

* routing:skill:assign
* admin

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
String languageId = "languageId_example"; // String | languageId
UserRoutingLanguage body = new UserRoutingLanguage(); // UserRoutingLanguage | Language
try {
    UserRoutingLanguage result = apiInstance.patchUserRoutinglanguage(userId, languageId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#patchUserRoutinglanguage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **languageId** | **String**| languageId | 
| **body** | [**UserRoutingLanguage**](UserRoutingLanguage.html)| Language | 
{: class="table-striped"}


### Return type

[**UserRoutingLanguage**](UserRoutingLanguage.html)

<a name="patchUserRoutinglanguagesBulk"></a>

# **patchUserRoutinglanguagesBulk**



> [UserLanguageEntityListing](UserLanguageEntityListing.html) patchUserRoutinglanguagesBulk(userId, body)

Add bulk routing language to user. Max limit 50 languages



Wraps PATCH /api/v2/users/{userId}/routinglanguages/bulk  

Requires ANY permissions: 

* routing:skill:assign
* admin

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
List<UserRoutingLanguagePost> body = Arrays.asList(new UserRoutingLanguagePost()); // List<UserRoutingLanguagePost> | Language
try {
    UserLanguageEntityListing result = apiInstance.patchUserRoutinglanguagesBulk(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#patchUserRoutinglanguagesBulk");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **body** | [**List&lt;UserRoutingLanguagePost&gt;**](UserRoutingLanguagePost.html)| Language | 
{: class="table-striped"}


### Return type

[**UserLanguageEntityListing**](UserLanguageEntityListing.html)

<a name="patchUserRoutingskillsBulk"></a>

# **patchUserRoutingskillsBulk**



> [UserSkillEntityListing](UserSkillEntityListing.html) patchUserRoutingskillsBulk(userId, body)

Bulk add routing skills to user



Wraps PATCH /api/v2/users/{userId}/routingskills/bulk  

Requires ANY permissions: 

* routing:skill:assign
* admin

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
List<UserRoutingSkillPost> body = Arrays.asList(new UserRoutingSkillPost()); // List<UserRoutingSkillPost> | Skill
try {
    UserSkillEntityListing result = apiInstance.patchUserRoutingskillsBulk(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#patchUserRoutingskillsBulk");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **body** | [**List&lt;UserRoutingSkillPost&gt;**](UserRoutingSkillPost.html)| Skill | 
{: class="table-striped"}


### Return type

[**UserSkillEntityListing**](UserSkillEntityListing.html)

<a name="postAnalyticsQueuesObservationsQuery"></a>

# **postAnalyticsQueuesObservationsQuery**



> [QualifierMappingObservationQueryResponse](QualifierMappingObservationQueryResponse.html) postAnalyticsQueuesObservationsQuery(body)

Query for queue observations



Wraps POST /api/v2/analytics/queues/observations/query  

Requires ANY permissions: 

* analytics:queueObservation:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
ObservationQuery body = new ObservationQuery(); // ObservationQuery | query
try {
    QualifierMappingObservationQueryResponse result = apiInstance.postAnalyticsQueuesObservationsQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postAnalyticsQueuesObservationsQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ObservationQuery**](ObservationQuery.html)| query | 
{: class="table-striped"}


### Return type

[**QualifierMappingObservationQueryResponse**](QualifierMappingObservationQueryResponse.html)

<a name="postRoutingEmailDomainRoutes"></a>

# **postRoutingEmailDomainRoutes**



> [InboundRoute](InboundRoute.html) postRoutingEmailDomainRoutes(domainName, body)

Create a route



Wraps POST /api/v2/routing/email/domains/{domainName}/routes  

Requires ANY permissions: 

* routing:email:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String domainName = "domainName_example"; // String | email domain
InboundRoute body = new InboundRoute(); // InboundRoute | Route
try {
    InboundRoute result = apiInstance.postRoutingEmailDomainRoutes(domainName, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingEmailDomainRoutes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domainName** | **String**| email domain | 
| **body** | [**InboundRoute**](InboundRoute.html)| Route | 
{: class="table-striped"}


### Return type

[**InboundRoute**](InboundRoute.html)

<a name="postRoutingEmailDomains"></a>

# **postRoutingEmailDomains**



> [InboundDomain](InboundDomain.html) postRoutingEmailDomains(body)

Create a domain



Wraps POST /api/v2/routing/email/domains  

Requires ANY permissions: 

* routing:email:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
InboundDomain body = new InboundDomain(); // InboundDomain | Domain
try {
    InboundDomain result = apiInstance.postRoutingEmailDomains(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingEmailDomains");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**InboundDomain**](InboundDomain.html)| Domain | 
{: class="table-striped"}


### Return type

[**InboundDomain**](InboundDomain.html)

<a name="postRoutingLanguages"></a>

# **postRoutingLanguages**



> [Language](Language.html) postRoutingLanguages(body)

Create Language



Wraps POST /api/v2/routing/languages  

Requires ANY permissions: 

* routing:skill:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
Language body = new Language(); // Language | Language
try {
    Language result = apiInstance.postRoutingLanguages(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingLanguages");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**Language**](Language.html)| Language | 
{: class="table-striped"}


### Return type

[**Language**](Language.html)

<a name="postRoutingQueueUsers"></a>

# **postRoutingQueueUsers**



> String postRoutingQueueUsers(queueId, body, delete)

Bulk add or delete up to 100 queue members



Wraps POST /api/v2/routing/queues/{queueId}/users  

Requires ANY permissions: 

* routing:queue:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
List<WritableEntity> body = Arrays.asList(new WritableEntity()); // List<WritableEntity> | Queue Members
Boolean delete = false; // Boolean | True to delete queue members
try {
    String result = apiInstance.postRoutingQueueUsers(queueId, body, delete);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingQueueUsers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **queueId** | **String**| Queue ID | 
| **body** | [**List&lt;WritableEntity&gt;**](WritableEntity.html)| Queue Members | 
| **delete** | **Boolean**| True to delete queue members | [optional] [default to false] 
{: class="table-striped"}


### Return type

**String**

<a name="postRoutingQueueWrapupcodes"></a>

# **postRoutingQueueWrapupcodes**



> [List&lt;WrapupCode&gt;](WrapupCode.html) postRoutingQueueWrapupcodes(queueId, body)

Add up to 100 wrap-up codes to a queue



Wraps POST /api/v2/routing/queues/{queueId}/wrapupcodes  

Requires ANY permissions: 

* routing:queue:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
List<WrapUpCodeReference> body = Arrays.asList(new WrapUpCodeReference()); // List<WrapUpCodeReference> | List of wrapup codes
try {
    List<WrapupCode> result = apiInstance.postRoutingQueueWrapupcodes(queueId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingQueueWrapupcodes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **queueId** | **String**| Queue ID | 
| **body** | [**List&lt;WrapUpCodeReference&gt;**](WrapUpCodeReference.html)| List of wrapup codes | 
{: class="table-striped"}


### Return type

[**List&lt;WrapupCode&gt;**](WrapupCode.html)

<a name="postRoutingQueues"></a>

# **postRoutingQueues**



> [Queue](Queue.html) postRoutingQueues(body)

Create a queue



Wraps POST /api/v2/routing/queues  

Requires ANY permissions: 

* routing:queue:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
CreateQueueRequest body = new CreateQueueRequest(); // CreateQueueRequest | Queue
try {
    Queue result = apiInstance.postRoutingQueues(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingQueues");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CreateQueueRequest**](CreateQueueRequest.html)| Queue | 
{: class="table-striped"}


### Return type

[**Queue**](Queue.html)

<a name="postRoutingSkills"></a>

# **postRoutingSkills**



> [RoutingSkill](RoutingSkill.html) postRoutingSkills(body)

Create Skill



Wraps POST /api/v2/routing/skills  

Requires ANY permissions: 

* routing:skill:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
RoutingSkill body = new RoutingSkill(); // RoutingSkill | Skill
try {
    RoutingSkill result = apiInstance.postRoutingSkills(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingSkills");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**RoutingSkill**](RoutingSkill.html)| Skill | 
{: class="table-striped"}


### Return type

[**RoutingSkill**](RoutingSkill.html)

<a name="postRoutingSmsAddresses"></a>

# **postRoutingSmsAddresses**



> [SmsPhoneNumber](SmsPhoneNumber.html) postRoutingSmsAddresses(body)

Provision an Address for SMS



Wraps POST /api/v2/routing/sms/addresses  

Requires ANY permissions: 

* sms:phoneNumber:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
SmsAddressProvision body = new SmsAddressProvision(); // SmsAddressProvision | SmsAddress
try {
    SmsPhoneNumber result = apiInstance.postRoutingSmsAddresses(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingSmsAddresses");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**SmsAddressProvision**](SmsAddressProvision.html)| SmsAddress | 
{: class="table-striped"}


### Return type

[**SmsPhoneNumber**](SmsPhoneNumber.html)

<a name="postRoutingSmsPhonenumbers"></a>

# **postRoutingSmsPhonenumbers**



> [SmsPhoneNumber](SmsPhoneNumber.html) postRoutingSmsPhonenumbers(body)

Provision a phone number for SMS



Wraps POST /api/v2/routing/sms/phonenumbers  

Requires ANY permissions: 

* sms:phoneNumber:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
SmsPhoneNumberProvision body = new SmsPhoneNumberProvision(); // SmsPhoneNumberProvision | SmsPhoneNumber
try {
    SmsPhoneNumber result = apiInstance.postRoutingSmsPhonenumbers(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingSmsPhonenumbers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**SmsPhoneNumberProvision**](SmsPhoneNumberProvision.html)| SmsPhoneNumber | 
{: class="table-striped"}


### Return type

[**SmsPhoneNumber**](SmsPhoneNumber.html)

<a name="postRoutingWrapupcodes"></a>

# **postRoutingWrapupcodes**



> [WrapupCode](WrapupCode.html) postRoutingWrapupcodes(body)

Create a wrap-up code



Wraps POST /api/v2/routing/wrapupcodes  

Requires ANY permissions: 

* routing:wrapupCode:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
WrapupCode body = new WrapupCode(); // WrapupCode | WrapupCode
try {
    WrapupCode result = apiInstance.postRoutingWrapupcodes(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingWrapupcodes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**WrapupCode**](WrapupCode.html)| WrapupCode | 
{: class="table-striped"}


### Return type

[**WrapupCode**](WrapupCode.html)

<a name="postUserRoutinglanguages"></a>

# **postUserRoutinglanguages**



> [UserRoutingLanguage](UserRoutingLanguage.html) postUserRoutinglanguages(userId, body)

Add routing language to user



Wraps POST /api/v2/users/{userId}/routinglanguages  

Requires ANY permissions: 

* routing:skill:assign
* admin

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
UserRoutingLanguagePost body = new UserRoutingLanguagePost(); // UserRoutingLanguagePost | Language
try {
    UserRoutingLanguage result = apiInstance.postUserRoutinglanguages(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postUserRoutinglanguages");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **body** | [**UserRoutingLanguagePost**](UserRoutingLanguagePost.html)| Language | 
{: class="table-striped"}


### Return type

[**UserRoutingLanguage**](UserRoutingLanguage.html)

<a name="postUserRoutingskills"></a>

# **postUserRoutingskills**



> [UserRoutingSkill](UserRoutingSkill.html) postUserRoutingskills(userId, body)

Add routing skill to user



Wraps POST /api/v2/users/{userId}/routingskills  

Requires ANY permissions: 

* routing:skill:assign
* admin

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
UserRoutingSkillPost body = new UserRoutingSkillPost(); // UserRoutingSkillPost | Skill
try {
    UserRoutingSkill result = apiInstance.postUserRoutingskills(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postUserRoutingskills");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **body** | [**UserRoutingSkillPost**](UserRoutingSkillPost.html)| Skill | 
{: class="table-striped"}


### Return type

[**UserRoutingSkill**](UserRoutingSkill.html)

<a name="putRoutingEmailDomainRoute"></a>

# **putRoutingEmailDomainRoute**



> [InboundRoute](InboundRoute.html) putRoutingEmailDomainRoute(domainName, routeId, body)

Update a route



Wraps PUT /api/v2/routing/email/domains/{domainName}/routes/{routeId}  

Requires ANY permissions: 

* routing:email:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String domainName = "domainName_example"; // String | email domain
String routeId = "routeId_example"; // String | route ID
InboundRoute body = new InboundRoute(); // InboundRoute | Route
try {
    InboundRoute result = apiInstance.putRoutingEmailDomainRoute(domainName, routeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putRoutingEmailDomainRoute");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domainName** | **String**| email domain | 
| **routeId** | **String**| route ID | 
| **body** | [**InboundRoute**](InboundRoute.html)| Route | 
{: class="table-striped"}


### Return type

[**InboundRoute**](InboundRoute.html)

<a name="putRoutingMessageRecipient"></a>

# **putRoutingMessageRecipient**



> [Recipient](Recipient.html) putRoutingMessageRecipient(recipientId, body)

Update a recipient



Wraps PUT /api/v2/routing/message/recipients/{recipientId}  

Requires ANY permissions: 

* routing:message:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String recipientId = "recipientId_example"; // String | Recipient ID
Recipient body = new Recipient(); // Recipient | Recipient
try {
    Recipient result = apiInstance.putRoutingMessageRecipient(recipientId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putRoutingMessageRecipient");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **recipientId** | **String**| Recipient ID | 
| **body** | [**Recipient**](Recipient.html)| Recipient | 
{: class="table-striped"}


### Return type

[**Recipient**](Recipient.html)

<a name="putRoutingQueue"></a>

# **putRoutingQueue**



> [Queue](Queue.html) putRoutingQueue(queueId, body)

Update a queue



Wraps PUT /api/v2/routing/queues/{queueId}  

Requires ANY permissions: 

* routing:queue:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
QueueRequest body = new QueueRequest(); // QueueRequest | Queue
try {
    Queue result = apiInstance.putRoutingQueue(queueId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putRoutingQueue");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **queueId** | **String**| Queue ID | 
| **body** | [**QueueRequest**](QueueRequest.html)| Queue | 
{: class="table-striped"}


### Return type

[**Queue**](Queue.html)

<a name="putRoutingSmsPhonenumber"></a>

# **putRoutingSmsPhonenumber**



> [SmsPhoneNumber](SmsPhoneNumber.html) putRoutingSmsPhonenumber(addressId, body)

Update a phone number provisioned for SMS.



Wraps PUT /api/v2/routing/sms/phonenumbers/{addressId}  

Requires ANY permissions: 

* sms:phoneNumber:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String addressId = "addressId_example"; // String | Address ID
SmsPhoneNumber body = new SmsPhoneNumber(); // SmsPhoneNumber | SmsPhoneNumber
try {
    SmsPhoneNumber result = apiInstance.putRoutingSmsPhonenumber(addressId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putRoutingSmsPhonenumber");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **addressId** | **String**| Address ID | 
| **body** | [**SmsPhoneNumber**](SmsPhoneNumber.html)| SmsPhoneNumber | 
{: class="table-striped"}


### Return type

[**SmsPhoneNumber**](SmsPhoneNumber.html)

<a name="putRoutingUtilization"></a>

# **putRoutingUtilization**



> [Utilization](Utilization.html) putRoutingUtilization(body)

Update the utilization settings.



Wraps PUT /api/v2/routing/utilization  

Requires ANY permissions: 

* routing:utilization:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
Utilization body = new Utilization(); // Utilization | utilization
try {
    Utilization result = apiInstance.putRoutingUtilization(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putRoutingUtilization");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**Utilization**](Utilization.html)| utilization | 
{: class="table-striped"}


### Return type

[**Utilization**](Utilization.html)

<a name="putRoutingWrapupcode"></a>

# **putRoutingWrapupcode**



> [WrapupCode](WrapupCode.html) putRoutingWrapupcode(codeId, body)

Update wrap-up code



Wraps PUT /api/v2/routing/wrapupcodes/{codeId}  

Requires ANY permissions: 

* routing:wrapupCode:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String codeId = "codeId_example"; // String | Wrapup Code ID
WrapupCode body = new WrapupCode(); // WrapupCode | WrapupCode
try {
    WrapupCode result = apiInstance.putRoutingWrapupcode(codeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putRoutingWrapupcode");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **codeId** | **String**| Wrapup Code ID | 
| **body** | [**WrapupCode**](WrapupCode.html)| WrapupCode | 
{: class="table-striped"}


### Return type

[**WrapupCode**](WrapupCode.html)

<a name="putUserRoutingskill"></a>

# **putUserRoutingskill**



> [UserRoutingSkill](UserRoutingSkill.html) putUserRoutingskill(userId, skillId, body)

Update routing skill proficiency or state.



Wraps PUT /api/v2/users/{userId}/routingskills/{skillId}  

Requires ANY permissions: 

* routing:skill:assign
* admin

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
String skillId = "skillId_example"; // String | skillId
UserRoutingSkill body = new UserRoutingSkill(); // UserRoutingSkill | Skill
try {
    UserRoutingSkill result = apiInstance.putUserRoutingskill(userId, skillId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putUserRoutingskill");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **skillId** | **String**| skillId | 
| **body** | [**UserRoutingSkill**](UserRoutingSkill.html)| Skill | 
{: class="table-striped"}


### Return type

[**UserRoutingSkill**](UserRoutingSkill.html)

<a name="putUserRoutingskillsBulk"></a>

# **putUserRoutingskillsBulk**



> [UserSkillEntityListing](UserSkillEntityListing.html) putUserRoutingskillsBulk(userId, body)

Replace all routing skills assigned to a user



Wraps PUT /api/v2/users/{userId}/routingskills/bulk  

Requires ANY permissions: 

* routing:skill:assign
* admin

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
List<UserRoutingSkillPost> body = Arrays.asList(new UserRoutingSkillPost()); // List<UserRoutingSkillPost> | Skill
try {
    UserSkillEntityListing result = apiInstance.putUserRoutingskillsBulk(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putUserRoutingskillsBulk");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **body** | [**List&lt;UserRoutingSkillPost&gt;**](UserRoutingSkillPost.html)| Skill | 
{: class="table-striped"}


### Return type

[**UserSkillEntityListing**](UserSkillEntityListing.html)

