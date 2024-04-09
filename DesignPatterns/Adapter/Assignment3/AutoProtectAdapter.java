package LowLevelDesign.DesignPatterns.Adapter.Assignment3;

import LowLevelDesign.DesignPatterns.Adapter.Assignment3.external.AutoProtectApi;

public class AutoProtectAdapter implements TravelInsuranceAdapter{

    AutoProtectApi autoProtectApi = new AutoProtectApi();

    @Override
    public void addClaim(String id, Double amount) {
        autoProtectApi.addClaim(amount);
    }

    @Override
    public String getStatus(String id) {
        return autoProtectApi.getStatus(id).toString();
    }
    
}
