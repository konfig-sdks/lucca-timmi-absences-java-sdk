

# Leave

Absences from work, wether they are planned or not, are described in Lucca using three concepts : **LeaveRequests**, **LeavePeriods** and **Leaves**.  A **LeaveRequest** represent the request made by employees when planning time off. This resource is used for workflow purposes.  A **LeavePeriod** is the continuous period of absence requested by the employee or entered by HR. It is linked to a **LeaveRequest** if workflow applies.  A **Leave** is the subdivision of a **LeavePeriod**. There is one **Leave** per half-day of the **LeavePeriod**. Each **Leave** is linked to a **LeaveAccount**, which represent the type of leave (PTO, Sick Leave, Congés payés, RTT, etc).  ![Timmi Absences - UML](https://stoplight.io/api/v1/projects/cHJqOjEwNjgxNg/images/6yaK9GNTQ08)  There can only be one **Leave** per half-day. This prevents duplicates. For **Leaves** expressed in hours (as opposed to **Leaves** in days), the duration of the **Leave** is stored in the value field of the **Leave**. The previous constraint implies that there can only be one type of **Leave** per half-day. This issue is solved in the next version of the API.  ## Fields

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for the Leave |  |
|**date** | **LocalDate** | Date of the leave in ISO format &#x60;yyyy-mm-dd&#x60; |  |
|**isAm** | **Boolean** | Has the value &#x60;true&#x60; for morning or the value &#x60;false&#x60; for afternoon |  |
|**leaveAccountId** | **Integer** | Unique identifier for the attached LeaveAccount |  |
|**leaveAccount** | [**LeaveAccount**](LeaveAccount.md) |  |  [optional] |
|**leavePeriodId** | **Integer** | Unique identifier for the attached LeavePeriod |  |
|**leavePeriod** | [**LeavePeriod**](LeavePeriod.md) |  |  [optional] |
|**value** | **Object** | Leave duration in hours |  [optional] |
|**creationDate** | **OffsetDateTime** | Time at which the object was created |  [optional] |
|**isActive** | **Boolean** | Has the value &#x60;true&#x60; when the Leave exists (for pending or confirmed LeavePeriods), or the value &#x60;false&#x60; when it has been deleted (for canceled or denied LeaveRequests).  |  [optional] |
|**cancellationDate** | **Object** | Time at which the request was canceled |  [optional] |
|**cancellationUserId** | **Object** | Unique identifier for the user who canceled the request  |  [optional] |
|**comment** | **String** | Comments |  [optional] |



