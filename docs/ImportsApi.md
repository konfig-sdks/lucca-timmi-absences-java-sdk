# ImportsApi

All URIs are relative to *https://example.ilucca.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**absenceBatchCreate**](ImportsApi.md#absenceBatchCreate) | **POST** /api/v3/services/importLeavePeriods | Import leaves (deprecated) |
| [**createAbsencesBatch**](ImportsApi.md#createAbsencesBatch) | **POST** /timmi-absences/api/imports/v1.0/leavePeriods | Import leaves |
| [**entitlementsBatchImport**](ImportsApi.md#entitlementsBatchImport) | **POST** /figgo/api/public/services/v1.0/leaveEntitlementsImport | Import entitlements (deprecated) |
| [**getProgress**](ImportsApi.md#getProgress) | **GET** /timmi-absences/api/imports/v1.0/leavePeriods/{summaryId}/progress | Get import leaves progress |
| [**importLeaveEntitlements**](ImportsApi.md#importLeaveEntitlements) | **POST** /timmi-absences/api/public/services/v1.0/leaveEntitlementsImport | Import entitlements |
| [**replaceEntitlements**](ImportsApi.md#replaceEntitlements) | **POST** /figgo/api/public/services/v1.0/leaveEntitlementsReplace | Replace entitlements (deprecated) |
| [**replaceEntitlements_0**](ImportsApi.md#replaceEntitlements_0) | **POST** /timmi-absences/api/public/services/v1.0/leaveEntitlementsReplace | Replace entitlements |


<a name="absenceBatchCreate"></a>
# **absenceBatchCreate**
> ImportsAbsenceBatchCreateResponse absenceBatchCreate(type, originalFileName).create(create).recredit(recredit).synchronize(synchronize).overrideLeaves(overrideLeaves).body(body).execute();

Import leaves (deprecated)

Create absences in batch from a CSV file.  **Important notice: Absence imports cannot be cancelled.**   In case of a mistake absences must be deleted manually through the interface or using the API (see Use cases). **Use import with care!**   **File format**  Type: CSV (with semicolon \&quot;;\&quot;)  Encoding: UTF-8   All the following fields must be present with the field name in the header:  - legalEntity : establishment of the employee - employeeNumber : employee number - lastName : last name of the employee - firstName : firstname of the employee - accountId : absence account id in Timmi Absences (you can find it in the leave accounts admin page) - startDate : absence start date (DD/MM/YYYY) - flagStartDate : AM (if the absences starts in the morning) or PM (if the absence starts in the afternoon) - endDate : absence end date (DD/MM/YYYY) - flagEndDate : AM (if the absences ends at noon) or PM (if the absences ends in the afternoon) - isApproved : yes or no. Compulsory if the absence type is subject to approval, optional otherwise.  **History** Import history is available in the import module, including imports made using the API. 

### Example
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

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String**| Support CSV files only | [default to csv] [enum: csv] |
| **originalFileName** | **String**| Filename | |
| **create** | **Boolean**| Use &#x60;false&#x60; to simulate the import. | [optional] [default to false] |
| **recredit** | **Boolean**| Use &#x60;true&#x60; if absences should **not** be deducted from the user balance. Use &#x60;false&#x60; if absences should be deducted from the user balance. Note: if the absence type doesn’t have balance management, absence won’t impact the balance in any case. | [optional] |
| **synchronize** | **Boolean**| Use &#x60;true&#x60; to force synchronization of the absences in the sync webservice (sync to Exchange/0365, Google Calendar, Webhook or ADP GXP, depending on configuration). Use &#x60;false&#x60; to import absences without synchronizing absences. | [optional] |
| **overrideLeaves** | **Boolean**| Use &#x60;true&#x60; to allow replacing existing absences | [optional] |
| **body** | **Object**|  | [optional] |

### Return type

[**ImportsAbsenceBatchCreateResponse**](ImportsAbsenceBatchCreateResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createAbsencesBatch"></a>
# **createAbsencesBatch**
> ImportsCreateAbsencesBatchResponse createAbsencesBatch().create(create).recredit(recredit).originalFileName(originalFileName).synchronize(synchronize).async(async).files(files).importsCreateAbsencesBatchRequest(importsCreateAbsencesBatchRequest).execute();

Import leaves

Create absences in batch from a CSV file.  **Important notice: Absence imports cannot be cancelled.**   In case of a mistake absences must be deleted manually through the interface or using the API (see Use cases). **Use import with care!**  **File format**  Content-Type: CSV. Column divider is semicolon \&quot;;\&quot;. Line breaks between rows.  Encoding: UTF-8  All the following fields must be present with the field name in the header:  - legalEntity: Name of the establishment the employee belongs to. - employeeNumber: Employee number. - lastName: Family (last) name of the employee. - firstName: Given (first) name of the employee. - accountId: Identifier of the absence account in Timmi Absences (can be found in the leave accounts admin page). - startDate: Start date of the absence, formatted as &#x60;DD/MM/YYYY&#x60;. - flagStartDate: &#x60;\&quot;AM\&quot;&#x60; if the absence starts in the morning or &#x60;\&quot;PM\&quot;&#x60; if the absence starts in the afternoon. - endDate: End date of the absence, formatted as &#x60;DD/MM/YYYY&#x60;. - flagEndDate: &#x60;\&quot;AM\&quot;&#x60; if the absence ends at noon or &#x60;\&quot;PM\&quot;&#x60; if the absence ends in the afternoon. - isApproved: &#x60;true&#x60; or &#x60;false&#x60;. Dictates whether the absence request should be created and already approved.    Required if the type of the absence requires approval, optional otherwise.  **History** Import history is available in the import module. It includes imports made via the API. 

### Example
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
    Boolean create = true; // Use `false` to simulate the import.
    Boolean recredit = true; // Use `true` if absences should **not** be deducted from the user balance. Use `false` if absences should be deducted from the user balance. Note: if the absence type doesn’t have balance management, absence won’t impact the balance in any case.
    String originalFileName = "import.csv"; // Filename
    Boolean synchronize = true; // Use `true` to force synchronization of the absences in the sync webservice (sync to Exchange/0365, Google Calendar, Webhook or ADP GXP, depending on configuration). Use `false` to import absences without synchronizing absences.
    Boolean async = true; // Use `true` if you want to import absences with the asynchronous processing (you have to request figgo/api/imports/v1.0/leavePeriods/{summaryId}/progress API to track the status). Use `false` if you want import absences with the synchronous processing (the response is sent when the file is fully imported).
    List<String> files = Arrays.asList();
    try {
      ImportsCreateAbsencesBatchResponse result = client
              .imports
              .createAbsencesBatch()
              .create(create)
              .recredit(recredit)
              .originalFileName(originalFileName)
              .synchronize(synchronize)
              .async(async)
              .files(files)
              .execute();
      System.out.println(result);
      System.out.println(result.getSummaryId());
      System.out.println(result.getHasError());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportsApi#createAbsencesBatch");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ImportsCreateAbsencesBatchResponse> response = client
              .imports
              .createAbsencesBatch()
              .create(create)
              .recredit(recredit)
              .originalFileName(originalFileName)
              .synchronize(synchronize)
              .async(async)
              .files(files)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportsApi#createAbsencesBatch");
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
| **create** | **Boolean**| Use &#x60;false&#x60; to simulate the import. | [optional] |
| **recredit** | **Boolean**| Use &#x60;true&#x60; if absences should **not** be deducted from the user balance. Use &#x60;false&#x60; if absences should be deducted from the user balance. Note: if the absence type doesn’t have balance management, absence won’t impact the balance in any case. | [optional] |
| **originalFileName** | **String**| Filename | [optional] [default to import.csv] |
| **synchronize** | **Boolean**| Use &#x60;true&#x60; to force synchronization of the absences in the sync webservice (sync to Exchange/0365, Google Calendar, Webhook or ADP GXP, depending on configuration). Use &#x60;false&#x60; to import absences without synchronizing absences. | [optional] |
| **async** | **Boolean**| Use &#x60;true&#x60; if you want to import absences with the asynchronous processing (you have to request figgo/api/imports/v1.0/leavePeriods/{summaryId}/progress API to track the status). Use &#x60;false&#x60; if you want import absences with the synchronous processing (the response is sent when the file is fully imported). | [optional] |
| **files** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **importsCreateAbsencesBatchRequest** | [**ImportsCreateAbsencesBatchRequest**](ImportsCreateAbsencesBatchRequest.md)| Content of the CSV file to import. Each file in its dedicated part of the multipart request. Parts are divided by the &#39;boundary&#39; string set in the Content-Type HTTP header.  Example of a single file request body: &#x60;&#x60;&#x60; --myBoundary Content-Disposition: form-data; name&#x3D;\&quot;figgo-import-5875e9dd-0b1f-4a9f-8756-0f25fb0a2946.csv\&quot;; filename&#x3D;\&quot;figgo-import-5875e9dd-0b1f-4a9f-8756-0f25fb0a2946.csv\&quot; Content-Type: application/vnd.ms-excel  legalEntity;employeeNumber;lastName;firstName;accountId;startDate;flagStartDate;endDate;flagEndDate;isApproved Lucca FR;M0029;Bart;Maurice;1322;16/08/2022;am;17/08/2022;pm;true Lucca FR;M0029;Bart;Maurice;1322;22/08/2022;am;23/08/2022;pm;false Lucca FR;M0029;Bart;Maurice;8;29/08/2022;am;30/08/2022;pm;true --myBoundary-- &#x60;&#x60;&#x60;  | [optional] |

### Return type

[**ImportsCreateAbsencesBatchResponse**](ImportsCreateAbsencesBatchResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="entitlementsBatchImport"></a>
# **entitlementsBatchImport**
> ImportsEntitlementsBatchImportResponse entitlementsBatchImport().strict(strict).simulate(simulate)._file(_file).description(description).referenceDate(referenceDate).importsEntitlementsBatchImportRequest(importsEntitlementsBatchImportRequest).execute();

Import entitlements (deprecated)

**Supported file formats:** - CSV   - \&quot;UTF-8\&quot; encoding   - separator “;” - XSLX  **Columns to fill in:**  Column name | Description --- | --- LegalEntityCode | Employee legal entity code EmployeeNumber | Employee payroll number LastName | Last name FirstName | First name Account number or name (one column per account) | Value to import for the account defined in the header.   *Remark: A template file can be downloaded from the import page (Credit / Debit&gt; A group of collaborators&gt; File import).*  In the event of a malformed (or unrecognized) file, no data will be imported; the problems detected will be specified in the &#x60;globalErrors&#x60; field.  If successful, the number of imported lines is indicated by the “successLinesCount” field; the lines in error are detailed in the &#x60;lineErrors&#x60; field.   *Remarks: Any import made by the API is of course available in the import history. A simulation returns the same level of information, but does not trigger an import*  **List of errors handled**  Here is the list of fatal errors, which can be returned in the &#x60;globalErrors&#x60;: - Unauthorized - FileEmpty, - FileExtensionNotSupported, - ColumnsFormatNotSupported, - AccountColumnMissing, - ColumnNamesDistinct, - LineErrorForbiddenInStrictMode,  The list of line processing errors, which can be restored in the &#x60;lineErrors&#x60;: - AccountNotFound, - AccountsNotFound, - AccountColumnsProcessing, - LegalEntityCodesNotFound, - MissingValuesForAccount, - AccountNotAvailableForUser, - LegalEntityCodeRequired, - EmployeeNumberRequired, - LoginRequired, - LoginNotFound, - AccountNumberRequired, - LegalEntityNotFound, - EmployeeNumberNotExist, - EmployeeNumberNotInLegalEntity, - FistNameAndLastNameNotMatching, - FistNameNotMatching, - LastLameNotMatching, - FistNameAndLastNameNotMatchingEmployeeNumber, - FistNameNotMatchingEmployeeNumber, - LastLameNotMatchingEmployeeNumber, - FistNameAndLastNameNotMatchingLogin, - FistNameNotMatchingLogin, - LastLameNotMatchingLogin, - DuplicatedLine, - AmbiguousLegalEntity, - ColumnNotExists, - LegalEntityNameNotAvailable, - AccountNameNotUnique  The list of import generation errors: - UnableToCreditAccount 

### Example
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
    Boolean strict = false; // In strict mode, if the import has errors, nothing is imported. Without strict mode, the lines in error are ignored and those in success are imported.
    Boolean simulate = false; // Allows you to simulate the import. In this case, the response indicates the theoretical result of the import without any data being recorded.
    String _file = "_file_example";
    String description = "description_example"; // Description of the entries generated by the import (visible to users in the account details).
    OffsetDateTime referenceDate = OffsetDateTime.now(); // Reference date (text mode). Respect the format: yyyy-MM-ddThh: mm: ss
    try {
      ImportsEntitlementsBatchImportResponse result = client
              .imports
              .entitlementsBatchImport()
              .strict(strict)
              .simulate(simulate)
              ._file(_file)
              .description(description)
              .referenceDate(referenceDate)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccessLinesCount());
      System.out.println(result.getGlobalErrors());
      System.out.println(result.getLineErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportsApi#entitlementsBatchImport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ImportsEntitlementsBatchImportResponse> response = client
              .imports
              .entitlementsBatchImport()
              .strict(strict)
              .simulate(simulate)
              ._file(_file)
              .description(description)
              .referenceDate(referenceDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportsApi#entitlementsBatchImport");
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
| **strict** | **Boolean**| In strict mode, if the import has errors, nothing is imported. Without strict mode, the lines in error are ignored and those in success are imported. | [optional] [default to false] |
| **simulate** | **Boolean**| Allows you to simulate the import. In this case, the response indicates the theoretical result of the import without any data being recorded. | [optional] [default to false] |
| **_file** | **String**|  | [optional] |
| **description** | **String**| Description of the entries generated by the import (visible to users in the account details). | [optional] |
| **referenceDate** | **OffsetDateTime**| Reference date (text mode). Respect the format: yyyy-MM-ddThh: mm: ss | [optional] |
| **importsEntitlementsBatchImportRequest** | [**ImportsEntitlementsBatchImportRequest**](ImportsEntitlementsBatchImportRequest.md)|  | [optional] |

### Return type

[**ImportsEntitlementsBatchImportResponse**](ImportsEntitlementsBatchImportResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Example response |  -  |

<a name="getProgress"></a>
# **getProgress**
> Integer getProgress(summaryId).execute();

Get import leaves progress

Retrieve the progress of Import leaves API request.

### Example
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
    String summaryId = "summaryId_example"; // Identifier of the import
    try {
      Integer result = client
              .imports
              .getProgress(summaryId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportsApi#getProgress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Integer> response = client
              .imports
              .getProgress(summaryId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportsApi#getProgress");
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
| **summaryId** | **String**| Identifier of the import | |

### Return type

**Integer**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="importLeaveEntitlements"></a>
# **importLeaveEntitlements**
> ImportsEntitlementsBatchImportResponse importLeaveEntitlements().strict(strict).simulate(simulate)._file(_file).description(description).referenceDate(referenceDate).importsImportLeaveEntitlementsRequest(importsImportLeaveEntitlementsRequest).execute();

Import entitlements

**Supported file formats:** - CSV   - \&quot;UTF-8\&quot; encoding   - separator “;” - XSLX  **Columns to fill in:**  Column name | Description --- | --- LegalEntityCode | Employee legal entity code EmployeeNumber | Employee payroll number LastName | Last name FirstName | First name Account number or name (one column per account) | Value to import for the account defined in the header.   *Remark: A template file can be downloaded from the import page (Credit / Debit&gt; A group of collaborators&gt; File import).*  In the event of a malformed (or unrecognized) file, no data will be imported; the problems detected will be specified in the &#x60;globalErrors&#x60; field.  If successful, the number of imported lines is indicated by the “successLinesCount” field; the lines in error are detailed in the &#x60;lineErrors&#x60; field.   *Remarks: Any import made by the API is of course available in the import history. A simulation returns the same level of information, but does not trigger an import*  **List of errors handled**  Here is the list of fatal errors, which can be returned in the &#x60;globalErrors&#x60;: - Unauthorized - FileEmpty, - FileExtensionNotSupported, - ColumnsFormatNotSupported, - AccountColumnMissing, - ColumnNamesDistinct, - LineErrorForbiddenInStrictMode,  The list of line processing errors, which can be restored in the &#x60;lineErrors&#x60;: - AccountNotFound, - AccountsNotFound, - AccountColumnsProcessing, - LegalEntityCodesNotFound, - MissingValuesForAccount, - AccountNotAvailableForUser, - LegalEntityCodeRequired, - EmployeeNumberRequired, - LoginRequired, - LoginNotFound, - AccountNumberRequired, - LegalEntityNotFound, - EmployeeNumberNotExist, - EmployeeNumberNotInLegalEntity, - FistNameAndLastNameNotMatching, - FistNameNotMatching, - LastLameNotMatching, - FistNameAndLastNameNotMatchingEmployeeNumber, - FistNameNotMatchingEmployeeNumber, - LastLameNotMatchingEmployeeNumber, - FistNameAndLastNameNotMatchingLogin, - FistNameNotMatchingLogin, - LastLameNotMatchingLogin, - DuplicatedLine, - AmbiguousLegalEntity, - ColumnNotExists, - LegalEntityNameNotAvailable, - AccountNameNotUnique  The list of import generation errors: - UnableToCreditAccount 

### Example
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
    Boolean strict = false; // In strict mode, if the import has errors, nothing is imported. Without strict mode, the lines in error are ignored and those in success are imported.
    Boolean simulate = false; // Allows you to simulate the import. In this case, the response indicates the theoretical result of the import without any data being recorded.
    String _file = "_file_example";
    String description = "description_example"; // Description of the entries generated by the import (visible to users in the account details).
    OffsetDateTime referenceDate = OffsetDateTime.now(); // Reference date (text mode). Respect the format: yyyy-MM-ddThh: mm: ss
    try {
      ImportsEntitlementsBatchImportResponse result = client
              .imports
              .importLeaveEntitlements()
              .strict(strict)
              .simulate(simulate)
              ._file(_file)
              .description(description)
              .referenceDate(referenceDate)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccessLinesCount());
      System.out.println(result.getGlobalErrors());
      System.out.println(result.getLineErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportsApi#importLeaveEntitlements");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ImportsEntitlementsBatchImportResponse> response = client
              .imports
              .importLeaveEntitlements()
              .strict(strict)
              .simulate(simulate)
              ._file(_file)
              .description(description)
              .referenceDate(referenceDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportsApi#importLeaveEntitlements");
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
| **strict** | **Boolean**| In strict mode, if the import has errors, nothing is imported. Without strict mode, the lines in error are ignored and those in success are imported. | [optional] [default to false] |
| **simulate** | **Boolean**| Allows you to simulate the import. In this case, the response indicates the theoretical result of the import without any data being recorded. | [optional] [default to false] |
| **_file** | **String**|  | [optional] |
| **description** | **String**| Description of the entries generated by the import (visible to users in the account details). | [optional] |
| **referenceDate** | **OffsetDateTime**| Reference date (text mode). Respect the format: yyyy-MM-ddThh: mm: ss | [optional] |
| **importsImportLeaveEntitlementsRequest** | [**ImportsImportLeaveEntitlementsRequest**](ImportsImportLeaveEntitlementsRequest.md)|  | [optional] |

### Return type

[**ImportsEntitlementsBatchImportResponse**](ImportsEntitlementsBatchImportResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Example response |  -  |

<a name="replaceEntitlements"></a>
# **replaceEntitlements**
> ImportsEntitlementsBatchImportResponse replaceEntitlements().strict(strict).simulate(simulate)._file(_file).description(description).referenceDate(referenceDate).entryTypes(entryTypes).importsReplaceEntitlementsRequest(importsReplaceEntitlementsRequest).execute();

Replace entitlements (deprecated)

**Supported file formats:** - CSV   - \&quot;UTF-8\&quot; encoding   - separator “;” - XSLX  **Columns to fill in:**  Column name | Description --- | --- LegalEntityCode | Employee legal entity code EmployeeNumber | Employee payroll number LastName | Last name FirstName | First name Account number or name (one column per account) | Value to import for the account defined in the header.   *Remark: A template file can be downloaded from the import page (Credit / Debit&gt; A group of collaborators&gt; File import).*  In the event of a malformed (or unrecognized) file, no data will be imported; the problems detected will be specified in the &#x60;globalErrors&#x60; field.  If successful, the number of imported lines is indicated by the “successLinesCount” field; the lines in error are detailed in the &#x60;lineErrors&#x60; field.   *Remarks: Any import made by the API is of course available in the import history. A simulation returns the same level of information, but does not trigger an import*  **List of errors handled**  Here is the list of fatal errors, which can be returned in the &#x60;globalErrors&#x60;: - Unauthorized - FileEmpty, - FileExtensionNotSupported, - ColumnsFormatNotSupported, - AccountColumnMissing, - ColumnNamesDistinct, - LineErrorForbiddenInStrictMode,  The list of line processing errors, which can be restored in the &#x60;lineErrors&#x60;: - AccountNotFound, - AccountsNotFound, - AccountColumnsProcessing, - LegalEntityCodesNotFound, - MissingValuesForAccount, - AccountNotAvailableForUser, - LegalEntityCodeRequired, - EmployeeNumberRequired, - LoginRequired, - LoginNotFound, - AccountNumberRequired, - LegalEntityNotFound, - EmployeeNumberNotExist, - EmployeeNumberNotInLegalEntity, - FistNameAndLastNameNotMatching, - FistNameNotMatching, - LastLameNotMatching, - FistNameAndLastNameNotMatchingEmployeeNumber, - FistNameNotMatchingEmployeeNumber, - LastLameNotMatchingEmployeeNumber, - FistNameAndLastNameNotMatchingLogin, - FistNameNotMatchingLogin, - LastLameNotMatchingLogin, - DuplicatedLine, - AmbiguousLegalEntity, - ColumnNotExists, - LegalEntityNameNotAvailable, - AccountNameNotUnique  The list of import generation errors: - UnableToCreditAccount 

### Example
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
    Boolean strict = false; // In strict mode, if the import has errors, nothing is imported. Without strict mode, the lines in error are ignored and those in success are imported.
    Boolean simulate = false; // Allows you to simulate the import. In this case, the response indicates the theoretical result of the import without any data being recorded.
    String _file = "_file_example";
    String description = "description_example"; // Description of the entries generated by the import (visible to users in the account details).
    OffsetDateTime referenceDate = OffsetDateTime.now(); // Reference date (text mode). Respect the format: yyyy-MM-ddThh: mm: ss
    String entryTypes = "AutoAccruals,ManualAccruals,Regularizations"; // Types of entries to take into account, separated by commas, from the following list: AutoAccruals, ManualAccruals, Regularisations, EntitlementsImport, Seniority, Fractionnement, TimeSavings, Comp  By default: `AutoAccruals, ManualAccruals, Regularizations` which correspond to the main cases of acquisition (automatic acquisition, manual adjustments, regularisations).
    try {
      ImportsEntitlementsBatchImportResponse result = client
              .imports
              .replaceEntitlements()
              .strict(strict)
              .simulate(simulate)
              ._file(_file)
              .description(description)
              .referenceDate(referenceDate)
              .entryTypes(entryTypes)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccessLinesCount());
      System.out.println(result.getGlobalErrors());
      System.out.println(result.getLineErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportsApi#replaceEntitlements");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ImportsEntitlementsBatchImportResponse> response = client
              .imports
              .replaceEntitlements()
              .strict(strict)
              .simulate(simulate)
              ._file(_file)
              .description(description)
              .referenceDate(referenceDate)
              .entryTypes(entryTypes)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportsApi#replaceEntitlements");
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
| **strict** | **Boolean**| In strict mode, if the import has errors, nothing is imported. Without strict mode, the lines in error are ignored and those in success are imported. | [optional] [default to false] |
| **simulate** | **Boolean**| Allows you to simulate the import. In this case, the response indicates the theoretical result of the import without any data being recorded. | [optional] [default to false] |
| **_file** | **String**|  | [optional] |
| **description** | **String**| Description of the entries generated by the import (visible to users in the account details). | [optional] |
| **referenceDate** | **OffsetDateTime**| Reference date (text mode). Respect the format: yyyy-MM-ddThh: mm: ss | [optional] |
| **entryTypes** | **String**| Types of entries to take into account, separated by commas, from the following list: AutoAccruals, ManualAccruals, Regularisations, EntitlementsImport, Seniority, Fractionnement, TimeSavings, Comp  By default: &#x60;AutoAccruals, ManualAccruals, Regularizations&#x60; which correspond to the main cases of acquisition (automatic acquisition, manual adjustments, regularisations). | [optional] [default to AutoAccruals,ManualAccruals,Regularizations] |
| **importsReplaceEntitlementsRequest** | [**ImportsReplaceEntitlementsRequest**](ImportsReplaceEntitlementsRequest.md)|  | [optional] |

### Return type

[**ImportsEntitlementsBatchImportResponse**](ImportsEntitlementsBatchImportResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Example response |  -  |

<a name="replaceEntitlements_0"></a>
# **replaceEntitlements_0**
> ImportsEntitlementsBatchImportResponse replaceEntitlements_0().strict(strict).simulate(simulate)._file(_file).description(description).referenceDate(referenceDate).entryTypes(entryTypes).importsReplaceEntitlementsRequest1(importsReplaceEntitlementsRequest1).execute();

Replace entitlements

**Supported file formats:** - CSV   - \&quot;UTF-8\&quot; encoding   - separator “;” - XSLX  **Columns to fill in:**  Column name | Description --- | --- LegalEntityCode | Employee legal entity code EmployeeNumber | Employee payroll number LastName | Last name FirstName | First name Account number or name (one column per account) | Value to import for the account defined in the header.   *Remark: A template file can be downloaded from the import page (Credit / Debit&gt; A group of collaborators&gt; File import).*  In the event of a malformed (or unrecognized) file, no data will be imported; the problems detected will be specified in the &#x60;globalErrors&#x60; field.  If successful, the number of imported lines is indicated by the “successLinesCount” field; the lines in error are detailed in the &#x60;lineErrors&#x60; field.   *Remarks: Any import made by the API is of course available in the import history. A simulation returns the same level of information, but does not trigger an import*  **List of errors handled**  Here is the list of fatal errors, which can be returned in the &#x60;globalErrors&#x60;: - Unauthorized - FileEmpty, - FileExtensionNotSupported, - ColumnsFormatNotSupported, - AccountColumnMissing, - ColumnNamesDistinct, - LineErrorForbiddenInStrictMode,  The list of line processing errors, which can be restored in the &#x60;lineErrors&#x60;: - AccountNotFound, - AccountsNotFound, - AccountColumnsProcessing, - LegalEntityCodesNotFound, - MissingValuesForAccount, - AccountNotAvailableForUser, - LegalEntityCodeRequired, - EmployeeNumberRequired, - LoginRequired, - LoginNotFound, - AccountNumberRequired, - LegalEntityNotFound, - EmployeeNumberNotExist, - EmployeeNumberNotInLegalEntity, - FistNameAndLastNameNotMatching, - FistNameNotMatching, - LastLameNotMatching, - FistNameAndLastNameNotMatchingEmployeeNumber, - FistNameNotMatchingEmployeeNumber, - LastLameNotMatchingEmployeeNumber, - FistNameAndLastNameNotMatchingLogin, - FistNameNotMatchingLogin, - LastLameNotMatchingLogin, - DuplicatedLine, - AmbiguousLegalEntity, - ColumnNotExists, - LegalEntityNameNotAvailable, - AccountNameNotUnique  The list of import generation errors: - UnableToCreditAccount 

### Example
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
    Boolean strict = false; // In strict mode, if the import has errors, nothing is imported. Without strict mode, the lines in error are ignored and those in success are imported.
    Boolean simulate = false; // Allows you to simulate the import. In this case, the response indicates the theoretical result of the import without any data being recorded.
    String _file = "_file_example";
    String description = "description_example"; // Description of the entries generated by the import (visible to users in the account details).
    OffsetDateTime referenceDate = OffsetDateTime.now(); // Reference date (text mode). Respect the format: yyyy-MM-ddThh: mm: ss
    String entryTypes = "AutoAccruals,ManualAccruals,Regularizations"; // Types of entries to take into account, separated by commas, from the following list: AutoAccruals, ManualAccruals, Regularisations, EntitlementsImport, Seniority, Fractionnement, TimeSavings, Comp  By default: `AutoAccruals, ManualAccruals, Regularizations` which correspond to the main cases of acquisition (automatic acquisition, manual adjustments, regularisations).
    try {
      ImportsEntitlementsBatchImportResponse result = client
              .imports
              .replaceEntitlements_0()
              .strict(strict)
              .simulate(simulate)
              ._file(_file)
              .description(description)
              .referenceDate(referenceDate)
              .entryTypes(entryTypes)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccessLinesCount());
      System.out.println(result.getGlobalErrors());
      System.out.println(result.getLineErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportsApi#replaceEntitlements_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ImportsEntitlementsBatchImportResponse> response = client
              .imports
              .replaceEntitlements_0()
              .strict(strict)
              .simulate(simulate)
              ._file(_file)
              .description(description)
              .referenceDate(referenceDate)
              .entryTypes(entryTypes)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportsApi#replaceEntitlements_0");
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
| **strict** | **Boolean**| In strict mode, if the import has errors, nothing is imported. Without strict mode, the lines in error are ignored and those in success are imported. | [optional] [default to false] |
| **simulate** | **Boolean**| Allows you to simulate the import. In this case, the response indicates the theoretical result of the import without any data being recorded. | [optional] [default to false] |
| **_file** | **String**|  | [optional] |
| **description** | **String**| Description of the entries generated by the import (visible to users in the account details). | [optional] |
| **referenceDate** | **OffsetDateTime**| Reference date (text mode). Respect the format: yyyy-MM-ddThh: mm: ss | [optional] |
| **entryTypes** | **String**| Types of entries to take into account, separated by commas, from the following list: AutoAccruals, ManualAccruals, Regularisations, EntitlementsImport, Seniority, Fractionnement, TimeSavings, Comp  By default: &#x60;AutoAccruals, ManualAccruals, Regularizations&#x60; which correspond to the main cases of acquisition (automatic acquisition, manual adjustments, regularisations). | [optional] [default to AutoAccruals,ManualAccruals,Regularizations] |
| **importsReplaceEntitlementsRequest1** | [**ImportsReplaceEntitlementsRequest1**](ImportsReplaceEntitlementsRequest1.md)|  | [optional] |

### Return type

[**ImportsEntitlementsBatchImportResponse**](ImportsEntitlementsBatchImportResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Example response |  -  |

