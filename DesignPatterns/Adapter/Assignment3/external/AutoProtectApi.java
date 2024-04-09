package LowLevelDesign.DesignPatterns.Adapter.Assignment3.external;

import LowLevelDesign.DesignPatterns.Adapter.Assignment3.ApiUtils;

public class AutoProtectApi {

    public void addClaim(Double amount) {
        ApiUtils.logAutoProtectClaimCall();
    }

    public AutoProtectStatus getStatus(String id) {
        ApiUtils.logAutoProtectStatusCall();
        return AutoProtectStatus.APPROVED;
    }
}