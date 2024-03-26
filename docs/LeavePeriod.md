

# LeavePeriod

Absences from work, wether they are planned or not, are described in Lucca using three concepts : **LeaveRequests**, **LeavePeriods** and **Leaves**.  A **LeaveRequest** represent the request made by employees when planning time off. This resource is used for workflow purposes.  A **LeavePeriod** is the continuous period of absence requested by the employee or entered by HR. It is linked to a **LeaveRequest** if workflow applies.  A **Leave** is the subdivision of a **LeavePeriod**. There is one **Leave** per half-day of the **LeavePeriod**. Each **Leave** is linked to a **LeaveAccount**, which represent the type of leave (PTO, Sick Leave, Congés payés, RTT, etc).   ![Timmi Absences - UML](../assets/images/ROunRiCm34LtdeB8M206UeCucG9qABfq9aIs5Y9BBKNPGv6xrrOSH4CcKG-F_F-GZTJA621VVFmXfH5Te9pn3n2Fv2xVcahaKmf9yNFm9YjFog8tTWoBjB1UDSqjkZOd1ueygpUJYAP5OF0iwBow80XmItmJckH3VejaWpK-hE1Tr2S-y_BFHbRoCdHT1zTsRRFgLfgZQFLzFgNuvNKKVhfKTIQJwlRZFR9tBfLePtxIOQ9G.png)  ## Fields

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Double** | Unique identifier for the LeavePeriod |  [optional] |
|**ownerId** | **Double** | Unique identifier for the user  |  [optional] |
|**isConfirmed** | **Boolean** | Has the value &#x60;true&#x60; for approved LeavePeriod or the value &#x60;false&#x60; for LeavePeriod pending approval |  [optional] |
|**confirmationDate** | **Object** | Time at which the LeavePeriod was approved |  [optional] |
|**attachmentId** | **Object** | Unique identifier for the attached document |  [optional] |
|**leaves** | [**List&lt;Leave&gt;**](Leave.md) |  |  [optional] |
|**logs** | [**List&lt;LeavePeriodLog&gt;**](LeavePeriodLog.md) |  |  [optional] |



