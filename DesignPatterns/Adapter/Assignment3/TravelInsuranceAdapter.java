package LowLevelDesign.DesignPatterns.Adapter.Assignment3;


public interface TravelInsuranceAdapter {

    public void addClaim(String id, Double amount) ;

    public String getStatus(String id) ;
}