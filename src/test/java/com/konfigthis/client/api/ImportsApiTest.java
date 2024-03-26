/*
 * Timmi Absences API
 * Welcome on the documentation for Timmi Absences API.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: developers@lucca.fr
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.ImportsAbsenceBatchCreateResponse;
import com.konfigthis.client.model.ImportsCreateAbsencesBatchRequest;
import com.konfigthis.client.model.ImportsCreateAbsencesBatchResponse;
import com.konfigthis.client.model.ImportsEntitlementsBatchImportRequest;
import com.konfigthis.client.model.ImportsEntitlementsBatchImportResponse;
import com.konfigthis.client.model.ImportsImportLeaveEntitlementsRequest;
import com.konfigthis.client.model.ImportsReplaceEntitlementsRequest;
import com.konfigthis.client.model.ImportsReplaceEntitlementsRequest1;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ImportsApi
 */
@Disabled
public class ImportsApiTest {

    private static ImportsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ImportsApi(apiClient);
    }

    /**
     * Import leaves (deprecated)
     *
     * Create absences in batch from a CSV file.  **Important notice: Absence imports cannot be cancelled.**   In case of a mistake absences must be deleted manually through the interface or using the API (see Use cases). **Use import with care!**   **File format**  Type: CSV (with semicolon \&quot;;\&quot;)  Encoding: UTF-8   All the following fields must be present with the field name in the header:  - legalEntity : establishment of the employee - employeeNumber : employee number - lastName : last name of the employee - firstName : firstname of the employee - accountId : absence account id in Timmi Absences (you can find it in the leave accounts admin page) - startDate : absence start date (DD/MM/YYYY) - flagStartDate : AM (if the absences starts in the morning) or PM (if the absence starts in the afternoon) - endDate : absence end date (DD/MM/YYYY) - flagEndDate : AM (if the absences ends at noon) or PM (if the absences ends in the afternoon) - isApproved : yes or no. Compulsory if the absence type is subject to approval, optional otherwise.  **History** Import history is available in the import module, including imports made using the API. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void absenceBatchCreateTest() throws ApiException {
        String type = null;
        String originalFileName = null;
        Boolean create = null;
        Boolean recredit = null;
        Boolean synchronize = null;
        Boolean overrideLeaves = null;
        ImportsAbsenceBatchCreateResponse response = api.absenceBatchCreate(type, originalFileName)
                .create(create)
                .recredit(recredit)
                .synchronize(synchronize)
                .overrideLeaves(overrideLeaves)
                .execute();
        // TODO: test validations
    }

    /**
     * Import leaves
     *
     * Create absences in batch from a CSV file.  **Important notice: Absence imports cannot be cancelled.**   In case of a mistake absences must be deleted manually through the interface or using the API (see Use cases). **Use import with care!**  **File format**  Content-Type: CSV. Column divider is semicolon \&quot;;\&quot;. Line breaks between rows.  Encoding: UTF-8  All the following fields must be present with the field name in the header:  - legalEntity: Name of the establishment the employee belongs to. - employeeNumber: Employee number. - lastName: Family (last) name of the employee. - firstName: Given (first) name of the employee. - accountId: Identifier of the absence account in Timmi Absences (can be found in the leave accounts admin page). - startDate: Start date of the absence, formatted as &#x60;DD/MM/YYYY&#x60;. - flagStartDate: &#x60;\&quot;AM\&quot;&#x60; if the absence starts in the morning or &#x60;\&quot;PM\&quot;&#x60; if the absence starts in the afternoon. - endDate: End date of the absence, formatted as &#x60;DD/MM/YYYY&#x60;. - flagEndDate: &#x60;\&quot;AM\&quot;&#x60; if the absence ends at noon or &#x60;\&quot;PM\&quot;&#x60; if the absence ends in the afternoon. - isApproved: &#x60;true&#x60; or &#x60;false&#x60;. Dictates whether the absence request should be created and already approved.    Required if the type of the absence requires approval, optional otherwise.  **History** Import history is available in the import module. It includes imports made via the API. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createAbsencesBatchTest() throws ApiException {
        Boolean create = null;
        Boolean recredit = null;
        String originalFileName = null;
        Boolean synchronize = null;
        Boolean async = null;
        List<String> files = null;
        ImportsCreateAbsencesBatchResponse response = api.createAbsencesBatch()
                .create(create)
                .recredit(recredit)
                .originalFileName(originalFileName)
                .synchronize(synchronize)
                .async(async)
                .files(files)
                .execute();
        // TODO: test validations
    }

    /**
     * Import entitlements (deprecated)
     *
     * **Supported file formats:** - CSV   - \&quot;UTF-8\&quot; encoding   - separator “;” - XSLX  **Columns to fill in:**  Column name | Description --- | --- LegalEntityCode | Employee legal entity code EmployeeNumber | Employee payroll number LastName | Last name FirstName | First name Account number or name (one column per account) | Value to import for the account defined in the header.   *Remark: A template file can be downloaded from the import page (Credit / Debit&gt; A group of collaborators&gt; File import).*  In the event of a malformed (or unrecognized) file, no data will be imported; the problems detected will be specified in the &#x60;globalErrors&#x60; field.  If successful, the number of imported lines is indicated by the “successLinesCount” field; the lines in error are detailed in the &#x60;lineErrors&#x60; field.   *Remarks: Any import made by the API is of course available in the import history. A simulation returns the same level of information, but does not trigger an import*  **List of errors handled**  Here is the list of fatal errors, which can be returned in the &#x60;globalErrors&#x60;: - Unauthorized - FileEmpty, - FileExtensionNotSupported, - ColumnsFormatNotSupported, - AccountColumnMissing, - ColumnNamesDistinct, - LineErrorForbiddenInStrictMode,  The list of line processing errors, which can be restored in the &#x60;lineErrors&#x60;: - AccountNotFound, - AccountsNotFound, - AccountColumnsProcessing, - LegalEntityCodesNotFound, - MissingValuesForAccount, - AccountNotAvailableForUser, - LegalEntityCodeRequired, - EmployeeNumberRequired, - LoginRequired, - LoginNotFound, - AccountNumberRequired, - LegalEntityNotFound, - EmployeeNumberNotExist, - EmployeeNumberNotInLegalEntity, - FistNameAndLastNameNotMatching, - FistNameNotMatching, - LastLameNotMatching, - FistNameAndLastNameNotMatchingEmployeeNumber, - FistNameNotMatchingEmployeeNumber, - LastLameNotMatchingEmployeeNumber, - FistNameAndLastNameNotMatchingLogin, - FistNameNotMatchingLogin, - LastLameNotMatchingLogin, - DuplicatedLine, - AmbiguousLegalEntity, - ColumnNotExists, - LegalEntityNameNotAvailable, - AccountNameNotUnique  The list of import generation errors: - UnableToCreditAccount 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void entitlementsBatchImportTest() throws ApiException {
        Boolean strict = null;
        Boolean simulate = null;
        String _file = null;
        String description = null;
        OffsetDateTime referenceDate = null;
        ImportsEntitlementsBatchImportResponse response = api.entitlementsBatchImport()
                .strict(strict)
                .simulate(simulate)
                ._file(_file)
                .description(description)
                .referenceDate(referenceDate)
                .execute();
        // TODO: test validations
    }

    /**
     * Get import leaves progress
     *
     * Retrieve the progress of Import leaves API request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProgressTest() throws ApiException {
        String summaryId = null;
        Integer response = api.getProgress(summaryId)
                .execute();
        // TODO: test validations
    }

    /**
     * Import entitlements
     *
     * **Supported file formats:** - CSV   - \&quot;UTF-8\&quot; encoding   - separator “;” - XSLX  **Columns to fill in:**  Column name | Description --- | --- LegalEntityCode | Employee legal entity code EmployeeNumber | Employee payroll number LastName | Last name FirstName | First name Account number or name (one column per account) | Value to import for the account defined in the header.   *Remark: A template file can be downloaded from the import page (Credit / Debit&gt; A group of collaborators&gt; File import).*  In the event of a malformed (or unrecognized) file, no data will be imported; the problems detected will be specified in the &#x60;globalErrors&#x60; field.  If successful, the number of imported lines is indicated by the “successLinesCount” field; the lines in error are detailed in the &#x60;lineErrors&#x60; field.   *Remarks: Any import made by the API is of course available in the import history. A simulation returns the same level of information, but does not trigger an import*  **List of errors handled**  Here is the list of fatal errors, which can be returned in the &#x60;globalErrors&#x60;: - Unauthorized - FileEmpty, - FileExtensionNotSupported, - ColumnsFormatNotSupported, - AccountColumnMissing, - ColumnNamesDistinct, - LineErrorForbiddenInStrictMode,  The list of line processing errors, which can be restored in the &#x60;lineErrors&#x60;: - AccountNotFound, - AccountsNotFound, - AccountColumnsProcessing, - LegalEntityCodesNotFound, - MissingValuesForAccount, - AccountNotAvailableForUser, - LegalEntityCodeRequired, - EmployeeNumberRequired, - LoginRequired, - LoginNotFound, - AccountNumberRequired, - LegalEntityNotFound, - EmployeeNumberNotExist, - EmployeeNumberNotInLegalEntity, - FistNameAndLastNameNotMatching, - FistNameNotMatching, - LastLameNotMatching, - FistNameAndLastNameNotMatchingEmployeeNumber, - FistNameNotMatchingEmployeeNumber, - LastLameNotMatchingEmployeeNumber, - FistNameAndLastNameNotMatchingLogin, - FistNameNotMatchingLogin, - LastLameNotMatchingLogin, - DuplicatedLine, - AmbiguousLegalEntity, - ColumnNotExists, - LegalEntityNameNotAvailable, - AccountNameNotUnique  The list of import generation errors: - UnableToCreditAccount 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void importLeaveEntitlementsTest() throws ApiException {
        Boolean strict = null;
        Boolean simulate = null;
        String _file = null;
        String description = null;
        OffsetDateTime referenceDate = null;
        ImportsEntitlementsBatchImportResponse response = api.importLeaveEntitlements()
                .strict(strict)
                .simulate(simulate)
                ._file(_file)
                .description(description)
                .referenceDate(referenceDate)
                .execute();
        // TODO: test validations
    }

    /**
     * Replace entitlements (deprecated)
     *
     * **Supported file formats:** - CSV   - \&quot;UTF-8\&quot; encoding   - separator “;” - XSLX  **Columns to fill in:**  Column name | Description --- | --- LegalEntityCode | Employee legal entity code EmployeeNumber | Employee payroll number LastName | Last name FirstName | First name Account number or name (one column per account) | Value to import for the account defined in the header.   *Remark: A template file can be downloaded from the import page (Credit / Debit&gt; A group of collaborators&gt; File import).*  In the event of a malformed (or unrecognized) file, no data will be imported; the problems detected will be specified in the &#x60;globalErrors&#x60; field.  If successful, the number of imported lines is indicated by the “successLinesCount” field; the lines in error are detailed in the &#x60;lineErrors&#x60; field.   *Remarks: Any import made by the API is of course available in the import history. A simulation returns the same level of information, but does not trigger an import*  **List of errors handled**  Here is the list of fatal errors, which can be returned in the &#x60;globalErrors&#x60;: - Unauthorized - FileEmpty, - FileExtensionNotSupported, - ColumnsFormatNotSupported, - AccountColumnMissing, - ColumnNamesDistinct, - LineErrorForbiddenInStrictMode,  The list of line processing errors, which can be restored in the &#x60;lineErrors&#x60;: - AccountNotFound, - AccountsNotFound, - AccountColumnsProcessing, - LegalEntityCodesNotFound, - MissingValuesForAccount, - AccountNotAvailableForUser, - LegalEntityCodeRequired, - EmployeeNumberRequired, - LoginRequired, - LoginNotFound, - AccountNumberRequired, - LegalEntityNotFound, - EmployeeNumberNotExist, - EmployeeNumberNotInLegalEntity, - FistNameAndLastNameNotMatching, - FistNameNotMatching, - LastLameNotMatching, - FistNameAndLastNameNotMatchingEmployeeNumber, - FistNameNotMatchingEmployeeNumber, - LastLameNotMatchingEmployeeNumber, - FistNameAndLastNameNotMatchingLogin, - FistNameNotMatchingLogin, - LastLameNotMatchingLogin, - DuplicatedLine, - AmbiguousLegalEntity, - ColumnNotExists, - LegalEntityNameNotAvailable, - AccountNameNotUnique  The list of import generation errors: - UnableToCreditAccount 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void replaceEntitlementsTest() throws ApiException {
        Boolean strict = null;
        Boolean simulate = null;
        String _file = null;
        String description = null;
        OffsetDateTime referenceDate = null;
        String entryTypes = null;
        ImportsEntitlementsBatchImportResponse response = api.replaceEntitlements()
                .strict(strict)
                .simulate(simulate)
                ._file(_file)
                .description(description)
                .referenceDate(referenceDate)
                .entryTypes(entryTypes)
                .execute();
        // TODO: test validations
    }

    /**
     * Replace entitlements
     *
     * **Supported file formats:** - CSV   - \&quot;UTF-8\&quot; encoding   - separator “;” - XSLX  **Columns to fill in:**  Column name | Description --- | --- LegalEntityCode | Employee legal entity code EmployeeNumber | Employee payroll number LastName | Last name FirstName | First name Account number or name (one column per account) | Value to import for the account defined in the header.   *Remark: A template file can be downloaded from the import page (Credit / Debit&gt; A group of collaborators&gt; File import).*  In the event of a malformed (or unrecognized) file, no data will be imported; the problems detected will be specified in the &#x60;globalErrors&#x60; field.  If successful, the number of imported lines is indicated by the “successLinesCount” field; the lines in error are detailed in the &#x60;lineErrors&#x60; field.   *Remarks: Any import made by the API is of course available in the import history. A simulation returns the same level of information, but does not trigger an import*  **List of errors handled**  Here is the list of fatal errors, which can be returned in the &#x60;globalErrors&#x60;: - Unauthorized - FileEmpty, - FileExtensionNotSupported, - ColumnsFormatNotSupported, - AccountColumnMissing, - ColumnNamesDistinct, - LineErrorForbiddenInStrictMode,  The list of line processing errors, which can be restored in the &#x60;lineErrors&#x60;: - AccountNotFound, - AccountsNotFound, - AccountColumnsProcessing, - LegalEntityCodesNotFound, - MissingValuesForAccount, - AccountNotAvailableForUser, - LegalEntityCodeRequired, - EmployeeNumberRequired, - LoginRequired, - LoginNotFound, - AccountNumberRequired, - LegalEntityNotFound, - EmployeeNumberNotExist, - EmployeeNumberNotInLegalEntity, - FistNameAndLastNameNotMatching, - FistNameNotMatching, - LastLameNotMatching, - FistNameAndLastNameNotMatchingEmployeeNumber, - FistNameNotMatchingEmployeeNumber, - LastLameNotMatchingEmployeeNumber, - FistNameAndLastNameNotMatchingLogin, - FistNameNotMatchingLogin, - LastLameNotMatchingLogin, - DuplicatedLine, - AmbiguousLegalEntity, - ColumnNotExists, - LegalEntityNameNotAvailable, - AccountNameNotUnique  The list of import generation errors: - UnableToCreditAccount 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void replaceEntitlements_0Test() throws ApiException {
        Boolean strict = null;
        Boolean simulate = null;
        String _file = null;
        String description = null;
        OffsetDateTime referenceDate = null;
        String entryTypes = null;
        ImportsEntitlementsBatchImportResponse response = api.replaceEntitlements_0()
                .strict(strict)
                .simulate(simulate)
                ._file(_file)
                .description(description)
                .referenceDate(referenceDate)
                .entryTypes(entryTypes)
                .execute();
        // TODO: test validations
    }

}
