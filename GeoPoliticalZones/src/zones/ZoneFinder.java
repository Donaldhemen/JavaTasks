package zones;

public class ZoneFinder {

    public static GeoPoliticalZone findZone(String state) {

        for(GeoPoliticalZone zone : GeoPoliticalZone.values()){

            for(String zoneState : zone.getState()) {

                if(zoneState.equalsIgnoreCase(state)){
                    return zone;
                }
            }
        }
        return null;
    }
}
