package movie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Reservation {
	
	private long id;   //예매번호
	private long movieId;    //영화 구별 번호
	private String movieTitle; //영화 제목
	private String SeatName; //좌석
	
	private static final File file = new File("src/movie/reservations.txt");
	
//	public Reservation(long id, long movieId,String movieTitle, String SeatName) {
//		this.id = id;
//		this.movieId = movieId;
//		this.movieTitle = movieTitle;
//		this.SeatName = SeatName;
//	}
	
	public static Reservation findById(String reservationId) {
	
		Reservation reservation = null;
		BufferedReader br = null;
		String line = null;
		try {
			br = new BufferedReader(new FileReader(file));
			while(( line = br.readLine()) != null) {
				
				String[] temp = line.split(",");
				
				if(reservationId.equals(temp[0])) {
					reservation = new Reservation(
							Long.parseLong(temp[0]),
							Long.parseLong(temp[1]),
							 temp[2],
							 temp[3]
							);
					break;
				}
			}
			br.close();
			return reservation;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Reservation cancel(String reservationID) {
		
		Reservation canceled = null;
		BufferedReader bf = null;
		
		try {
			bf = new BufferedReader(new FileReader(file));  //new File("src/movie/reservations.txt"); => 이경로 파일 읽어온다
			String text = "";
			String line = null;
			
			while( (line = bf.readLine()) != null) {
				String[] temp = line.split(",");    //1627263849001,1627175707,에벤져스,B-4
				
				if(reservationID.equals(temp[0])) {
					
					/*
					 * private long id;   //예매번호
						private long movieId;    //영화 구별 번호
						private String movieTitle; //영화 제목
						private String SeatName; //좌석
					 */
					canceled = new Reservation(
							Long.parseLong(temp[0]), 
							Long.parseLong(temp[1]), 
							temp[2],
							temp[3]);
					continue;
				}
				
				text += line + "\n";
			}
			bf.close();
			
			//new File("src/movie/reservations.txt"); => 이 경로에
			//cancel(String reservationID) 예약번호를 제외한 파일을 다시 reservations.txt 덮어쓴다.
			FileWriter fw = new FileWriter(file); 
			fw.write(text);
			fw.close();
			return canceled;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		return canceled;
	}
	
	@Override
	public String toString() {
		return 
		String.format("영화 : %s, 좌석: %s", movieTitle, SeatName);
	}
}
















