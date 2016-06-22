
public class TV {
	boolean power; //전원
	int channel; //채널
	int volume; //음량
	
	

	public void powerOn(){
		power = true;
	}
	public void powerOff(){
		power = false;
	}
	public boolean isPower(){
		return power;
	}

	public void setChannel(int c){
		channel=c;
	}
	public int getChannel(){
		return channel;
	}
	public void channelUp(){
		channel++;
	}
	public void channelDown(){
		if(channel>0){
			channel--;
			}
	}
	public int getVolume(){
		return volume;
	}
	public void volumeUp(){
		volume++;
	}
	public void volumeDown(){
		if(volume > 0){
			volume--;
		}
		
	}
}
