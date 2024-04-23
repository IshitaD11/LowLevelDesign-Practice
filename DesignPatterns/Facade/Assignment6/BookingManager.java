package LowLevelDesign.DesignPatterns.Facade.Assignment6;

import java.time.LocalDate;

// import LowLevelDesign.DesignPatterns.Facade.Assignment6.models.BookingConfirmation;
import LowLevelDesign.DesignPatterns.Facade.Assignment6.models.BookingResult;
// import LowLevelDesign.DesignPatterns.Facade.Assignment6.models.PaymentStatus;
import LowLevelDesign.DesignPatterns.Facade.Assignment6.services.AccommodationDetailsService;
import LowLevelDesign.DesignPatterns.Facade.Assignment6.services.AvailabilityService;
import LowLevelDesign.DesignPatterns.Facade.Assignment6.services.LoyaltyService;
import LowLevelDesign.DesignPatterns.Facade.Assignment6.services.NotificationService;
import LowLevelDesign.DesignPatterns.Facade.Assignment6.services.PaymentService;

public class BookingManager {

    // code before Facade pattern commented
    // private AvailabilityService availabilityService;
    // private PaymentService paymentService;
    // private NotificationService notificationService;
    // private LoyaltyService loyaltyService;
    // private AccommodationDetailsService accommodationDetailsService;

    // public BookingManager(AvailabilityService availabilityService, PaymentService paymentService,
    //                       NotificationService notificationService, LoyaltyService loyaltyService,
    //                       AccommodationDetailsService accommodationDetailsService) {
    //     this.availabilityService = availabilityService;
    //     this.paymentService = paymentService;
    //     this.notificationService = notificationService;
    //     this.loyaltyService = loyaltyService;
    //     this.accommodationDetailsService = accommodationDetailsService;
    // }

    // public BookingResult bookAccommodation(String userId, String accommodationId, LocalDate checkInDate, LocalDate checkOutDate) {
    //     boolean isAvailable = availabilityService.checkAvailability(accommodationId, checkInDate, checkOutDate);

    //     if (!isAvailable) {
    //         return BookingResult.notAvailable("Accommodation not available for the given dates");
    //     }

    //     PaymentStatus paymentStatus = paymentService.makePayment(userId, accommodationId);
    //     if (paymentStatus != PaymentStatus.SUCCESS) {
    //         return BookingResult.paymentFailed("Payment failed with status: " + paymentStatus);
    //     }

    //     BookingConfirmation confirmation = new BookingConfirmation(userId, accommodationId, checkInDate, checkOutDate);
    //     notificationService.sendBookingConfirmation(confirmation);

    //     loyaltyService.updateLoyaltyPoints(userId, paymentService.calculatePaymentAmount(accommodationId));
    //     accommodationDetailsService.updateAccommodationDetails(accommodationId, checkInDate, checkOutDate);

    //     return BookingResult.success(confirmation);
    // }

    // below are the code using Facade Design pattern
    private BookingFacade bookingFacade;

    public BookingManager(AvailabilityService availabilityService, PaymentService paymentService,
                          NotificationService notificationService, LoyaltyService loyaltyService,
                          AccommodationDetailsService accommodationDetailsService) {
        
        bookingFacade = new BookingFacade(availabilityService, paymentService, notificationService, loyaltyService, accommodationDetailsService);
    }


    public BookingResult bookAccommodation(String userId, String accommodationId, LocalDate checkInDate, LocalDate checkOutDate) {
        return bookingFacade.bookAccommodation(userId, accommodationId, checkInDate, checkOutDate);
    }

}
