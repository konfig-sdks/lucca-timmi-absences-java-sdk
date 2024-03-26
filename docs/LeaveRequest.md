

# LeaveRequest

Absences from work, wether they are planned or not, are described in Lucca using three concepts : **LeaveRequests**, **LeavePeriods** and **Leaves**.  A **LeaveRequest** represent the request made by employees when planning time off. This resource is used for workflow purposes.  A **LeavePeriod** is the continuous period of absence requested by the employee or entered by HR. It is linked to a **LeaveRequest** if workflow applies.  A **Leave** is the subdivision of a **LeavePeriod**. There is one **Leave** per half-day of the **LeavePeriod**. Each **Leave** is linked to a **LeaveAccount**, which represent the type of leave (PTO, Sick Leave, Congés payés, RTT, etc).  ![Timmi Absences - UML](../assets/images/ROunRiCm34LtdeB8M206UeCucG9qABfq9aIs5Y9BBKNPGv6xrrOSH4CcKG-F_F-GZTJA621VVFmXfH5Te9pn3n2Fv2xVcahaKmf9yNFm9YjFog8tTWoBjB1UDSqjkZOd1ueygpUJYAP5OF0iwBow80XmItmJckH3VejaWpK-hE1Tr2S-y_BFHbRoCdHT1zTsRRFgLfgZQFLzFgNuvNKKVhfKTIQJwlRZFR9tBfLePtxIOQ9G.png)  **LeaveRequests** status are by default in the `pending_approval` state. **LeaveRequests** status can be `approved`, `denied`, `cancelled` or in the `cancellation_pending` state.  ## Fields

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Unique identifier for the LeaveRequest |  [optional] |
|**leavePeriodId** | **Integer** | Unique identifier for the attached LeavePeriod |  [optional] |
|**leavePeriod** | [**LeavePeriod**](LeavePeriod.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the Leave request. Can be :   0 &#x3D; PENDING_APPROVAL  2 &#x3D; APPROVED  3 &#x3D; DENIED  4 &#x3D; CANCELLED  5 &#x3D; CANCELLATION_PENDING  |  [optional] |
|**creationDate** | **OffsetDateTime** | Time at which the object was created |  [optional] |
|**nextApproverId** | **Object** | Unique identifier for the next approver |  [optional] |
|**cancellationUserId** | **Object** | Unique identifier for the user that cancelled the Leave Request |  [optional] |
|**cancellationDate** | **Object** | Time at which the object was cancelled |  [optional] |
|**isActive** | **Boolean** | Has the value &#x60;true&#x60; for acitve Leave Request or the value &#x60;false&#x60; for cancelled Leave Request |  [optional] |
|**approvals** | [**List&lt;LeaveRequestApproval&gt;**](LeaveRequestApproval.md) |  |  [optional] |
|**cancellationRequests** | [**List&lt;CancellationRequest&gt;**](CancellationRequest.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |



