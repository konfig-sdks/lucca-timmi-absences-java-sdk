<div align="center">

[![Visit Lucca](./header.png)](https://lucca-hr.com)

# [Lucca](https://lucca-hr.com)

Welcome on the documentation for Timmi Absences API.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Lucca&serviceName=Timmi%20Absences&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>lucca-timmi-absences-java-sdk</artifactId>
  <version>1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:lucca-timmi-absences-java-sdk:1.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/lucca-timmi-absences-java-sdk-1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.LuccaTimmiAbsences;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ImportsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://example.ilucca.net";
    
    configuration.authorization  = "YOUR API KEY";
    LuccaTimmiAbsences client = new LuccaTimmiAbsences(configuration);
    String type = "csv"; // Support CSV files only
    String originalFileName = "import.csv"; // Filename
    Boolean create = false; // Use `false` to simulate the import.
    Boolean recredit = true; // Use `true` if absences should **not** be deducted from the user balance. Use `false` if absences should be deducted from the user balance. Note: if the absence type doesn’t have balance management, absence won’t impact the balance in any case.
    Boolean synchronize = true; // Use `true` to force synchronization of the absences in the sync webservice (sync to Exchange/0365, Google Calendar, Webhook or ADP GXP, depending on configuration). Use `false` to import absences without synchronizing absences.
    Boolean overrideLeaves = true; // Use `true` to allow replacing existing absences
    try {
      ImportsAbsenceBatchCreateResponse result = client
              .imports
              .absenceBatchCreate(type, originalFileName)
              .create(create)
              .recredit(recredit)
              .synchronize(synchronize)
              .overrideLeaves(overrideLeaves)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportsApi#absenceBatchCreate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ImportsAbsenceBatchCreateResponse> response = client
              .imports
              .absenceBatchCreate(type, originalFileName)
              .create(create)
              .recredit(recredit)
              .synchronize(synchronize)
              .overrideLeaves(overrideLeaves)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportsApi#absenceBatchCreate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://example.ilucca.net*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ImportsApi* | [**absenceBatchCreate**](docs/ImportsApi.md#absenceBatchCreate) | **POST** /api/v3/services/importLeavePeriods | Import leaves (deprecated)
*ImportsApi* | [**createAbsencesBatch**](docs/ImportsApi.md#createAbsencesBatch) | **POST** /timmi-absences/api/imports/v1.0/leavePeriods | Import leaves
*ImportsApi* | [**entitlementsBatchImport**](docs/ImportsApi.md#entitlementsBatchImport) | **POST** /figgo/api/public/services/v1.0/leaveEntitlementsImport | Import entitlements (deprecated)
*ImportsApi* | [**getProgress**](docs/ImportsApi.md#getProgress) | **GET** /timmi-absences/api/imports/v1.0/leavePeriods/{summaryId}/progress | Get import leaves progress
*ImportsApi* | [**importLeaveEntitlements**](docs/ImportsApi.md#importLeaveEntitlements) | **POST** /timmi-absences/api/public/services/v1.0/leaveEntitlementsImport | Import entitlements
*ImportsApi* | [**replaceEntitlements**](docs/ImportsApi.md#replaceEntitlements) | **POST** /figgo/api/public/services/v1.0/leaveEntitlementsReplace | Replace entitlements (deprecated)
*ImportsApi* | [**replaceEntitlements_0**](docs/ImportsApi.md#replaceEntitlements_0) | **POST** /timmi-absences/api/public/services/v1.0/leaveEntitlementsReplace | Replace entitlements
*LeaveRequestsApi* | [**approveDeny**](docs/LeaveRequestsApi.md#approveDeny) | **POST** /api/v3/leaveRequests/{leaveRequestId}/approvals | Approve or deny a leave request
*LeaveRequestsApi* | [**cancelRequest**](docs/LeaveRequestsApi.md#cancelRequest) | **DELETE** /api/v3/leaveRequests/{leaveRequestId} | Request to cancel a leave request
*LeaveRequestsApi* | [**getById**](docs/LeaveRequestsApi.md#getById) | **GET** /api/v3/leaveRequests/{leaveRequestId} | Get a leave request by id
*LeaveRequestsApi* | [**list**](docs/LeaveRequestsApi.md#list) | **GET** /api/v3/leaveRequests | List leave requests
*LeavesApi* | [**cancelLeaveById**](docs/LeavesApi.md#cancelLeaveById) | **DELETE** /api/v3/leaves/{leaveId} | Cancellation of a leave
*LeavesApi* | [**getApprovedList**](docs/LeavesApi.md#getApprovedList) | **GET** /api/v3/leaves | List leaves
*LeavesApi* | [**getById**](docs/LeavesApi.md#getById) | **GET** /api/v3/leaves/{leaveId} | Get a leave by id


## Documentation for Models

 - [CancellationRequest](docs/CancellationRequest.md)
 - [ImportsAbsenceBatchCreateResponse](docs/ImportsAbsenceBatchCreateResponse.md)
 - [ImportsAbsenceBatchCreateResponseData](docs/ImportsAbsenceBatchCreateResponseData.md)
 - [ImportsAbsenceBatchCreateResponseDataReport](docs/ImportsAbsenceBatchCreateResponseDataReport.md)
 - [ImportsCreateAbsencesBatchRequest](docs/ImportsCreateAbsencesBatchRequest.md)
 - [ImportsCreateAbsencesBatchResponse](docs/ImportsCreateAbsencesBatchResponse.md)
 - [ImportsEntitlementsBatchImportRequest](docs/ImportsEntitlementsBatchImportRequest.md)
 - [ImportsEntitlementsBatchImportResponse](docs/ImportsEntitlementsBatchImportResponse.md)
 - [ImportsImportLeaveEntitlementsRequest](docs/ImportsImportLeaveEntitlementsRequest.md)
 - [ImportsReplaceEntitlementsRequest](docs/ImportsReplaceEntitlementsRequest.md)
 - [ImportsReplaceEntitlementsRequest1](docs/ImportsReplaceEntitlementsRequest1.md)
 - [Leave](docs/Leave.md)
 - [LeaveAccount](docs/LeaveAccount.md)
 - [LeavePeriod](docs/LeavePeriod.md)
 - [LeavePeriodLog](docs/LeavePeriodLog.md)
 - [LeaveRequest](docs/LeaveRequest.md)
 - [LeaveRequestApproval](docs/LeaveRequestApproval.md)
 - [LeaveRequestsApproveDenyRequest](docs/LeaveRequestsApproveDenyRequest.md)
 - [LeaveRequestsGetByIdResponse](docs/LeaveRequestsGetByIdResponse.md)
 - [LeaveRequestsListResponse](docs/LeaveRequestsListResponse.md)
 - [LeaveRequestsListResponseData](docs/LeaveRequestsListResponseData.md)
 - [LeavesGetApprovedListResponse](docs/LeavesGetApprovedListResponse.md)
 - [LeavesGetByIdResponse](docs/LeavesGetByIdResponse.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
