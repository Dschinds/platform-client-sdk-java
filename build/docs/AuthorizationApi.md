---
title: AuthorizationApi
---
## AuthorizationApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteAuthorizationDivision**](AuthorizationApi.html#deleteAuthorizationDivision) | Delete a division. |
| [**deleteAuthorizationRole**](AuthorizationApi.html#deleteAuthorizationRole) | Delete an organization role. |
| [**deleteAuthorizationSubjectDivisionRole**](AuthorizationApi.html#deleteAuthorizationSubjectDivisionRole) | Delete a grant of a role in a division |
| [**deleteUserRoles**](AuthorizationApi.html#deleteUserRoles) | Removes all the roles from the user. |
| [**getAuthorizationDivision**](AuthorizationApi.html#getAuthorizationDivision) | Returns an authorization division. |
| [**getAuthorizationDivisions**](AuthorizationApi.html#getAuthorizationDivisions) | Retrieve a list of all divisions defined for the organization |
| [**getAuthorizationDivisionsHome**](AuthorizationApi.html#getAuthorizationDivisionsHome) | Retrieve the home division for the organization. |
| [**getAuthorizationDivisionsLimit**](AuthorizationApi.html#getAuthorizationDivisionsLimit) | Returns the maximum allowed number of divisions. |
| [**getAuthorizationDivisionspermittedMe**](AuthorizationApi.html#getAuthorizationDivisionspermittedMe) | Returns whether or not current user can perform the specified action(s). |
| [**getAuthorizationDivisionspermittedSubjectId**](AuthorizationApi.html#getAuthorizationDivisionspermittedSubjectId) | Returns whether or not specified user can perform the specified action(s). |
| [**getAuthorizationPermissions**](AuthorizationApi.html#getAuthorizationPermissions) | Get all permissions. |
| [**getAuthorizationProducts**](AuthorizationApi.html#getAuthorizationProducts) | Get the list of enabled products |
| [**getAuthorizationRole**](AuthorizationApi.html#getAuthorizationRole) | Get a single organization role. |
| [**getAuthorizationRoleComparedefaultRightRoleId**](AuthorizationApi.html#getAuthorizationRoleComparedefaultRightRoleId) | Get an org role to default role comparison |
| [**getAuthorizationRoleSubjectgrants**](AuthorizationApi.html#getAuthorizationRoleSubjectgrants) | Get the subjects&#39; granted divisions in the specified role. |
| [**getAuthorizationRoleUsers**](AuthorizationApi.html#getAuthorizationRoleUsers) | Get a list of the users in a specified role. |
| [**getAuthorizationRoles**](AuthorizationApi.html#getAuthorizationRoles) | Retrieve a list of all roles defined for the organization |
| [**getAuthorizationSubject**](AuthorizationApi.html#getAuthorizationSubject) | Returns a listing of roles and permissions for a user. |
| [**getAuthorizationSubjectsMe**](AuthorizationApi.html#getAuthorizationSubjectsMe) | Returns a listing of roles and permissions for the currently authenticated user. |
| [**getAuthorizationSubjectsRolecounts**](AuthorizationApi.html#getAuthorizationSubjectsRolecounts) | Get the count of roles granted to a list of subjects |
| [**getUserRoles**](AuthorizationApi.html#getUserRoles) | Returns a listing of roles and permissions for a user. |
| [**patchAuthorizationRole**](AuthorizationApi.html#patchAuthorizationRole) | Patch Organization Role for needsUpdate Field |
| [**postAuthorizationDivisionObject**](AuthorizationApi.html#postAuthorizationDivisionObject) | Assign a list of objects to a division |
| [**postAuthorizationDivisions**](AuthorizationApi.html#postAuthorizationDivisions) | Create a division. |
| [**postAuthorizationRole**](AuthorizationApi.html#postAuthorizationRole) | Bulk-grant subjects and divisions with an organization role. |
| [**postAuthorizationRoleComparedefaultRightRoleId**](AuthorizationApi.html#postAuthorizationRoleComparedefaultRightRoleId) | Get an unsaved org role to default role comparison |
| [**postAuthorizationRoles**](AuthorizationApi.html#postAuthorizationRoles) | Create an organization role. |
| [**postAuthorizationRolesDefault**](AuthorizationApi.html#postAuthorizationRolesDefault) | Restores all default roles |
| [**postAuthorizationSubjectDivisionRole**](AuthorizationApi.html#postAuthorizationSubjectDivisionRole) | Make a grant of a role in a division |
| [**putAuthorizationDivision**](AuthorizationApi.html#putAuthorizationDivision) | Update a division. |
| [**putAuthorizationRole**](AuthorizationApi.html#putAuthorizationRole) | Update an organization role. |
| [**putAuthorizationRoleUsersAdd**](AuthorizationApi.html#putAuthorizationRoleUsersAdd) | Sets the users for the role |
| [**putAuthorizationRoleUsersRemove**](AuthorizationApi.html#putAuthorizationRoleUsersRemove) | Removes the users from the role |
| [**putAuthorizationRolesDefault**](AuthorizationApi.html#putAuthorizationRolesDefault) | Restore specified default roles |
| [**putUserRoles**](AuthorizationApi.html#putUserRoles) | Sets the user&#39;s roles |
{: class="table-striped"}

<a name="deleteAuthorizationDivision"></a>

# **deleteAuthorizationDivision**



> Void deleteAuthorizationDivision(divisionId)

Delete a division.



Wraps DELETE /api/v2/authorization/divisions/{divisionId}  

Requires ANY permissions: 

* authorization:division:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String divisionId = "divisionId_example"; // String | Division ID
try {
    apiInstance.deleteAuthorizationDivision(divisionId);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#deleteAuthorizationDivision");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **divisionId** | **String**| Division ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteAuthorizationRole"></a>

# **deleteAuthorizationRole**



> Void deleteAuthorizationRole(roleId)

Delete an organization role.



Wraps DELETE /api/v2/authorization/roles/{roleId}  

Requires ANY permissions: 

* admin
* role_manager
* authorization:role:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String roleId = "roleId_example"; // String | Role ID
try {
    apiInstance.deleteAuthorizationRole(roleId);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#deleteAuthorizationRole");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roleId** | **String**| Role ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteAuthorizationSubjectDivisionRole"></a>

# **deleteAuthorizationSubjectDivisionRole**



> Void deleteAuthorizationSubjectDivisionRole(subjectId, divisionId, roleId)

Delete a grant of a role in a division



Wraps DELETE /api/v2/authorization/subjects/{subjectId}/divisions/{divisionId}/roles/{roleId}  

Requires ANY permissions: 

* authorization:grant:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String subjectId = "subjectId_example"; // String | Subject ID (user or group)
String divisionId = "divisionId_example"; // String | the id of the division of the grant
String roleId = "roleId_example"; // String | the id of the role of the grant
try {
    apiInstance.deleteAuthorizationSubjectDivisionRole(subjectId, divisionId, roleId);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#deleteAuthorizationSubjectDivisionRole");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **subjectId** | **String**| Subject ID (user or group) | 
| **divisionId** | **String**| the id of the division of the grant | 
| **roleId** | **String**| the id of the role of the grant | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteUserRoles"></a>

# **deleteUserRoles**



> Void deleteUserRoles(userId)

Removes all the roles from the user.



Wraps DELETE /api/v2/users/{userId}/roles  

Requires ANY permissions: 

* admin
* role_manager
* authorization:grant:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String userId = "userId_example"; // String | User ID
try {
    apiInstance.deleteUserRoles(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#deleteUserRoles");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="getAuthorizationDivision"></a>

# **getAuthorizationDivision**



> [AuthzDivision](AuthzDivision.html) getAuthorizationDivision(divisionId, objectCount)

Returns an authorization division.



Wraps GET /api/v2/authorization/divisions/{divisionId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String divisionId = "divisionId_example"; // String | Division ID
Boolean objectCount = false; // Boolean | Get count of objects in this division, grouped by type
try {
    AuthzDivision result = apiInstance.getAuthorizationDivision(divisionId, objectCount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationDivision");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **divisionId** | **String**| Division ID | 
| **objectCount** | **Boolean**| Get count of objects in this division, grouped by type | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**AuthzDivision**](AuthzDivision.html)

<a name="getAuthorizationDivisions"></a>

# **getAuthorizationDivisions**



> [AuthzDivisionEntityListing](AuthzDivisionEntityListing.html) getAuthorizationDivisions(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, objectCount, id, name)

Retrieve a list of all divisions defined for the organization

Request specific divisions by id using a query param \&quot;id\&quot;, e.g.  ?id=5f777167-63be-4c24-ad41-374155d9e28b&amp;id=72e9fb25-c484-488d-9312-7acba82435b3

Wraps GET /api/v2/authorization/divisions  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<String> expand = Arrays.asList("expand_example"); // List<String> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
Boolean objectCount = false; // Boolean | Include the count of objects contained in the division
List<String> id = Arrays.asList("id_example"); // List<String> | Optionally request specific divisions by their IDs
String name = "name_example"; // String | Search term to filter by division name
try {
    AuthzDivisionEntityListing result = apiInstance.getAuthorizationDivisions(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, objectCount, id, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationDivisions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] 
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] 
| **sortBy** | **String**| variable name requested to sort by | [optional] 
| **expand** | [**List&lt;String&gt;**](String.html)| variable name requested by expand list | [optional] 
| **nextPage** | **String**| next page token | [optional] 
| **previousPage** | **String**| Previous page token | [optional] 
| **objectCount** | **Boolean**| Include the count of objects contained in the division | [optional] [default to false] 
| **id** | [**List&lt;String&gt;**](String.html)| Optionally request specific divisions by their IDs | [optional] 
| **name** | **String**| Search term to filter by division name | [optional] 
{: class="table-striped"}


### Return type

[**AuthzDivisionEntityListing**](AuthzDivisionEntityListing.html)

<a name="getAuthorizationDivisionsHome"></a>

# **getAuthorizationDivisionsHome**



> [AuthzDivision](AuthzDivision.html) getAuthorizationDivisionsHome()

Retrieve the home division for the organization.

Will not include object counts.

Wraps GET /api/v2/authorization/divisions/home  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
try {
    AuthzDivision result = apiInstance.getAuthorizationDivisionsHome();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationDivisionsHome");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**AuthzDivision**](AuthzDivision.html)

<a name="getAuthorizationDivisionsLimit"></a>

# **getAuthorizationDivisionsLimit**



> Integer getAuthorizationDivisionsLimit()

Returns the maximum allowed number of divisions.



Wraps GET /api/v2/authorization/divisions/limit  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
try {
    Integer result = apiInstance.getAuthorizationDivisionsLimit();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationDivisionsLimit");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

**Integer**

<a name="getAuthorizationDivisionspermittedMe"></a>

# **getAuthorizationDivisionspermittedMe**



> [List&lt;AuthzDivision&gt;](AuthzDivision.html) getAuthorizationDivisionspermittedMe(permission, name)

Returns whether or not current user can perform the specified action(s).



Wraps GET /api/v2/authorization/divisionspermitted/me  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String permission = "permission_example"; // String | The permission string, including the object to access, e.g. routing:queue:view
String name = "name_example"; // String | Search term to filter by division name
try {
    List<AuthzDivision> result = apiInstance.getAuthorizationDivisionspermittedMe(permission, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationDivisionspermittedMe");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **permission** | **String**| The permission string, including the object to access, e.g. routing:queue:view | 
| **name** | **String**| Search term to filter by division name | [optional] 
{: class="table-striped"}


### Return type

[**List&lt;AuthzDivision&gt;**](AuthzDivision.html)

<a name="getAuthorizationDivisionspermittedSubjectId"></a>

# **getAuthorizationDivisionspermittedSubjectId**



> [List&lt;AuthzDivision&gt;](AuthzDivision.html) getAuthorizationDivisionspermittedSubjectId(subjectId, permission, name)

Returns whether or not specified user can perform the specified action(s).



Wraps GET /api/v2/authorization/divisionspermitted/{subjectId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String subjectId = "subjectId_example"; // String | Subject ID (user or group)
String permission = "permission_example"; // String | The permission string, including the object to access, e.g. routing:queue:view
String name = "name_example"; // String | Search term to filter by division name
try {
    List<AuthzDivision> result = apiInstance.getAuthorizationDivisionspermittedSubjectId(subjectId, permission, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationDivisionspermittedSubjectId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **subjectId** | **String**| Subject ID (user or group) | 
| **permission** | **String**| The permission string, including the object to access, e.g. routing:queue:view | 
| **name** | **String**| Search term to filter by division name | [optional] 
{: class="table-striped"}


### Return type

[**List&lt;AuthzDivision&gt;**](AuthzDivision.html)

<a name="getAuthorizationPermissions"></a>

# **getAuthorizationPermissions**



> [PermissionCollectionEntityListing](PermissionCollectionEntityListing.html) getAuthorizationPermissions(pageSize, pageNumber)

Get all permissions.

Retrieve a list of all permission defined in the system.

Wraps GET /api/v2/authorization/permissions  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    PermissionCollectionEntityListing result = apiInstance.getAuthorizationPermissions(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationPermissions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
{: class="table-striped"}


### Return type

[**PermissionCollectionEntityListing**](PermissionCollectionEntityListing.html)

<a name="getAuthorizationProducts"></a>

# **getAuthorizationProducts**



> [OrganizationProductEntityListing](OrganizationProductEntityListing.html) getAuthorizationProducts()

Get the list of enabled products

Gets the list of enabled products. Some example product names are: collaborateFree, collaboratePro, communicate, and engage.

Wraps GET /api/v2/authorization/products  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
try {
    OrganizationProductEntityListing result = apiInstance.getAuthorizationProducts();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationProducts");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**OrganizationProductEntityListing**](OrganizationProductEntityListing.html)

<a name="getAuthorizationRole"></a>

# **getAuthorizationRole**



> [DomainOrganizationRole](DomainOrganizationRole.html) getAuthorizationRole(roleId)

Get a single organization role.

Get the organization role specified by its ID.

Wraps GET /api/v2/authorization/roles/{roleId}  

Requires ANY permissions: 

* authorization:role:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String roleId = "roleId_example"; // String | Role ID
try {
    DomainOrganizationRole result = apiInstance.getAuthorizationRole(roleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationRole");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roleId** | **String**| Role ID | 
{: class="table-striped"}


### Return type

[**DomainOrganizationRole**](DomainOrganizationRole.html)

<a name="getAuthorizationRoleComparedefaultRightRoleId"></a>

# **getAuthorizationRoleComparedefaultRightRoleId**



> [DomainOrgRoleDifference](DomainOrgRoleDifference.html) getAuthorizationRoleComparedefaultRightRoleId(leftRoleId, rightRoleId)

Get an org role to default role comparison

Compares any organization role to a default role id and show differences

Wraps GET /api/v2/authorization/roles/{leftRoleId}/comparedefault/{rightRoleId}  

Requires ANY permissions: 

* authorization:role:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String leftRoleId = "leftRoleId_example"; // String | Left Role ID
String rightRoleId = "rightRoleId_example"; // String | Right Role id
try {
    DomainOrgRoleDifference result = apiInstance.getAuthorizationRoleComparedefaultRightRoleId(leftRoleId, rightRoleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationRoleComparedefaultRightRoleId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **leftRoleId** | **String**| Left Role ID | 
| **rightRoleId** | **String**| Right Role id | 
{: class="table-striped"}


### Return type

[**DomainOrgRoleDifference**](DomainOrgRoleDifference.html)

<a name="getAuthorizationRoleSubjectgrants"></a>

# **getAuthorizationRoleSubjectgrants**



> [SubjectDivisionGrantsEntityListing](SubjectDivisionGrantsEntityListing.html) getAuthorizationRoleSubjectgrants(roleId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage)

Get the subjects&#39; granted divisions in the specified role.

Includes the divisions for which the subject has a grant.

Wraps GET /api/v2/authorization/roles/{roleId}/subjectgrants  

Requires ANY permissions: 

* authorization:role:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String roleId = "roleId_example"; // String | Role ID
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<String> expand = Arrays.asList("expand_example"); // List<String> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
try {
    SubjectDivisionGrantsEntityListing result = apiInstance.getAuthorizationRoleSubjectgrants(roleId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationRoleSubjectgrants");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roleId** | **String**| Role ID | 
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] 
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] 
| **sortBy** | **String**| variable name requested to sort by | [optional] 
| **expand** | [**List&lt;String&gt;**](String.html)| variable name requested by expand list | [optional] 
| **nextPage** | **String**| next page token | [optional] 
| **previousPage** | **String**| Previous page token | [optional] 
{: class="table-striped"}


### Return type

[**SubjectDivisionGrantsEntityListing**](SubjectDivisionGrantsEntityListing.html)

<a name="getAuthorizationRoleUsers"></a>

# **getAuthorizationRoleUsers**



> [UserEntityListing](UserEntityListing.html) getAuthorizationRoleUsers(roleId, pageSize, pageNumber)

Get a list of the users in a specified role.

Get an array of the UUIDs of the users in the specified role.

Wraps GET /api/v2/authorization/roles/{roleId}/users  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String roleId = "roleId_example"; // String | Role ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    UserEntityListing result = apiInstance.getAuthorizationRoleUsers(roleId, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationRoleUsers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roleId** | **String**| Role ID | 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
{: class="table-striped"}


### Return type

[**UserEntityListing**](UserEntityListing.html)

<a name="getAuthorizationRoles"></a>

# **getAuthorizationRoles**



> [OrganizationRoleEntityListing](OrganizationRoleEntityListing.html) getAuthorizationRoles(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, name, permission, defaultRoleId, userCount, id)

Retrieve a list of all roles defined for the organization



Wraps GET /api/v2/authorization/roles  

Requires ANY permissions: 

* authorization:role:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<String> expand = Arrays.asList("expand_example"); // List<String> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
String name = "name_example"; // String | 
List<String> permission = Arrays.asList("permission_example"); // List<String> | 
List<String> defaultRoleId = Arrays.asList("defaultRoleId_example"); // List<String> | 
Boolean userCount = true; // Boolean | 
List<String> id = Arrays.asList("id_example"); // List<String> | id
try {
    OrganizationRoleEntityListing result = apiInstance.getAuthorizationRoles(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, name, permission, defaultRoleId, userCount, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationRoles");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] 
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] 
| **sortBy** | **String**| variable name requested to sort by | [optional] 
| **expand** | [**List&lt;String&gt;**](String.html)| variable name requested by expand list | [optional] 
| **nextPage** | **String**| next page token | [optional] 
| **previousPage** | **String**| Previous page token | [optional] 
| **name** | **String**|  | [optional] 
| **permission** | [**List&lt;String&gt;**](String.html)|  | [optional] 
| **defaultRoleId** | [**List&lt;String&gt;**](String.html)|  | [optional] 
| **userCount** | **Boolean**|  | [optional] [default to true] 
| **id** | [**List&lt;String&gt;**](String.html)| id | [optional] 
{: class="table-striped"}


### Return type

[**OrganizationRoleEntityListing**](OrganizationRoleEntityListing.html)

<a name="getAuthorizationSubject"></a>

# **getAuthorizationSubject**



> [AuthzSubject](AuthzSubject.html) getAuthorizationSubject(subjectId)

Returns a listing of roles and permissions for a user.



Wraps GET /api/v2/authorization/subjects/{subjectId}  

Requires ANY permissions: 

* authorization:grant:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String subjectId = "subjectId_example"; // String | Subject ID (user or group)
try {
    AuthzSubject result = apiInstance.getAuthorizationSubject(subjectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationSubject");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **subjectId** | **String**| Subject ID (user or group) | 
{: class="table-striped"}


### Return type

[**AuthzSubject**](AuthzSubject.html)

<a name="getAuthorizationSubjectsMe"></a>

# **getAuthorizationSubjectsMe**



> [AuthzSubject](AuthzSubject.html) getAuthorizationSubjectsMe()

Returns a listing of roles and permissions for the currently authenticated user.



Wraps GET /api/v2/authorization/subjects/me  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
try {
    AuthzSubject result = apiInstance.getAuthorizationSubjectsMe();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationSubjectsMe");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**AuthzSubject**](AuthzSubject.html)

<a name="getAuthorizationSubjectsRolecounts"></a>

# **getAuthorizationSubjectsRolecounts**



> [Map&lt;String, Object&gt;](Map.html) getAuthorizationSubjectsRolecounts(id)

Get the count of roles granted to a list of subjects



Wraps GET /api/v2/authorization/subjects/rolecounts  

Requires ANY permissions: 

* authorization:grant:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
List<String> id = Arrays.asList("id_example"); // List<String> | id
try {
    Map<String, Object> result = apiInstance.getAuthorizationSubjectsRolecounts(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationSubjectsRolecounts");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | [**List&lt;String&gt;**](String.html)| id | [optional] 
{: class="table-striped"}


### Return type

[**Map&lt;String, Object&gt;**](Map.html)

<a name="getUserRoles"></a>

# **getUserRoles**



> [UserAuthorization](UserAuthorization.html) getUserRoles(userId)

Returns a listing of roles and permissions for a user.



Wraps GET /api/v2/users/{userId}/roles  

Requires ANY permissions: 

* authorization:grant:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String userId = "userId_example"; // String | User ID
try {
    UserAuthorization result = apiInstance.getUserRoles(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getUserRoles");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
{: class="table-striped"}


### Return type

[**UserAuthorization**](UserAuthorization.html)

<a name="patchAuthorizationRole"></a>

# **patchAuthorizationRole**



> [DomainOrganizationRole](DomainOrganizationRole.html) patchAuthorizationRole(roleId, body)

Patch Organization Role for needsUpdate Field

Patch Organization Role for needsUpdate Field

Wraps PATCH /api/v2/authorization/roles/{roleId}  

Requires ANY permissions: 

* admin
* role_manager
* authorization:role:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String roleId = "roleId_example"; // String | Role ID
DomainOrganizationRole body = new DomainOrganizationRole(); // DomainOrganizationRole | Organization role
try {
    DomainOrganizationRole result = apiInstance.patchAuthorizationRole(roleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#patchAuthorizationRole");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roleId** | **String**| Role ID | 
| **body** | [**DomainOrganizationRole**](DomainOrganizationRole.html)| Organization role | 
{: class="table-striped"}


### Return type

[**DomainOrganizationRole**](DomainOrganizationRole.html)

<a name="postAuthorizationDivisionObject"></a>

# **postAuthorizationDivisionObject**



> Void postAuthorizationDivisionObject(divisionId, objectType, body)

Assign a list of objects to a division

Set the division of a specified list of objects. The objects must all be of the same type, one of:  CAMPAIGN, MANAGEMENTUNIT, FLOW, QUEUE, or USER.  The body of the request is a list of object IDs, which are expected to be  GUIDs, e.g. [\&quot;206ce31f-61ec-40ed-a8b1-be6f06303998\&quot;,\&quot;250a754e-f5e4-4f51-800f-a92f09d3bf8c\&quot;]

Wraps POST /api/v2/authorization/divisions/{divisionId}/objects/{objectType}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String divisionId = "divisionId_example"; // String | Division ID
String objectType = "objectType_example"; // String | The type of the objects. Must be one of the valid object types
List<String> body = Arrays.asList(new List<String>()); // List<String> | Object Id List
try {
    apiInstance.postAuthorizationDivisionObject(divisionId, objectType, body);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#postAuthorizationDivisionObject");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **divisionId** | **String**| Division ID | 
| **objectType** | **String**| The type of the objects. Must be one of the valid object types |<br />**Values**: QUEUE, CAMPAIGN, CONTACTLIST, DNCLIST, MANAGEMENTUNIT, FLOW, USER 
| **body** | **List&lt;String&gt;**| Object Id List | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="postAuthorizationDivisions"></a>

# **postAuthorizationDivisions**



> [AuthzDivision](AuthzDivision.html) postAuthorizationDivisions(body)

Create a division.



Wraps POST /api/v2/authorization/divisions  

Requires ALL permissions: 

* authorization:division:add
* authorization:grant:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
AuthzDivision body = new AuthzDivision(); // AuthzDivision | Division
try {
    AuthzDivision result = apiInstance.postAuthorizationDivisions(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#postAuthorizationDivisions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**AuthzDivision**](AuthzDivision.html)| Division | 
{: class="table-striped"}


### Return type

[**AuthzDivision**](AuthzDivision.html)

<a name="postAuthorizationRole"></a>

# **postAuthorizationRole**



> Void postAuthorizationRole(roleId, body, subjectType)

Bulk-grant subjects and divisions with an organization role.



Wraps POST /api/v2/authorization/roles/{roleId}  

Requires ANY permissions: 

* authorization:grant:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String roleId = "roleId_example"; // String | Role ID
SubjectDivisions body = new SubjectDivisions(); // SubjectDivisions | Subjects and Divisions
String subjectType = "PC_USER"; // String | what the type of the subject is, PC_GROUP or PC_USER
try {
    apiInstance.postAuthorizationRole(roleId, body, subjectType);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#postAuthorizationRole");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roleId** | **String**| Role ID | 
| **body** | [**SubjectDivisions**](SubjectDivisions.html)| Subjects and Divisions | 
| **subjectType** | **String**| what the type of the subject is, PC_GROUP or PC_USER | [optional] [default to PC_USER] 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="postAuthorizationRoleComparedefaultRightRoleId"></a>

# **postAuthorizationRoleComparedefaultRightRoleId**



> [DomainOrgRoleDifference](DomainOrgRoleDifference.html) postAuthorizationRoleComparedefaultRightRoleId(leftRoleId, rightRoleId, body)

Get an unsaved org role to default role comparison

Allows users to compare their existing roles in an unsaved state to its default role

Wraps POST /api/v2/authorization/roles/{leftRoleId}/comparedefault/{rightRoleId}  

Requires ANY permissions: 

* authorization:role:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String leftRoleId = "leftRoleId_example"; // String | Left Role ID
String rightRoleId = "rightRoleId_example"; // String | Right Role id
DomainOrganizationRole body = new DomainOrganizationRole(); // DomainOrganizationRole | Organization role
try {
    DomainOrgRoleDifference result = apiInstance.postAuthorizationRoleComparedefaultRightRoleId(leftRoleId, rightRoleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#postAuthorizationRoleComparedefaultRightRoleId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **leftRoleId** | **String**| Left Role ID | 
| **rightRoleId** | **String**| Right Role id | 
| **body** | [**DomainOrganizationRole**](DomainOrganizationRole.html)| Organization role | 
{: class="table-striped"}


### Return type

[**DomainOrgRoleDifference**](DomainOrgRoleDifference.html)

<a name="postAuthorizationRoles"></a>

# **postAuthorizationRoles**



> [DomainOrganizationRole](DomainOrganizationRole.html) postAuthorizationRoles(body)

Create an organization role.



Wraps POST /api/v2/authorization/roles  

Requires ANY permissions: 

* authorization:role:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
DomainOrganizationRoleCreate body = new DomainOrganizationRoleCreate(); // DomainOrganizationRoleCreate | Organization role
try {
    DomainOrganizationRole result = apiInstance.postAuthorizationRoles(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#postAuthorizationRoles");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**DomainOrganizationRoleCreate**](DomainOrganizationRoleCreate.html)| Organization role | 
{: class="table-striped"}


### Return type

[**DomainOrganizationRole**](DomainOrganizationRole.html)

<a name="postAuthorizationRolesDefault"></a>

# **postAuthorizationRolesDefault**



> [OrganizationRoleEntityListing](OrganizationRoleEntityListing.html) postAuthorizationRolesDefault(force)

Restores all default roles

This endpoint serves several purposes. 1. It provides the org with default roles. This is important for default roles that will be added after go-live (they can retroactively add the new default-role). Note: When not using a query param of force=true, it only adds the default roles not configured for the org; it does not overwrite roles. 2. Using the query param force=true, you can restore all default roles. Note: This does not have an effect on custom roles.

Wraps POST /api/v2/authorization/roles/default  

Requires ANY permissions: 

* authorization:role:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
Boolean force = false; // Boolean | Restore default roles
try {
    OrganizationRoleEntityListing result = apiInstance.postAuthorizationRolesDefault(force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#postAuthorizationRolesDefault");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **force** | **Boolean**| Restore default roles | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**OrganizationRoleEntityListing**](OrganizationRoleEntityListing.html)

<a name="postAuthorizationSubjectDivisionRole"></a>

# **postAuthorizationSubjectDivisionRole**



> Void postAuthorizationSubjectDivisionRole(subjectId, divisionId, roleId, subjectType)

Make a grant of a role in a division



Wraps POST /api/v2/authorization/subjects/{subjectId}/divisions/{divisionId}/roles/{roleId}  

Requires ANY permissions: 

* authorization:grant:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String subjectId = "subjectId_example"; // String | Subject ID (user or group)
String divisionId = "divisionId_example"; // String | the id of the division to which to make the grant
String roleId = "roleId_example"; // String | the id of the role to grant
String subjectType = "PC_USER"; // String | what the type of the subject is, PC_GROUP or PC_USER
try {
    apiInstance.postAuthorizationSubjectDivisionRole(subjectId, divisionId, roleId, subjectType);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#postAuthorizationSubjectDivisionRole");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **subjectId** | **String**| Subject ID (user or group) | 
| **divisionId** | **String**| the id of the division to which to make the grant | 
| **roleId** | **String**| the id of the role to grant | 
| **subjectType** | **String**| what the type of the subject is, PC_GROUP or PC_USER | [optional] [default to PC_USER] 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="putAuthorizationDivision"></a>

# **putAuthorizationDivision**



> [AuthzDivision](AuthzDivision.html) putAuthorizationDivision(divisionId, body)

Update a division.



Wraps PUT /api/v2/authorization/divisions/{divisionId}  

Requires ANY permissions: 

* authorization:division:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String divisionId = "divisionId_example"; // String | Division ID
AuthzDivision body = new AuthzDivision(); // AuthzDivision | Updated division data
try {
    AuthzDivision result = apiInstance.putAuthorizationDivision(divisionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#putAuthorizationDivision");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **divisionId** | **String**| Division ID | 
| **body** | [**AuthzDivision**](AuthzDivision.html)| Updated division data | 
{: class="table-striped"}


### Return type

[**AuthzDivision**](AuthzDivision.html)

<a name="putAuthorizationRole"></a>

# **putAuthorizationRole**



> [DomainOrganizationRole](DomainOrganizationRole.html) putAuthorizationRole(roleId, body)

Update an organization role.

Update

Wraps PUT /api/v2/authorization/roles/{roleId}  

Requires ANY permissions: 

* admin
* role_manager
* authorization:role:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String roleId = "roleId_example"; // String | Role ID
DomainOrganizationRoleUpdate body = new DomainOrganizationRoleUpdate(); // DomainOrganizationRoleUpdate | Organization role
try {
    DomainOrganizationRole result = apiInstance.putAuthorizationRole(roleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#putAuthorizationRole");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roleId** | **String**| Role ID | 
| **body** | [**DomainOrganizationRoleUpdate**](DomainOrganizationRoleUpdate.html)| Organization role | 
{: class="table-striped"}


### Return type

[**DomainOrganizationRole**](DomainOrganizationRole.html)

<a name="putAuthorizationRoleUsersAdd"></a>

# **putAuthorizationRoleUsersAdd**



> List&lt;String&gt; putAuthorizationRoleUsersAdd(roleId, body)

Sets the users for the role



Wraps PUT /api/v2/authorization/roles/{roleId}/users/add  

Requires ANY permissions: 

* authorization:grant:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String roleId = "roleId_example"; // String | Role ID
List<String> body = Arrays.asList(new List<String>()); // List<String> | List of user IDs
try {
    List<String> result = apiInstance.putAuthorizationRoleUsersAdd(roleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#putAuthorizationRoleUsersAdd");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roleId** | **String**| Role ID | 
| **body** | **List&lt;String&gt;**| List of user IDs | 
{: class="table-striped"}


### Return type

**List&lt;String&gt;**

<a name="putAuthorizationRoleUsersRemove"></a>

# **putAuthorizationRoleUsersRemove**



> List&lt;String&gt; putAuthorizationRoleUsersRemove(roleId, body)

Removes the users from the role



Wraps PUT /api/v2/authorization/roles/{roleId}/users/remove  

Requires ANY permissions: 

* authorization:grant:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String roleId = "roleId_example"; // String | Role ID
List<String> body = Arrays.asList(new List<String>()); // List<String> | List of user IDs
try {
    List<String> result = apiInstance.putAuthorizationRoleUsersRemove(roleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#putAuthorizationRoleUsersRemove");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roleId** | **String**| Role ID | 
| **body** | **List&lt;String&gt;**| List of user IDs | 
{: class="table-striped"}


### Return type

**List&lt;String&gt;**

<a name="putAuthorizationRolesDefault"></a>

# **putAuthorizationRolesDefault**



> [OrganizationRoleEntityListing](OrganizationRoleEntityListing.html) putAuthorizationRolesDefault(body)

Restore specified default roles



Wraps PUT /api/v2/authorization/roles/default  

Requires ANY permissions: 

* authorization:role:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
List<DomainOrganizationRole> body = Arrays.asList(new DomainOrganizationRole()); // List<DomainOrganizationRole> | Organization roles list
try {
    OrganizationRoleEntityListing result = apiInstance.putAuthorizationRolesDefault(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#putAuthorizationRolesDefault");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**List&lt;DomainOrganizationRole&gt;**](DomainOrganizationRole.html)| Organization roles list | 
{: class="table-striped"}


### Return type

[**OrganizationRoleEntityListing**](OrganizationRoleEntityListing.html)

<a name="putUserRoles"></a>

# **putUserRoles**



> [UserAuthorization](UserAuthorization.html) putUserRoles(userId, body)

Sets the user&#39;s roles



Wraps PUT /api/v2/users/{userId}/roles  

Requires ANY permissions: 

* admin
* role_manager
* authorization:grant:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String userId = "userId_example"; // String | User ID
List<String> body = Arrays.asList(new List<String>()); // List<String> | List of roles
try {
    UserAuthorization result = apiInstance.putUserRoles(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#putUserRoles");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **body** | **List&lt;String&gt;**| List of roles | 
{: class="table-striped"}


### Return type

[**UserAuthorization**](UserAuthorization.html)

