

# LeaveRequestApproval

## Fields

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Unique identifier for the LeaveRequestApproval |  [optional] |
|**date** | **OffsetDateTime** |  |  [optional] |
|**approverId** | **Double** | Unique identifier for the approver |  [optional] |
|**substitutedApproverId** | [**SubstitutedApproverIdEnum**](#SubstitutedApproverIdEnum) | 0 &#x3D; PENDING_APPROVAL  2 &#x3D; APPROVED  3 &#x3D; DENIED  4 &#x3D; CANCELLED  5 &#x3D; CANCELLATION_PENDING  |  [optional] |
|**approved** | **Boolean** | Has the value &#x60;true&#x60; for approved LeaveRequest or the value &#x60;false&#x60; for LeaveRequest pending approval |  [optional] |
|**comment** | **String** | Comments |  [optional] |



## Enum: SubstitutedApproverIdEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |



