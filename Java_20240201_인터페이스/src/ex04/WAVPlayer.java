package ex04;

public class WAVPlayer implements MediaPlayer{

	@Override
	public void play() {
		System.out.println("WAV 파일 재생 중...");
	}

	@Override
	public void pause() {
	}

	@Override
	public void stop() {
	}

}
