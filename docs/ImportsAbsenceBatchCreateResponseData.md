

# ImportsAbsenceBatchCreateResponseData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**report** | [**ImportsAbsenceBatchCreateResponseDataReport**](ImportsAbsenceBatchCreateResponseDataReport.md) |  |  [optional] |
|**generatedAt** | **OffsetDateTime** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | 0 &#x3D; Pending  10 &#x3D; Started  20 &#x3D; Finished  100 &#x3D; Failed  |  [optional] |
|**lineTotal** | **Integer** |  |  [optional] |
|**testErrorTotal** | **Integer** |  |  [optional] |
|**totalStep** | **Integer** |  |  [optional] |
|**expectedCreationTotal** | **Integer** |  |  [optional] |
|**expectedUpdateTotal** | **Integer** |  |  [optional] |
|**testNonBlockingErrorTotal** | **Integer** |  |  [optional] |
|**currentStep** | **Integer** |  |  [optional] |
|**creationTotal** | **Integer** |  |  [optional] |
|**updateTotal** | **Integer** |  |  [optional] |
|**importErrorTotal** | **Integer** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_10 | 10 |
| NUMBER_20 | 20 |
| NUMBER_100 | 100 |



