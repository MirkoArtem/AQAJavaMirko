package Lesson_4;

public class Park {
    private String rollerCoaster;
    private String carousel;
    private String shootingGallery;
    private String ferrisWheel;
    private String workingHours;
    private String priceRollerCoaster;
    private String priceCarousel;
    private String priceShootingGallery;
    private String priceFerrisWheel;

    public Park(String rollerCoaster, String carousel, String shootingGallery,
                String ferrisWheel, String workingHours, String priceRollerCoaster,
                String priceCarousel, String priceShootingGallery, String priceFerrisWheel) {
        this.rollerCoaster = rollerCoaster;
        this.carousel = carousel;
        this.shootingGallery = shootingGallery;
        this.ferrisWheel = ferrisWheel;
        this.workingHours = workingHours;
        this.priceRollerCoaster = priceRollerCoaster;
        this.priceCarousel = priceCarousel;
        this.priceShootingGallery = priceShootingGallery;
        this.priceFerrisWheel = priceFerrisWheel;
    }

    public void infoTable(){
        System.out.println("Каталог аттракионов: \n");
    }

    public class RollerCoaster{

        public void infoAboutRollerCoaster(){
            System.out.println("Аттракцион: " + rollerCoaster + "; \n" + "Время работы: " + workingHours + "; \n"
                    + "Стоимость: " + priceRollerCoaster + "; \n");
        }
    }
    public class Carousel{

        public void infoAboutCarousel(){
            System.out.println("Аттракцион: " + carousel + "; \n" + "Время работы: " + workingHours + "; \n"
                    + "Стоимость: " + priceCarousel + "; \n");
        }
    }
    public class ShootingGallery{

        public void infoAboutShootingGallery(){
            System.out.println("Аттракцион: " + shootingGallery + "; \n" + "Время работы: " + workingHours + "; \n"
                    + "Стоимость: " + priceShootingGallery + "; \n");
        }
    }
    public class FerrisWheel{

        public void infoAboutFerrisWheel(){
            System.out.println("Аттракцион: " + ferrisWheel + "; \n" + "Время работы: " + workingHours + "; \n"
                    + "Стоимость: " + priceFerrisWheel + "; \n");
        }
    }

    public static void main(String[] args) {
        Park attractions = new Park("Американские горки", "Карусель", "Тир",
                "Колесо обозрения", "8.00 - 20.00", "15$", "5$",
                "5$", "8$" );
        Park.RollerCoaster rollerCoaster1 = attractions.new RollerCoaster();
        Park.Carousel carousel1 = attractions.new Carousel();
        Park.ShootingGallery shootingGallery1 = attractions.new ShootingGallery();
        Park.FerrisWheel ferrisWheel1 = attractions.new FerrisWheel();

        attractions.infoTable();
        rollerCoaster1.infoAboutRollerCoaster();
        carousel1.infoAboutCarousel();
        shootingGallery1.infoAboutShootingGallery();
        ferrisWheel1.infoAboutFerrisWheel();
    }
}
