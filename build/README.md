---
title: Platform API Client SDK - Java
---

## Resources

[![platform-client-v2](https://maven-badges.herokuapp.com/maven-central/com.mypurecloud/platform-client-v2/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.mypurecloud/platform-client-v2)

* **Documentation** https://developer.mypurecloud.com/api/rest/client-libraries/java/
* **Source** https://github.com/MyPureCloud/platform-client-sdk-java

## Install Using maven

Install the library from maven via the package [com.mypurecloud:platform-client-v2](https://mvnrepository.com/artifact/com.mypurecloud/platform-client-v2)

## Android Support

The SDK may be used in Android as of SDK version 5.0.1. This requires Java 8 support in Android Studio (2.4 Preview 6 or later). For more information, see the Android Developers Blog: [Java 8 Language Features Support Update](https://android-developers.googleblog.com/2017/04/java-8-language-features-support-update.html)

## Using the SDK

### Referencing the Package

Import the necessary packages:

```{"language":"java"}
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.api.UsersApi;
import com.mypurecloud.sdk.v2.model.User;
import com.mypurecloud.sdk.v2.model.UserMe;
import com.mypurecloud.sdk.v2.model.UserEntityListing;
```

### Authenticating

The Java SDK contains a helper method toe execute a Client Credentials OAuth flow. This is appropriate for non-user Java applications, typically when there is no UI. Invoking `authorizeClientCredentials(String clientId, String clientSecret)` will execute the client credentials OAuth grant and store the access token within the ApiClient class. 

```{"language":"java"}
String clientId = "a0bda580-cb41-4ff6-8f06-28ffb4227594";
String clientSecret = "e4meQ53cXGq53j6uffdULVjRl8It8M3FVsupKei0nSg";

//Choose on of the 5 regions based off the values in the PureCloudRegionHosts file
PureCloudRegionHosts region = PureCloudRegionHosts.ap_northeast_1;
ApiClient apiClient = ApiClient.Builder.standard().withBasePath(region).build();


  ApiResponse<AuthResponse> authResponse = null;
        try {
            authResponse = apiClient.authorizeClientCredentials(clientId,clientSecret);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ApiException e) {
            e.printStackTrace();
        }

// Don't actually do this, this logs your auth token to the console!
System.out.println(authResponse.getBody().toString());

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

// Create API instances and make authenticated API requests
UsersApi apiInstance = new UsersApi();
UserEntityListing response = usersApi.getUsers(null, null, null, null, null, null);
```

For user applications, the consuming application must complete an implicit, auth token, or SAML2 Bearer OAuth flow to get an access token outside the scope of the SDK. Once an access token is obtained, it should be set on the SDK via constructing a new ApiClient instance (use `withAccessToken(String token)`). For more information about authenticating with OAuth, see the Developer Center article [Authorization](https://developer.mypurecloud.com/api/rest/authorization/index.html).

### Building an ApiClient Instance

`ApiClient` implements a builder pattern to construct new instances:

```{"language":"java"}
// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath(region)
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

// Create API instances and make authenticated API requests
UsersApi apiInstance = new UsersApi();
UserEntityListing response = usersApi.getUsers(null, null, null, null, null, null);
```

#### Setting the access token

If not authorizing using the `authorizeClientCredentials(...)` helper, provide the access token to use for API requests:

```{"language":"java"}
.withAccessToken("aisuefh89734hfkhsaldkh348jf")
```

#### Setting the environment

Provide the full base url if not using `https://api.mypurecloud.com`:

```{"language":"java"}
.withBasePath("https://api.mypurecloud.ie")
```

#### Setting the HTTP connector

The SDK supports the following HTTP connectors:

* Apache (_default_, synchronous), use `ApacheHttpClientConnectorProvider`
* Ning (async), use `AsyncHttpClientConnectorProvider`
* OkHTTP (synchronous, recommended for Android), use `OkHttpClientConnectorProvider`

Specify the connector in the builder:

```{"language":"java"}
.withProperty(ApiClientConnectorProperty.CONNECTOR_PROVIDER, new OkHttpClientConnectorProvider())
```

#### Other ApiClient.Builder methods

* `withDefaultHeader(String header, String value)` Specifies additional headers to be sent with every request
* `withUserAgent(String userAgent)` Overrides the default user agent header
* `withObjectMapper(ObjectMapper objectMapper)` Overrides the default `ObjectMapper` used for deserialization
* `withDateFormat(DateFormat dateFormat)` Overrides the default `DateFormat`
* `withConnectionTimeout(int connectionTimeout)` Overrides the default connection timeout
* `withShouldThrowErrors(boolean shouldThrowErrors)` Set to `false` to suppress throwing of all errors
* `withProxy(Proxy proxy)` Sets a proxy to use for requests

### Making Requests

There are two steps to making requests:

1. Instantiate one of the API classes in the com.mypurecloud.sdk.v2.api namespace
2. Invoke the methods on the API object

Example of getting the authenticated user's information:

#### Using a request builder

Request builders allow requests to be constructed by only providing values for the properties you want to set. This is useful for methods with long signatures when you only need to set some properties and will help future-proof your code if the method signature changes (i.e. new parameters added).

```{"language":"java"}
UsersApi usersApi = new UsersApi();
GetUsersMeRequest request = GetUsersMeRequest.builder()
        .withExpand(Collections.singletonList("presence"))
        .build();
UserMe me = usersApi.getUsersMe(request);
System.out.println("Hello " + me.getName());
```

#### Using method parameters

This request is identical to the request above, but uses the method with explicit parameters instead of a builder. These methods construct the request builder behind the scenes.

```{"language":"java"}
UsersApi usersApi = new UsersApi();
UserMe me = usersApi.getUsersMe(Collections.singletonList("presence"));
System.out.println("Hello " + me.getName());
```


#### Getting extended info

The Java SDK has the ability to return extended information about the response in addition to the response body. There are varieties of each API method call that are suffixed with _WithHttpInfo_. E.g. The `UsersApi` has a method `getUsersMe(...)` as well as `getUsersMeWithHttpInfo(...)`. Additionally, the request builder classes (e.g. `GetUsersMeRequest`) has a method `withHttpInfo()` that can be used to transform the request into an `ApiRequest` object that will return the extended information.

The extended responses will be of type [ApiResponse<T>](https://github.com/MyPureCloud/platform-client-sdk-java/blob/master/build/src/main/java/com/mypurecloud/sdk/v2/ApiResponse.java). This interface provides methods to get the exception (can be null), get the HTTP status code, get the reason phrase associated with the status code, get all headers, get a specific header, get the correlation ID header, and get the response body as a raw string or as a typed object.

Examples:

```{"language":"java"}
// Using the WithHttpInfo method
ApiResponse<UserMe> meWithHttpInfo = usersApi.getUsersMeWithHttpInfo(new ArrayList<String>());
System.out.println(meWithHttpInfo.getHeaders());
System.out.println(meWithHttpInfo.getCorrelationId());
System.out.println(meWithHttpInfo.getBody().getName());
```

```{"language":"java"}
// Using the request builder
ApiRequest<Void> getUsersMeRequestWithHttpInfo = GetUsersMeRequest.builder()
        .withExpand(new ArrayList<String>())
        .build()
        .withHttpInfo();

// Execute request
ApiResponse<UserMe> meWithHttpInfo = usersApi.getUsersMe(getUsersMeRequestWithHttpInfo);
System.out.println(meWithHttpInfo.getHeaders());
System.out.println(meWithHttpInfo.getCorrelationId());
System.out.println(meWithHttpInfo.getBody().getName());
```


## NotificationHandler Helper Class

The Java SDK includes a helper class, `NotificationHandler`, to assist in managing PureCloud notifications. The class will create a single notification channel, or use an existing one, and provides methods to add and remove subscriptions and raises an event with a deserialized notification object whenever one is received.

### Using NotificationHandler

**Create a new instance**

The preferred way to create a `NotificationHandler` instance is to use its builder to construct a new instance. This comes with the advantage of being able to set listeners and add subscriptions before the websocket is opened.

```{"language":"java"}
NotificationHandler notificationHandler = NotificationHandler.Builder.standard()
        .withWebSocketListener(new MyWebSocketListener())
        // Individually
        .withNotificationListener(new UserPresenceListener(me.getId()))
        .withNotificationListener(new ChannelMetadataListener())
        // As a list
        .withNotificationListeners(new ArrayList<NotificationListener<?>>()\{\{
            add(new UserPresenceListener(me.getId());
            add(new ChannelMetadataListener());
        }})
        .withAutoConnect(false)
        .build();
```

Alternatively, the `NotificationHandler` instance can be constructed with the default constructor and will connect to the websocket automatically. Listeners and subscriptions can then be managed from the instance regardless of how it was constructed. The following example is equivalent to the builder except that the socket will be connected in the constructor and the listeners and subscriptions will be added after it is connected:

```{"language":"java"}
NotificationHandler notificationHandler = new NotificationHandler();
notificationHandler.setWebSocketListener(new MyWebSocketListener());
// Individually
notificationHandler.addSubscription(new UserPresenceListener(me.getId()));
notificationHandler.addSubscription(new ChannelMetadataListener());
// As a list
notificationHandler.addSubscriptions(new ArrayList<NotificationListener<?>>()\{\{
            add(new UserPresenceListener(me.getId());
            add(new ChannelMetadataListener());
        }});
```

**Send a ping**

To test the connection, you may send a ping. For more information about this ping, see [Use the notification service](https://developer.mypurecloud.com/api/rest/v2/notifications/notification_service.html) under the _WebSocket Health Check_ heading.

```{"language":"java"}
notificationHandler.sendPing();
```

**Handle incoming notification events**

To handle incoming events, implement the `NotificationListener<T>` interface to handle registered topics and the `WebSocketListener` interface for information about the websocket itself. This is a basic example of how to handle user presence events:

```{"language":"java"}
public class UserPresenceListener implements NotificationListener<UserPresenceNotification> {
    private String topic;

    public String getTopic() {
        return topic;
    }

    public Class<UserPresenceNotification> getEventBodyClass() {
        return UserPresenceNotification.class;
    }

    @Override
    public void onEvent(NotificationEvent<?> event) {
        System.out.println("system presence -> " + ((UserPresenceNotification)event.getEventBody()).getPresenceDefinition().getSystemPresence());
    }

    public UserPresenceListener(String userId) {
        this.topic = "v2.users." + userId + ".presence";
    }
}
```

And an example of listening to the channel metadata events (periodic heartbeat and ping/pong message):

```{"language":"java"}
public class ChannelMetadataListener implements NotificationListener<ChannelMetadataNotification> {
    public String getTopic() {
        return "channel.metadata";
    }

    public Class<?> getEventBodyClass() {
        return ChannelMetadataNotification.class;
    }

    public void onEvent(NotificationEvent<?> notificationEvent) {
        System.out.println("[channel.metadata] " + ((ChannelMetadataNotification)notificationEvent.getEventBody()).getMessage());
    }
}
```

## SDK Source Code Generation

The SDK is automatically regenerated and published from the API's definition after each API release. For more information on the build process, see the [platform-client-sdk-common](https://github.com/MyPureCloud/platform-client-sdk-common) project.


## Versioning

The SDK's version is incremented according to the [Semantic Versioning Specification](https://semver.org/). The decision to increment version numbers is determined by [diffing the Platform API's swagger](https://github.com/purecloudlabs/platform-client-sdk-common/blob/master/modules/swaggerDiff.js) for automated builds, and optionally forcing a version bump when a build is triggered manually (e.g. releasing a bugfix).


## Support

This package is intended to be forwards compatible with v2 of PureCloud's Platform API. While the general policy for the API is not to introduce breaking changes, there are certain additions and changes to the API that cause breaking changes for the SDK, often due to the way the API is expressed in its swagger definition. Because of this, the SDK can have a major version bump while the API remains at major version 2. While the SDK is intended to be forward compatible, patches will only be released to the latest version. For these reasons, it is strongly recommended that all applications using this SDK are kept up to date and use the latest version of the SDK.

For any issues, questions, or suggestions for the SDK, visit the [PureCloud Developer Forum](https://developer.mypurecloud.com/forum/).
