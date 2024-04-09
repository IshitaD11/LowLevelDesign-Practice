package LowLevelDesign.DesignPatterns.Adapter.Assignment3;

import LowLevelDesign.DesignPatterns.Adapter.Assignment3.external.TravelGuardApi;

public class TravelGuardAdapter implements TravelInsuranceAdapter{

    TravelGuardApi travelGuardApi = new TravelGuardApi();

    @Override
    public void addClaim(String id, Double amount) {
        travelGuardApi.submitClaim(id, amount);
    }

    @Override
    public String getStatus(String id) {
        return travelGuardApi.getClaimStatus(id);
    }
    
}
