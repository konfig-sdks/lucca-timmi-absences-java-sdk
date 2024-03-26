package com.konfigthis.client;

import com.konfigthis.client.api.ImportsApi;
import com.konfigthis.client.api.LeaveRequestsApi;
import com.konfigthis.client.api.LeavesApi;

public class LuccaTimmiAbsences {
    private ApiClient apiClient;
    public final ImportsApi imports;
    public final LeaveRequestsApi leaveRequests;
    public final LeavesApi leaves;

    public LuccaTimmiAbsences() {
        this(null);
    }

    public LuccaTimmiAbsences(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.imports = new ImportsApi(this.apiClient);
        this.leaveRequests = new LeaveRequestsApi(this.apiClient);
        this.leaves = new LeavesApi(this.apiClient);
    }

}
