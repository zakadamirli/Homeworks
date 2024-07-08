package MentorDay11.AparmentManagement;

public class Building {
    int id;
    String buildingName;
    int buildingNumber;
    int countOfFloor;
    String apartmentNumber;
    boolean mortgage;

    public Building(int id,String buildingName,int buildingNumber,int countOfFloor,String apartmentNumber,boolean mortgage){
            this.id=id;
            this.buildingName=buildingName;
            this.buildingNumber=buildingNumber;
            this.countOfFloor=countOfFloor;
            this.apartmentNumber=apartmentNumber;
            this.mortgage=mortgage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public int getCountOfFloor() {
        return countOfFloor;
    }

    public void setCountOfFloor(int countOfFloor) {
        this.countOfFloor = countOfFloor;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public boolean isMortgage() {
        return mortgage;
    }

    public void setMortgage(boolean mortgage) {
        this.mortgage = mortgage;
    }

    @Override
    public String toString() {
        return "Building{" +
                "id=" + id +
                ", buildingName='" + buildingName + '\'' +
                ", buildingNumber=" + buildingNumber +
                ", countOfFloor=" + countOfFloor +
                ", apartmentNumber='" + apartmentNumber + '\'' +
                ", mortgage=" + mortgage +
                '}';
    }
}
