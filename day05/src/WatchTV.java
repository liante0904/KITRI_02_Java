
public class WatchTV {

	public static void main(String[] args) {
		TV tv = new TV();
		
		tv.powerOn();
		if(tv.isPower()){
			System.out.println("전원이 켜졌습니다.");
		}
		
		tv.setChannel(11); // 채널을 11번으로 설정한다.
		int c = tv.getChannel();
		System.out.println("현재 채널: " +c ); //11
		
		tv.channelUp();
		System.out.println("현재채널:" + tv.getChannel()); //12번
		
		tv.getVolume();
		System.out.println("현재음량:" + tv.getVolume()); //12번
		
		tv.volumeUp();
		tv.volumeDown();
		tv.volumeDown();
		System.out.println("현재음량:" + tv.getVolume());
		
		tv.powerOff();
		if(!tv.isPower()){
			System.out.println("전원이 꺼졌습니다.");
		
		
		}
	}

}
