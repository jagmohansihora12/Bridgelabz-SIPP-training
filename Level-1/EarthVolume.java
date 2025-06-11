public class EarthVolume{
public static void main(String[] args){

double radiusInKilometers = 6378.0;
double radiusInMiles = radiusInKilometers * 0.621371;
double radiusPowerInKilometers = Math.pow(radiusInKilometers,3);
double radiusPowerInMiles = Math.pow(radiusInMiles,3);
double earthVolumeInKilometers = (4.0/3.0) * Math.PI * radiusPowerInKilometers;
double earthVolumeInMies = (4.0/3.0) * Math.PI * radiusPowerInMiles;
System.out.println("The volume of earth in cubic kilometers is" + earthVolumeInKilometers +"and cubic miles is" + earthVolumeInMies );
}
}