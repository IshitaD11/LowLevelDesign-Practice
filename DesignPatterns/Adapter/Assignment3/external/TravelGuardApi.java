package LowLevelDesign.DesignPatterns.Adapter.Assignment3.external;

import LowLevelDesign.DesignPatterns.Adapter.Assignment3.ApiUtils;

public class TravelGuardApi {
    
    public void submitClaim(String id, Double amount) {
        ApiUtils.logTravelGuardClaimCall();
    }

    public String getClaimStatus(String id) {
        ApiUtils.logTravelGuardStatusCall();
        return "SUCCESS";
    }
}