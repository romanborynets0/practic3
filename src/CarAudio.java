import  java.util.*;
public class CarAudio {
    String manufactureTapeRecord;
    private List<String> Tracks;
     CarAudio carAudio;

    public CarAudio (String manufactureTapeRecord){
        this.manufactureTapeRecord= manufactureTapeRecord;
        this.Tracks = new ArrayList<>();
    }
    public void addTrack(String track){
        this.Tracks.add(track);
    }
    public void findTrack(String TrackName){
        for (String track : Tracks){
            if(track.equals(TrackName)){
                System.out.println("Знайдено трек - " + TrackName);
                return;
            }
        }
        System.out.println("Трек не знайдено - " + TrackName);
    }
    public  void deleteTrack(String TrackName){
        Iterator<String> iterator = Tracks.iterator();
        while (iterator.hasNext()) {
            String Track = iterator.next();
            if(Track.equals(TrackName)){
                iterator.remove();
                System.out.println("Трек Видалено - "+ TrackName);
                return;


            }
        }
        System.out.println("Трек не знайдено - "+TrackName);
    }
    public void ListTracks(){
        if (Tracks.isEmpty()){
            System.out.println("Трек не знайдено");
        }else {
            System.out.println("Список Треків - ");
            for (String track: Tracks);
            System.out.println(Tracks);
        }
    }


}