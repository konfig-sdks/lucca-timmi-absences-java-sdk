# LeavesApi

All URIs are relative to *https://example.ilucca.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelLeaveById**](LeavesApi.md#cancelLeaveById) | **DELETE** /api/v3/leaves/{leaveId} | Cancellation of a leave |
| [**getApprovedList**](LeavesApi.md#getApprovedList) | **GET** /api/v3/leaves | List leaves |
| [**getById**](LeavesApi.md#getById) | **GET** /api/v3/leaves/{leaveId} | Get a leave by id |


<a name="cancelLeaveById"></a>
# **cancelLeaveById**
> cancelLeaveById(leaveId).execute();

Cancellation of a leave

Cancel a single Leave by its unique identifier.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.LuccaTimmiAbsences;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeavesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://example.ilucca.net";
    
    configuration.authorization  = "YOUR API KEY";
    LuccaTimmiAbsences client = new LuccaTimmiAbsences(configuration);
    String leaveId = "leaveId_example"; // Identifier of the leave.
    try {
      client
              .leaves
              .cancelLeaveById(leaveId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LeavesApi#cancelLeaveById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .leaves
              .cancelLeaveById(leaveId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LeavesApi#cancelLeaveById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **leaveId** | **String**| Identifier of the leave. | |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getApprovedList"></a>
# **getApprovedList**
> LeavesGetApprovedListResponse getApprovedList(paging, leavePeriodOwnerId, date).leaveAccountId(leaveAccountId).execute();

List leaves

Retrieve a list of approved leaves for one or several users on a given period.  The &#x60;leavePeriod.ownerId&#x60; query parameter is required ans is used to:   - retrieve Leaves of a specific user: &#x60;?leavePeriod.ownerId&#x3D;5&#x60; - retrieve Leaves of several users: &#x60;?leavePeriod.ownerId&#x3D;5,6&#x60; - retrieve Leaves of a specific group of users: &#x60;?leavePeriod.owner.departmentId&#x3D;3&#x60;  The &#x60;date&#x60; query parameter can operate comparisons with a given date-time value:  - &#x60;?date&#x3D;2021-01-01&#x60;: strict equality. - &#x60;?date&#x3D;since,2021-01-01&#x60;: greater than or equal. - &#x60;?date&#x3D;until,2021-01-01&#x60;: lower than or equal. - &#x60;?date&#x3D;between,2021-01-01,2021-01-31&#x60;: comprised between two dates.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.LuccaTimmiAbsences;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeavesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://example.ilucca.net";
    
    configuration.authorization  = "YOUR API KEY";
    LuccaTimmiAbsences client = new LuccaTimmiAbsences(configuration);
    String paging = "100,0"; // {offset},{limit}. Defaults to 0,1000.
    List<Object> leavePeriodOwnerId = null; // Employee's identifier
    String date = "date_example"; // {comparator},{date-time}
    String leaveAccountId = "leaveAccountId_example";
    try {
      LeavesGetApprovedListResponse result = client
              .leaves
              .getApprovedList(paging, leavePeriodOwnerId, date)
              .leaveAccountId(leaveAccountId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeavesApi#getApprovedList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LeavesGetApprovedListResponse> response = client
              .leaves
              .getApprovedList(paging, leavePeriodOwnerId, date)
              .leaveAccountId(leaveAccountId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeavesApi#getApprovedList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **paging** | **String**| {offset},{limit}. Defaults to 0,1000. | |
| **leavePeriodOwnerId** | [**List&lt;Object&gt;**](Object.md)| Employee&#39;s identifier | |
| **date** | **String**| {comparator},{date-time} | |
| **leaveAccountId** | **String**|  | [optional] |

### Return type

[**LeavesGetApprovedListResponse**](LeavesGetApprovedListResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a name="getById"></a>
# **getById**
> LeavesGetByIdResponse getById(leaveId).execute();

Get a leave by id

Retrieve a single Leave by its unique identifier.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.LuccaTimmiAbsences;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeavesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://example.ilucca.net";
    
    configuration.authorization  = "YOUR API KEY";
    LuccaTimmiAbsences client = new LuccaTimmiAbsences(configuration);
    String leaveId = "leaveId_example"; // Identifier of the leave.
    try {
      LeavesGetByIdResponse result = client
              .leaves
              .getById(leaveId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeavesApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LeavesGetByIdResponse> response = client
              .leaves
              .getById(leaveId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeavesApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **leaveId** | **String**| Identifier of the leave. | |

### Return type

[**LeavesGetByIdResponse**](LeavesGetByIdResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

