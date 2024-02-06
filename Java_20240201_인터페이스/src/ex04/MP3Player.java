package ex04;

public class MP3Player implements MediaPlayer{

	@Override
	public void play() {
		System.out.println("MP3 파일 재생 중...");
	}

	@Override
	public void pause() {
	}

	@Override
	public void stop() {
	}

}
